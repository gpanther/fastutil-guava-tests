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

import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntBigArrayBigList;
import it.unimi.dsi.fastutil.ints.IntBigListIterator;
import it.unimi.dsi.fastutil.ints.IntBigLists;
import it.unimi.dsi.fastutil.ints.IntHash;
import com.google.common.hash.Hashing;
import it.unimi.dsi.fastutil.ints.IntLinkedOpenCustomHashSet;
import it.unimi.dsi.fastutil.ints.IntLinkedOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntOpenHashBigSet;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.ints.IntSortedSets;

import it.unimi.dsi.fastutil.ints.Int2ShortArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ShortLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ShortMap;
import it.unimi.dsi.fastutil.ints.Int2ShortMaps;
import it.unimi.dsi.fastutil.ints.Int2ShortOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ShortAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ShortRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ShortSortedMap;
import it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps;

import it.unimi.dsi.fastutil.ints.Int2ReferenceArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ReferenceMap;
import it.unimi.dsi.fastutil.ints.Int2ReferenceMaps;
import it.unimi.dsi.fastutil.ints.Int2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ReferenceRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap;
import it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMaps;

import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntMaps;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2IntAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2IntRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2IntSortedMap;
import it.unimi.dsi.fastutil.ints.Int2IntSortedMaps;

import it.unimi.dsi.fastutil.ints.Int2DoubleArrayMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleMaps;
import it.unimi.dsi.fastutil.ints.Int2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps;

import it.unimi.dsi.fastutil.ints.Int2FloatArrayMap;
import it.unimi.dsi.fastutil.ints.Int2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2FloatMap;
import it.unimi.dsi.fastutil.ints.Int2FloatMaps;
import it.unimi.dsi.fastutil.ints.Int2FloatOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2FloatAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2FloatRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2FloatSortedMap;
import it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps;

import it.unimi.dsi.fastutil.ints.Int2LongArrayMap;
import it.unimi.dsi.fastutil.ints.Int2LongLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2LongMap;
import it.unimi.dsi.fastutil.ints.Int2LongMaps;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2LongAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2LongRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2LongSortedMap;
import it.unimi.dsi.fastutil.ints.Int2LongSortedMaps;

import it.unimi.dsi.fastutil.ints.Int2CharArrayMap;
import it.unimi.dsi.fastutil.ints.Int2CharLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2CharMap;
import it.unimi.dsi.fastutil.ints.Int2CharMaps;
import it.unimi.dsi.fastutil.ints.Int2CharOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2CharAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2CharRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2CharSortedMap;
import it.unimi.dsi.fastutil.ints.Int2CharSortedMaps;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps;

import it.unimi.dsi.fastutil.ints.Int2ByteArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ByteMap;
import it.unimi.dsi.fastutil.ints.Int2ByteMaps;
import it.unimi.dsi.fastutil.ints.Int2ByteOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ByteAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ByteRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ByteSortedMap;
import it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps;


import junit.framework.TestSuite;

