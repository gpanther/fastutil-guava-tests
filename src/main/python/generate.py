#!/usr/bin/python
import os
import re
import jinja2

def generate_metadata(name, additional_dict=None):
    result = {
        'package': 'it.unimi.dsi.fastutil.%ss' % name.lower(),
        'primitive': name.lower(),
        'boxed_class': name
    }
    result.update(additional_dict or {})
    return name, result

kind_metadata = {
    k: v for (k, v) in [
        generate_metadata('Byte'),
        generate_metadata('Char', {'boxed_class': 'Character'}),
        generate_metadata('Double'),
        generate_metadata('Float'),
        generate_metadata('Int', {'boxed_class': 'Integer'}),
        generate_metadata('Long'),
        generate_metadata('Short'),
        generate_metadata('Object', {'primitive': None, 'boxed_class': 'String'}),
        # This is mostly the same as Object with the difference that equality is checked
        # using "==" instead of equals
        generate_metadata('Reference', {
            'package': 'it.unimi.dsi.fastutil.objects',
            'primitive': None,
            'boxed_class': 'String',
        }),
    ]
}

def is_ref(kind):
    return kind == 'Object' or kind == 'Reference'

def map_cast(kind, target_kind, suffix):
    result = '%s2%s%s' % (kind, target_kind, suffix)
    boxed_class = kind_metadata['Object']['boxed_class']
    if is_ref(kind) and is_ref(target_kind):
        result += '<%s, %s>' % (boxed_class, boxed_class)
    elif is_ref(target_kind):
        result += '<%s>' % boxed_class
    return result

script_dir = os.path.dirname(os.path.realpath(__file__))
env = jinja2.Environment(loader=jinja2.FileSystemLoader(script_dir), autoescape=False, trim_blocks=True)
env.globals['map_cast'] = map_cast

test_template = env.get_template('collection_tests.j')

for kind in kind_metadata.keys():
    output = test_template.render(
        kinds=kind_metadata.keys(),
        kind=kind, metadata=kind_metadata[kind], metadatas=kind_metadata)
    output = re.sub(r'(new (?:Object|Reference)\w+?(?:Set|List))(?=\()', r'\1<String>', output)
    output = re.sub(r'\(((?:Object|Reference)2\w+Map)\) ', r'(\1<String>) ', output)
    with open('%sCollectionsTest.java' % kind, 'w') as f:
        f.write(output)
