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

import it.unimi.dsi.fastutil.shorts.ShortAVLTreeSet;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortArraySet;
import it.unimi.dsi.fastutil.shorts.ShortBigArrayBigList;
import it.unimi.dsi.fastutil.shorts.ShortBigListIterator;
import it.unimi.dsi.fastutil.shorts.ShortBigLists;
import it.unimi.dsi.fastutil.shorts.ShortHash;
import com.google.common.hash.Hashing;
import it.unimi.dsi.fastutil.shorts.ShortLinkedOpenCustomHashSet;
import it.unimi.dsi.fastutil.shorts.ShortLinkedOpenHashSet;
import it.unimi.dsi.fastutil.shorts.ShortLists;
import it.unimi.dsi.fastutil.shorts.ShortOpenHashSet;
import it.unimi.dsi.fastutil.shorts.ShortRBTreeSet;
import it.unimi.dsi.fastutil.shorts.ShortSets;
import it.unimi.dsi.fastutil.shorts.ShortSortedSets;

import it.unimi.dsi.fastutil.shorts.Short2ShortArrayMap;
import it.unimi.dsi.fastutil.shorts.Short2ShortLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ShortMap;
import it.unimi.dsi.fastutil.shorts.Short2ShortMaps;
import it.unimi.dsi.fastutil.shorts.Short2ShortOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ShortAVLTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2ShortRBTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap;
import it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps;

import it.unimi.dsi.fastutil.shorts.Short2ReferenceArrayMap;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceMap;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceRBTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMaps;

import it.unimi.dsi.fastutil.shorts.Short2IntArrayMap;
import it.unimi.dsi.fastutil.shorts.Short2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2IntMap;
import it.unimi.dsi.fastutil.shorts.Short2IntMaps;
import it.unimi.dsi.fastutil.shorts.Short2IntOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2IntAVLTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2IntRBTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2IntSortedMap;
import it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps;

import it.unimi.dsi.fastutil.shorts.Short2DoubleArrayMap;
import it.unimi.dsi.fastutil.shorts.Short2DoubleLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2DoubleMap;
import it.unimi.dsi.fastutil.shorts.Short2DoubleMaps;
import it.unimi.dsi.fastutil.shorts.Short2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap;
import it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps;

import it.unimi.dsi.fastutil.shorts.Short2FloatArrayMap;
import it.unimi.dsi.fastutil.shorts.Short2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2FloatMap;
import it.unimi.dsi.fastutil.shorts.Short2FloatMaps;
import it.unimi.dsi.fastutil.shorts.Short2FloatOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2FloatAVLTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2FloatRBTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap;
import it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps;

import it.unimi.dsi.fastutil.shorts.Short2LongArrayMap;
import it.unimi.dsi.fastutil.shorts.Short2LongLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2LongMap;
import it.unimi.dsi.fastutil.shorts.Short2LongMaps;
import it.unimi.dsi.fastutil.shorts.Short2LongOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2LongAVLTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2LongRBTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2LongSortedMap;
import it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps;

import it.unimi.dsi.fastutil.shorts.Short2CharArrayMap;
import it.unimi.dsi.fastutil.shorts.Short2CharLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2CharMap;
import it.unimi.dsi.fastutil.shorts.Short2CharMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2CharAVLTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2CharRBTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2CharSortedMap;
import it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps;

import it.unimi.dsi.fastutil.shorts.Short2ObjectArrayMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMaps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectRBTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps;

import it.unimi.dsi.fastutil.shorts.Short2ByteArrayMap;
import it.unimi.dsi.fastutil.shorts.Short2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ByteMap;
import it.unimi.dsi.fastutil.shorts.Short2ByteMaps;
import it.unimi.dsi.fastutil.shorts.Short2ByteOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ByteAVLTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2ByteRBTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap;
import it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps;

import junit.framework.TestSuite;