@RunWith(Enclosed.class)
public final class IntCollectionsTest {
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
      TestSuite suite = new TestSuite("IntCollectionsTests.Lists");
      suite.addTest(getIntArrayListTests());
      suite.addTest(getSynchronizedIntArrayListTests());
      suite.addTest(getUnmodifiableIntArrayListTests());
      suite.addTest(getSingletonIntListTests());
      suite.addTest(getEmptyIntListTests());
      return suite;
    }

    private static junit.framework.Test getIntArrayListTests() {
      return getGeneralIntListTests("IntArrayList", c -> new IntArrayList(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedIntArrayListTests() {
      return getGeneralIntListTests("SynchronizedIntArrayList",
          c -> IntLists.synchronize(new IntArrayList(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableIntArrayListTests() {
      return getGeneralIntListTests("UnmodifiableIntArrayList",
          c -> IntLists.unmodifiable(new IntArrayList(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonIntListTests() {
      final class Generator extends IntGeneratorBase implements TestListGenerator<Integer> {
        @Override
        public List<Integer> create(Object... elements) {
          Integer value = Iterables.getOnlyElement(arrayToCollection(elements));
          return IntLists.singleton(value);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("IntSingletonList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyIntListTests() {
      final class Generator extends IntGeneratorBase implements TestListGenerator<Integer> {
        @Override
        public List<Integer> create(Object... elements) {
          assertEquals(0, elements.length);
          return IntLists.EMPTY_LIST;
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("IntEmptyList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }
  }

  public static final class BigLists {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("IntCollectionsTests.BigLists");
      suite.addTest(getIntBigArrayBigListTests());
      suite.addTest(getSynchronizedIntBigArrayBigListTests());
      suite.addTest(getUnmodifiableIntBigArrayBigListTests());
      suite.addTest(getSingletonIntBigListTests());
      suite.addTest(getEmptyIntBigListTests());
      return suite;
    }

    private static junit.framework.Test getIntBigArrayBigListTests() {
      return getGeneralIntListTests("IntBigArrayBigList",
          c -> new IntBigList2ListAdapter(new IntBigArrayBigList(c.iterator())),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedIntBigArrayBigListTests() {
      return getGeneralIntListTests("SynchronizedIntBigArrayBigList",
          c -> new IntBigList2ListAdapter(
              IntBigLists.synchronize(new IntBigArrayBigList(c.iterator()))),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableIntBigArrayBigListTests() {
      return getGeneralIntListTests("UnmodifiableIntBigArrayBigList",
          c -> new IntBigList2ListAdapter(
              IntBigLists.unmodifiable(new IntBigArrayBigList(c.iterator()))),
          Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonIntBigListTests() {
      final class Generator extends IntGeneratorBase implements TestListGenerator<Integer> {
        @Override
        public List<Integer> create(Object... elements) {
          Integer value = Iterables.getOnlyElement(arrayToCollection(elements));
          return new IntBigList2ListAdapter(IntBigLists.singleton(value));
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("SingletonIntBigList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyIntBigListTests() {
      final class Generator extends IntGeneratorBase implements TestListGenerator<Integer> {
        @Override
        public List<Integer> create(Object... elements) {
          assertEquals(0, elements.length);
          return new IntBigList2ListAdapter(IntBigLists.EMPTY_BIG_LIST);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("EmptyIntBigList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    @SuppressWarnings("serial")
    private static final class IntBigList2ListAdapter extends BigList2ListAdapter<Integer> {
      private IntBigList2ListAdapter(BigList<Integer> bigList) {
        super(bigList);
      }

      @Override
      public List<Integer> subList(int fromIndex, int toIndex) {
        return new IntBigList2ListAdapter(bigList.subList(fromIndex, toIndex));
      }

      @Override
      void bigListIteratorSet(BigListIterator<Integer> bigListIterator, Integer e) {
        ((IntBigListIterator) bigListIterator).set(e);
      }

      @Override
      void bigListIteratorAdd(BigListIterator<Integer> bigListIterator, Integer e) {
        ((IntBigListIterator) bigListIterator).add(e);
      }
    }
  }

  public static final class Sets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("IntCollectionsTests.Sets");
      suite.addTest(getIntArraySetTests());
      suite.addTest(getSynchronizedIntArraySetTests());
      suite.addTest(getUnmodifiableIntArraySetTests());
      suite.addTest(getIntOpenHashSetTests());
      suite.addTest(getIntOpenHashBigSetTests());
      suite.addTest(getSingletonIntSetTests());
      suite.addTest(getEmptyIntSetTests());
      return suite;
    }

    private static junit.framework.Test getIntArraySetTests() {
      return getGeneralIntSetTests("IntArraySet", c -> new IntArraySet(c), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedIntArraySetTests() {
      return getGeneralIntSetTests("SynchronizedIntArraySet",
          c -> IntSets.synchronize(new IntArraySet(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableIntArraySetTests() {
      return getGeneralIntSetTests("UnmodifiableIntArraySet",
          c -> IntSets.unmodifiable(new IntArraySet(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getIntOpenHashSetTests() {
      return getGeneralIntSetTests("IntOpenHashSet", c -> new IntOpenHashSet(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getIntOpenHashBigSetTests() {
      return getGeneralIntSetTests("IntOpenHashBigSet", c -> new IntOpenHashBigSet(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getGeneralIntSetTests(String testSuiteName,
        Function<Collection<Integer>, Set<Integer>> generator, Modifiable modifiable) {
      final class Generator extends IntGeneratorBase implements TestSetGenerator<Integer> {
        @Override
        public Set<Integer> create(Object... elements) {
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

    private static junit.framework.Test getSingletonIntSetTests() {
      final class Generator extends IntGeneratorBase implements TestSetGenerator<Integer> {
        @Override
        public Set<Integer> create(Object... elements) {
          Integer value = Iterables.getOnlyElement(arrayToCollection(elements));
          return IntSets.singleton(value);
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("IntSingletonSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyIntSetTests() {
      final class Generator extends IntGeneratorBase implements TestSetGenerator<Integer> {
        @Override
        public Set<Integer> create(Object... elements) {
          assertEquals(0, elements.length);
          return IntSets.EMPTY_SET;
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("IntEmptySet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
          .createTestSuite();
    }
  }

  public static final class SortedSets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("IntCollectionsTests.SortedSets");
      suite.addTest(getLinkedOpenHashSetTests());
      suite.addTest(getLinkedOpenCustomHashSetTests());
      suite.addTest(getAVLTreeSetTests());
      suite.addTest(getRBTreeSetTests());
      suite.addTest(getSynchronizedRBTreeSetTests());
      suite.addTest(getUnmodifiableRBTreeSetTests());
      suite.addTest(getSingletonIntSortedSetTests());
      suite.addTest(getEmptyIntSortedSetTests());
      return suite;
    }

    private static junit.framework.Test getLinkedOpenHashSetTests() {
      return getGeneralIntSortedSetTests("IntLinkedOpenHashSet",
          c -> new IntLinkedOpenHashSet(c), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getLinkedOpenCustomHashSetTests() {
      @SuppressWarnings("serial")
      final class HashStrategy implements IntHash.Strategy, java.io.Serializable {
        @Override
        public int hashCode(int e) {
          return Hashing.murmur3_32().hashInt(e).asInt();
        }

        @Override
        public boolean equals(int a, int b) {
          return a == b;
        }
      }

      return getGeneralIntSortedSetTests("IntLinkedOpenCustomHashSet",
          c -> new IntLinkedOpenCustomHashSet(c, new HashStrategy()), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getAVLTreeSetTests() {
      return getGeneralIntSortedSetTests("IntAVLTreeSet", c -> new IntAVLTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getRBTreeSetTests() {
      return getGeneralIntSortedSetTests("IntRBTreeSet", c -> new IntRBTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getSynchronizedRBTreeSetTests() {
      return getGeneralIntSortedSetTests("IntRBTreeSet",
          c -> IntSortedSets.synchronize(new IntRBTreeSet(c)), Modifiable.MUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getUnmodifiableRBTreeSetTests() {
      return getGeneralIntSortedSetTests("IntRBTreeSet",
          c -> IntSortedSets.unmodifiable(new IntRBTreeSet(c)), Modifiable.IMMUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getGeneralIntSortedSetTests(String testSuiteName,
        Function<Collection<Integer>, SortedSet<Integer>> generator, Modifiable modifiable,
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

      return SortedSetTestSuiteBuilder.using(new IntSortedSetGenerator(ordering, generator))
          .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingletonIntSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new IntSortedSetGenerator(Ordering.SORTED, c -> {
        Integer value = Iterables.getOnlyElement(c);
        return IntSortedSets.singleton(value);
      })).named("IntSingletonSortedSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyIntSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new IntSortedSetGenerator(Ordering.SORTED, c -> {
        assertTrue(c.isEmpty());
        return IntSortedSets.EMPTY_SET;
      })).named("IntSingletonSortedSet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

    private static class IntSortedSetGenerator extends IntGeneratorBase
        implements TestSortedSetGenerator<Integer> {
      private final Function<Collection<Integer>, SortedSet<Integer>> generator;

      IntSortedSetGenerator(Ordering ordering,
          Function<Collection<Integer>, SortedSet<Integer>> generator) {
        super(TestSampleValues.INT_SAMPLE_ELEMENTS_FOR_SORTED, ordering);
        this.generator = generator;
      }

      @Override
      public SortedSet<Integer> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }

      @Override
      public Integer belowSamplesLesser() {
        return TestSampleValues.INTS_FOR_SORTED[0];
      }

      @Override
      public Integer belowSamplesGreater() {
        return TestSampleValues.INTS_FOR_SORTED[1];
      }

      @Override
      public Integer aboveSamplesLesser() {
        return TestSampleValues.INTS_FOR_SORTED[7];
      }

      @Override
      public Integer aboveSamplesGreater() {
        return TestSampleValues.INTS_FOR_SORTED[8];
      }
    }
  }

  public static final class FastutilInt2ShortMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Short.class, Int2ShortArrayMap::new, TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Short.class, Int2ShortArrayMap::new,
          m -> Int2ShortMaps.synchronize((Int2ShortMap) m), TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Short.class, Int2ShortArrayMap::new,
          m -> Int2ShortMaps.unmodifiable((Int2ShortMap) m),
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Short.class, Int2ShortOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Short.class, Int2ShortLinkedOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Short.class, Int2ShortMaps::singleton,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Short.class, getEmptyMap(), TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Int2ShortMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilInt2ShortSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Short.class, Int2ShortAVLTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Short.class, Int2ShortRBTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Short.class, Int2ShortRBTreeMap::new,
          m -> Int2ShortSortedMaps.synchronize((Int2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Short.class, Int2ShortRBTreeMap::new,
          m -> Int2ShortSortedMaps.unmodifiable((Int2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Short.class, Int2ShortSortedMaps::singleton,
      // TestSampleValues.SHORTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Short.class, Int2ShortSortedMaps.EMPTY_MAP,
      // TestSampleValues.SHORTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilInt2ReferenceMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.Maps");
      suite.addTest(
          getMapTests(String.class, Int2ReferenceArrayMap::new, TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(String.class, Int2ReferenceArrayMap::new,
          m -> Int2ReferenceMaps.synchronize((Int2ReferenceMap<String>) m), TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(String.class, Int2ReferenceArrayMap::new,
          m -> Int2ReferenceMaps.unmodifiable((Int2ReferenceMap<String>) m),
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(String.class, Int2ReferenceOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Int2ReferenceLinkedOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Int2ReferenceMaps::singleton,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(String.class, getEmptyMap(), TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Int2ReferenceMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilInt2ReferenceSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Int2ReferenceAVLTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Int2ReferenceRBTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Int2ReferenceRBTreeMap::new,
          m -> Int2ReferenceSortedMaps.synchronize((Int2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Int2ReferenceRBTreeMap::new,
          m -> Int2ReferenceSortedMaps.unmodifiable((Int2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Int2ReferenceSortedMaps::singleton,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Int2ReferenceSortedMaps.EMPTY_MAP,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilInt2IntMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Integer.class, Int2IntArrayMap::new, TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Integer.class, Int2IntArrayMap::new,
          m -> Int2IntMaps.synchronize((Int2IntMap) m), TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Integer.class, Int2IntArrayMap::new,
          m -> Int2IntMaps.unmodifiable((Int2IntMap) m),
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Integer.class, Int2IntOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Integer.class, Int2IntLinkedOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Integer.class, Int2IntMaps::singleton,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Integer.class, getEmptyMap(), TestSampleValues.INT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Int2IntMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilInt2IntSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Integer.class, Int2IntAVLTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Integer.class, Int2IntRBTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Integer.class, Int2IntRBTreeMap::new,
          m -> Int2IntSortedMaps.synchronize((Int2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Integer.class, Int2IntRBTreeMap::new,
          m -> Int2IntSortedMaps.unmodifiable((Int2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Integer.class, Int2IntSortedMaps::singleton,
      // TestSampleValues.INTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Integer.class, Int2IntSortedMaps.EMPTY_MAP,
      // TestSampleValues.INTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilInt2DoubleMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Double.class, Int2DoubleArrayMap::new, TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Double.class, Int2DoubleArrayMap::new,
          m -> Int2DoubleMaps.synchronize((Int2DoubleMap) m), TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Double.class, Int2DoubleArrayMap::new,
          m -> Int2DoubleMaps.unmodifiable((Int2DoubleMap) m),
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Double.class, Int2DoubleOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Double.class, Int2DoubleLinkedOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Double.class, Int2DoubleMaps::singleton,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Double.class, getEmptyMap(), TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Int2DoubleMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilInt2DoubleSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Double.class, Int2DoubleAVLTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Double.class, Int2DoubleRBTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Double.class, Int2DoubleRBTreeMap::new,
          m -> Int2DoubleSortedMaps.synchronize((Int2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Double.class, Int2DoubleRBTreeMap::new,
          m -> Int2DoubleSortedMaps.unmodifiable((Int2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Double.class, Int2DoubleSortedMaps::singleton,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Double.class, Int2DoubleSortedMaps.EMPTY_MAP,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilInt2FloatMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Float.class, Int2FloatArrayMap::new, TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Float.class, Int2FloatArrayMap::new,
          m -> Int2FloatMaps.synchronize((Int2FloatMap) m), TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Float.class, Int2FloatArrayMap::new,
          m -> Int2FloatMaps.unmodifiable((Int2FloatMap) m),
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Float.class, Int2FloatOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Float.class, Int2FloatLinkedOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Float.class, Int2FloatMaps::singleton,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Float.class, getEmptyMap(), TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Int2FloatMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilInt2FloatSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Float.class, Int2FloatAVLTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Float.class, Int2FloatRBTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Float.class, Int2FloatRBTreeMap::new,
          m -> Int2FloatSortedMaps.synchronize((Int2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Float.class, Int2FloatRBTreeMap::new,
          m -> Int2FloatSortedMaps.unmodifiable((Int2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Float.class, Int2FloatSortedMaps::singleton,
      // TestSampleValues.FLOATS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Float.class, Int2FloatSortedMaps.EMPTY_MAP,
      // TestSampleValues.FLOATS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilInt2LongMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Long.class, Int2LongArrayMap::new, TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Long.class, Int2LongArrayMap::new,
          m -> Int2LongMaps.synchronize((Int2LongMap) m), TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Long.class, Int2LongArrayMap::new,
          m -> Int2LongMaps.unmodifiable((Int2LongMap) m),
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Long.class, Int2LongOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Long.class, Int2LongLinkedOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Long.class, Int2LongMaps::singleton,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Long.class, getEmptyMap(), TestSampleValues.LONG_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Int2LongMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilInt2LongSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Long.class, Int2LongAVLTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Long.class, Int2LongRBTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Long.class, Int2LongRBTreeMap::new,
          m -> Int2LongSortedMaps.synchronize((Int2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Long.class, Int2LongRBTreeMap::new,
          m -> Int2LongSortedMaps.unmodifiable((Int2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Long.class, Int2LongSortedMaps::singleton,
      // TestSampleValues.LONGS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Long.class, Int2LongSortedMaps.EMPTY_MAP,
      // TestSampleValues.LONGS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilInt2CharMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Character.class, Int2CharArrayMap::new, TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Character.class, Int2CharArrayMap::new,
          m -> Int2CharMaps.synchronize((Int2CharMap) m), TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Character.class, Int2CharArrayMap::new,
          m -> Int2CharMaps.unmodifiable((Int2CharMap) m),
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Character.class, Int2CharOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Character.class, Int2CharLinkedOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Character.class, Int2CharMaps::singleton,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Character.class, getEmptyMap(), TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Int2CharMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilInt2CharSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Character.class, Int2CharAVLTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Character.class, Int2CharRBTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Character.class, Int2CharRBTreeMap::new,
          m -> Int2CharSortedMaps.synchronize((Int2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Character.class, Int2CharRBTreeMap::new,
          m -> Int2CharSortedMaps.unmodifiable((Int2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Character.class, Int2CharSortedMaps::singleton,
      // TestSampleValues.CHARS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Character.class, Int2CharSortedMaps.EMPTY_MAP,
      // TestSampleValues.CHARS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilInt2ObjectMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.Maps");
      suite.addTest(
          getMapTests(String.class, Int2ObjectArrayMap::new, TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(String.class, Int2ObjectArrayMap::new,
          m -> Int2ObjectMaps.synchronize((Int2ObjectMap<String>) m), TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(String.class, Int2ObjectArrayMap::new,
          m -> Int2ObjectMaps.unmodifiable((Int2ObjectMap<String>) m),
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(String.class, Int2ObjectOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Int2ObjectLinkedOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Int2ObjectMaps::singleton,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(String.class, getEmptyMap(), TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Int2ObjectMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilInt2ObjectSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Int2ObjectAVLTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Int2ObjectRBTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Int2ObjectRBTreeMap::new,
          m -> Int2ObjectSortedMaps.synchronize((Int2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Int2ObjectRBTreeMap::new,
          m -> Int2ObjectSortedMaps.unmodifiable((Int2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Int2ObjectSortedMaps::singleton,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Int2ObjectSortedMaps.EMPTY_MAP,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilInt2ByteMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Byte.class, Int2ByteArrayMap::new, TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Byte.class, Int2ByteArrayMap::new,
          m -> Int2ByteMaps.synchronize((Int2ByteMap) m), TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Byte.class, Int2ByteArrayMap::new,
          m -> Int2ByteMaps.unmodifiable((Int2ByteMap) m),
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Byte.class, Int2ByteOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Byte.class, Int2ByteLinkedOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Byte.class, Int2ByteMaps::singleton,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Byte.class, getEmptyMap(), TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Int2ByteMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilInt2ByteSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Int2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Byte.class, Int2ByteAVLTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Byte.class, Int2ByteRBTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Byte.class, Int2ByteRBTreeMap::new,
          m -> Int2ByteSortedMaps.synchronize((Int2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Byte.class, Int2ByteRBTreeMap::new,
          m -> Int2ByteSortedMaps.unmodifiable((Int2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Byte.class, Int2ByteSortedMaps::singleton,
      // TestSampleValues.BYTES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Byte.class, Int2ByteSortedMaps.EMPTY_MAP,
      // TestSampleValues.BYTES_FOR_SORTED));
      return suite;
    }
  }

  private static abstract class IntGeneratorBase extends TestContainerGeneratorBase<Integer> {
    IntGeneratorBase() {
      this(TestSampleValues.INT_SAMPLE_ELEMENTS, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    IntGeneratorBase(SampleElements<Integer> sampleElements, Ordering ordering) {
      super(Integer.class, sampleElements, ordering);
    }
  }

  private static junit.framework.Test getGeneralIntListTests(String testSuiteName,
      Function<Collection<Integer>, List<Integer>> generator, Modifiable modifiable) {
    final class Generator extends IntGeneratorBase implements TestListGenerator<Integer> {
      @Override
      public List<Integer> create(Object... elements) {
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
      Supplier<Map<Integer, V>> mapFactory, SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Integer, V> map = mapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedArrayMapTests(Class<V> clazzV,
      Supplier<Map<Integer, V>> mapFactory, Function<Map<Integer, V>, Map<Integer, V>> syncrhonizeWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Integer, V> map = mapFactory.get();
      map.putAll(m);
      map = syncrhonizeWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableArrayMapTests(Class<V> clazzV,
      Supplier<Map<Integer, V>> mapFactory, Function<Map<Integer, V>, Map<Integer, V>> unmodifiableWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Integer, V> map = mapFactory.get();
      map.putAll(m);
      map = unmodifiableWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralMapTests(Class<V> clazzV,
      Function<Map<Integer, V>, Map<Integer, V>> mapFactory, String testSuiteName,
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
        .using(new IntMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  private static <V> junit.framework.Test getSingletonMapTests(Class<V> clazzV,
      BiFunction<Integer, V, Map<Integer, V>> singletonMapFactory,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonMap";
    return MapTestSuiteBuilder.using(new IntMapGenerator<V>(clazzV, map -> {
      Map.Entry<Integer, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE, CollectionFeature.NON_STANDARD_TOSTRING)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getEmptyMapTests(Class<V> clazzV, Map<Integer, V> emptyMap,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptyMap";
    return MapTestSuiteBuilder.using(new IntMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getSortedMapTests(Class<V> clazzV,
      Supplier<SortedMap<Integer, V>> sortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Integer, V> map = sortedMapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Integer, V>> sortedMapFactory,
      Function<SortedMap<Integer, V>, SortedMap<Integer, V>> synchronziedWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Synchronized" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Integer, V> map = sortedMapFactory.get();
      map.putAll(m);
      return synchronziedWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Integer, V>> sortedMapFactory,
      Function<SortedMap<Integer, V>, SortedMap<Integer, V>> unmodifiableWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Unmodifiable" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Integer, V> map = sortedMapFactory.get();
      map.putAll(m);
      return unmodifiableWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralSortedMapTests(Class<V> clazzV,
      Function<Map<Integer, V>, SortedMap<Integer, V>> mapFactory, String testSuiteName,
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
        .using(new IntSortedMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getSingletonSortedMapTests(Class<V> clazzV,
      BiFunction<Integer, V, SortedMap<Integer, V>> singletonSortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonSortedMap";
    return SortedMapTestSuiteBuilder.using(new IntSortedMapGenerator<V>(clazzV, map -> {
      Map.Entry<Integer, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonSortedMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE)
        .createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getEmptySortedMapTests(Class<V> clazzV,
      SortedMap<Integer, V> emptyMap, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptySortedMap";
    return SortedMapTestSuiteBuilder.using(new IntSortedMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE)
        .createTestSuite();
  }

  private static final class IntMapGenerator<V> extends TestMapGeneratorBase<Integer, V> {
    private final Function<Map<Integer, V>, Map<Integer, V>> mapFactory;

    protected IntMapGenerator(Class<V> clazzV, Function<Map<Integer, V>, Map<Integer, V>> mapFactory,
        SampleElements<V> valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected IntMapGenerator(Class<V> clazzV, Function<Map<Integer, V>, Map<Integer, V>> mapFactory,
        SampleElements<V> valueSampleElements, Ordering ordering) {
      super(Integer.class, clazzV, TestSampleValues.INT_SAMPLE_ELEMENTS, valueSampleElements,
          ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public Map<Integer, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }

  private static final class IntSortedMapGenerator<V> extends TestSortedMapGeneratorBase<Integer, V> {
    private final Function<Map<Integer, V>, SortedMap<Integer, V>> mapFactory;

    protected IntSortedMapGenerator(Class<V> clazzV,
        Function<Map<Integer, V>, SortedMap<Integer, V>> mapFactory, V[] valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected IntSortedMapGenerator(Class<V> clazzV,
        Function<Map<Integer, V>, SortedMap<Integer, V>> mapFactory, V[] valueSampleElements,
        Ordering ordering) {
      super(Integer.class, clazzV, TestSampleValues.INTS_FOR_SORTED, valueSampleElements, ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public SortedMap<Integer, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }
}