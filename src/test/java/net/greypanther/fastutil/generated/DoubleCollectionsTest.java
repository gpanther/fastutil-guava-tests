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

import it.unimi.dsi.fastutil.doubles.DoubleAVLTreeSet;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleArraySet;
import it.unimi.dsi.fastutil.doubles.DoubleBigArrayBigList;
import it.unimi.dsi.fastutil.doubles.DoubleBigListIterator;
import it.unimi.dsi.fastutil.doubles.DoubleBigLists;
import it.unimi.dsi.fastutil.doubles.DoubleHash;
import com.google.common.hash.Hashing;
import it.unimi.dsi.fastutil.doubles.DoubleLinkedOpenCustomHashSet;
import it.unimi.dsi.fastutil.doubles.DoubleLinkedOpenHashSet;
import it.unimi.dsi.fastutil.doubles.DoubleLists;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashBigSet;
import it.unimi.dsi.fastutil.doubles.DoubleRBTreeSet;
import it.unimi.dsi.fastutil.doubles.DoubleSets;
import it.unimi.dsi.fastutil.doubles.DoubleSortedSets;

import it.unimi.dsi.fastutil.doubles.Double2ShortArrayMap;
import it.unimi.dsi.fastutil.doubles.Double2ShortLinkedOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2ShortMap;
import it.unimi.dsi.fastutil.doubles.Double2ShortMaps;
import it.unimi.dsi.fastutil.doubles.Double2ShortOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2ShortAVLTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2ShortRBTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap;
import it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps;

import it.unimi.dsi.fastutil.doubles.Double2ReferenceArrayMap;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceMap;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceRBTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMaps;

import it.unimi.dsi.fastutil.doubles.Double2IntArrayMap;
import it.unimi.dsi.fastutil.doubles.Double2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2IntMap;
import it.unimi.dsi.fastutil.doubles.Double2IntMaps;
import it.unimi.dsi.fastutil.doubles.Double2IntOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2IntAVLTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2IntRBTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2IntSortedMap;
import it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps;

import it.unimi.dsi.fastutil.doubles.Double2DoubleArrayMap;
import it.unimi.dsi.fastutil.doubles.Double2DoubleLinkedOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2DoubleMap;
import it.unimi.dsi.fastutil.doubles.Double2DoubleMaps;
import it.unimi.dsi.fastutil.doubles.Double2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap;
import it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps;

import it.unimi.dsi.fastutil.doubles.Double2FloatArrayMap;
import it.unimi.dsi.fastutil.doubles.Double2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2FloatMap;
import it.unimi.dsi.fastutil.doubles.Double2FloatMaps;
import it.unimi.dsi.fastutil.doubles.Double2FloatOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2FloatAVLTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2FloatRBTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap;
import it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps;

import it.unimi.dsi.fastutil.doubles.Double2LongArrayMap;
import it.unimi.dsi.fastutil.doubles.Double2LongLinkedOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2LongMap;
import it.unimi.dsi.fastutil.doubles.Double2LongMaps;
import it.unimi.dsi.fastutil.doubles.Double2LongOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2LongAVLTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2LongRBTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2LongSortedMap;
import it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps;

import it.unimi.dsi.fastutil.doubles.Double2CharArrayMap;
import it.unimi.dsi.fastutil.doubles.Double2CharLinkedOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2CharMap;
import it.unimi.dsi.fastutil.doubles.Double2CharMaps;
import it.unimi.dsi.fastutil.doubles.Double2CharOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2CharAVLTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2CharRBTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2CharSortedMap;
import it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps;

import it.unimi.dsi.fastutil.doubles.Double2ObjectArrayMap;
import it.unimi.dsi.fastutil.doubles.Double2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2ObjectMap;
import it.unimi.dsi.fastutil.doubles.Double2ObjectMaps;
import it.unimi.dsi.fastutil.doubles.Double2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2ObjectRBTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap;
import it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps;

import it.unimi.dsi.fastutil.doubles.Double2ByteArrayMap;
import it.unimi.dsi.fastutil.doubles.Double2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2ByteMap;
import it.unimi.dsi.fastutil.doubles.Double2ByteMaps;
import it.unimi.dsi.fastutil.doubles.Double2ByteOpenHashMap;
import it.unimi.dsi.fastutil.doubles.Double2ByteAVLTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2ByteRBTreeMap;
import it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap;
import it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps;


