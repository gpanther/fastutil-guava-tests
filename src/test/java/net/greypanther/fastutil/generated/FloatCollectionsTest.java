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

import it.unimi.dsi.fastutil.floats.FloatAVLTreeSet;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.floats.FloatArraySet;
import it.unimi.dsi.fastutil.floats.FloatBigArrayBigList;
import it.unimi.dsi.fastutil.floats.FloatBigListIterator;
import it.unimi.dsi.fastutil.floats.FloatBigLists;
import it.unimi.dsi.fastutil.floats.FloatHash;
import com.google.common.hash.Hashing;
import it.unimi.dsi.fastutil.floats.FloatLinkedOpenCustomHashSet;
import it.unimi.dsi.fastutil.floats.FloatLinkedOpenHashSet;
import it.unimi.dsi.fastutil.floats.FloatLists;
import it.unimi.dsi.fastutil.floats.FloatOpenHashSet;
import it.unimi.dsi.fastutil.floats.FloatOpenHashBigSet;
import it.unimi.dsi.fastutil.floats.FloatRBTreeSet;
import it.unimi.dsi.fastutil.floats.FloatSets;
import it.unimi.dsi.fastutil.floats.FloatSortedSets;

import it.unimi.dsi.fastutil.floats.Float2ShortArrayMap;
import it.unimi.dsi.fastutil.floats.Float2ShortLinkedOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2ShortMap;
import it.unimi.dsi.fastutil.floats.Float2ShortMaps;
import it.unimi.dsi.fastutil.floats.Float2ShortOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2ShortAVLTreeMap;
import it.unimi.dsi.fastutil.floats.Float2ShortRBTreeMap;
import it.unimi.dsi.fastutil.floats.Float2ShortSortedMap;
import it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps;

import it.unimi.dsi.fastutil.floats.Float2ReferenceArrayMap;
import it.unimi.dsi.fastutil.floats.Float2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2ReferenceMap;
import it.unimi.dsi.fastutil.floats.Float2ReferenceMaps;
import it.unimi.dsi.fastutil.floats.Float2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.floats.Float2ReferenceRBTreeMap;
import it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap;
import it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMaps;

import it.unimi.dsi.fastutil.floats.Float2IntArrayMap;
import it.unimi.dsi.fastutil.floats.Float2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2IntMap;
import it.unimi.dsi.fastutil.floats.Float2IntMaps;
import it.unimi.dsi.fastutil.floats.Float2IntOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2IntAVLTreeMap;
import it.unimi.dsi.fastutil.floats.Float2IntRBTreeMap;
import it.unimi.dsi.fastutil.floats.Float2IntSortedMap;
import it.unimi.dsi.fastutil.floats.Float2IntSortedMaps;

import it.unimi.dsi.fastutil.floats.Float2DoubleArrayMap;
import it.unimi.dsi.fastutil.floats.Float2DoubleLinkedOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2DoubleMap;
import it.unimi.dsi.fastutil.floats.Float2DoubleMaps;
import it.unimi.dsi.fastutil.floats.Float2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.floats.Float2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap;
import it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps;

import it.unimi.dsi.fastutil.floats.Float2FloatArrayMap;
import it.unimi.dsi.fastutil.floats.Float2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2FloatMap;
import it.unimi.dsi.fastutil.floats.Float2FloatMaps;
import it.unimi.dsi.fastutil.floats.Float2FloatOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2FloatAVLTreeMap;
import it.unimi.dsi.fastutil.floats.Float2FloatRBTreeMap;
import it.unimi.dsi.fastutil.floats.Float2FloatSortedMap;
import it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps;

import it.unimi.dsi.fastutil.floats.Float2LongArrayMap;
import it.unimi.dsi.fastutil.floats.Float2LongLinkedOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2LongMap;
import it.unimi.dsi.fastutil.floats.Float2LongMaps;
import it.unimi.dsi.fastutil.floats.Float2LongOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2LongAVLTreeMap;
import it.unimi.dsi.fastutil.floats.Float2LongRBTreeMap;
import it.unimi.dsi.fastutil.floats.Float2LongSortedMap;
import it.unimi.dsi.fastutil.floats.Float2LongSortedMaps;

