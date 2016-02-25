package net.greypanther.fastutil.generated;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import com.google.common.collect.Iterables;
import com.google.common.collect.testing.ListTestSuiteBuilder;
import com.google.common.collect.testing.MapTestSuiteBuilder;
import com.google.common.collect.testing.SampleElements;
import com.google.common.collect.testing.SetTestSuiteBuilder;
import com.google.common.collect.testing.SortedMapTestSuiteBuilder;
import com.google.common.collect.testing.SortedSetTestSuiteBuilder;
import com.google.common.collect.testing.TestListGenerator;
import com.google.common.collect.testing.TestSetGenerator;
import com.google.common.collect.testing.TestSortedSetGenerator;
import com.google.common.collect.testing.features.CollectionFeature;
import com.google.common.collect.testing.features.CollectionSize;
import com.google.common.collect.testing.features.Feature;
import com.google.common.collect.testing.features.ListFeature;
import com.google.common.collect.testing.features.MapFeature;
import com.google.common.collect.testing.features.SetFeature;

import it.unimi.dsi.fastutil.BigList;
import it.unimi.dsi.fastutil.BigListIterator;

{% if kind != "Reference" %}
import {{ metadata.package }}.{{ kind }}AVLTreeSet;
{% endif %}
import {{ metadata.package }}.{{ kind }}ArrayList;
import {{ metadata.package }}.{{ kind }}ArraySet;
import {{ metadata.package }}.{{ kind }}BigArrayBigList;
import {{ metadata.package }}.{{ kind }}BigListIterator;
import {{ metadata.package }}.{{ kind }}BigLists;
{% if kind == "Object" or kind == "Reference" %}
import it.unimi.dsi.fastutil.Hash;
{% else %}
import {{ metadata.package }}.{{ kind }}Hash;
import com.google.common.hash.Hashing;
{% endif %}
import {{ metadata.package }}.{{ kind }}LinkedOpenCustomHashSet;
import {{ metadata.package }}.{{ kind }}LinkedOpenHashSet;
import {{ metadata.package }}.{{ kind }}Lists;
import {{ metadata.package }}.{{ kind }}OpenHashSet;
{% if kind != "Byte" and kind != "Char" and kind != "Short" %}
import {{ metadata.package }}.{{ kind }}OpenHashBigSet;
{% endif %}
import {{ metadata.package }}.{{ kind }}RBTreeSet;
import {{ metadata.package }}.{{ kind }}Sets;
import {{ metadata.package }}.{{ kind }}SortedSets;

{% for target_kind in kinds %}
import {{ metadata.package }}.{{ kind }}2{{ target_kind }}ArrayMap;
import {{ metadata.package }}.{{ kind }}2{{ target_kind }}LinkedOpenHashMap;
import {{ metadata.package }}.{{ kind }}2{{ target_kind }}Map;
import {{ metadata.package }}.{{ kind }}2{{ target_kind }}Maps;
import {{ metadata.package }}.{{ kind }}2{{ target_kind }}OpenHashMap;
{% if kind != "Reference" %}
import {{ metadata.package }}.{{ kind }}2{{ target_kind }}AVLTreeMap;
import {{ metadata.package }}.{{ kind }}2{{ target_kind }}RBTreeMap;
import {{ metadata.package }}.{{ kind }}2{{ target_kind }}SortedMap;
import {{ metadata.package }}.{{ kind }}2{{ target_kind }}SortedMaps;
{%endif %}

{% endfor %}

import junit.framework.TestSuite;

@RunWith(Enclosed.class)
public final class {{ kind }}CollectionsTest {
  public static final class PriorityQueue {
    @Test
    @Ignore
    public void testPriorityQueue() {
      fail("guava-testlib has no tests for priority queues");
    }
  }

  public static final class Stack {
    @Test
    @Ignore
    public void testStack() {
      fail("guava-testlib has no tests for stacks");
    }
  }