import junit.framework.TestSuite;

@RunWith(Enclosed.class)
public final class DoubleCollectionsTest {
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
      TestSuite suite = new TestSuite("DoubleCollectionsTests.Lists");
      suite.addTest(getDoubleArrayListTests());
      suite.addTest(getSynchronizedDoubleArrayListTests());
      suite.addTest(getUnmodifiableDoubleArrayListTests());
      suite.addTest(getSingletonDoubleListTests());
      suite.addTest(getEmptyDoubleListTests());
      return suite;
    }

    private static junit.framework.Test getDoubleArrayListTests() {
      return getGeneralDoubleListTests("DoubleArrayList", c -> new DoubleArrayList(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedDoubleArrayListTests() {
      return getGeneralDoubleListTests("SynchronizedDoubleArrayList",
          c -> DoubleLists.synchronize(new DoubleArrayList(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableDoubleArrayListTests() {
      return getGeneralDoubleListTests("UnmodifiableDoubleArrayList",
          c -> DoubleLists.unmodifiable(new DoubleArrayList(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonDoubleListTests() {
      final class Generator extends DoubleGeneratorBase implements TestListGenerator<Double> {
        @Override
        public List<Double> create(Object... elements) {
          Double value = Iterables.getOnlyElement(arrayToCollection(elements));
          return DoubleLists.singleton(value);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("DoubleSingletonList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyDoubleListTests() {
      final class Generator extends DoubleGeneratorBase implements TestListGenerator<Double> {
        @Override
        public List<Double> create(Object... elements) {
          assertEquals(0, elements.length);
          return DoubleLists.EMPTY_LIST;
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("DoubleEmptyList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }
  }

  public static final class BigLists {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("DoubleCollectionsTests.BigLists");
      suite.addTest(getDoubleBigArrayBigListTests());
      suite.addTest(getSynchronizedDoubleBigArrayBigListTests());
      suite.addTest(getUnmodifiableDoubleBigArrayBigListTests());
      suite.addTest(getSingletonDoubleBigListTests());
      suite.addTest(getEmptyDoubleBigListTests());
      return suite;
    }

    private static junit.framework.Test getDoubleBigArrayBigListTests() {
      return getGeneralDoubleListTests("DoubleBigArrayBigList",
          c -> new DoubleBigList2ListAdapter(new DoubleBigArrayBigList(c.iterator())),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedDoubleBigArrayBigListTests() {
      return getGeneralDoubleListTests("SynchronizedDoubleBigArrayBigList",
          c -> new DoubleBigList2ListAdapter(
              DoubleBigLists.synchronize(new DoubleBigArrayBigList(c.iterator()))),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableDoubleBigArrayBigListTests() {
      return getGeneralDoubleListTests("UnmodifiableDoubleBigArrayBigList",
          c -> new DoubleBigList2ListAdapter(
              DoubleBigLists.unmodifiable(new DoubleBigArrayBigList(c.iterator()))),
          Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonDoubleBigListTests() {
      final class Generator extends DoubleGeneratorBase implements TestListGenerator<Double> {
        @Override
        public List<Double> create(Object... elements) {
          Double value = Iterables.getOnlyElement(arrayToCollection(elements));
          return new DoubleBigList2ListAdapter(DoubleBigLists.singleton(value));
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("SingletonDoubleBigList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyDoubleBigListTests() {
      final class Generator extends DoubleGeneratorBase implements TestListGenerator<Double> {
        @Override
        public List<Double> create(Object... elements) {
          assertEquals(0, elements.length);
          return new DoubleBigList2ListAdapter(DoubleBigLists.EMPTY_BIG_LIST);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("EmptyDoubleBigList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    @SuppressWarnings("serial")
    private static final class DoubleBigList2ListAdapter extends BigList2ListAdapter<Double> {
      private DoubleBigList2ListAdapter(BigList<Double> bigList) {
        super(bigList);
      }

      @Override
      public List<Double> subList(int fromIndex, int toIndex) {
        return new DoubleBigList2ListAdapter(bigList.subList(fromIndex, toIndex));
      }

      @Override
      void bigListIteratorSet(BigListIterator<Double> bigListIterator, Double e) {
        ((DoubleBigListIterator) bigListIterator).set(e);
      }

      @Override
      void bigListIteratorAdd(BigListIterator<Double> bigListIterator, Double e) {
        ((DoubleBigListIterator) bigListIterator).add(e);
      }
    }
  }

  public static final class Sets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("DoubleCollectionsTests.Sets");
      suite.addTest(getDoubleArraySetTests());
      suite.addTest(getSynchronizedDoubleArraySetTests());
      suite.addTest(getUnmodifiableDoubleArraySetTests());
      suite.addTest(getDoubleOpenHashSetTests());
      suite.addTest(getDoubleOpenHashBigSetTests());
      suite.addTest(getSingletonDoubleSetTests());
      suite.addTest(getEmptyDoubleSetTests());
      return suite;
    }

    private static junit.framework.Test getDoubleArraySetTests() {
      return getGeneralDoubleSetTests("DoubleArraySet", c -> new DoubleArraySet(c), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedDoubleArraySetTests() {
      return getGeneralDoubleSetTests("SynchronizedDoubleArraySet",
          c -> DoubleSets.synchronize(new DoubleArraySet(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableDoubleArraySetTests() {
      return getGeneralDoubleSetTests("UnmodifiableDoubleArraySet",
          c -> DoubleSets.unmodifiable(new DoubleArraySet(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getDoubleOpenHashSetTests() {
      return getGeneralDoubleSetTests("DoubleOpenHashSet", c -> new DoubleOpenHashSet(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getDoubleOpenHashBigSetTests() {
      return getGeneralDoubleSetTests("DoubleOpenHashBigSet", c -> new DoubleOpenHashBigSet(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getGeneralDoubleSetTests(String testSuiteName,
        Function<Collection<Double>, Set<Double>> generator, Modifiable modifiable) {
      final class Generator extends DoubleGeneratorBase implements TestSetGenerator<Double> {
        @Override
        public Set<Double> create(Object... elements) {
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

    private static junit.framework.Test getSingletonDoubleSetTests() {
      final class Generator extends DoubleGeneratorBase implements TestSetGenerator<Double> {
        @Override
        public Set<Double> create(Object... elements) {
          Double value = Iterables.getOnlyElement(arrayToCollection(elements));
          return DoubleSets.singleton(value);
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("DoubleSingletonSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyDoubleSetTests() {
      final class Generator extends DoubleGeneratorBase implements TestSetGenerator<Double> {
        @Override
        public Set<Double> create(Object... elements) {
          assertEquals(0, elements.length);
          return DoubleSets.EMPTY_SET;
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("DoubleEmptySet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }
  }

  public static final class SortedSets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("DoubleCollectionsTests.SortedSets");
      suite.addTest(getLinkedOpenHashSetTests());
      suite.addTest(getLinkedOpenCustomHashSetTests());
      suite.addTest(getAVLTreeSetTests());
      suite.addTest(getRBTreeSetTests());
      suite.addTest(getSynchronizedRBTreeSetTests());
      suite.addTest(getUnmodifiableRBTreeSetTests());
      suite.addTest(getSingletonDoubleSortedSetTests());
      suite.addTest(getEmptyDoubleSortedSetTests());
      return suite;
    }

    private static junit.framework.Test getLinkedOpenHashSetTests() {
      return getGeneralDoubleSortedSetTests("DoubleLinkedOpenHashSet",
          c -> new DoubleLinkedOpenHashSet(c), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getLinkedOpenCustomHashSetTests() {
      @SuppressWarnings("serial")
      final class HashStrategy implements DoubleHash.Strategy, java.io.Serializable {
        @Override
        public int hashCode(double e) {
          return Hashing.murmur3_32().hashLong(Double.doubleToLongBits(e)).asInt();
        }

        @Override
        public boolean equals(double a, double b) {
          return a == b;
        }
      }

      return getGeneralDoubleSortedSetTests("DoubleLinkedOpenCustomHashSet",
          c -> new DoubleLinkedOpenCustomHashSet(c, new HashStrategy()), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getAVLTreeSetTests() {
      return getGeneralDoubleSortedSetTests("DoubleAVLTreeSet", c -> new DoubleAVLTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getRBTreeSetTests() {
      return getGeneralDoubleSortedSetTests("DoubleRBTreeSet", c -> new DoubleRBTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getSynchronizedRBTreeSetTests() {
      return getGeneralDoubleSortedSetTests("DoubleRBTreeSet",
          c -> DoubleSortedSets.synchronize(new DoubleRBTreeSet(c)), Modifiable.MUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getUnmodifiableRBTreeSetTests() {
      return getGeneralDoubleSortedSetTests("DoubleRBTreeSet",
          c -> DoubleSortedSets.unmodifiable(new DoubleRBTreeSet(c)), Modifiable.IMMUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getGeneralDoubleSortedSetTests(String testSuiteName,
        Function<Collection<Double>, SortedSet<Double>> generator, Modifiable modifiable,
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

      return SortedSetTestSuiteBuilder.using(new DoubleSortedSetGenerator(ordering, generator))
          .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingletonDoubleSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new DoubleSortedSetGenerator(Ordering.SORTED, c -> {
        Double value = Iterables.getOnlyElement(c);
        return DoubleSortedSets.singleton(value);
      })).named("DoubleSingletonSortedSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyDoubleSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new DoubleSortedSetGenerator(Ordering.SORTED, c -> {
        assertTrue(c.isEmpty());
        return DoubleSortedSets.EMPTY_SET;
      })).named("DoubleSingletonSortedSet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

    private static class DoubleSortedSetGenerator extends DoubleGeneratorBase
        implements TestSortedSetGenerator<Double> {
      private final Function<Collection<Double>, SortedSet<Double>> generator;

      DoubleSortedSetGenerator(Ordering ordering,
          Function<Collection<Double>, SortedSet<Double>> generator) {
        super(TestSampleValues.DOUBLE_SAMPLE_ELEMENTS_FOR_SORTED, ordering);
        this.generator = generator;
      }

      @Override
      public SortedSet<Double> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }

      @Override
      public Double belowSamplesLesser() {
        return TestSampleValues.DOUBLES_FOR_SORTED[0];
      }

      @Override
      public Double belowSamplesGreater() {
        return TestSampleValues.DOUBLES_FOR_SORTED[1];
      }

      @Override
      public Double aboveSamplesLesser() {
        return TestSampleValues.DOUBLES_FOR_SORTED[7];
      }

      @Override
      public Double aboveSamplesGreater() {
        return TestSampleValues.DOUBLES_FOR_SORTED[8];
      }
    }
  }

  public static final class FastutilDouble2ShortMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Short.class, Double2ShortArrayMap::new, TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Short.class, Double2ShortArrayMap::new,
          m -> Double2ShortMaps.synchronize((Double2ShortMap) m), TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Short.class, Double2ShortArrayMap::new,
          m -> Double2ShortMaps.unmodifiable((Double2ShortMap) m),
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Short.class, Double2ShortOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Short.class, Double2ShortLinkedOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Short.class, Double2ShortMaps::singleton,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Short.class, getEmptyMap(), TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Double2ShortMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilDouble2ShortSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Short.class, Double2ShortAVLTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Short.class, Double2ShortRBTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Short.class, Double2ShortRBTreeMap::new,
          m -> Double2ShortSortedMaps.synchronize((Double2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Short.class, Double2ShortRBTreeMap::new,
          m -> Double2ShortSortedMaps.unmodifiable((Double2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Short.class, Double2ShortSortedMaps::singleton,
      // TestSampleValues.SHORTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Short.class, Double2ShortSortedMaps.EMPTY_MAP,
      // TestSampleValues.SHORTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilDouble2ReferenceMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.Maps");
      suite.addTest(
          getMapTests(String.class, Double2ReferenceArrayMap::new, TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(String.class, Double2ReferenceArrayMap::new,
          m -> Double2ReferenceMaps.synchronize((Double2ReferenceMap<String>) m), TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(String.class, Double2ReferenceArrayMap::new,
          m -> Double2ReferenceMaps.unmodifiable((Double2ReferenceMap<String>) m),
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(String.class, Double2ReferenceOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Double2ReferenceLinkedOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Double2ReferenceMaps::singleton,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(String.class, getEmptyMap(), TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Double2ReferenceMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilDouble2ReferenceSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Double2ReferenceAVLTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Double2ReferenceRBTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Double2ReferenceRBTreeMap::new,
          m -> Double2ReferenceSortedMaps.synchronize((Double2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Double2ReferenceRBTreeMap::new,
          m -> Double2ReferenceSortedMaps.unmodifiable((Double2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Double2ReferenceSortedMaps::singleton,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Double2ReferenceSortedMaps.EMPTY_MAP,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilDouble2IntMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Integer.class, Double2IntArrayMap::new, TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Integer.class, Double2IntArrayMap::new,
          m -> Double2IntMaps.synchronize((Double2IntMap) m), TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Integer.class, Double2IntArrayMap::new,
          m -> Double2IntMaps.unmodifiable((Double2IntMap) m),
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Integer.class, Double2IntOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Integer.class, Double2IntLinkedOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Integer.class, Double2IntMaps::singleton,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Integer.class, getEmptyMap(), TestSampleValues.INT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Double2IntMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilDouble2IntSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Integer.class, Double2IntAVLTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Integer.class, Double2IntRBTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Integer.class, Double2IntRBTreeMap::new,
          m -> Double2IntSortedMaps.synchronize((Double2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Integer.class, Double2IntRBTreeMap::new,
          m -> Double2IntSortedMaps.unmodifiable((Double2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Integer.class, Double2IntSortedMaps::singleton,
      // TestSampleValues.INTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Integer.class, Double2IntSortedMaps.EMPTY_MAP,
      // TestSampleValues.INTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilDouble2DoubleMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Double.class, Double2DoubleArrayMap::new, TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Double.class, Double2DoubleArrayMap::new,
          m -> Double2DoubleMaps.synchronize((Double2DoubleMap) m), TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Double.class, Double2DoubleArrayMap::new,
          m -> Double2DoubleMaps.unmodifiable((Double2DoubleMap) m),
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Double.class, Double2DoubleOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Double.class, Double2DoubleLinkedOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Double.class, Double2DoubleMaps::singleton,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Double.class, getEmptyMap(), TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Double2DoubleMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilDouble2DoubleSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Double.class, Double2DoubleAVLTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Double.class, Double2DoubleRBTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Double.class, Double2DoubleRBTreeMap::new,
          m -> Double2DoubleSortedMaps.synchronize((Double2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Double.class, Double2DoubleRBTreeMap::new,
          m -> Double2DoubleSortedMaps.unmodifiable((Double2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Double.class, Double2DoubleSortedMaps::singleton,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Double.class, Double2DoubleSortedMaps.EMPTY_MAP,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilDouble2FloatMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Float.class, Double2FloatArrayMap::new, TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Float.class, Double2FloatArrayMap::new,
          m -> Double2FloatMaps.synchronize((Double2FloatMap) m), TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Float.class, Double2FloatArrayMap::new,
          m -> Double2FloatMaps.unmodifiable((Double2FloatMap) m),
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Float.class, Double2FloatOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Float.class, Double2FloatLinkedOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Float.class, Double2FloatMaps::singleton,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Float.class, getEmptyMap(), TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Double2FloatMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilDouble2FloatSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Float.class, Double2FloatAVLTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Float.class, Double2FloatRBTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Float.class, Double2FloatRBTreeMap::new,
          m -> Double2FloatSortedMaps.synchronize((Double2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Float.class, Double2FloatRBTreeMap::new,
          m -> Double2FloatSortedMaps.unmodifiable((Double2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Float.class, Double2FloatSortedMaps::singleton,
      // TestSampleValues.FLOATS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Float.class, Double2FloatSortedMaps.EMPTY_MAP,
      // TestSampleValues.FLOATS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilDouble2LongMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Long.class, Double2LongArrayMap::new, TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Long.class, Double2LongArrayMap::new,
          m -> Double2LongMaps.synchronize((Double2LongMap) m), TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Long.class, Double2LongArrayMap::new,
          m -> Double2LongMaps.unmodifiable((Double2LongMap) m),
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Long.class, Double2LongOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Long.class, Double2LongLinkedOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Long.class, Double2LongMaps::singleton,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Long.class, getEmptyMap(), TestSampleValues.LONG_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Double2LongMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilDouble2LongSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Long.class, Double2LongAVLTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Long.class, Double2LongRBTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Long.class, Double2LongRBTreeMap::new,
          m -> Double2LongSortedMaps.synchronize((Double2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Long.class, Double2LongRBTreeMap::new,
          m -> Double2LongSortedMaps.unmodifiable((Double2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Long.class, Double2LongSortedMaps::singleton,
      // TestSampleValues.LONGS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Long.class, Double2LongSortedMaps.EMPTY_MAP,
      // TestSampleValues.LONGS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilDouble2CharMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Character.class, Double2CharArrayMap::new, TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Character.class, Double2CharArrayMap::new,
          m -> Double2CharMaps.synchronize((Double2CharMap) m), TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Character.class, Double2CharArrayMap::new,
          m -> Double2CharMaps.unmodifiable((Double2CharMap) m),
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Character.class, Double2CharOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Character.class, Double2CharLinkedOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Character.class, Double2CharMaps::singleton,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Character.class, getEmptyMap(), TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Double2CharMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilDouble2CharSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Character.class, Double2CharAVLTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Character.class, Double2CharRBTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Character.class, Double2CharRBTreeMap::new,
          m -> Double2CharSortedMaps.synchronize((Double2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Character.class, Double2CharRBTreeMap::new,
          m -> Double2CharSortedMaps.unmodifiable((Double2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Character.class, Double2CharSortedMaps::singleton,
      // TestSampleValues.CHARS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Character.class, Double2CharSortedMaps.EMPTY_MAP,
      // TestSampleValues.CHARS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilDouble2ObjectMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.Maps");
      suite.addTest(
          getMapTests(String.class, Double2ObjectArrayMap::new, TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(String.class, Double2ObjectArrayMap::new,
          m -> Double2ObjectMaps.synchronize((Double2ObjectMap<String>) m), TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(String.class, Double2ObjectArrayMap::new,
          m -> Double2ObjectMaps.unmodifiable((Double2ObjectMap<String>) m),
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(String.class, Double2ObjectOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Double2ObjectLinkedOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Double2ObjectMaps::singleton,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(String.class, getEmptyMap(), TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Double2ObjectMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilDouble2ObjectSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Double2ObjectAVLTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Double2ObjectRBTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Double2ObjectRBTreeMap::new,
          m -> Double2ObjectSortedMaps.synchronize((Double2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Double2ObjectRBTreeMap::new,
          m -> Double2ObjectSortedMaps.unmodifiable((Double2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Double2ObjectSortedMaps::singleton,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Double2ObjectSortedMaps.EMPTY_MAP,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilDouble2ByteMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Byte.class, Double2ByteArrayMap::new, TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Byte.class, Double2ByteArrayMap::new,
          m -> Double2ByteMaps.synchronize((Double2ByteMap) m), TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Byte.class, Double2ByteArrayMap::new,
          m -> Double2ByteMaps.unmodifiable((Double2ByteMap) m),
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Byte.class, Double2ByteOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Byte.class, Double2ByteLinkedOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Byte.class, Double2ByteMaps::singleton,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Byte.class, getEmptyMap(), TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Double2ByteMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilDouble2ByteSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Double2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Byte.class, Double2ByteAVLTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Byte.class, Double2ByteRBTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Byte.class, Double2ByteRBTreeMap::new,
          m -> Double2ByteSortedMaps.synchronize((Double2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Byte.class, Double2ByteRBTreeMap::new,
          m -> Double2ByteSortedMaps.unmodifiable((Double2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Byte.class, Double2ByteSortedMaps::singleton,
      // TestSampleValues.BYTES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Byte.class, Double2ByteSortedMaps.EMPTY_MAP,
      // TestSampleValues.BYTES_FOR_SORTED));
      return suite;
    }
  }

  private static abstract class DoubleGeneratorBase extends TestContainerGeneratorBase<Double> {
    DoubleGeneratorBase() {
      this(TestSampleValues.DOUBLE_SAMPLE_ELEMENTS, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    DoubleGeneratorBase(SampleElements<Double> sampleElements, Ordering ordering) {
      super(Double.class, sampleElements, ordering);
    }
  }

  private static junit.framework.Test getGeneralDoubleListTests(String testSuiteName,
      Function<Collection<Double>, List<Double>> generator, Modifiable modifiable) {
    final class Generator extends DoubleGeneratorBase implements TestListGenerator<Double> {
      @Override
      public List<Double> create(Object... elements) {
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
      Supplier<Map<Double, V>> mapFactory, SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Double, V> map = mapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedArrayMapTests(Class<V> clazzV,
      Supplier<Map<Double, V>> mapFactory, Function<Map<Double, V>, Map<Double, V>> syncrhonizeWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Double, V> map = mapFactory.get();
      map.putAll(m);
      map = syncrhonizeWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableArrayMapTests(Class<V> clazzV,
      Supplier<Map<Double, V>> mapFactory, Function<Map<Double, V>, Map<Double, V>> unmodifiableWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Double, V> map = mapFactory.get();
      map.putAll(m);
      map = unmodifiableWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralMapTests(Class<V> clazzV,
      Function<Map<Double, V>, Map<Double, V>> mapFactory, String testSuiteName,
      SampleElements<V> valueSampleElements, Modifiable modifiable) {
    List<Feature<?>> testSuiteFeatures = new ArrayList<>(5);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE);
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
        .using(new DoubleMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  private static <V> junit.framework.Test getSingletonMapTests(Class<V> clazzV,
      BiFunction<Double, V, Map<Double, V>> singletonMapFactory,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonMap";
    return MapTestSuiteBuilder.using(new DoubleMapGenerator<V>(clazzV, map -> {
      Map.Entry<Double, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE, CollectionFeature.NON_STANDARD_TOSTRING)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getEmptyMapTests(Class<V> clazzV, Map<Double, V> emptyMap,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptyMap";
    return MapTestSuiteBuilder.using(new DoubleMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getSortedMapTests(Class<V> clazzV,
      Supplier<SortedMap<Double, V>> sortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Double, V> map = sortedMapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Double, V>> sortedMapFactory,
      Function<SortedMap<Double, V>, SortedMap<Double, V>> synchronziedWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Synchronized" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Double, V> map = sortedMapFactory.get();
      map.putAll(m);
      return synchronziedWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Double, V>> sortedMapFactory,
      Function<SortedMap<Double, V>, SortedMap<Double, V>> unmodifiableWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Unmodifiable" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Double, V> map = sortedMapFactory.get();
      map.putAll(m);
      return unmodifiableWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralSortedMapTests(Class<V> clazzV,
      Function<Map<Double, V>, SortedMap<Double, V>> mapFactory, String testSuiteName,
      V[] valueSampleElements, Modifiable modifiable) {
    List<Feature<?>> testSuiteFeatures = new ArrayList<>(8);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE);
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
        .using(new DoubleSortedMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getSingletonSortedMapTests(Class<V> clazzV,
      BiFunction<Double, V, SortedMap<Double, V>> singletonSortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonSortedMap";
    return SortedMapTestSuiteBuilder.using(new DoubleSortedMapGenerator<V>(clazzV, map -> {
      Map.Entry<Double, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonSortedMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
        .createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getEmptySortedMapTests(Class<V> clazzV,
      SortedMap<Double, V> emptyMap, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptySortedMap";
    return SortedMapTestSuiteBuilder.using(new DoubleSortedMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
        .createTestSuite();
  }

  private static final class DoubleMapGenerator<V> extends TestMapGeneratorBase<Double, V> {
    private final Function<Map<Double, V>, Map<Double, V>> mapFactory;

    protected DoubleMapGenerator(Class<V> clazzV, Function<Map<Double, V>, Map<Double, V>> mapFactory,
        SampleElements<V> valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected DoubleMapGenerator(Class<V> clazzV, Function<Map<Double, V>, Map<Double, V>> mapFactory,
        SampleElements<V> valueSampleElements, Ordering ordering) {
      super(Double.class, clazzV, TestSampleValues.DOUBLE_SAMPLE_ELEMENTS, valueSampleElements,
          ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public Map<Double, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }

  private static final class DoubleSortedMapGenerator<V> extends TestSortedMapGeneratorBase<Double, V> {
    private final Function<Map<Double, V>, SortedMap<Double, V>> mapFactory;

    protected DoubleSortedMapGenerator(Class<V> clazzV,
        Function<Map<Double, V>, SortedMap<Double, V>> mapFactory, V[] valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected DoubleSortedMapGenerator(Class<V> clazzV,
        Function<Map<Double, V>, SortedMap<Double, V>> mapFactory, V[] valueSampleElements,
        Ordering ordering) {
      super(Double.class, clazzV, TestSampleValues.DOUBLES_FOR_SORTED, valueSampleElements, ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public SortedMap<Double, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }
}