import it.unimi.dsi.fastutil.floats.Float2CharArrayMap;
import it.unimi.dsi.fastutil.floats.Float2CharLinkedOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2CharMap;
import it.unimi.dsi.fastutil.floats.Float2CharMaps;
import it.unimi.dsi.fastutil.floats.Float2CharOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2CharAVLTreeMap;
import it.unimi.dsi.fastutil.floats.Float2CharRBTreeMap;
import it.unimi.dsi.fastutil.floats.Float2CharSortedMap;
import it.unimi.dsi.fastutil.floats.Float2CharSortedMaps;

import it.unimi.dsi.fastutil.floats.Float2ObjectArrayMap;
import it.unimi.dsi.fastutil.floats.Float2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2ObjectMap;
import it.unimi.dsi.fastutil.floats.Float2ObjectMaps;
import it.unimi.dsi.fastutil.floats.Float2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.floats.Float2ObjectRBTreeMap;
import it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap;
import it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps;

import it.unimi.dsi.fastutil.floats.Float2ByteArrayMap;
import it.unimi.dsi.fastutil.floats.Float2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2ByteMap;
import it.unimi.dsi.fastutil.floats.Float2ByteMaps;
import it.unimi.dsi.fastutil.floats.Float2ByteOpenHashMap;
import it.unimi.dsi.fastutil.floats.Float2ByteAVLTreeMap;
import it.unimi.dsi.fastutil.floats.Float2ByteRBTreeMap;
import it.unimi.dsi.fastutil.floats.Float2ByteSortedMap;
import it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps;

import junit.framework.TestSuite;

