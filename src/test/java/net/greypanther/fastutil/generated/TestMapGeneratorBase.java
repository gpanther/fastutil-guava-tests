package net.greypanther.fastutil.generated;

import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.testing.SampleElements;
import com.google.common.collect.testing.TestMapGenerator;

abstract class TestMapGeneratorBase<K extends Comparable<? super K>, V>
    implements TestMapGenerator<K, V> {
  private final Class<K> clazzK;
  private final Class<V> clazzV;
  private final SampleElements<Map.Entry<K, V>> sampleElements;
  private final Ordering ordering;

  protected TestMapGeneratorBase(Class<K> clazzK, Class<V> clazzV,
      SampleElements<K> keySampleElements, SampleElements<V> valueSampleElements,
      Ordering ordering) {
    this.clazzK = clazzK;
    this.clazzV = clazzV;
    this.ordering = ordering;
    this.sampleElements = new SampleElements<Map.Entry<K, V>>(
        new AbstractMap.SimpleEntry<K, V>(keySampleElements.e0(), valueSampleElements.e0()),
        new AbstractMap.SimpleEntry<K, V>(keySampleElements.e1(), valueSampleElements.e1()),
        new AbstractMap.SimpleEntry<K, V>(keySampleElements.e2(), valueSampleElements.e2()),
        new AbstractMap.SimpleEntry<K, V>(keySampleElements.e3(), valueSampleElements.e3()),
        new AbstractMap.SimpleEntry<K, V>(keySampleElements.e4(), valueSampleElements.e4()));
  }

  @Override
  public SampleElements<Map.Entry<K, V>> samples() {
    return sampleElements;
  }

  @Override
  @SuppressWarnings("unchecked")
  public Map.Entry<K, V>[] createArray(int length) {
    return (Map.Entry<K, V>[]) Array.newInstance(Map.Entry.class, length);
  }

  @Override
  public Iterable<Map.Entry<K, V>> order(List<Map.Entry<K, V>> insertionOrder) {
    switch (ordering) {
      case SORTED: {
        List<Map.Entry<K, V>> result = Lists.newArrayList(insertionOrder);
        Collections.sort(result, new Comparator<Map.Entry<K, V>>() {
          @Override
          public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
            return e1.getKey().compareTo(e2.getKey());
          }
        });
        return result;
      }
      case UNSORTED_OR_INSERTION_ORDER:
        return insertionOrder;
      default:
        throw new IllegalArgumentException(ordering.toString());
    }
  }

  @Override
  @SuppressWarnings("unchecked")
  public K[] createKeyArray(int length) {
    return (K[]) Array.newInstance(clazzK, length);
  }

  @Override
  @SuppressWarnings("unchecked")
  public V[] createValueArray(int length) {
    return (V[]) Array.newInstance(clazzV, length);
  }

  @SuppressWarnings("unchecked")
  protected final Map<K, V> arrayToMap(Object... elements) {
    Map<K, V> result = Maps.newLinkedHashMap();
    for (Object element : elements) {
      Map.Entry<K, V> entry = (Map.Entry<K, V>) element;
      result.put(entry.getKey(), entry.getValue());
    }
    return result;
  }
}