  public static final class Lists {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("{{ kind }}CollectionsTests.Lists");
      suite.addTest(get{{ kind }}ArrayListTests());
      suite.addTest(getSynchronized{{ kind }}ArrayListTests());
      suite.addTest(getUnmodifiable{{ kind }}ArrayListTests());
      suite.addTest(getSingleton{{ kind }}ListTests());
      suite.addTest(getEmpty{{ kind }}ListTests());
      return suite;
    }

    private static junit.framework.Test get{{ kind }}ArrayListTests() {
      return getGeneral{{ kind }}ListTests("{{ kind }}ArrayList", c -> new {{ kind }}ArrayList(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronized{{ kind }}ArrayListTests() {
      return getGeneral{{ kind }}ListTests("Synchronized{{ kind }}ArrayList",
          c -> {{ kind }}Lists.synchronize(new {{ kind }}ArrayList(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiable{{ kind }}ArrayListTests() {
      return getGeneral{{ kind }}ListTests("Unmodifiable{{ kind }}ArrayList",
          c -> {{ kind }}Lists.unmodifiable(new {{ kind }}ArrayList(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingleton{{ kind }}ListTests() {
      final class Generator extends {{ kind }}GeneratorBase implements TestListGenerator<{{ metadata.boxed_class }}> {
        @Override
        public List<{{ metadata.boxed_class }}> create(Object... elements) {
          {{ metadata.boxed_class }} value = Iterables.getOnlyElement(arrayToCollection(elements));
          return {{ kind }}Lists.singleton(value);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("{{ kind }}SingletonList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    private static junit.framework.Test getEmpty{{ kind }}ListTests() {
      final class Generator extends {{ kind }}GeneratorBase implements TestListGenerator<{{ metadata.boxed_class }}> {
        @Override
{% if kind == "Object" or kind == "Reference" %}
        @SuppressWarnings("unchecked")
{% endif %}
        public List<{{ metadata.boxed_class }}> create(Object... elements) {
          assertEquals(0, elements.length);
          return {{ kind }}Lists.EMPTY_LIST;
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("{{ kind }}EmptyList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }
  }

  public static final class BigLists {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("{{ kind }}CollectionsTests.BigLists");
      suite.addTest(get{{ kind }}BigArrayBigListTests());
      suite.addTest(getSynchronized{{ kind }}BigArrayBigListTests());
      suite.addTest(getUnmodifiable{{ kind }}BigArrayBigListTests());
      suite.addTest(getSingleton{{ kind }}BigListTests());
      suite.addTest(getEmpty{{ kind }}BigListTests());
      return suite;
    }

    private static junit.framework.Test get{{ kind }}BigArrayBigListTests() {
      return getGeneral{{ kind }}ListTests("{{ kind }}BigArrayBigList",
          c -> new {{ kind }}BigList2ListAdapter(new {{ kind }}BigArrayBigList(c.iterator())),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronized{{ kind }}BigArrayBigListTests() {
      return getGeneral{{ kind }}ListTests("Synchronized{{ kind }}BigArrayBigList",
          c -> new {{ kind }}BigList2ListAdapter(
              {{ kind }}BigLists.synchronize(new {{ kind }}BigArrayBigList(c.iterator()))),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiable{{ kind }}BigArrayBigListTests() {
      return getGeneral{{ kind }}ListTests("Unmodifiable{{ kind }}BigArrayBigList",
          c -> new {{ kind }}BigList2ListAdapter(
              {{ kind }}BigLists.unmodifiable(new {{ kind }}BigArrayBigList(c.iterator()))),
          Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingleton{{ kind }}BigListTests() {
      final class Generator extends {{ kind }}GeneratorBase implements TestListGenerator<{{ metadata.boxed_class }}> {
        @Override
        public List<{{ metadata.boxed_class }}> create(Object... elements) {
          {{ metadata.boxed_class }} value = Iterables.getOnlyElement(arrayToCollection(elements));
          return new {{ kind }}BigList2ListAdapter({{ kind }}BigLists.singleton(value));
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("Singleton{{ kind }}BigList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    private static junit.framework.Test getEmpty{{ kind }}BigListTests() {
      final class Generator extends {{ kind }}GeneratorBase implements TestListGenerator<{{ metadata.boxed_class }}> {
        @Override
{% if kind == "Object" or kind == "Reference" %}
        @SuppressWarnings("unchecked")
{% endif %}
        public List<{{ metadata.boxed_class }}> create(Object... elements) {
          assertEquals(0, elements.length);
          return new {{ kind }}BigList2ListAdapter({{ kind }}BigLists.EMPTY_BIG_LIST);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("Empty{{ kind }}BigList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    @SuppressWarnings("serial")
    private static final class {{ kind }}BigList2ListAdapter extends BigList2ListAdapter<{{ metadata.boxed_class }}> {
      private {{ kind }}BigList2ListAdapter(BigList<{{ metadata.boxed_class }}> bigList) {
        super(bigList);
      }

      @Override
      public List<{{ metadata.boxed_class }}> subList(int fromIndex, int toIndex) {
        return new {{ kind }}BigList2ListAdapter(bigList.subList(fromIndex, toIndex));
      }

      @Override
      void bigListIteratorSet(BigListIterator<{{ metadata.boxed_class }}> bigListIterator, {{ metadata.boxed_class }} e) {
{% if kind == "Object" or kind == "Reference" %}
        (({{ kind }}BigListIterator<{{ metadata.boxed_class }}>) bigListIterator).set(e);
{% else %}
        (({{ kind }}BigListIterator) bigListIterator).set(e);
{% endif %}
      }

      @Override
      void bigListIteratorAdd(BigListIterator<{{ metadata.boxed_class }}> bigListIterator, {{ metadata.boxed_class }} e) {
{% if kind == "Object" or kind == "Reference" %}
        (({{ kind }}BigListIterator<{{ metadata.boxed_class }}>) bigListIterator).add(e);
{% else %}
        (({{ kind }}BigListIterator) bigListIterator).add(e);
{% endif %}
      }
    }
  }

  public static final class Sets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("{{ kind }}CollectionsTests.Sets");
      suite.addTest(get{{ kind }}ArraySetTests());
      suite.addTest(getSynchronized{{ kind }}ArraySetTests());
      suite.addTest(getUnmodifiable{{ kind }}ArraySetTests());
      suite.addTest(get{{ kind }}OpenHashSetTests());
{% if kind != "Byte" and kind != "Char" and kind != "Short" %}
      suite.addTest(get{{ kind }}OpenHashBigSetTests());
{% endif %}
      suite.addTest(getSingleton{{ kind }}SetTests());
      suite.addTest(getEmpty{{ kind }}SetTests());
      return suite;
    }

    private static junit.framework.Test get{{ kind }}ArraySetTests() {
      return getGeneral{{ kind }}SetTests("{{ kind }}ArraySet", c -> new {{ kind }}ArraySet(c), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronized{{ kind }}ArraySetTests() {
      return getGeneral{{ kind }}SetTests("Synchronized{{ kind }}ArraySet",
          c -> {{ kind }}Sets.synchronize(new {{ kind }}ArraySet(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiable{{ kind }}ArraySetTests() {
      return getGeneral{{ kind }}SetTests("Unmodifiable{{ kind }}ArraySet",
          c -> {{ kind }}Sets.unmodifiable(new {{ kind }}ArraySet(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test get{{ kind }}OpenHashSetTests() {
      return getGeneral{{ kind }}SetTests("{{ kind }}OpenHashSet", c -> new {{ kind }}OpenHashSet(c),
          Modifiable.MUTABLE);
    }

{% if kind != "Byte" and kind != "Char" and kind != "Short" %}
    private static junit.framework.Test get{{ kind }}OpenHashBigSetTests() {
      return getGeneral{{ kind }}SetTests("{{ kind }}OpenHashBigSet", c -> new {{ kind }}OpenHashBigSet(c),
          Modifiable.MUTABLE);
    }
{% endif %}

    private static junit.framework.Test getGeneral{{ kind }}SetTests(String testSuiteName,
        Function<Collection<{{ metadata.boxed_class }}>, Set<{{ metadata.boxed_class }}>> generator, Modifiable modifiable) {
      final class Generator extends {{ kind }}GeneratorBase implements TestSetGenerator<{{ metadata.boxed_class }}> {
        @Override
        public Set<{{ metadata.boxed_class }}> create(Object... elements) {
          return generator.apply(arrayToCollection(elements));
        }
      }

      List<Feature<?>> testSuiteFeatures = new ArrayList<>(3);
      testSuiteFeatures.add(CollectionSize.ANY);
      testSuiteFeatures.add(CollectionFeature.SERIALIZABLE);
      switch (modifiable) {
        case IMMUTABLE:
          break;
        case MUTABLE:
          testSuiteFeatures.add(SetFeature.GENERAL_PURPOSE);
          break;
        default:
          throw new IllegalArgumentException(modifiable.toString());
      }

      return SetTestSuiteBuilder.using(new Generator()).named(testSuiteName)
          .withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingleton{{ kind }}SetTests() {
      final class Generator extends {{ kind }}GeneratorBase implements TestSetGenerator<{{ metadata.boxed_class }}> {
        @Override
        public Set<{{ metadata.boxed_class }}> create(Object... elements) {
          {{ metadata.boxed_class }} value = Iterables.getOnlyElement(arrayToCollection(elements));
          return {{ kind }}Sets.singleton(value);
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("{{ kind }}SingletonSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    private static junit.framework.Test getEmpty{{ kind }}SetTests() {
      final class Generator extends {{ kind }}GeneratorBase implements TestSetGenerator<{{ metadata.boxed_class }}> {
        @Override
{% if kind == "Object" or kind == "Reference" %}
        @SuppressWarnings("unchecked")
{% endif %}
        public Set<{{ metadata.boxed_class }}> create(Object... elements) {
          assertEquals(0, elements.length);
          return {{ kind }}Sets.EMPTY_SET;
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("{{ kind }}EmptySet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }
  }

  public static final class SortedSets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("{{ kind }}CollectionsTests.SortedSets");
      suite.addTest(getLinkedOpenHashSetTests());
      suite.addTest(getLinkedOpenCustomHashSetTests());
      suite.addTest(getAVLTreeSetTests());
      suite.addTest(getRBTreeSetTests());
      suite.addTest(getSynchronizedRBTreeSetTests());
      suite.addTest(getUnmodifiableRBTreeSetTests());
      suite.addTest(getSingleton{{ kind }}SortedSetTests());
      suite.addTest(getEmpty{{ kind }}SortedSetTests());
      return suite;
    }

    private static junit.framework.Test getLinkedOpenHashSetTests() {
      return getGeneral{{ kind }}SortedSetTests("{{ kind }}LinkedOpenHashSet",
          c -> new {{ kind }}LinkedOpenHashSet(c), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getLinkedOpenCustomHashSetTests() {
{% if kind == "Byte" or kind == "Char" or kind == "Double" or kind == "Float" or kind == "Int" or kind == "Long" or kind == "Short" %}
      @SuppressWarnings("serial")
      final class HashStrategy implements {{ kind }}Hash.Strategy, java.io.Serializable {
        @Override
        public int hashCode({{ metadata.primitive }} e) {
{% if kind == "Byte" or kind == "Char" or kind == "Int" or kind == "Short" %}
          return Hashing.murmur3_32().hashInt(e).asInt();
{% elif kind == "Long" %}
          return Hashing.murmur3_32().hashLong(e).asInt();
{% elif kind == "Double" %}
          return Hashing.murmur3_32().hashLong(Double.doubleToLongBits(e)).asInt();
{% elif kind == "Float" %}
          return Hashing.murmur3_32().hashLong(Float.floatToIntBits(e)).asInt();
{% endif %}
        }

        @Override
        public boolean equals({{ metadata.primitive }} a, {{ metadata.primitive }} b) {
          return a == b;
        }
      }
{% elif kind == "Object" or kind == "Reference" %}
      final class HashStrategy implements Hash.Strategy<{{ metadata.boxed_class }}> {
        @Override
        public int hashCode({{ metadata.boxed_class }} o) {
          return o.hashCode();
        }

        @Override
        public boolean equals({{ metadata.boxed_class }} a, {{ metadata.boxed_class }} b) {
          return java.util.Objects.equals(a, b);
        }
      }
{% endif %}

      return getGeneral{{ kind }}SortedSetTests("{{ kind }}LinkedOpenCustomHashSet",
          c -> new {{ kind }}LinkedOpenCustomHashSet(c, new HashStrategy()), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getAVLTreeSetTests() {
      return getGeneral{{ kind }}SortedSetTests("{{ kind }}AVLTreeSet", c -> new {{ kind }}AVLTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getRBTreeSetTests() {
      return getGeneral{{ kind }}SortedSetTests("{{ kind }}RBTreeSet", c -> new {{ kind }}RBTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getSynchronizedRBTreeSetTests() {
      return getGeneral{{ kind }}SortedSetTests("{{ kind }}RBTreeSet",
          c -> {{ kind }}SortedSets.synchronize(new {{ kind }}RBTreeSet(c)), Modifiable.MUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getUnmodifiableRBTreeSetTests() {
      return getGeneral{{ kind }}SortedSetTests("{{ kind }}RBTreeSet",
          c -> {{ kind }}SortedSets.unmodifiable(new {{ kind }}RBTreeSet(c)), Modifiable.IMMUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getGeneral{{ kind }}SortedSetTests(String testSuiteName,
        Function<Collection<{{ metadata.boxed_class }}>, SortedSet<{{ metadata.boxed_class }}>> generator, Modifiable modifiable,
        Ordering ordering) {
      List<Feature<?>> testSuiteFeatures = new ArrayList<>(3);
      testSuiteFeatures.add(CollectionSize.ANY);
      testSuiteFeatures.add(CollectionFeature.SERIALIZABLE);
      testSuiteFeatures.add(CollectionFeature.KNOWN_ORDER);
      testSuiteFeatures.add(CollectionFeature.SUBSET_VIEW);
      testSuiteFeatures.add(CollectionFeature.DESCENDING_VIEW);
      switch (modifiable) {
        case IMMUTABLE:
          break;
        case MUTABLE:
          testSuiteFeatures.add(SetFeature.GENERAL_PURPOSE);
          break;
        default:
          throw new IllegalArgumentException(modifiable.toString());
      }

      return SortedSetTestSuiteBuilder.using(new {{ kind }}SortedSetGenerator(ordering, generator))
          .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingleton{{ kind }}SortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new {{ kind }}SortedSetGenerator(Ordering.SORTED, c -> {
        {{ metadata.boxed_class }} value = Iterables.getOnlyElement(c);
        return {{ kind }}SortedSets.singleton(value);
      })).named("{{ kind }}SingletonSortedSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

{% if kind == "Object" or kind == "Reference" %}
    @SuppressWarnings("unchecked")
{% endif %}
    private static junit.framework.Test getEmpty{{ kind }}SortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new {{ kind }}SortedSetGenerator(Ordering.SORTED, c -> {
        assertTrue(c.isEmpty());
        return {{ kind }}SortedSets.EMPTY_SET;
      })).named("{{ kind }}SingletonSortedSet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

    private static class {{ kind }}SortedSetGenerator extends {{ kind }}GeneratorBase
        implements TestSortedSetGenerator<{{ metadata.boxed_class }}> {
      private final Function<Collection<{{ metadata.boxed_class }}>, SortedSet<{{ metadata.boxed_class }}>> generator;

      {{ kind }}SortedSetGenerator(Ordering ordering,
          Function<Collection<{{ metadata.boxed_class }}>, SortedSet<{{ metadata.boxed_class }}>> generator) {
        super(TestSampleValues.{{ kind | upper}}_SAMPLE_ELEMENTS_FOR_SORTED, ordering);
        this.generator = generator;
      }

      @Override
      public SortedSet<{{ metadata.boxed_class }}> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }

      @Override
      public {{ metadata.boxed_class }} belowSamplesLesser() {
        return TestSampleValues.{{ kind | upper}}S_FOR_SORTED[0];
      }

      @Override
      public {{ metadata.boxed_class }} belowSamplesGreater() {
        return TestSampleValues.{{ kind | upper}}S_FOR_SORTED[1];
      }

      @Override
      public {{ metadata.boxed_class }} aboveSamplesLesser() {
        return TestSampleValues.{{ kind | upper}}S_FOR_SORTED[7];
      }

      @Override
      public {{ metadata.boxed_class }} aboveSamplesGreater() {
        return TestSampleValues.{{ kind | upper}}S_FOR_SORTED[8];
      }
    }
  }

{% for target_kind in kinds %}
  public static final class Fastutil{{ kind }}2{{ target_kind }}Maps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("{{ kind }}2ByteMaps.Maps");
      suite.addTest(
          getMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}ArrayMap::new, TestSampleValues.{{ target_kind | upper }}_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}ArrayMap::new,
          m -> {{ kind }}2{{ target_kind }}Maps.synchronize(({{ map_cast(kind, target_kind, 'Map') }}) m), TestSampleValues.{{ target_kind | upper }}_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}ArrayMap::new,
          m -> {{ kind }}2{{ target_kind }}Maps.unmodifiable(({{ map_cast(kind, target_kind, 'Map') }}) m),
          TestSampleValues.{{ target_kind | upper }}_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}OpenHashMap::new,
          TestSampleValues.{{ target_kind | upper }}_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}LinkedOpenHashMap::new,
          TestSampleValues.{{ target_kind | upper }}_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}Maps::singleton,
          TestSampleValues.{{ target_kind | upper }}_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests({{ metadatas[target_kind].boxed_class }}.class, getEmptyMap(), TestSampleValues.{{ target_kind | upper }}_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) {{ kind }}2{{ target_kind }}Maps.EMPTY_MAP;
    }
  }

{% if kind != "Reference" %}
  public static final class Fastutil{{ kind }}2{{ target_kind }}SortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("{{ kind }}2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}AVLTreeMap::new,
          TestSampleValues.{{ target_kind | upper }}S_FOR_SORTED));
      suite.addTest(getSortedMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}RBTreeMap::new,
          TestSampleValues.{{ target_kind | upper }}S_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}RBTreeMap::new,
          m -> {{ kind }}2{{ target_kind }}SortedMaps.synchronize(({{ map_cast(kind, target_kind, 'SortedMap') }}) m),
          TestSampleValues.{{ target_kind | upper }}S_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}RBTreeMap::new,
          m -> {{ kind }}2{{ target_kind }}SortedMaps.unmodifiable(({{ map_cast(kind, target_kind, 'SortedMap') }}) m),
          TestSampleValues.{{ target_kind | upper }}S_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}SortedMaps::singleton,
      // TestSampleValues.{{ target_kind | upper }}S_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests({{ metadatas[target_kind].boxed_class }}.class, {{ kind }}2{{ target_kind }}SortedMaps.EMPTY_MAP,
      // TestSampleValues.{{ target_kind | upper }}S_FOR_SORTED));
      return suite;
    }
  }
{% endif %}

{% endfor %}
  private static abstract class {{ kind }}GeneratorBase extends TestContainerGeneratorBase<{{ metadata.boxed_class }}> {
    {{ kind }}GeneratorBase() {
      this(TestSampleValues.{{ kind | upper}}_SAMPLE_ELEMENTS, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    {{ kind }}GeneratorBase(SampleElements<{{ metadata.boxed_class }}> sampleElements, Ordering ordering) {
      super({{ metadata.boxed_class }}.class, sampleElements, ordering);
    }
  }

  private static junit.framework.Test getGeneral{{ kind }}ListTests(String testSuiteName,
      Function<Collection<{{ metadata.boxed_class }}>, List<{{ metadata.boxed_class }}>> generator, Modifiable modifiable) {
    final class Generator extends {{ kind }}GeneratorBase implements TestListGenerator<{{ metadata.boxed_class }}> {
      @Override
      public List<{{ metadata.boxed_class }}> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }
    }

    List<Feature<?>> testSuiteFeatures = new ArrayList<>(3);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE);
    switch (modifiable) {
      case IMMUTABLE:
        break;
      case MUTABLE:
        testSuiteFeatures.add(ListFeature.GENERAL_PURPOSE);
        break;
      default:
        throw new IllegalArgumentException(modifiable.toString());
    }

    return ListTestSuiteBuilder.using(new Generator()).named(testSuiteName)
        .withFeatures(testSuiteFeatures).createTestSuite();
  }

  private static <V> junit.framework.Test getMapTests(Class<V> clazzV,
      Supplier<Map<{{ metadata.boxed_class }}, V>> mapFactory, SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<{{ metadata.boxed_class }}, V> map = mapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedArrayMapTests(Class<V> clazzV,
      Supplier<Map<{{ metadata.boxed_class }}, V>> mapFactory, Function<Map<{{ metadata.boxed_class }}, V>, Map<{{ metadata.boxed_class }}, V>> syncrhonizeWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<{{ metadata.boxed_class }}, V> map = mapFactory.get();
      map.putAll(m);
      map = syncrhonizeWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableArrayMapTests(Class<V> clazzV,
      Supplier<Map<{{ metadata.boxed_class }}, V>> mapFactory, Function<Map<{{ metadata.boxed_class }}, V>, Map<{{ metadata.boxed_class }}, V>> unmodifiableWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<{{ metadata.boxed_class }}, V> map = mapFactory.get();
      map.putAll(m);
      map = unmodifiableWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralMapTests(Class<V> clazzV,
      Function<Map<{{ metadata.boxed_class }}, V>, Map<{{ metadata.boxed_class }}, V>> mapFactory, String testSuiteName,
      SampleElements<V> valueSampleElements, Modifiable modifiable) {
    List<Feature<?>> testSuiteFeatures = new ArrayList<>(3);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE);
{% if kind == "Object" or kind == "Reference" %}
    testSuiteFeatures.add(MapFeature.ALLOWS_NULL_KEYS);
{% endif %}
    switch (modifiable) {
      case IMMUTABLE:
        break;
      case MUTABLE:
        testSuiteFeatures.add(MapFeature.GENERAL_PURPOSE);
        break;
      default:
        throw new IllegalArgumentException(modifiable.toString());
    }

    return MapTestSuiteBuilder
        .using(new {{ kind }}MapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  private static <V> junit.framework.Test getSingletonMapTests(Class<V> clazzV,
      BiFunction<{{ metadata.boxed_class }}, V, Map<{{ metadata.boxed_class }}, V>> singletonMapFactory,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonMap";
    return MapTestSuiteBuilder.using(new {{ kind }}MapGenerator<V>(clazzV, map -> {
      Map.Entry<{{ metadata.boxed_class }}, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getEmptyMapTests(Class<V> clazzV, Map<{{ metadata.boxed_class }}, V> emptyMap,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptyMap";
    return MapTestSuiteBuilder.using(new {{ kind }}MapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
        .createTestSuite();
  }

{% if kind != "Reference" %}
  private static <V> junit.framework.Test getSortedMapTests(Class<V> clazzV,
      Supplier<SortedMap<{{ metadata.boxed_class }}, V>> sortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<{{ metadata.boxed_class }}, V> map = sortedMapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<{{ metadata.boxed_class }}, V>> sortedMapFactory,
      Function<SortedMap<{{ metadata.boxed_class }}, V>, SortedMap<{{ metadata.boxed_class }}, V>> synchronziedWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Synchronized" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<{{ metadata.boxed_class }}, V> map = sortedMapFactory.get();
      map.putAll(m);
      return synchronziedWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<{{ metadata.boxed_class }}, V>> sortedMapFactory,
      Function<SortedMap<{{ metadata.boxed_class }}, V>, SortedMap<{{ metadata.boxed_class }}, V>> unmodifiableWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Unmodifiable" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<{{ metadata.boxed_class }}, V> map = sortedMapFactory.get();
      map.putAll(m);
      return unmodifiableWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralSortedMapTests(Class<V> clazzV,
      Function<Map<{{ metadata.boxed_class }}, V>, SortedMap<{{ metadata.boxed_class }}, V>> mapFactory, String testSuiteName,
      V[] valueSampleElements, Modifiable modifiable) {
    List<Feature<?>> testSuiteFeatures = new ArrayList<>(8);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE);
    testSuiteFeatures.add(CollectionFeature.KNOWN_ORDER);
    testSuiteFeatures.add(CollectionFeature.SUBSET_VIEW);
    testSuiteFeatures.add(CollectionFeature.DESCENDING_VIEW);
{% if kind == "Object" or kind == "Reference" %}
    testSuiteFeatures.add(MapFeature.ALLOWS_NULL_KEYS);
{% endif %}
    switch (modifiable) {
      case IMMUTABLE:
        break;
      case MUTABLE:
        testSuiteFeatures.add(MapFeature.GENERAL_PURPOSE);
        break;
      default:
        throw new IllegalArgumentException(modifiable.toString());
    }

    return SortedMapTestSuiteBuilder
        .using(new {{ kind }}SortedMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getSingletonSortedMapTests(Class<V> clazzV,
      BiFunction<{{ metadata.boxed_class }}, V, SortedMap<{{ metadata.boxed_class }}, V>> singletonSortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonSortedMap";
    return SortedMapTestSuiteBuilder.using(new {{ kind }}SortedMapGenerator<V>(clazzV, map -> {
      Map.Entry<{{ metadata.boxed_class }}, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonSortedMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
        .createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getEmptySortedMapTests(Class<V> clazzV,
      SortedMap<{{ metadata.boxed_class }}, V> emptyMap, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptySortedMap";
    return SortedMapTestSuiteBuilder.using(new {{ kind }}SortedMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
        .createTestSuite();
  }
{% endif %}

  private static final class {{ kind }}MapGenerator<V> extends TestMapGeneratorBase<{{ metadata.boxed_class }}, V> {
    private final Function<Map<{{ metadata.boxed_class }}, V>, Map<{{ metadata.boxed_class }}, V>> mapFactory;

    protected {{ kind }}MapGenerator(Class<V> clazzV, Function<Map<{{ metadata.boxed_class }}, V>, Map<{{ metadata.boxed_class }}, V>> mapFactory,
        SampleElements<V> valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected {{ kind }}MapGenerator(Class<V> clazzV, Function<Map<{{ metadata.boxed_class }}, V>, Map<{{ metadata.boxed_class }}, V>> mapFactory,
        SampleElements<V> valueSampleElements, Ordering ordering) {
      super({{ metadata.boxed_class }}.class, clazzV, TestSampleValues.{{ kind | upper}}_SAMPLE_ELEMENTS, valueSampleElements,
          ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public Map<{{ metadata.boxed_class }}, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }

{% if kind != "Reference" %}
  private static final class {{ kind }}SortedMapGenerator<V> extends TestSortedMapGeneratorBase<{{ metadata.boxed_class }}, V> {
    private final Function<Map<{{ metadata.boxed_class }}, V>, SortedMap<{{ metadata.boxed_class }}, V>> mapFactory;

    protected {{ kind }}SortedMapGenerator(Class<V> clazzV,
        Function<Map<{{ metadata.boxed_class }}, V>, SortedMap<{{ metadata.boxed_class }}, V>> mapFactory, V[] valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected {{ kind }}SortedMapGenerator(Class<V> clazzV,
        Function<Map<{{ metadata.boxed_class }}, V>, SortedMap<{{ metadata.boxed_class }}, V>> mapFactory, V[] valueSampleElements,
        Ordering ordering) {
      super({{ metadata.boxed_class }}.class, clazzV, TestSampleValues.{{ kind | upper}}S_FOR_SORTED, valueSampleElements, ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public SortedMap<{{ metadata.boxed_class }}, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }
{% endif %}
}