@RunWith(Enclosed.class)
public final class FloatCollectionsTest {
  private static final boolean RUN_ARRAYMAP_TESTS =
      System.getProperties().containsKey("runArrayMapTests");
  private static final boolean RUN_ARRAYSET_TESTS =
      System.getProperties().containsKey("runArraySetTests");

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
      TestSuite suite = new TestSuite("FloatCollectionsTests.Lists");
      suite.addTest(getFloatArrayListTests());
      suite.addTest(getSynchronizedFloatArrayListTests());
      suite.addTest(getUnmodifiableFloatArrayListTests());
      suite.addTest(getSingletonFloatListTests());
      suite.addTest(getEmptyFloatListTests());
      return suite;
    }

    private static junit.framework.Test getFloatArrayListTests() {
      return getGeneralFloatListTests("FloatArrayList", c -> new FloatArrayList(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedFloatArrayListTests() {
      return getGeneralFloatListTests("SynchronizedFloatArrayList",
          c -> FloatLists.synchronize(new FloatArrayList(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableFloatArrayListTests() {
      return getGeneralFloatListTests("UnmodifiableFloatArrayList",
          c -> FloatLists.unmodifiable(new FloatArrayList(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonFloatListTests() {
      final class Generator extends FloatGeneratorBase implements TestListGenerator<Float> {
        @Override
        public List<Float> create(Object... elements) {
          Float value = Iterables.getOnlyElement(arrayToCollection(elements));
          return FloatLists.singleton(value);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("FloatSingletonList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyFloatListTests() {
      final class Generator extends FloatGeneratorBase implements TestListGenerator<Float> {
        @Override
        public List<Float> create(Object... elements) {
          assertEquals(0, elements.length);
          return FloatLists.EMPTY_LIST;
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("FloatEmptyList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }
  }

  public static final class BigLists {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("FloatCollectionsTests.BigLists");
      suite.addTest(getFloatBigArrayBigListTests());
      suite.addTest(getSynchronizedFloatBigArrayBigListTests());
      suite.addTest(getUnmodifiableFloatBigArrayBigListTests());
      suite.addTest(getSingletonFloatBigListTests());
      suite.addTest(getEmptyFloatBigListTests());
      return suite;
    }

    private static junit.framework.Test getFloatBigArrayBigListTests() {
      return getGeneralFloatListTests("FloatBigArrayBigList",
          c -> new FloatBigList2ListAdapter(new FloatBigArrayBigList(c.iterator())),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedFloatBigArrayBigListTests() {
      return getGeneralFloatListTests("SynchronizedFloatBigArrayBigList",
          c -> new FloatBigList2ListAdapter(
              FloatBigLists.synchronize(new FloatBigArrayBigList(c.iterator()))),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableFloatBigArrayBigListTests() {
      return getGeneralFloatListTests("UnmodifiableFloatBigArrayBigList",
          c -> new FloatBigList2ListAdapter(
              FloatBigLists.unmodifiable(new FloatBigArrayBigList(c.iterator()))),
          Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonFloatBigListTests() {
      final class Generator extends FloatGeneratorBase implements TestListGenerator<Float> {
        @Override
        public List<Float> create(Object... elements) {
          Float value = Iterables.getOnlyElement(arrayToCollection(elements));
          return new FloatBigList2ListAdapter(FloatBigLists.singleton(value));
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("SingletonFloatBigList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyFloatBigListTests() {
      final class Generator extends FloatGeneratorBase implements TestListGenerator<Float> {
        @Override
        public List<Float> create(Object... elements) {
          assertEquals(0, elements.length);
          return new FloatBigList2ListAdapter(FloatBigLists.EMPTY_BIG_LIST);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("EmptyFloatBigList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    @SuppressWarnings("serial")
    private static final class FloatBigList2ListAdapter extends BigList2ListAdapter<Float> {
      private FloatBigList2ListAdapter(BigList<Float> bigList) {
        super(bigList);
      }

      @Override
      public List<Float> subList(int fromIndex, int toIndex) {
        return new FloatBigList2ListAdapter(bigList.subList(fromIndex, toIndex));
      }

      @Override
      void bigListIteratorSet(BigListIterator<Float> bigListIterator, Float e) {
        ((FloatBigListIterator) bigListIterator).set(e);
      }

      @Override
      void bigListIteratorAdd(BigListIterator<Float> bigListIterator, Float e) {
        ((FloatBigListIterator) bigListIterator).add(e);
      }
    }
  }

  public static final class Sets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("FloatCollectionsTests.Sets");
      if (RUN_ARRAYSET_TESTS) {
        suite.addTest(getFloatArraySetTests());
        suite.addTest(getSynchronizedFloatArraySetTests());
        suite.addTest(getUnmodifiableFloatArraySetTests());
      }
      suite.addTest(getFloatOpenHashSetTests());
      suite.addTest(getFloatOpenHashBigSetTests());
      suite.addTest(getSingletonFloatSetTests());
      suite.addTest(getEmptyFloatSetTests());
      return suite;
    }

    private static junit.framework.Test getFloatArraySetTests() {
      return getGeneralFloatSetTests("FloatArraySet", c -> new FloatArraySet(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedFloatArraySetTests() {
      return getGeneralFloatSetTests("SynchronizedFloatArraySet",
          c -> FloatSets.synchronize(new FloatArraySet(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableFloatArraySetTests() {
      return getGeneralFloatSetTests("UnmodifiableFloatArraySet",
          c -> FloatSets.unmodifiable(new FloatArraySet(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getFloatOpenHashSetTests() {
      return getGeneralFloatSetTests("FloatOpenHashSet", c -> new FloatOpenHashSet(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getFloatOpenHashBigSetTests() {
      return getGeneralFloatSetTests("FloatOpenHashBigSet", c -> new FloatOpenHashBigSet(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getGeneralFloatSetTests(String testSuiteName,
        Function<Collection<Float>, Set<Float>> generator, Modifiable modifiable) {
      final class Generator extends FloatGeneratorBase implements TestSetGenerator<Float> {
        @Override
        public Set<Float> create(Object... elements) {
          return generator.apply(arrayToCollection(elements));
        }
      }

      List<Feature<?>> testSuiteFeatures = new ArrayList<>(4);
      testSuiteFeatures.add(CollectionSize.ANY);
      testSuiteFeatures.add(CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS);
      testSuiteFeatures.add(CollectionFeature.NON_STANDARD_TOSTRING);
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

    private static junit.framework.Test getSingletonFloatSetTests() {
      final class Generator extends FloatGeneratorBase implements TestSetGenerator<Float> {
        @Override
        public Set<Float> create(Object... elements) {
          Float value = Iterables.getOnlyElement(arrayToCollection(elements));
          return FloatSets.singleton(value);
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("FloatSingletonSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyFloatSetTests() {
      final class Generator extends FloatGeneratorBase implements TestSetGenerator<Float> {
        @Override
        public Set<Float> create(Object... elements) {
          assertEquals(0, elements.length);
          return FloatSets.EMPTY_SET;
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("FloatEmptySet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }
  }

  public static final class SortedSets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("FloatCollectionsTests.SortedSets");
      suite.addTest(getLinkedOpenHashSetTests());
      suite.addTest(getLinkedOpenCustomHashSetTests());
      suite.addTest(getAVLTreeSetTests());
      suite.addTest(getRBTreeSetTests());
      suite.addTest(getSynchronizedRBTreeSetTests());
      suite.addTest(getUnmodifiableRBTreeSetTests());
      suite.addTest(getSingletonFloatSortedSetTests());
      suite.addTest(getEmptyFloatSortedSetTests());
      return suite;
    }

    private static junit.framework.Test getLinkedOpenHashSetTests() {
      return getGeneralFloatSortedSetTests("FloatLinkedOpenHashSet",
          c -> new FloatLinkedOpenHashSet(c), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getLinkedOpenCustomHashSetTests() {
      @SuppressWarnings("serial")
      final class HashStrategy implements FloatHash.Strategy, java.io.Serializable {
        @Override
        public int hashCode(float e) {
          return Hashing.murmur3_32().hashLong(Float.floatToIntBits(e)).asInt();
        }

        @Override
        public boolean equals(float a, float b) {
          return a == b;
        }
      }

      return getGeneralFloatSortedSetTests("FloatLinkedOpenCustomHashSet",
          c -> new FloatLinkedOpenCustomHashSet(c, new HashStrategy()), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getAVLTreeSetTests() {
      return getGeneralFloatSortedSetTests("FloatAVLTreeSet", c -> new FloatAVLTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getRBTreeSetTests() {
      return getGeneralFloatSortedSetTests("FloatRBTreeSet", c -> new FloatRBTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getSynchronizedRBTreeSetTests() {
      return getGeneralFloatSortedSetTests("FloatRBTreeSet",
          c -> FloatSortedSets.synchronize(new FloatRBTreeSet(c)), Modifiable.MUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getUnmodifiableRBTreeSetTests() {
      return getGeneralFloatSortedSetTests("FloatRBTreeSet",
          c -> FloatSortedSets.unmodifiable(new FloatRBTreeSet(c)), Modifiable.IMMUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getGeneralFloatSortedSetTests(String testSuiteName,
        Function<Collection<Float>, SortedSet<Float>> generator, Modifiable modifiable,
        Ordering ordering) {
      List<Feature<?>> testSuiteFeatures = new ArrayList<>(7);
      testSuiteFeatures.add(CollectionSize.ANY);
      testSuiteFeatures.add(CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS);
      testSuiteFeatures.add(CollectionFeature.KNOWN_ORDER);
      testSuiteFeatures.add(CollectionFeature.SUBSET_VIEW);
      testSuiteFeatures.add(CollectionFeature.DESCENDING_VIEW);
      testSuiteFeatures.add(CollectionFeature.NON_STANDARD_TOSTRING);
      switch (modifiable) {
        case IMMUTABLE:
          break;
        case MUTABLE:
          testSuiteFeatures.add(SetFeature.GENERAL_PURPOSE);
          break;
        default:
          throw new IllegalArgumentException(modifiable.toString());
      }

      return SortedSetTestSuiteBuilder.using(new FloatSortedSetGenerator(ordering, generator))
          .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingletonFloatSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new FloatSortedSetGenerator(Ordering.SORTED, c -> {
        Float value = Iterables.getOnlyElement(c);
        return FloatSortedSets.singleton(value);
      })).named("FloatSingletonSortedSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW, CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyFloatSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new FloatSortedSetGenerator(Ordering.SORTED, c -> {
        assertTrue(c.isEmpty());
        return FloatSortedSets.EMPTY_SET;
      })).named("FloatSingletonSortedSet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW, CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    private static class FloatSortedSetGenerator extends FloatGeneratorBase
        implements TestSortedSetGenerator<Float> {
      private final Function<Collection<Float>, SortedSet<Float>> generator;

      FloatSortedSetGenerator(Ordering ordering,
          Function<Collection<Float>, SortedSet<Float>> generator) {
        super(TestSampleValues.FLOAT_SAMPLE_ELEMENTS_FOR_SORTED, ordering);
        this.generator = generator;
      }

      @Override
      public SortedSet<Float> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }

      @Override
      public Float belowSamplesLesser() {
        return TestSampleValues.FLOATS_FOR_SORTED[0];
      }

      @Override
      public Float belowSamplesGreater() {
        return TestSampleValues.FLOATS_FOR_SORTED[1];
      }

      @Override
      public Float aboveSamplesLesser() {
        return TestSampleValues.FLOATS_FOR_SORTED[7];
      }

      @Override
      public Float aboveSamplesGreater() {
        return TestSampleValues.FLOATS_FOR_SORTED[8];
      }
    }
  }

  public static final class FastutilFloat2ShortMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Short.class, Float2ShortArrayMap::new,
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Short.class, Float2ShortArrayMap::new,
            m -> Float2ShortMaps.synchronize((Float2ShortMap) m),
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Short.class, Float2ShortArrayMap::new,
            m -> Float2ShortMaps.unmodifiable((Float2ShortMap) m),
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Short.class, Float2ShortOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Short.class, Float2ShortLinkedOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Short.class, Float2ShortMaps::singleton,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Short.class, Float2ShortMaps.EMPTY_MAP,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilFloat2ShortSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Short.class, Float2ShortAVLTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Short.class, Float2ShortRBTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Short.class, Float2ShortRBTreeMap::new,
          m -> Float2ShortSortedMaps.synchronize((Float2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Short.class, Float2ShortRBTreeMap::new,
          m -> Float2ShortSortedMaps.unmodifiable((Float2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Short.class, Float2ShortSortedMaps::singleton,
      // TestSampleValues.SHORTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Short.class, Float2ShortSortedMaps.EMPTY_MAP,
      // TestSampleValues.SHORTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilFloat2ReferenceMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(String.class, Float2ReferenceArrayMap::new,
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(String.class, Float2ReferenceArrayMap::new,
            m -> Float2ReferenceMaps.synchronize((Float2ReferenceMap<String>) m),
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(String.class, Float2ReferenceArrayMap::new,
            m -> Float2ReferenceMaps.unmodifiable((Float2ReferenceMap<String>) m),
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(String.class, Float2ReferenceOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Float2ReferenceLinkedOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Float2ReferenceMaps::singleton,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(String.class, Float2ReferenceMaps.emptyMap(),
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilFloat2ReferenceSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Float2ReferenceAVLTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Float2ReferenceRBTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Float2ReferenceRBTreeMap::new,
          m -> Float2ReferenceSortedMaps.synchronize((Float2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Float2ReferenceRBTreeMap::new,
          m -> Float2ReferenceSortedMaps.unmodifiable((Float2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class,
      // Float2ReferenceSortedMaps::singleton,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Float2ReferenceSortedMaps.EMPTY_MAP,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilFloat2IntMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Integer.class, Float2IntArrayMap::new,
            TestSampleValues.INT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Integer.class, Float2IntArrayMap::new,
            m -> Float2IntMaps.synchronize((Float2IntMap) m),
            TestSampleValues.INT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Integer.class, Float2IntArrayMap::new,
            m -> Float2IntMaps.unmodifiable((Float2IntMap) m),
            TestSampleValues.INT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Integer.class, Float2IntOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Integer.class, Float2IntLinkedOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Integer.class, Float2IntMaps::singleton,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Integer.class, Float2IntMaps.EMPTY_MAP,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilFloat2IntSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Integer.class, Float2IntAVLTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Integer.class, Float2IntRBTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Integer.class, Float2IntRBTreeMap::new,
          m -> Float2IntSortedMaps.synchronize((Float2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Integer.class, Float2IntRBTreeMap::new,
          m -> Float2IntSortedMaps.unmodifiable((Float2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Integer.class, Float2IntSortedMaps::singleton,
      // TestSampleValues.INTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Integer.class, Float2IntSortedMaps.EMPTY_MAP,
      // TestSampleValues.INTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilFloat2DoubleMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Double.class, Float2DoubleArrayMap::new,
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Double.class, Float2DoubleArrayMap::new,
            m -> Float2DoubleMaps.synchronize((Float2DoubleMap) m),
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Double.class, Float2DoubleArrayMap::new,
            m -> Float2DoubleMaps.unmodifiable((Float2DoubleMap) m),
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Double.class, Float2DoubleOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Double.class, Float2DoubleLinkedOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Double.class, Float2DoubleMaps::singleton,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Double.class, Float2DoubleMaps.EMPTY_MAP,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilFloat2DoubleSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Double.class, Float2DoubleAVLTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Double.class, Float2DoubleRBTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Double.class, Float2DoubleRBTreeMap::new,
          m -> Float2DoubleSortedMaps.synchronize((Float2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Double.class, Float2DoubleRBTreeMap::new,
          m -> Float2DoubleSortedMaps.unmodifiable((Float2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Double.class, Float2DoubleSortedMaps::singleton,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Double.class, Float2DoubleSortedMaps.EMPTY_MAP,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilFloat2FloatMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Float.class, Float2FloatArrayMap::new,
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Float.class, Float2FloatArrayMap::new,
            m -> Float2FloatMaps.synchronize((Float2FloatMap) m),
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Float.class, Float2FloatArrayMap::new,
            m -> Float2FloatMaps.unmodifiable((Float2FloatMap) m),
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Float.class, Float2FloatOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Float.class, Float2FloatLinkedOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Float.class, Float2FloatMaps::singleton,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Float.class, Float2FloatMaps.EMPTY_MAP,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilFloat2FloatSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Float.class, Float2FloatAVLTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Float.class, Float2FloatRBTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Float.class, Float2FloatRBTreeMap::new,
          m -> Float2FloatSortedMaps.synchronize((Float2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Float.class, Float2FloatRBTreeMap::new,
          m -> Float2FloatSortedMaps.unmodifiable((Float2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Float.class, Float2FloatSortedMaps::singleton,
      // TestSampleValues.FLOATS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Float.class, Float2FloatSortedMaps.EMPTY_MAP,
      // TestSampleValues.FLOATS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilFloat2LongMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Long.class, Float2LongArrayMap::new,
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Long.class, Float2LongArrayMap::new,
            m -> Float2LongMaps.synchronize((Float2LongMap) m),
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Long.class, Float2LongArrayMap::new,
            m -> Float2LongMaps.unmodifiable((Float2LongMap) m),
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Long.class, Float2LongOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Long.class, Float2LongLinkedOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Long.class, Float2LongMaps::singleton,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Long.class, Float2LongMaps.EMPTY_MAP,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilFloat2LongSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Long.class, Float2LongAVLTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Long.class, Float2LongRBTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Long.class, Float2LongRBTreeMap::new,
          m -> Float2LongSortedMaps.synchronize((Float2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Long.class, Float2LongRBTreeMap::new,
          m -> Float2LongSortedMaps.unmodifiable((Float2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Long.class, Float2LongSortedMaps::singleton,
      // TestSampleValues.LONGS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Long.class, Float2LongSortedMaps.EMPTY_MAP,
      // TestSampleValues.LONGS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilFloat2CharMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Character.class, Float2CharArrayMap::new,
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Character.class, Float2CharArrayMap::new,
            m -> Float2CharMaps.synchronize((Float2CharMap) m),
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Character.class, Float2CharArrayMap::new,
            m -> Float2CharMaps.unmodifiable((Float2CharMap) m),
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Character.class, Float2CharOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Character.class, Float2CharLinkedOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Character.class, Float2CharMaps::singleton,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Character.class, Float2CharMaps.EMPTY_MAP,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilFloat2CharSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Character.class, Float2CharAVLTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Character.class, Float2CharRBTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Character.class, Float2CharRBTreeMap::new,
          m -> Float2CharSortedMaps.synchronize((Float2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Character.class, Float2CharRBTreeMap::new,
          m -> Float2CharSortedMaps.unmodifiable((Float2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Character.class, Float2CharSortedMaps::singleton,
      // TestSampleValues.CHARS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Character.class, Float2CharSortedMaps.EMPTY_MAP,
      // TestSampleValues.CHARS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilFloat2ObjectMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(String.class, Float2ObjectArrayMap::new,
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(String.class, Float2ObjectArrayMap::new,
            m -> Float2ObjectMaps.synchronize((Float2ObjectMap<String>) m),
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(String.class, Float2ObjectArrayMap::new,
            m -> Float2ObjectMaps.unmodifiable((Float2ObjectMap<String>) m),
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(String.class, Float2ObjectOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Float2ObjectLinkedOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Float2ObjectMaps::singleton,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(String.class, Float2ObjectMaps.emptyMap(),
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilFloat2ObjectSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Float2ObjectAVLTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Float2ObjectRBTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Float2ObjectRBTreeMap::new,
          m -> Float2ObjectSortedMaps.synchronize((Float2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Float2ObjectRBTreeMap::new,
          m -> Float2ObjectSortedMaps.unmodifiable((Float2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Float2ObjectSortedMaps::singleton,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Float2ObjectSortedMaps.EMPTY_MAP,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilFloat2ByteMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Byte.class, Float2ByteArrayMap::new,
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Byte.class, Float2ByteArrayMap::new,
            m -> Float2ByteMaps.synchronize((Float2ByteMap) m),
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Byte.class, Float2ByteArrayMap::new,
            m -> Float2ByteMaps.unmodifiable((Float2ByteMap) m),
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Byte.class, Float2ByteOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Byte.class, Float2ByteLinkedOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Byte.class, Float2ByteMaps::singleton,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Byte.class, Float2ByteMaps.EMPTY_MAP,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilFloat2ByteSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Float2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Byte.class, Float2ByteAVLTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Byte.class, Float2ByteRBTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Byte.class, Float2ByteRBTreeMap::new,
          m -> Float2ByteSortedMaps.synchronize((Float2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Byte.class, Float2ByteRBTreeMap::new,
          m -> Float2ByteSortedMaps.unmodifiable((Float2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Byte.class, Float2ByteSortedMaps::singleton,
      // TestSampleValues.BYTES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Byte.class, Float2ByteSortedMaps.EMPTY_MAP,
      // TestSampleValues.BYTES_FOR_SORTED));
      return suite;
    }
  }

  private static abstract class FloatGeneratorBase extends TestContainerGeneratorBase<Float> {
    FloatGeneratorBase() {
      this(TestSampleValues.FLOAT_SAMPLE_ELEMENTS, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    FloatGeneratorBase(SampleElements<Float> sampleElements, Ordering ordering) {
      super(Float.class, sampleElements, ordering);
    }
  }

  private static junit.framework.Test getGeneralFloatListTests(String testSuiteName,
      Function<Collection<Float>, List<Float>> generator, Modifiable modifiable) {
    final class Generator extends FloatGeneratorBase implements TestListGenerator<Float> {
      @Override
      public List<Float> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }
    }

    List<Feature<?>> testSuiteFeatures = new ArrayList<>(3);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS);
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
      Supplier<Map<Float, V>> mapFactory, SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Float, V> map = mapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedArrayMapTests(Class<V> clazzV,
      Supplier<Map<Float, V>> mapFactory, Function<Map<Float, V>, Map<Float, V>> syncrhonizeWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Float, V> map = mapFactory.get();
      map.putAll(m);
      map = syncrhonizeWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableArrayMapTests(Class<V> clazzV,
      Supplier<Map<Float, V>> mapFactory,
      Function<Map<Float, V>, Map<Float, V>> unmodifiableWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Float, V> map = mapFactory.get();
      map.putAll(m);
      map = unmodifiableWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralMapTests(Class<V> clazzV,
      Function<Map<Float, V>, Map<Float, V>> mapFactory, String testSuiteName,
      SampleElements<V> valueSampleElements, Modifiable modifiable) {
    List<Feature<?>> testSuiteFeatures = new ArrayList<>(5);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS);
    testSuiteFeatures.add(CollectionFeature.NON_STANDARD_TOSTRING);
    testSuiteFeatures.add(CollectionFeature.REMOVE_OPERATIONS);
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
        .using(new FloatMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  private static <V> junit.framework.Test getSingletonMapTests(Class<V> clazzV,
      BiFunction<Float, V, Map<Float, V>> singletonMapFactory,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonMap";
    return MapTestSuiteBuilder.using(new FloatMapGenerator<V>(clazzV, map -> {
      Map.Entry<Float, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements))
        .named(testSuiteName).withFeatures(CollectionSize.ONE,
            CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS, CollectionFeature.NON_STANDARD_TOSTRING)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getEmptyMapTests(Class<V> clazzV, Map<Float, V> emptyMap,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptyMap";
    return MapTestSuiteBuilder.using(new FloatMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements))
        .named(testSuiteName).withFeatures(CollectionSize.ZERO,
            CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS, CollectionFeature.NON_STANDARD_TOSTRING)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getSortedMapTests(Class<V> clazzV,
      Supplier<SortedMap<Float, V>> sortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Float, V> map = sortedMapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Float, V>> sortedMapFactory,
      Function<SortedMap<Float, V>, SortedMap<Float, V>> synchronziedWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Synchronized" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Float, V> map = sortedMapFactory.get();
      map.putAll(m);
      return synchronziedWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Float, V>> sortedMapFactory,
      Function<SortedMap<Float, V>, SortedMap<Float, V>> unmodifiableWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Unmodifiable" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Float, V> map = sortedMapFactory.get();
      map.putAll(m);
      return unmodifiableWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralSortedMapTests(Class<V> clazzV,
      Function<Map<Float, V>, SortedMap<Float, V>> mapFactory, String testSuiteName,
      V[] valueSampleElements, Modifiable modifiable) {
    List<Feature<?>> testSuiteFeatures = new ArrayList<>(8);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS);
    testSuiteFeatures.add(CollectionFeature.NON_STANDARD_TOSTRING);
    testSuiteFeatures.add(CollectionFeature.KNOWN_ORDER);
    testSuiteFeatures.add(CollectionFeature.SUBSET_VIEW);
    testSuiteFeatures.add(CollectionFeature.DESCENDING_VIEW);
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
        .using(new FloatSortedMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getSingletonSortedMapTests(Class<V> clazzV,
      BiFunction<Float, V, SortedMap<Float, V>> singletonSortedMapFactory,
      V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonSortedMap";
    return SortedMapTestSuiteBuilder.using(new FloatSortedMapGenerator<V>(clazzV, map -> {
      Map.Entry<Float, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonSortedMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getEmptySortedMapTests(Class<V> clazzV,
      SortedMap<Float, V> emptyMap, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptySortedMap";
    return SortedMapTestSuiteBuilder.using(new FloatSortedMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  private static final class FloatMapGenerator<V> extends TestMapGeneratorBase<Float, V> {
    private final Function<Map<Float, V>, Map<Float, V>> mapFactory;

    protected FloatMapGenerator(Class<V> clazzV, Function<Map<Float, V>, Map<Float, V>> mapFactory,
        SampleElements<V> valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected FloatMapGenerator(Class<V> clazzV, Function<Map<Float, V>, Map<Float, V>> mapFactory,
        SampleElements<V> valueSampleElements, Ordering ordering) {
      super(Float.class, clazzV, TestSampleValues.FLOAT_SAMPLE_ELEMENTS, valueSampleElements,
          ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public Map<Float, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }

  private static final class FloatSortedMapGenerator<V>
      extends TestSortedMapGeneratorBase<Float, V> {
    private final Function<Map<Float, V>, SortedMap<Float, V>> mapFactory;

    protected FloatSortedMapGenerator(Class<V> clazzV,
        Function<Map<Float, V>, SortedMap<Float, V>> mapFactory, V[] valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected FloatSortedMapGenerator(Class<V> clazzV,
        Function<Map<Float, V>, SortedMap<Float, V>> mapFactory, V[] valueSampleElements,
        Ordering ordering) {
      super(Float.class, clazzV, TestSampleValues.FLOATS_FOR_SORTED, valueSampleElements, ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public SortedMap<Float, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }
}