@RunWith(Enclosed.class)
public final class ShortCollectionsTest {
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
      TestSuite suite = new TestSuite("ShortCollectionsTests.Lists");
      suite.addTest(getShortArrayListTests());
      suite.addTest(getSynchronizedShortArrayListTests());
      suite.addTest(getUnmodifiableShortArrayListTests());
      suite.addTest(getSingletonShortListTests());
      suite.addTest(getEmptyShortListTests());
      return suite;
    }

    private static junit.framework.Test getShortArrayListTests() {
      return getGeneralShortListTests("ShortArrayList", c -> new ShortArrayList(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedShortArrayListTests() {
      return getGeneralShortListTests("SynchronizedShortArrayList",
          c -> ShortLists.synchronize(new ShortArrayList(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableShortArrayListTests() {
      return getGeneralShortListTests("UnmodifiableShortArrayList",
          c -> ShortLists.unmodifiable(new ShortArrayList(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonShortListTests() {
      final class Generator extends ShortGeneratorBase implements TestListGenerator<Short> {
        @Override
        public List<Short> create(Object... elements) {
          Short value = Iterables.getOnlyElement(arrayToCollection(elements));
          return ShortLists.singleton(value);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("ShortSingletonList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyShortListTests() {
      final class Generator extends ShortGeneratorBase implements TestListGenerator<Short> {
        @Override
        public List<Short> create(Object... elements) {
          assertEquals(0, elements.length);
          return ShortLists.EMPTY_LIST;
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("ShortEmptyList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }
  }

  public static final class BigLists {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("ShortCollectionsTests.BigLists");
      suite.addTest(getShortBigArrayBigListTests());
      suite.addTest(getSynchronizedShortBigArrayBigListTests());
      suite.addTest(getUnmodifiableShortBigArrayBigListTests());
      suite.addTest(getSingletonShortBigListTests());
      suite.addTest(getEmptyShortBigListTests());
      return suite;
    }

    private static junit.framework.Test getShortBigArrayBigListTests() {
      return getGeneralShortListTests("ShortBigArrayBigList",
          c -> new ShortBigList2ListAdapter(new ShortBigArrayBigList(c.iterator())),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedShortBigArrayBigListTests() {
      return getGeneralShortListTests("SynchronizedShortBigArrayBigList",
          c -> new ShortBigList2ListAdapter(
              ShortBigLists.synchronize(new ShortBigArrayBigList(c.iterator()))),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableShortBigArrayBigListTests() {
      return getGeneralShortListTests("UnmodifiableShortBigArrayBigList",
          c -> new ShortBigList2ListAdapter(
              ShortBigLists.unmodifiable(new ShortBigArrayBigList(c.iterator()))),
          Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonShortBigListTests() {
      final class Generator extends ShortGeneratorBase implements TestListGenerator<Short> {
        @Override
        public List<Short> create(Object... elements) {
          Short value = Iterables.getOnlyElement(arrayToCollection(elements));
          return new ShortBigList2ListAdapter(ShortBigLists.singleton(value));
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("SingletonShortBigList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyShortBigListTests() {
      final class Generator extends ShortGeneratorBase implements TestListGenerator<Short> {
        @Override
        public List<Short> create(Object... elements) {
          assertEquals(0, elements.length);
          return new ShortBigList2ListAdapter(ShortBigLists.EMPTY_BIG_LIST);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("EmptyShortBigList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    @SuppressWarnings("serial")
    private static final class ShortBigList2ListAdapter extends BigList2ListAdapter<Short> {
      private ShortBigList2ListAdapter(BigList<Short> bigList) {
        super(bigList);
      }

      @Override
      public List<Short> subList(int fromIndex, int toIndex) {
        return new ShortBigList2ListAdapter(bigList.subList(fromIndex, toIndex));
      }

      @Override
      void bigListIteratorSet(BigListIterator<Short> bigListIterator, Short e) {
        ((ShortBigListIterator) bigListIterator).set(e);
      }

      @Override
      void bigListIteratorAdd(BigListIterator<Short> bigListIterator, Short e) {
        ((ShortBigListIterator) bigListIterator).add(e);
      }
    }
  }

  public static final class Sets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("ShortCollectionsTests.Sets");
      if (RUN_ARRAYSET_TESTS) {
        suite.addTest(getShortArraySetTests());
        suite.addTest(getSynchronizedShortArraySetTests());
        suite.addTest(getUnmodifiableShortArraySetTests());
      }
      suite.addTest(getShortOpenHashSetTests());
      suite.addTest(getSingletonShortSetTests());
      suite.addTest(getEmptyShortSetTests());
      return suite;
    }

    private static junit.framework.Test getShortArraySetTests() {
      return getGeneralShortSetTests("ShortArraySet", c -> new ShortArraySet(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedShortArraySetTests() {
      return getGeneralShortSetTests("SynchronizedShortArraySet",
          c -> ShortSets.synchronize(new ShortArraySet(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableShortArraySetTests() {
      return getGeneralShortSetTests("UnmodifiableShortArraySet",
          c -> ShortSets.unmodifiable(new ShortArraySet(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getShortOpenHashSetTests() {
      return getGeneralShortSetTests("ShortOpenHashSet", c -> new ShortOpenHashSet(c),
          Modifiable.MUTABLE);
    }


    private static junit.framework.Test getGeneralShortSetTests(String testSuiteName,
        Function<Collection<Short>, Set<Short>> generator, Modifiable modifiable) {
      final class Generator extends ShortGeneratorBase implements TestSetGenerator<Short> {
        @Override
        public Set<Short> create(Object... elements) {
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

    private static junit.framework.Test getSingletonShortSetTests() {
      final class Generator extends ShortGeneratorBase implements TestSetGenerator<Short> {
        @Override
        public Set<Short> create(Object... elements) {
          Short value = Iterables.getOnlyElement(arrayToCollection(elements));
          return ShortSets.singleton(value);
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("ShortSingletonSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyShortSetTests() {
      final class Generator extends ShortGeneratorBase implements TestSetGenerator<Short> {
        @Override
        public Set<Short> create(Object... elements) {
          assertEquals(0, elements.length);
          return ShortSets.EMPTY_SET;
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("ShortEmptySet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }
  }

  public static final class SortedSets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("ShortCollectionsTests.SortedSets");
      suite.addTest(getLinkedOpenHashSetTests());
      suite.addTest(getLinkedOpenCustomHashSetTests());
      suite.addTest(getAVLTreeSetTests());
      suite.addTest(getRBTreeSetTests());
      suite.addTest(getSynchronizedRBTreeSetTests());
      suite.addTest(getUnmodifiableRBTreeSetTests());
      suite.addTest(getSingletonShortSortedSetTests());
      suite.addTest(getEmptyShortSortedSetTests());
      return suite;
    }

    private static junit.framework.Test getLinkedOpenHashSetTests() {
      return getGeneralShortSortedSetTests("ShortLinkedOpenHashSet",
          c -> new ShortLinkedOpenHashSet(c), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getLinkedOpenCustomHashSetTests() {
      @SuppressWarnings("serial")
      final class HashStrategy implements ShortHash.Strategy, java.io.Serializable {
        @Override
        public int hashCode(short e) {
          return Hashing.murmur3_32().hashInt(e).asInt();
        }

        @Override
        public boolean equals(short a, short b) {
          return a == b;
        }
      }

      return getGeneralShortSortedSetTests("ShortLinkedOpenCustomHashSet",
          c -> new ShortLinkedOpenCustomHashSet(c, new HashStrategy()), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getAVLTreeSetTests() {
      return getGeneralShortSortedSetTests("ShortAVLTreeSet", c -> new ShortAVLTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getRBTreeSetTests() {
      return getGeneralShortSortedSetTests("ShortRBTreeSet", c -> new ShortRBTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getSynchronizedRBTreeSetTests() {
      return getGeneralShortSortedSetTests("ShortRBTreeSet",
          c -> ShortSortedSets.synchronize(new ShortRBTreeSet(c)), Modifiable.MUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getUnmodifiableRBTreeSetTests() {
      return getGeneralShortSortedSetTests("ShortRBTreeSet",
          c -> ShortSortedSets.unmodifiable(new ShortRBTreeSet(c)), Modifiable.IMMUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getGeneralShortSortedSetTests(String testSuiteName,
        Function<Collection<Short>, SortedSet<Short>> generator, Modifiable modifiable,
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

      return SortedSetTestSuiteBuilder.using(new ShortSortedSetGenerator(ordering, generator))
          .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingletonShortSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new ShortSortedSetGenerator(Ordering.SORTED, c -> {
        Short value = Iterables.getOnlyElement(c);
        return ShortSortedSets.singleton(value);
      })).named("ShortSingletonSortedSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW, CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyShortSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new ShortSortedSetGenerator(Ordering.SORTED, c -> {
        assertTrue(c.isEmpty());
        return ShortSortedSets.EMPTY_SET;
      })).named("ShortSingletonSortedSet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW, CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    private static class ShortSortedSetGenerator extends ShortGeneratorBase
        implements TestSortedSetGenerator<Short> {
      private final Function<Collection<Short>, SortedSet<Short>> generator;

      ShortSortedSetGenerator(Ordering ordering,
          Function<Collection<Short>, SortedSet<Short>> generator) {
        super(TestSampleValues.SHORT_SAMPLE_ELEMENTS_FOR_SORTED, ordering);
        this.generator = generator;
      }

      @Override
      public SortedSet<Short> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }

      @Override
      public Short belowSamplesLesser() {
        return TestSampleValues.SHORTS_FOR_SORTED[0];
      }

      @Override
      public Short belowSamplesGreater() {
        return TestSampleValues.SHORTS_FOR_SORTED[1];
      }

      @Override
      public Short aboveSamplesLesser() {
        return TestSampleValues.SHORTS_FOR_SORTED[7];
      }

      @Override
      public Short aboveSamplesGreater() {
        return TestSampleValues.SHORTS_FOR_SORTED[8];
      }
    }
  }

  public static final class FastutilShort2ShortMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Short.class, Short2ShortArrayMap::new,
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Short.class, Short2ShortArrayMap::new,
            m -> Short2ShortMaps.synchronize((Short2ShortMap) m),
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Short.class, Short2ShortArrayMap::new,
            m -> Short2ShortMaps.unmodifiable((Short2ShortMap) m),
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Short.class, Short2ShortOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Short.class, Short2ShortLinkedOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Short.class, Short2ShortMaps::singleton,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Short.class, Short2ShortMaps.EMPTY_MAP,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilShort2ShortSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Short.class, Short2ShortAVLTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Short.class, Short2ShortRBTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Short.class, Short2ShortRBTreeMap::new,
          m -> Short2ShortSortedMaps.synchronize((Short2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Short.class, Short2ShortRBTreeMap::new,
          m -> Short2ShortSortedMaps.unmodifiable((Short2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Short.class, Short2ShortSortedMaps::singleton,
      // TestSampleValues.SHORTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Short.class, Short2ShortSortedMaps.EMPTY_MAP,
      // TestSampleValues.SHORTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilShort2ReferenceMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(String.class, Short2ReferenceArrayMap::new,
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(String.class, Short2ReferenceArrayMap::new,
            m -> Short2ReferenceMaps.synchronize((Short2ReferenceMap<String>) m),
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(String.class, Short2ReferenceArrayMap::new,
            m -> Short2ReferenceMaps.unmodifiable((Short2ReferenceMap<String>) m),
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(String.class, Short2ReferenceOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Short2ReferenceLinkedOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Short2ReferenceMaps::singleton,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(String.class, Short2ReferenceMaps.emptyMap(),
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilShort2ReferenceSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Short2ReferenceAVLTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Short2ReferenceRBTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Short2ReferenceRBTreeMap::new,
          m -> Short2ReferenceSortedMaps.synchronize((Short2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Short2ReferenceRBTreeMap::new,
          m -> Short2ReferenceSortedMaps.unmodifiable((Short2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class,
      // Short2ReferenceSortedMaps::singleton,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Short2ReferenceSortedMaps.EMPTY_MAP,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilShort2IntMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Integer.class, Short2IntArrayMap::new,
            TestSampleValues.INT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Integer.class, Short2IntArrayMap::new,
            m -> Short2IntMaps.synchronize((Short2IntMap) m),
            TestSampleValues.INT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Integer.class, Short2IntArrayMap::new,
            m -> Short2IntMaps.unmodifiable((Short2IntMap) m),
            TestSampleValues.INT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Integer.class, Short2IntOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Integer.class, Short2IntLinkedOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Integer.class, Short2IntMaps::singleton,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Integer.class, Short2IntMaps.EMPTY_MAP,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilShort2IntSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Integer.class, Short2IntAVLTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Integer.class, Short2IntRBTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Integer.class, Short2IntRBTreeMap::new,
          m -> Short2IntSortedMaps.synchronize((Short2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Integer.class, Short2IntRBTreeMap::new,
          m -> Short2IntSortedMaps.unmodifiable((Short2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Integer.class, Short2IntSortedMaps::singleton,
      // TestSampleValues.INTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Integer.class, Short2IntSortedMaps.EMPTY_MAP,
      // TestSampleValues.INTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilShort2DoubleMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Double.class, Short2DoubleArrayMap::new,
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Double.class, Short2DoubleArrayMap::new,
            m -> Short2DoubleMaps.synchronize((Short2DoubleMap) m),
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Double.class, Short2DoubleArrayMap::new,
            m -> Short2DoubleMaps.unmodifiable((Short2DoubleMap) m),
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Double.class, Short2DoubleOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Double.class, Short2DoubleLinkedOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Double.class, Short2DoubleMaps::singleton,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Double.class, Short2DoubleMaps.EMPTY_MAP,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilShort2DoubleSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Double.class, Short2DoubleAVLTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Double.class, Short2DoubleRBTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Double.class, Short2DoubleRBTreeMap::new,
          m -> Short2DoubleSortedMaps.synchronize((Short2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Double.class, Short2DoubleRBTreeMap::new,
          m -> Short2DoubleSortedMaps.unmodifiable((Short2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Double.class, Short2DoubleSortedMaps::singleton,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Double.class, Short2DoubleSortedMaps.EMPTY_MAP,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilShort2FloatMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Float.class, Short2FloatArrayMap::new,
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Float.class, Short2FloatArrayMap::new,
            m -> Short2FloatMaps.synchronize((Short2FloatMap) m),
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Float.class, Short2FloatArrayMap::new,
            m -> Short2FloatMaps.unmodifiable((Short2FloatMap) m),
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Float.class, Short2FloatOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Float.class, Short2FloatLinkedOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Float.class, Short2FloatMaps::singleton,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Float.class, Short2FloatMaps.EMPTY_MAP,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilShort2FloatSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Float.class, Short2FloatAVLTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Float.class, Short2FloatRBTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Float.class, Short2FloatRBTreeMap::new,
          m -> Short2FloatSortedMaps.synchronize((Short2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Float.class, Short2FloatRBTreeMap::new,
          m -> Short2FloatSortedMaps.unmodifiable((Short2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Float.class, Short2FloatSortedMaps::singleton,
      // TestSampleValues.FLOATS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Float.class, Short2FloatSortedMaps.EMPTY_MAP,
      // TestSampleValues.FLOATS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilShort2LongMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Long.class, Short2LongArrayMap::new,
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Long.class, Short2LongArrayMap::new,
            m -> Short2LongMaps.synchronize((Short2LongMap) m),
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Long.class, Short2LongArrayMap::new,
            m -> Short2LongMaps.unmodifiable((Short2LongMap) m),
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Long.class, Short2LongOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Long.class, Short2LongLinkedOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Long.class, Short2LongMaps::singleton,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Long.class, Short2LongMaps.EMPTY_MAP,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilShort2LongSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Long.class, Short2LongAVLTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Long.class, Short2LongRBTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Long.class, Short2LongRBTreeMap::new,
          m -> Short2LongSortedMaps.synchronize((Short2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Long.class, Short2LongRBTreeMap::new,
          m -> Short2LongSortedMaps.unmodifiable((Short2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Long.class, Short2LongSortedMaps::singleton,
      // TestSampleValues.LONGS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Long.class, Short2LongSortedMaps.EMPTY_MAP,
      // TestSampleValues.LONGS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilShort2CharMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Character.class, Short2CharArrayMap::new,
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Character.class, Short2CharArrayMap::new,
            m -> Short2CharMaps.synchronize((Short2CharMap) m),
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Character.class, Short2CharArrayMap::new,
            m -> Short2CharMaps.unmodifiable((Short2CharMap) m),
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Character.class, Short2CharOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Character.class, Short2CharLinkedOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Character.class, Short2CharMaps::singleton,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Character.class, Short2CharMaps.EMPTY_MAP,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilShort2CharSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Character.class, Short2CharAVLTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Character.class, Short2CharRBTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Character.class, Short2CharRBTreeMap::new,
          m -> Short2CharSortedMaps.synchronize((Short2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Character.class, Short2CharRBTreeMap::new,
          m -> Short2CharSortedMaps.unmodifiable((Short2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Character.class, Short2CharSortedMaps::singleton,
      // TestSampleValues.CHARS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Character.class, Short2CharSortedMaps.EMPTY_MAP,
      // TestSampleValues.CHARS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilShort2ObjectMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(String.class, Short2ObjectArrayMap::new,
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(String.class, Short2ObjectArrayMap::new,
            m -> Short2ObjectMaps.synchronize((Short2ObjectMap<String>) m),
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(String.class, Short2ObjectArrayMap::new,
            m -> Short2ObjectMaps.unmodifiable((Short2ObjectMap<String>) m),
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(String.class, Short2ObjectOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Short2ObjectLinkedOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Short2ObjectMaps::singleton,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(String.class, Short2ObjectMaps.emptyMap(),
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilShort2ObjectSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Short2ObjectAVLTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Short2ObjectRBTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Short2ObjectRBTreeMap::new,
          m -> Short2ObjectSortedMaps.synchronize((Short2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Short2ObjectRBTreeMap::new,
          m -> Short2ObjectSortedMaps.unmodifiable((Short2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Short2ObjectSortedMaps::singleton,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Short2ObjectSortedMaps.EMPTY_MAP,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilShort2ByteMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Byte.class, Short2ByteArrayMap::new,
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Byte.class, Short2ByteArrayMap::new,
            m -> Short2ByteMaps.synchronize((Short2ByteMap) m),
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Byte.class, Short2ByteArrayMap::new,
            m -> Short2ByteMaps.unmodifiable((Short2ByteMap) m),
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Byte.class, Short2ByteOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Byte.class, Short2ByteLinkedOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Byte.class, Short2ByteMaps::singleton,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Byte.class, Short2ByteMaps.EMPTY_MAP,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilShort2ByteSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Short2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Byte.class, Short2ByteAVLTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Byte.class, Short2ByteRBTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Byte.class, Short2ByteRBTreeMap::new,
          m -> Short2ByteSortedMaps.synchronize((Short2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Byte.class, Short2ByteRBTreeMap::new,
          m -> Short2ByteSortedMaps.unmodifiable((Short2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Byte.class, Short2ByteSortedMaps::singleton,
      // TestSampleValues.BYTES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Byte.class, Short2ByteSortedMaps.EMPTY_MAP,
      // TestSampleValues.BYTES_FOR_SORTED));
      return suite;
    }
  }

  private static abstract class ShortGeneratorBase extends TestContainerGeneratorBase<Short> {
    ShortGeneratorBase() {
      this(TestSampleValues.SHORT_SAMPLE_ELEMENTS, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    ShortGeneratorBase(SampleElements<Short> sampleElements, Ordering ordering) {
      super(Short.class, sampleElements, ordering);
    }
  }

  private static junit.framework.Test getGeneralShortListTests(String testSuiteName,
      Function<Collection<Short>, List<Short>> generator, Modifiable modifiable) {
    final class Generator extends ShortGeneratorBase implements TestListGenerator<Short> {
      @Override
      public List<Short> create(Object... elements) {
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
      Supplier<Map<Short, V>> mapFactory, SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Short, V> map = mapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedArrayMapTests(Class<V> clazzV,
      Supplier<Map<Short, V>> mapFactory, Function<Map<Short, V>, Map<Short, V>> syncrhonizeWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Short, V> map = mapFactory.get();
      map.putAll(m);
      map = syncrhonizeWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableArrayMapTests(Class<V> clazzV,
      Supplier<Map<Short, V>> mapFactory,
      Function<Map<Short, V>, Map<Short, V>> unmodifiableWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Short, V> map = mapFactory.get();
      map.putAll(m);
      map = unmodifiableWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralMapTests(Class<V> clazzV,
      Function<Map<Short, V>, Map<Short, V>> mapFactory, String testSuiteName,
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
        .using(new ShortMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  private static <V> junit.framework.Test getSingletonMapTests(Class<V> clazzV,
      BiFunction<Short, V, Map<Short, V>> singletonMapFactory,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonMap";
    return MapTestSuiteBuilder.using(new ShortMapGenerator<V>(clazzV, map -> {
      Map.Entry<Short, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements))
        .named(testSuiteName).withFeatures(CollectionSize.ONE,
            CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS, CollectionFeature.NON_STANDARD_TOSTRING)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getEmptyMapTests(Class<V> clazzV, Map<Short, V> emptyMap,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptyMap";
    return MapTestSuiteBuilder.using(new ShortMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements))
        .named(testSuiteName).withFeatures(CollectionSize.ZERO,
            CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS, CollectionFeature.NON_STANDARD_TOSTRING)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getSortedMapTests(Class<V> clazzV,
      Supplier<SortedMap<Short, V>> sortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Short, V> map = sortedMapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Short, V>> sortedMapFactory,
      Function<SortedMap<Short, V>, SortedMap<Short, V>> synchronziedWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Synchronized" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Short, V> map = sortedMapFactory.get();
      map.putAll(m);
      return synchronziedWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Short, V>> sortedMapFactory,
      Function<SortedMap<Short, V>, SortedMap<Short, V>> unmodifiableWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Unmodifiable" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Short, V> map = sortedMapFactory.get();
      map.putAll(m);
      return unmodifiableWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralSortedMapTests(Class<V> clazzV,
      Function<Map<Short, V>, SortedMap<Short, V>> mapFactory, String testSuiteName,
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
        .using(new ShortSortedMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getSingletonSortedMapTests(Class<V> clazzV,
      BiFunction<Short, V, SortedMap<Short, V>> singletonSortedMapFactory,
      V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonSortedMap";
    return SortedMapTestSuiteBuilder.using(new ShortSortedMapGenerator<V>(clazzV, map -> {
      Map.Entry<Short, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonSortedMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getEmptySortedMapTests(Class<V> clazzV,
      SortedMap<Short, V> emptyMap, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptySortedMap";
    return SortedMapTestSuiteBuilder.using(new ShortSortedMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  private static final class ShortMapGenerator<V> extends TestMapGeneratorBase<Short, V> {
    private final Function<Map<Short, V>, Map<Short, V>> mapFactory;

    protected ShortMapGenerator(Class<V> clazzV, Function<Map<Short, V>, Map<Short, V>> mapFactory,
        SampleElements<V> valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected ShortMapGenerator(Class<V> clazzV, Function<Map<Short, V>, Map<Short, V>> mapFactory,
        SampleElements<V> valueSampleElements, Ordering ordering) {
      super(Short.class, clazzV, TestSampleValues.SHORT_SAMPLE_ELEMENTS, valueSampleElements,
          ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public Map<Short, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }

  private static final class ShortSortedMapGenerator<V>
      extends TestSortedMapGeneratorBase<Short, V> {
    private final Function<Map<Short, V>, SortedMap<Short, V>> mapFactory;

    protected ShortSortedMapGenerator(Class<V> clazzV,
        Function<Map<Short, V>, SortedMap<Short, V>> mapFactory, V[] valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected ShortSortedMapGenerator(Class<V> clazzV,
        Function<Map<Short, V>, SortedMap<Short, V>> mapFactory, V[] valueSampleElements,
        Ordering ordering) {
      super(Short.class, clazzV, TestSampleValues.SHORTS_FOR_SORTED, valueSampleElements, ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public SortedMap<Short, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }
}
