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

import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongArraySet;
import it.unimi.dsi.fastutil.longs.LongBigArrayBigList;
import it.unimi.dsi.fastutil.longs.LongBigListIterator;
import it.unimi.dsi.fastutil.longs.LongBigLists;
import it.unimi.dsi.fastutil.longs.LongHash;
import com.google.common.hash.Hashing;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenCustomHashSet;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongLists;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashBigSet;
import it.unimi.dsi.fastutil.longs.LongRBTreeSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.longs.LongSortedSets;

import it.unimi.dsi.fastutil.longs.Long2ShortArrayMap;
import it.unimi.dsi.fastutil.longs.Long2ShortLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ShortMap;
import it.unimi.dsi.fastutil.longs.Long2ShortMaps;
import it.unimi.dsi.fastutil.longs.Long2ShortOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ShortAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ShortRBTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ShortSortedMap;
import it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps;

import it.unimi.dsi.fastutil.longs.Long2ReferenceArrayMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceMaps;
import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceRBTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMaps;

import it.unimi.dsi.fastutil.longs.Long2IntArrayMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2IntRBTreeMap;
import it.unimi.dsi.fastutil.longs.Long2IntSortedMap;
import it.unimi.dsi.fastutil.longs.Long2IntSortedMaps;

import it.unimi.dsi.fastutil.longs.Long2DoubleArrayMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleMaps;
import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps;

import it.unimi.dsi.fastutil.longs.Long2FloatArrayMap;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2FloatMap;
import it.unimi.dsi.fastutil.longs.Long2FloatMaps;
import it.unimi.dsi.fastutil.longs.Long2FloatOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2FloatAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2FloatRBTreeMap;
import it.unimi.dsi.fastutil.longs.Long2FloatSortedMap;
import it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps;

import it.unimi.dsi.fastutil.longs.Long2LongArrayMap;
import it.unimi.dsi.fastutil.longs.Long2LongLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongMaps;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2LongRBTreeMap;
import it.unimi.dsi.fastutil.longs.Long2LongSortedMap;
import it.unimi.dsi.fastutil.longs.Long2LongSortedMaps;

import it.unimi.dsi.fastutil.longs.Long2CharArrayMap;
import it.unimi.dsi.fastutil.longs.Long2CharLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2CharMap;
import it.unimi.dsi.fastutil.longs.Long2CharMaps;
import it.unimi.dsi.fastutil.longs.Long2CharOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2CharAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2CharRBTreeMap;
import it.unimi.dsi.fastutil.longs.Long2CharSortedMap;
import it.unimi.dsi.fastutil.longs.Long2CharSortedMaps;

import it.unimi.dsi.fastutil.longs.Long2ObjectArrayMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectRBTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps;

import it.unimi.dsi.fastutil.longs.Long2ByteArrayMap;
import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMaps;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ByteRBTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ByteSortedMap;
import it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps;


import junit.framework.TestSuite;

@RunWith(Enclosed.class)
public final class LongCollectionsTest {
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
      TestSuite suite = new TestSuite("LongCollectionsTests.Lists");
      suite.addTest(getLongArrayListTests());
      suite.addTest(getSynchronizedLongArrayListTests());
      suite.addTest(getUnmodifiableLongArrayListTests());
      suite.addTest(getSingletonLongListTests());
      suite.addTest(getEmptyLongListTests());
      return suite;
    }

    private static junit.framework.Test getLongArrayListTests() {
      return getGeneralLongListTests("LongArrayList", c -> new LongArrayList(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedLongArrayListTests() {
      return getGeneralLongListTests("SynchronizedLongArrayList",
          c -> LongLists.synchronize(new LongArrayList(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableLongArrayListTests() {
      return getGeneralLongListTests("UnmodifiableLongArrayList",
          c -> LongLists.unmodifiable(new LongArrayList(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonLongListTests() {
      final class Generator extends LongGeneratorBase implements TestListGenerator<Long> {
        @Override
        public List<Long> create(Object... elements) {
          Long value = Iterables.getOnlyElement(arrayToCollection(elements));
          return LongLists.singleton(value);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("LongSingletonList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyLongListTests() {
      final class Generator extends LongGeneratorBase implements TestListGenerator<Long> {
        @Override
        public List<Long> create(Object... elements) {
          assertEquals(0, elements.length);
          return LongLists.EMPTY_LIST;
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("LongEmptyList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }
  }

  public static final class BigLists {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("LongCollectionsTests.BigLists");
      suite.addTest(getLongBigArrayBigListTests());
      suite.addTest(getSynchronizedLongBigArrayBigListTests());
      suite.addTest(getUnmodifiableLongBigArrayBigListTests());
      suite.addTest(getSingletonLongBigListTests());
      suite.addTest(getEmptyLongBigListTests());
      return suite;
    }

    private static junit.framework.Test getLongBigArrayBigListTests() {
      return getGeneralLongListTests("LongBigArrayBigList",
          c -> new LongBigList2ListAdapter(new LongBigArrayBigList(c.iterator())),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedLongBigArrayBigListTests() {
      return getGeneralLongListTests("SynchronizedLongBigArrayBigList",
          c -> new LongBigList2ListAdapter(
              LongBigLists.synchronize(new LongBigArrayBigList(c.iterator()))),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableLongBigArrayBigListTests() {
      return getGeneralLongListTests("UnmodifiableLongBigArrayBigList",
          c -> new LongBigList2ListAdapter(
              LongBigLists.unmodifiable(new LongBigArrayBigList(c.iterator()))),
          Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonLongBigListTests() {
      final class Generator extends LongGeneratorBase implements TestListGenerator<Long> {
        @Override
        public List<Long> create(Object... elements) {
          Long value = Iterables.getOnlyElement(arrayToCollection(elements));
          return new LongBigList2ListAdapter(LongBigLists.singleton(value));
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("SingletonLongBigList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyLongBigListTests() {
      final class Generator extends LongGeneratorBase implements TestListGenerator<Long> {
        @Override
        public List<Long> create(Object... elements) {
          assertEquals(0, elements.length);
          return new LongBigList2ListAdapter(LongBigLists.EMPTY_BIG_LIST);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("EmptyLongBigList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    @SuppressWarnings("serial")
    private static final class LongBigList2ListAdapter extends BigList2ListAdapter<Long> {
      private LongBigList2ListAdapter(BigList<Long> bigList) {
        super(bigList);
      }

      @Override
      public List<Long> subList(int fromIndex, int toIndex) {
        return new LongBigList2ListAdapter(bigList.subList(fromIndex, toIndex));
      }

      @Override
      void bigListIteratorSet(BigListIterator<Long> bigListIterator, Long e) {
        ((LongBigListIterator) bigListIterator).set(e);
      }

      @Override
      void bigListIteratorAdd(BigListIterator<Long> bigListIterator, Long e) {
        ((LongBigListIterator) bigListIterator).add(e);
      }
    }
  }

  public static final class Sets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("LongCollectionsTests.Sets");
      suite.addTest(getLongArraySetTests());
      suite.addTest(getSynchronizedLongArraySetTests());
      suite.addTest(getUnmodifiableLongArraySetTests());
      suite.addTest(getLongOpenHashSetTests());
      suite.addTest(getLongOpenHashBigSetTests());
      suite.addTest(getSingletonLongSetTests());
      suite.addTest(getEmptyLongSetTests());
      return suite;
    }

    private static junit.framework.Test getLongArraySetTests() {
      return getGeneralLongSetTests("LongArraySet", c -> new LongArraySet(c), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedLongArraySetTests() {
      return getGeneralLongSetTests("SynchronizedLongArraySet",
          c -> LongSets.synchronize(new LongArraySet(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableLongArraySetTests() {
      return getGeneralLongSetTests("UnmodifiableLongArraySet",
          c -> LongSets.unmodifiable(new LongArraySet(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getLongOpenHashSetTests() {
      return getGeneralLongSetTests("LongOpenHashSet", c -> new LongOpenHashSet(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getLongOpenHashBigSetTests() {
      return getGeneralLongSetTests("LongOpenHashBigSet", c -> new LongOpenHashBigSet(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getGeneralLongSetTests(String testSuiteName,
        Function<Collection<Long>, Set<Long>> generator, Modifiable modifiable) {
      final class Generator extends LongGeneratorBase implements TestSetGenerator<Long> {
        @Override
        public Set<Long> create(Object... elements) {
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
          testSuiteFeatures.add(SetFeature.GENERAL_PURPOSE);
          break;
        default:
          throw new IllegalArgumentException(modifiable.toString());
      }

      return SetTestSuiteBuilder.using(new Generator()).named(testSuiteName)
          .withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingletonLongSetTests() {
      final class Generator extends LongGeneratorBase implements TestSetGenerator<Long> {
        @Override
        public Set<Long> create(Object... elements) {
          Long value = Iterables.getOnlyElement(arrayToCollection(elements));
          return LongSets.singleton(value);
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("LongSingletonSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyLongSetTests() {
      final class Generator extends LongGeneratorBase implements TestSetGenerator<Long> {
        @Override
        public Set<Long> create(Object... elements) {
          assertEquals(0, elements.length);
          return LongSets.EMPTY_SET;
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("LongEmptySet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }
  }

  public static final class SortedSets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("LongCollectionsTests.SortedSets");
      suite.addTest(getLinkedOpenHashSetTests());
      suite.addTest(getLinkedOpenCustomHashSetTests());
      suite.addTest(getAVLTreeSetTests());
      suite.addTest(getRBTreeSetTests());
      suite.addTest(getSynchronizedRBTreeSetTests());
      suite.addTest(getUnmodifiableRBTreeSetTests());
      suite.addTest(getSingletonLongSortedSetTests());
      suite.addTest(getEmptyLongSortedSetTests());
      return suite;
    }

    private static junit.framework.Test getLinkedOpenHashSetTests() {
      return getGeneralLongSortedSetTests("LongLinkedOpenHashSet",
          c -> new LongLinkedOpenHashSet(c), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getLinkedOpenCustomHashSetTests() {
      @SuppressWarnings("serial")
      final class HashStrategy implements LongHash.Strategy, java.io.Serializable {
        @Override
        public int hashCode(long e) {
          return Hashing.murmur3_32().hashLong(e).asInt();
        }

        @Override
        public boolean equals(long a, long b) {
          return a == b;
        }
      }

      return getGeneralLongSortedSetTests("LongLinkedOpenCustomHashSet",
          c -> new LongLinkedOpenCustomHashSet(c, new HashStrategy()), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getAVLTreeSetTests() {
      return getGeneralLongSortedSetTests("LongAVLTreeSet", c -> new LongAVLTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getRBTreeSetTests() {
      return getGeneralLongSortedSetTests("LongRBTreeSet", c -> new LongRBTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getSynchronizedRBTreeSetTests() {
      return getGeneralLongSortedSetTests("LongRBTreeSet",
          c -> LongSortedSets.synchronize(new LongRBTreeSet(c)), Modifiable.MUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getUnmodifiableRBTreeSetTests() {
      return getGeneralLongSortedSetTests("LongRBTreeSet",
          c -> LongSortedSets.unmodifiable(new LongRBTreeSet(c)), Modifiable.IMMUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getGeneralLongSortedSetTests(String testSuiteName,
        Function<Collection<Long>, SortedSet<Long>> generator, Modifiable modifiable,
        Ordering ordering) {
      List<Feature<?>> testSuiteFeatures = new ArrayList<>(3);
      testSuiteFeatures.add(CollectionSize.ANY);
      testSuiteFeatures.add(CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS);
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

      return SortedSetTestSuiteBuilder.using(new LongSortedSetGenerator(ordering, generator))
          .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingletonLongSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new LongSortedSetGenerator(Ordering.SORTED, c -> {
        Long value = Iterables.getOnlyElement(c);
        return LongSortedSets.singleton(value);
      })).named("LongSingletonSortedSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyLongSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new LongSortedSetGenerator(Ordering.SORTED, c -> {
        assertTrue(c.isEmpty());
        return LongSortedSets.EMPTY_SET;
      })).named("LongSingletonSortedSet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

    private static class LongSortedSetGenerator extends LongGeneratorBase
        implements TestSortedSetGenerator<Long> {
      private final Function<Collection<Long>, SortedSet<Long>> generator;

      LongSortedSetGenerator(Ordering ordering,
          Function<Collection<Long>, SortedSet<Long>> generator) {
        super(TestSampleValues.LONG_SAMPLE_ELEMENTS_FOR_SORTED, ordering);
        this.generator = generator;
      }

      @Override
      public SortedSet<Long> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }

      @Override
      public Long belowSamplesLesser() {
        return TestSampleValues.LONGS_FOR_SORTED[0];
      }

      @Override
      public Long belowSamplesGreater() {
        return TestSampleValues.LONGS_FOR_SORTED[1];
      }

      @Override
      public Long aboveSamplesLesser() {
        return TestSampleValues.LONGS_FOR_SORTED[7];
      }

      @Override
      public Long aboveSamplesGreater() {
        return TestSampleValues.LONGS_FOR_SORTED[8];
      }
    }
  }

  public static final class FastutilLong2ShortMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Short.class, Long2ShortArrayMap::new, TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Short.class, Long2ShortArrayMap::new,
          m -> Long2ShortMaps.synchronize((Long2ShortMap) m), TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Short.class, Long2ShortArrayMap::new,
          m -> Long2ShortMaps.unmodifiable((Long2ShortMap) m),
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Short.class, Long2ShortOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Short.class, Long2ShortLinkedOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Short.class, Long2ShortMaps::singleton,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Short.class, getEmptyMap(), TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Long2ShortMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilLong2ShortSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Short.class, Long2ShortAVLTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Short.class, Long2ShortRBTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Short.class, Long2ShortRBTreeMap::new,
          m -> Long2ShortSortedMaps.synchronize((Long2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Short.class, Long2ShortRBTreeMap::new,
          m -> Long2ShortSortedMaps.unmodifiable((Long2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Short.class, Long2ShortSortedMaps::singleton,
      // TestSampleValues.SHORTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Short.class, Long2ShortSortedMaps.EMPTY_MAP,
      // TestSampleValues.SHORTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilLong2ReferenceMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.Maps");
      suite.addTest(
          getMapTests(String.class, Long2ReferenceArrayMap::new, TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(String.class, Long2ReferenceArrayMap::new,
          m -> Long2ReferenceMaps.synchronize((Long2ReferenceMap<String>) m), TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(String.class, Long2ReferenceArrayMap::new,
          m -> Long2ReferenceMaps.unmodifiable((Long2ReferenceMap<String>) m),
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(String.class, Long2ReferenceOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Long2ReferenceLinkedOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Long2ReferenceMaps::singleton,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(String.class, getEmptyMap(), TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Long2ReferenceMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilLong2ReferenceSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Long2ReferenceAVLTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Long2ReferenceRBTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Long2ReferenceRBTreeMap::new,
          m -> Long2ReferenceSortedMaps.synchronize((Long2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Long2ReferenceRBTreeMap::new,
          m -> Long2ReferenceSortedMaps.unmodifiable((Long2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Long2ReferenceSortedMaps::singleton,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Long2ReferenceSortedMaps.EMPTY_MAP,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilLong2IntMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Integer.class, Long2IntArrayMap::new, TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Integer.class, Long2IntArrayMap::new,
          m -> Long2IntMaps.synchronize((Long2IntMap) m), TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Integer.class, Long2IntArrayMap::new,
          m -> Long2IntMaps.unmodifiable((Long2IntMap) m),
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Integer.class, Long2IntOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Integer.class, Long2IntLinkedOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Integer.class, Long2IntMaps::singleton,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Integer.class, getEmptyMap(), TestSampleValues.INT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Long2IntMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilLong2IntSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Integer.class, Long2IntAVLTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Integer.class, Long2IntRBTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Integer.class, Long2IntRBTreeMap::new,
          m -> Long2IntSortedMaps.synchronize((Long2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Integer.class, Long2IntRBTreeMap::new,
          m -> Long2IntSortedMaps.unmodifiable((Long2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Integer.class, Long2IntSortedMaps::singleton,
      // TestSampleValues.INTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Integer.class, Long2IntSortedMaps.EMPTY_MAP,
      // TestSampleValues.INTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilLong2DoubleMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Double.class, Long2DoubleArrayMap::new, TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Double.class, Long2DoubleArrayMap::new,
          m -> Long2DoubleMaps.synchronize((Long2DoubleMap) m), TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Double.class, Long2DoubleArrayMap::new,
          m -> Long2DoubleMaps.unmodifiable((Long2DoubleMap) m),
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Double.class, Long2DoubleOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Double.class, Long2DoubleLinkedOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Double.class, Long2DoubleMaps::singleton,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Double.class, getEmptyMap(), TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Long2DoubleMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilLong2DoubleSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Double.class, Long2DoubleAVLTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Double.class, Long2DoubleRBTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Double.class, Long2DoubleRBTreeMap::new,
          m -> Long2DoubleSortedMaps.synchronize((Long2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Double.class, Long2DoubleRBTreeMap::new,
          m -> Long2DoubleSortedMaps.unmodifiable((Long2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Double.class, Long2DoubleSortedMaps::singleton,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Double.class, Long2DoubleSortedMaps.EMPTY_MAP,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilLong2FloatMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Float.class, Long2FloatArrayMap::new, TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Float.class, Long2FloatArrayMap::new,
          m -> Long2FloatMaps.synchronize((Long2FloatMap) m), TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Float.class, Long2FloatArrayMap::new,
          m -> Long2FloatMaps.unmodifiable((Long2FloatMap) m),
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Float.class, Long2FloatOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Float.class, Long2FloatLinkedOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Float.class, Long2FloatMaps::singleton,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Float.class, getEmptyMap(), TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Long2FloatMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilLong2FloatSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Float.class, Long2FloatAVLTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Float.class, Long2FloatRBTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Float.class, Long2FloatRBTreeMap::new,
          m -> Long2FloatSortedMaps.synchronize((Long2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Float.class, Long2FloatRBTreeMap::new,
          m -> Long2FloatSortedMaps.unmodifiable((Long2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Float.class, Long2FloatSortedMaps::singleton,
      // TestSampleValues.FLOATS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Float.class, Long2FloatSortedMaps.EMPTY_MAP,
      // TestSampleValues.FLOATS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilLong2LongMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Long.class, Long2LongArrayMap::new, TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Long.class, Long2LongArrayMap::new,
          m -> Long2LongMaps.synchronize((Long2LongMap) m), TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Long.class, Long2LongArrayMap::new,
          m -> Long2LongMaps.unmodifiable((Long2LongMap) m),
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Long.class, Long2LongOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Long.class, Long2LongLinkedOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Long.class, Long2LongMaps::singleton,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Long.class, getEmptyMap(), TestSampleValues.LONG_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Long2LongMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilLong2LongSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Long.class, Long2LongAVLTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Long.class, Long2LongRBTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Long.class, Long2LongRBTreeMap::new,
          m -> Long2LongSortedMaps.synchronize((Long2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Long.class, Long2LongRBTreeMap::new,
          m -> Long2LongSortedMaps.unmodifiable((Long2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Long.class, Long2LongSortedMaps::singleton,
      // TestSampleValues.LONGS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Long.class, Long2LongSortedMaps.EMPTY_MAP,
      // TestSampleValues.LONGS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilLong2CharMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Character.class, Long2CharArrayMap::new, TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Character.class, Long2CharArrayMap::new,
          m -> Long2CharMaps.synchronize((Long2CharMap) m), TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Character.class, Long2CharArrayMap::new,
          m -> Long2CharMaps.unmodifiable((Long2CharMap) m),
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Character.class, Long2CharOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Character.class, Long2CharLinkedOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Character.class, Long2CharMaps::singleton,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Character.class, getEmptyMap(), TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Long2CharMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilLong2CharSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Character.class, Long2CharAVLTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Character.class, Long2CharRBTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Character.class, Long2CharRBTreeMap::new,
          m -> Long2CharSortedMaps.synchronize((Long2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Character.class, Long2CharRBTreeMap::new,
          m -> Long2CharSortedMaps.unmodifiable((Long2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Character.class, Long2CharSortedMaps::singleton,
      // TestSampleValues.CHARS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Character.class, Long2CharSortedMaps.EMPTY_MAP,
      // TestSampleValues.CHARS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilLong2ObjectMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.Maps");
      suite.addTest(
          getMapTests(String.class, Long2ObjectArrayMap::new, TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(String.class, Long2ObjectArrayMap::new,
          m -> Long2ObjectMaps.synchronize((Long2ObjectMap<String>) m), TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(String.class, Long2ObjectArrayMap::new,
          m -> Long2ObjectMaps.unmodifiable((Long2ObjectMap<String>) m),
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(String.class, Long2ObjectOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Long2ObjectLinkedOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Long2ObjectMaps::singleton,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(String.class, getEmptyMap(), TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Long2ObjectMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilLong2ObjectSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Long2ObjectAVLTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Long2ObjectRBTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Long2ObjectRBTreeMap::new,
          m -> Long2ObjectSortedMaps.synchronize((Long2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Long2ObjectRBTreeMap::new,
          m -> Long2ObjectSortedMaps.unmodifiable((Long2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Long2ObjectSortedMaps::singleton,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Long2ObjectSortedMaps.EMPTY_MAP,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilLong2ByteMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Byte.class, Long2ByteArrayMap::new, TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Byte.class, Long2ByteArrayMap::new,
          m -> Long2ByteMaps.synchronize((Long2ByteMap) m), TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Byte.class, Long2ByteArrayMap::new,
          m -> Long2ByteMaps.unmodifiable((Long2ByteMap) m),
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Byte.class, Long2ByteOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Byte.class, Long2ByteLinkedOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Byte.class, Long2ByteMaps::singleton,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Byte.class, getEmptyMap(), TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Long2ByteMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilLong2ByteSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Long2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Byte.class, Long2ByteAVLTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Byte.class, Long2ByteRBTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Byte.class, Long2ByteRBTreeMap::new,
          m -> Long2ByteSortedMaps.synchronize((Long2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Byte.class, Long2ByteRBTreeMap::new,
          m -> Long2ByteSortedMaps.unmodifiable((Long2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Byte.class, Long2ByteSortedMaps::singleton,
      // TestSampleValues.BYTES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Byte.class, Long2ByteSortedMaps.EMPTY_MAP,
      // TestSampleValues.BYTES_FOR_SORTED));
      return suite;
    }
  }

  private static abstract class LongGeneratorBase extends TestContainerGeneratorBase<Long> {
    LongGeneratorBase() {
      this(TestSampleValues.LONG_SAMPLE_ELEMENTS, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    LongGeneratorBase(SampleElements<Long> sampleElements, Ordering ordering) {
      super(Long.class, sampleElements, ordering);
    }
  }

  private static junit.framework.Test getGeneralLongListTests(String testSuiteName,
      Function<Collection<Long>, List<Long>> generator, Modifiable modifiable) {
    final class Generator extends LongGeneratorBase implements TestListGenerator<Long> {
      @Override
      public List<Long> create(Object... elements) {
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
      Supplier<Map<Long, V>> mapFactory, SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Long, V> map = mapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedArrayMapTests(Class<V> clazzV,
      Supplier<Map<Long, V>> mapFactory, Function<Map<Long, V>, Map<Long, V>> syncrhonizeWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Long, V> map = mapFactory.get();
      map.putAll(m);
      map = syncrhonizeWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableArrayMapTests(Class<V> clazzV,
      Supplier<Map<Long, V>> mapFactory, Function<Map<Long, V>, Map<Long, V>> unmodifiableWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Long, V> map = mapFactory.get();
      map.putAll(m);
      map = unmodifiableWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralMapTests(Class<V> clazzV,
      Function<Map<Long, V>, Map<Long, V>> mapFactory, String testSuiteName,
      SampleElements<V> valueSampleElements, Modifiable modifiable) {
    List<Feature<?>> testSuiteFeatures = new ArrayList<>(3);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS);
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
        .using(new LongMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  private static <V> junit.framework.Test getSingletonMapTests(Class<V> clazzV,
      BiFunction<Long, V, Map<Long, V>> singletonMapFactory,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonMap";
    return MapTestSuiteBuilder.using(new LongMapGenerator<V>(clazzV, map -> {
      Map.Entry<Long, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getEmptyMapTests(Class<V> clazzV, Map<Long, V> emptyMap,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptyMap";
    return MapTestSuiteBuilder.using(new LongMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getSortedMapTests(Class<V> clazzV,
      Supplier<SortedMap<Long, V>> sortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Long, V> map = sortedMapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Long, V>> sortedMapFactory,
      Function<SortedMap<Long, V>, SortedMap<Long, V>> synchronziedWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Synchronized" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Long, V> map = sortedMapFactory.get();
      map.putAll(m);
      return synchronziedWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Long, V>> sortedMapFactory,
      Function<SortedMap<Long, V>, SortedMap<Long, V>> unmodifiableWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Unmodifiable" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Long, V> map = sortedMapFactory.get();
      map.putAll(m);
      return unmodifiableWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralSortedMapTests(Class<V> clazzV,
      Function<Map<Long, V>, SortedMap<Long, V>> mapFactory, String testSuiteName,
      V[] valueSampleElements, Modifiable modifiable) {
    List<Feature<?>> testSuiteFeatures = new ArrayList<>(8);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS);
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
        .using(new LongSortedMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getSingletonSortedMapTests(Class<V> clazzV,
      BiFunction<Long, V, SortedMap<Long, V>> singletonSortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonSortedMap";
    return SortedMapTestSuiteBuilder.using(new LongSortedMapGenerator<V>(clazzV, map -> {
      Map.Entry<Long, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonSortedMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getEmptySortedMapTests(Class<V> clazzV,
      SortedMap<Long, V> emptyMap, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptySortedMap";
    return SortedMapTestSuiteBuilder.using(new LongSortedMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  private static final class LongMapGenerator<V> extends TestMapGeneratorBase<Long, V> {
    private final Function<Map<Long, V>, Map<Long, V>> mapFactory;

    protected LongMapGenerator(Class<V> clazzV, Function<Map<Long, V>, Map<Long, V>> mapFactory,
        SampleElements<V> valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected LongMapGenerator(Class<V> clazzV, Function<Map<Long, V>, Map<Long, V>> mapFactory,
        SampleElements<V> valueSampleElements, Ordering ordering) {
      super(Long.class, clazzV, TestSampleValues.LONG_SAMPLE_ELEMENTS, valueSampleElements,
          ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public Map<Long, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }

  private static final class LongSortedMapGenerator<V> extends TestSortedMapGeneratorBase<Long, V> {
    private final Function<Map<Long, V>, SortedMap<Long, V>> mapFactory;

    protected LongSortedMapGenerator(Class<V> clazzV,
        Function<Map<Long, V>, SortedMap<Long, V>> mapFactory, V[] valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected LongSortedMapGenerator(Class<V> clazzV,
        Function<Map<Long, V>, SortedMap<Long, V>> mapFactory, V[] valueSampleElements,
        Ordering ordering) {
      super(Long.class, clazzV, TestSampleValues.LONGS_FOR_SORTED, valueSampleElements, ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public SortedMap<Long, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }
}