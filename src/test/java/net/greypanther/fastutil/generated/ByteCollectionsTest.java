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

import it.unimi.dsi.fastutil.bytes.ByteAVLTreeSet;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteArraySet;
import it.unimi.dsi.fastutil.bytes.ByteBigArrayBigList;
import it.unimi.dsi.fastutil.bytes.ByteBigListIterator;
import it.unimi.dsi.fastutil.bytes.ByteBigLists;
import it.unimi.dsi.fastutil.bytes.ByteHash;
import com.google.common.hash.Hashing;
import it.unimi.dsi.fastutil.bytes.ByteLinkedOpenCustomHashSet;
import it.unimi.dsi.fastutil.bytes.ByteLinkedOpenHashSet;
import it.unimi.dsi.fastutil.bytes.ByteLists;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import it.unimi.dsi.fastutil.bytes.ByteRBTreeSet;
import it.unimi.dsi.fastutil.bytes.ByteSets;
import it.unimi.dsi.fastutil.bytes.ByteSortedSets;

import it.unimi.dsi.fastutil.bytes.Byte2ShortArrayMap;
import it.unimi.dsi.fastutil.bytes.Byte2ShortLinkedOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2ShortMap;
import it.unimi.dsi.fastutil.bytes.Byte2ShortMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ShortOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2ShortAVLTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2ShortRBTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap;
import it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps;

import it.unimi.dsi.fastutil.bytes.Byte2ReferenceArrayMap;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceRBTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMaps;

import it.unimi.dsi.fastutil.bytes.Byte2IntArrayMap;
import it.unimi.dsi.fastutil.bytes.Byte2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2IntMap;
import it.unimi.dsi.fastutil.bytes.Byte2IntMaps;
import it.unimi.dsi.fastutil.bytes.Byte2IntOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2IntAVLTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2IntRBTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap;
import it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps;

import it.unimi.dsi.fastutil.bytes.Byte2DoubleArrayMap;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleLinkedOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleMap;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps;

import it.unimi.dsi.fastutil.bytes.Byte2FloatArrayMap;
import it.unimi.dsi.fastutil.bytes.Byte2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2FloatMap;
import it.unimi.dsi.fastutil.bytes.Byte2FloatMaps;
import it.unimi.dsi.fastutil.bytes.Byte2FloatOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2FloatAVLTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2FloatRBTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap;
import it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps;

import it.unimi.dsi.fastutil.bytes.Byte2LongArrayMap;
import it.unimi.dsi.fastutil.bytes.Byte2LongLinkedOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2LongMap;
import it.unimi.dsi.fastutil.bytes.Byte2LongMaps;
import it.unimi.dsi.fastutil.bytes.Byte2LongOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2LongAVLTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2LongRBTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap;
import it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps;

import it.unimi.dsi.fastutil.bytes.Byte2CharArrayMap;
import it.unimi.dsi.fastutil.bytes.Byte2CharLinkedOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2CharMap;
import it.unimi.dsi.fastutil.bytes.Byte2CharMaps;
import it.unimi.dsi.fastutil.bytes.Byte2CharOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2CharAVLTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2CharRBTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap;
import it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps;

import it.unimi.dsi.fastutil.bytes.Byte2ObjectArrayMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectRBTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps;

import it.unimi.dsi.fastutil.bytes.Byte2ByteArrayMap;
import it.unimi.dsi.fastutil.bytes.Byte2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2ByteMap;
import it.unimi.dsi.fastutil.bytes.Byte2ByteMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ByteOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2ByteAVLTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2ByteRBTreeMap;
import it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap;
import it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps;

import junit.framework.TestSuite;

@RunWith(Enclosed.class)
public final class ByteCollectionsTest {
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
      TestSuite suite = new TestSuite("ByteCollectionsTests.Lists");
      suite.addTest(getByteArrayListTests());
      suite.addTest(getSynchronizedByteArrayListTests());
      suite.addTest(getUnmodifiableByteArrayListTests());
      suite.addTest(getSingletonByteListTests());
      suite.addTest(getEmptyByteListTests());
      return suite;
    }

    private static junit.framework.Test getByteArrayListTests() {
      return getGeneralByteListTests("ByteArrayList", c -> new ByteArrayList(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedByteArrayListTests() {
      return getGeneralByteListTests("SynchronizedByteArrayList",
          c -> ByteLists.synchronize(new ByteArrayList(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableByteArrayListTests() {
      return getGeneralByteListTests("UnmodifiableByteArrayList",
          c -> ByteLists.unmodifiable(new ByteArrayList(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonByteListTests() {
      final class Generator extends ByteGeneratorBase implements TestListGenerator<Byte> {
        @Override
        public List<Byte> create(Object... elements) {
          Byte value = Iterables.getOnlyElement(arrayToCollection(elements));
          return ByteLists.singleton(value);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("ByteSingletonList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyByteListTests() {
      final class Generator extends ByteGeneratorBase implements TestListGenerator<Byte> {
        @Override
        public List<Byte> create(Object... elements) {
          assertEquals(0, elements.length);
          return ByteLists.EMPTY_LIST;
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("ByteEmptyList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }
  }

  public static final class BigLists {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("ByteCollectionsTests.BigLists");
      suite.addTest(getByteBigArrayBigListTests());
      suite.addTest(getSynchronizedByteBigArrayBigListTests());
      suite.addTest(getUnmodifiableByteBigArrayBigListTests());
      suite.addTest(getSingletonByteBigListTests());
      suite.addTest(getEmptyByteBigListTests());
      return suite;
    }

    private static junit.framework.Test getByteBigArrayBigListTests() {
      return getGeneralByteListTests("ByteBigArrayBigList",
          c -> new ByteBigList2ListAdapter(new ByteBigArrayBigList(c.iterator())),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedByteBigArrayBigListTests() {
      return getGeneralByteListTests("SynchronizedByteBigArrayBigList",
          c -> new ByteBigList2ListAdapter(
              ByteBigLists.synchronize(new ByteBigArrayBigList(c.iterator()))),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableByteBigArrayBigListTests() {
      return getGeneralByteListTests("UnmodifiableByteBigArrayBigList",
          c -> new ByteBigList2ListAdapter(
              ByteBigLists.unmodifiable(new ByteBigArrayBigList(c.iterator()))),
          Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonByteBigListTests() {
      final class Generator extends ByteGeneratorBase implements TestListGenerator<Byte> {
        @Override
        public List<Byte> create(Object... elements) {
          Byte value = Iterables.getOnlyElement(arrayToCollection(elements));
          return new ByteBigList2ListAdapter(ByteBigLists.singleton(value));
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("SingletonByteBigList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyByteBigListTests() {
      final class Generator extends ByteGeneratorBase implements TestListGenerator<Byte> {
        @Override
        public List<Byte> create(Object... elements) {
          assertEquals(0, elements.length);
          return new ByteBigList2ListAdapter(ByteBigLists.EMPTY_BIG_LIST);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("EmptyByteBigList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    @SuppressWarnings("serial")
    private static final class ByteBigList2ListAdapter extends BigList2ListAdapter<Byte> {
      private ByteBigList2ListAdapter(BigList<Byte> bigList) {
        super(bigList);
      }

      @Override
      public List<Byte> subList(int fromIndex, int toIndex) {
        return new ByteBigList2ListAdapter(bigList.subList(fromIndex, toIndex));
      }

      @Override
      void bigListIteratorSet(BigListIterator<Byte> bigListIterator, Byte e) {
        ((ByteBigListIterator) bigListIterator).set(e);
      }

      @Override
      void bigListIteratorAdd(BigListIterator<Byte> bigListIterator, Byte e) {
        ((ByteBigListIterator) bigListIterator).add(e);
      }
    }
  }

  public static final class Sets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("ByteCollectionsTests.Sets");
      if (RUN_ARRAYSET_TESTS) {
        suite.addTest(getByteArraySetTests());
        suite.addTest(getSynchronizedByteArraySetTests());
        suite.addTest(getUnmodifiableByteArraySetTests());
      }
      suite.addTest(getByteOpenHashSetTests());
      suite.addTest(getSingletonByteSetTests());
      suite.addTest(getEmptyByteSetTests());
      return suite;
    }

    private static junit.framework.Test getByteArraySetTests() {
      return getGeneralByteSetTests("ByteArraySet", c -> new ByteArraySet(c), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedByteArraySetTests() {
      return getGeneralByteSetTests("SynchronizedByteArraySet",
          c -> ByteSets.synchronize(new ByteArraySet(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableByteArraySetTests() {
      return getGeneralByteSetTests("UnmodifiableByteArraySet",
          c -> ByteSets.unmodifiable(new ByteArraySet(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getByteOpenHashSetTests() {
      return getGeneralByteSetTests("ByteOpenHashSet", c -> new ByteOpenHashSet(c),
          Modifiable.MUTABLE);
    }


    private static junit.framework.Test getGeneralByteSetTests(String testSuiteName,
        Function<Collection<Byte>, Set<Byte>> generator, Modifiable modifiable) {
      final class Generator extends ByteGeneratorBase implements TestSetGenerator<Byte> {
        @Override
        public Set<Byte> create(Object... elements) {
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

    private static junit.framework.Test getSingletonByteSetTests() {
      final class Generator extends ByteGeneratorBase implements TestSetGenerator<Byte> {
        @Override
        public Set<Byte> create(Object... elements) {
          Byte value = Iterables.getOnlyElement(arrayToCollection(elements));
          return ByteSets.singleton(value);
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("ByteSingletonSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyByteSetTests() {
      final class Generator extends ByteGeneratorBase implements TestSetGenerator<Byte> {
        @Override
        public Set<Byte> create(Object... elements) {
          assertEquals(0, elements.length);
          return ByteSets.EMPTY_SET;
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("ByteEmptySet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }
  }

  public static final class SortedSets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("ByteCollectionsTests.SortedSets");
      suite.addTest(getLinkedOpenHashSetTests());
      suite.addTest(getLinkedOpenCustomHashSetTests());
      suite.addTest(getAVLTreeSetTests());
      suite.addTest(getRBTreeSetTests());
      suite.addTest(getSynchronizedRBTreeSetTests());
      suite.addTest(getUnmodifiableRBTreeSetTests());
      suite.addTest(getSingletonByteSortedSetTests());
      suite.addTest(getEmptyByteSortedSetTests());
      return suite;
    }

    private static junit.framework.Test getLinkedOpenHashSetTests() {
      return getGeneralByteSortedSetTests("ByteLinkedOpenHashSet",
          c -> new ByteLinkedOpenHashSet(c), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getLinkedOpenCustomHashSetTests() {
      @SuppressWarnings("serial")
      final class HashStrategy implements ByteHash.Strategy, java.io.Serializable {
        @Override
        public int hashCode(byte e) {
          return Hashing.murmur3_32().hashInt(e).asInt();
        }

        @Override
        public boolean equals(byte a, byte b) {
          return a == b;
        }
      }

      return getGeneralByteSortedSetTests("ByteLinkedOpenCustomHashSet",
          c -> new ByteLinkedOpenCustomHashSet(c, new HashStrategy()), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getAVLTreeSetTests() {
      return getGeneralByteSortedSetTests("ByteAVLTreeSet", c -> new ByteAVLTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getRBTreeSetTests() {
      return getGeneralByteSortedSetTests("ByteRBTreeSet", c -> new ByteRBTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getSynchronizedRBTreeSetTests() {
      return getGeneralByteSortedSetTests("ByteRBTreeSet",
          c -> ByteSortedSets.synchronize(new ByteRBTreeSet(c)), Modifiable.MUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getUnmodifiableRBTreeSetTests() {
      return getGeneralByteSortedSetTests("ByteRBTreeSet",
          c -> ByteSortedSets.unmodifiable(new ByteRBTreeSet(c)), Modifiable.IMMUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getGeneralByteSortedSetTests(String testSuiteName,
        Function<Collection<Byte>, SortedSet<Byte>> generator, Modifiable modifiable,
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

      return SortedSetTestSuiteBuilder.using(new ByteSortedSetGenerator(ordering, generator))
          .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingletonByteSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new ByteSortedSetGenerator(Ordering.SORTED, c -> {
        Byte value = Iterables.getOnlyElement(c);
        return ByteSortedSets.singleton(value);
      })).named("ByteSingletonSortedSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyByteSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new ByteSortedSetGenerator(Ordering.SORTED, c -> {
        assertTrue(c.isEmpty());
        return ByteSortedSets.EMPTY_SET;
      })).named("ByteSingletonSortedSet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

    private static class ByteSortedSetGenerator extends ByteGeneratorBase
        implements TestSortedSetGenerator<Byte> {
      private final Function<Collection<Byte>, SortedSet<Byte>> generator;

      ByteSortedSetGenerator(Ordering ordering,
          Function<Collection<Byte>, SortedSet<Byte>> generator) {
        super(TestSampleValues.BYTE_SAMPLE_ELEMENTS_FOR_SORTED, ordering);
        this.generator = generator;
      }

      @Override
      public SortedSet<Byte> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }

      @Override
      public Byte belowSamplesLesser() {
        return TestSampleValues.BYTES_FOR_SORTED[0];
      }

      @Override
      public Byte belowSamplesGreater() {
        return TestSampleValues.BYTES_FOR_SORTED[1];
      }

      @Override
      public Byte aboveSamplesLesser() {
        return TestSampleValues.BYTES_FOR_SORTED[7];
      }

      @Override
      public Byte aboveSamplesGreater() {
        return TestSampleValues.BYTES_FOR_SORTED[8];
      }
    }
  }

  public static final class FastutilByte2ShortMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Short.class, Byte2ShortArrayMap::new,
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Short.class, Byte2ShortArrayMap::new,
            m -> Byte2ShortMaps.synchronize((Byte2ShortMap) m),
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Short.class, Byte2ShortArrayMap::new,
            m -> Byte2ShortMaps.unmodifiable((Byte2ShortMap) m),
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Short.class, Byte2ShortOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Short.class, Byte2ShortLinkedOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Short.class, Byte2ShortMaps::singleton,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Short.class, getEmptyMap(), TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Byte2ShortMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilByte2ShortSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Short.class, Byte2ShortAVLTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Short.class, Byte2ShortRBTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Short.class, Byte2ShortRBTreeMap::new,
          m -> Byte2ShortSortedMaps.synchronize((Byte2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Short.class, Byte2ShortRBTreeMap::new,
          m -> Byte2ShortSortedMaps.unmodifiable((Byte2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Short.class, Byte2ShortSortedMaps::singleton,
      // TestSampleValues.SHORTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Short.class, Byte2ShortSortedMaps.EMPTY_MAP,
      // TestSampleValues.SHORTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilByte2ReferenceMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(String.class, Byte2ReferenceArrayMap::new,
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(String.class, Byte2ReferenceArrayMap::new,
            m -> Byte2ReferenceMaps.synchronize((Byte2ReferenceMap<String>) m),
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(String.class, Byte2ReferenceArrayMap::new,
            m -> Byte2ReferenceMaps.unmodifiable((Byte2ReferenceMap<String>) m),
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(String.class, Byte2ReferenceOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Byte2ReferenceLinkedOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Byte2ReferenceMaps::singleton,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(String.class, getEmptyMap(),
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Byte2ReferenceMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilByte2ReferenceSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Byte2ReferenceAVLTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Byte2ReferenceRBTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Byte2ReferenceRBTreeMap::new,
          m -> Byte2ReferenceSortedMaps.synchronize((Byte2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Byte2ReferenceRBTreeMap::new,
          m -> Byte2ReferenceSortedMaps.unmodifiable((Byte2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Byte2ReferenceSortedMaps::singleton,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Byte2ReferenceSortedMaps.EMPTY_MAP,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilByte2IntMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Integer.class, Byte2IntArrayMap::new,
            TestSampleValues.INT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Integer.class, Byte2IntArrayMap::new,
            m -> Byte2IntMaps.synchronize((Byte2IntMap) m), TestSampleValues.INT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Integer.class, Byte2IntArrayMap::new,
            m -> Byte2IntMaps.unmodifiable((Byte2IntMap) m), TestSampleValues.INT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Integer.class, Byte2IntOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Integer.class, Byte2IntLinkedOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Integer.class, Byte2IntMaps::singleton,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Integer.class, getEmptyMap(), TestSampleValues.INT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Byte2IntMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilByte2IntSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Integer.class, Byte2IntAVLTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Integer.class, Byte2IntRBTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Integer.class, Byte2IntRBTreeMap::new,
          m -> Byte2IntSortedMaps.synchronize((Byte2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Integer.class, Byte2IntRBTreeMap::new,
          m -> Byte2IntSortedMaps.unmodifiable((Byte2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Integer.class, Byte2IntSortedMaps::singleton,
      // TestSampleValues.INTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Integer.class, Byte2IntSortedMaps.EMPTY_MAP,
      // TestSampleValues.INTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilByte2DoubleMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Double.class, Byte2DoubleArrayMap::new,
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Double.class, Byte2DoubleArrayMap::new,
            m -> Byte2DoubleMaps.synchronize((Byte2DoubleMap) m),
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Double.class, Byte2DoubleArrayMap::new,
            m -> Byte2DoubleMaps.unmodifiable((Byte2DoubleMap) m),
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Double.class, Byte2DoubleOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Double.class, Byte2DoubleLinkedOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Double.class, Byte2DoubleMaps::singleton,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Double.class, getEmptyMap(), TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Byte2DoubleMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilByte2DoubleSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Double.class, Byte2DoubleAVLTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Double.class, Byte2DoubleRBTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Double.class, Byte2DoubleRBTreeMap::new,
          m -> Byte2DoubleSortedMaps.synchronize((Byte2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Double.class, Byte2DoubleRBTreeMap::new,
          m -> Byte2DoubleSortedMaps.unmodifiable((Byte2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Double.class, Byte2DoubleSortedMaps::singleton,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Double.class, Byte2DoubleSortedMaps.EMPTY_MAP,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilByte2FloatMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Float.class, Byte2FloatArrayMap::new,
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Float.class, Byte2FloatArrayMap::new,
            m -> Byte2FloatMaps.synchronize((Byte2FloatMap) m),
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Float.class, Byte2FloatArrayMap::new,
            m -> Byte2FloatMaps.unmodifiable((Byte2FloatMap) m),
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Float.class, Byte2FloatOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Float.class, Byte2FloatLinkedOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Float.class, Byte2FloatMaps::singleton,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Float.class, getEmptyMap(), TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Byte2FloatMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilByte2FloatSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Float.class, Byte2FloatAVLTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Float.class, Byte2FloatRBTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Float.class, Byte2FloatRBTreeMap::new,
          m -> Byte2FloatSortedMaps.synchronize((Byte2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Float.class, Byte2FloatRBTreeMap::new,
          m -> Byte2FloatSortedMaps.unmodifiable((Byte2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Float.class, Byte2FloatSortedMaps::singleton,
      // TestSampleValues.FLOATS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Float.class, Byte2FloatSortedMaps.EMPTY_MAP,
      // TestSampleValues.FLOATS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilByte2LongMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(
            getMapTests(Long.class, Byte2LongArrayMap::new, TestSampleValues.LONG_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Long.class, Byte2LongArrayMap::new,
            m -> Byte2LongMaps.synchronize((Byte2LongMap) m),
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Long.class, Byte2LongArrayMap::new,
            m -> Byte2LongMaps.unmodifiable((Byte2LongMap) m),
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Long.class, Byte2LongOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Long.class, Byte2LongLinkedOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Long.class, Byte2LongMaps::singleton,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Long.class, getEmptyMap(), TestSampleValues.LONG_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Byte2LongMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilByte2LongSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Long.class, Byte2LongAVLTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Long.class, Byte2LongRBTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Long.class, Byte2LongRBTreeMap::new,
          m -> Byte2LongSortedMaps.synchronize((Byte2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Long.class, Byte2LongRBTreeMap::new,
          m -> Byte2LongSortedMaps.unmodifiable((Byte2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Long.class, Byte2LongSortedMaps::singleton,
      // TestSampleValues.LONGS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Long.class, Byte2LongSortedMaps.EMPTY_MAP,
      // TestSampleValues.LONGS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilByte2CharMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Character.class, Byte2CharArrayMap::new,
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Character.class, Byte2CharArrayMap::new,
            m -> Byte2CharMaps.synchronize((Byte2CharMap) m),
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Character.class, Byte2CharArrayMap::new,
            m -> Byte2CharMaps.unmodifiable((Byte2CharMap) m),
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Character.class, Byte2CharOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Character.class, Byte2CharLinkedOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Character.class, Byte2CharMaps::singleton,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Character.class, getEmptyMap(), TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Byte2CharMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilByte2CharSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Character.class, Byte2CharAVLTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Character.class, Byte2CharRBTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Character.class, Byte2CharRBTreeMap::new,
          m -> Byte2CharSortedMaps.synchronize((Byte2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Character.class, Byte2CharRBTreeMap::new,
          m -> Byte2CharSortedMaps.unmodifiable((Byte2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Character.class, Byte2CharSortedMaps::singleton,
      // TestSampleValues.CHARS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Character.class, Byte2CharSortedMaps.EMPTY_MAP,
      // TestSampleValues.CHARS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilByte2ObjectMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(String.class, Byte2ObjectArrayMap::new,
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(String.class, Byte2ObjectArrayMap::new,
            m -> Byte2ObjectMaps.synchronize((Byte2ObjectMap<String>) m),
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(String.class, Byte2ObjectArrayMap::new,
            m -> Byte2ObjectMaps.unmodifiable((Byte2ObjectMap<String>) m),
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(String.class, Byte2ObjectOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Byte2ObjectLinkedOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Byte2ObjectMaps::singleton,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(String.class, getEmptyMap(), TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Byte2ObjectMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilByte2ObjectSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Byte2ObjectAVLTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Byte2ObjectRBTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Byte2ObjectRBTreeMap::new,
          m -> Byte2ObjectSortedMaps.synchronize((Byte2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Byte2ObjectRBTreeMap::new,
          m -> Byte2ObjectSortedMaps.unmodifiable((Byte2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Byte2ObjectSortedMaps::singleton,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Byte2ObjectSortedMaps.EMPTY_MAP,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilByte2ByteMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(
            getMapTests(Byte.class, Byte2ByteArrayMap::new, TestSampleValues.BYTE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Byte.class, Byte2ByteArrayMap::new,
            m -> Byte2ByteMaps.synchronize((Byte2ByteMap) m),
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Byte.class, Byte2ByteArrayMap::new,
            m -> Byte2ByteMaps.unmodifiable((Byte2ByteMap) m),
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Byte.class, Byte2ByteOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Byte.class, Byte2ByteLinkedOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Byte.class, Byte2ByteMaps::singleton,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Byte.class, getEmptyMap(), TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Byte2ByteMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilByte2ByteSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Byte2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Byte.class, Byte2ByteAVLTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Byte.class, Byte2ByteRBTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Byte.class, Byte2ByteRBTreeMap::new,
          m -> Byte2ByteSortedMaps.synchronize((Byte2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Byte.class, Byte2ByteRBTreeMap::new,
          m -> Byte2ByteSortedMaps.unmodifiable((Byte2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Byte.class, Byte2ByteSortedMaps::singleton,
      // TestSampleValues.BYTES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Byte.class, Byte2ByteSortedMaps.EMPTY_MAP,
      // TestSampleValues.BYTES_FOR_SORTED));
      return suite;
    }
  }

  private static abstract class ByteGeneratorBase extends TestContainerGeneratorBase<Byte> {
    ByteGeneratorBase() {
      this(TestSampleValues.BYTE_SAMPLE_ELEMENTS, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    ByteGeneratorBase(SampleElements<Byte> sampleElements, Ordering ordering) {
      super(Byte.class, sampleElements, ordering);
    }
  }

  private static junit.framework.Test getGeneralByteListTests(String testSuiteName,
      Function<Collection<Byte>, List<Byte>> generator, Modifiable modifiable) {
    final class Generator extends ByteGeneratorBase implements TestListGenerator<Byte> {
      @Override
      public List<Byte> create(Object... elements) {
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
      Supplier<Map<Byte, V>> mapFactory, SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Byte, V> map = mapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedArrayMapTests(Class<V> clazzV,
      Supplier<Map<Byte, V>> mapFactory, Function<Map<Byte, V>, Map<Byte, V>> syncrhonizeWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Byte, V> map = mapFactory.get();
      map.putAll(m);
      map = syncrhonizeWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableArrayMapTests(Class<V> clazzV,
      Supplier<Map<Byte, V>> mapFactory, Function<Map<Byte, V>, Map<Byte, V>> unmodifiableWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Byte, V> map = mapFactory.get();
      map.putAll(m);
      map = unmodifiableWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralMapTests(Class<V> clazzV,
      Function<Map<Byte, V>, Map<Byte, V>> mapFactory, String testSuiteName,
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
        .using(new ByteMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  private static <V> junit.framework.Test getSingletonMapTests(Class<V> clazzV,
      BiFunction<Byte, V, Map<Byte, V>> singletonMapFactory,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonMap";
    return MapTestSuiteBuilder.using(new ByteMapGenerator<V>(clazzV, map -> {
      Map.Entry<Byte, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements))
        .named(testSuiteName).withFeatures(CollectionSize.ONE,
            CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS, CollectionFeature.NON_STANDARD_TOSTRING)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getEmptyMapTests(Class<V> clazzV, Map<Byte, V> emptyMap,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptyMap";
    return MapTestSuiteBuilder.using(new ByteMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements))
        .named(testSuiteName).withFeatures(CollectionSize.ZERO,
            CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS, CollectionFeature.NON_STANDARD_TOSTRING)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getSortedMapTests(Class<V> clazzV,
      Supplier<SortedMap<Byte, V>> sortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Byte, V> map = sortedMapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Byte, V>> sortedMapFactory,
      Function<SortedMap<Byte, V>, SortedMap<Byte, V>> synchronziedWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Synchronized" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Byte, V> map = sortedMapFactory.get();
      map.putAll(m);
      return synchronziedWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Byte, V>> sortedMapFactory,
      Function<SortedMap<Byte, V>, SortedMap<Byte, V>> unmodifiableWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Unmodifiable" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Byte, V> map = sortedMapFactory.get();
      map.putAll(m);
      return unmodifiableWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralSortedMapTests(Class<V> clazzV,
      Function<Map<Byte, V>, SortedMap<Byte, V>> mapFactory, String testSuiteName,
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
        .using(new ByteSortedMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getSingletonSortedMapTests(Class<V> clazzV,
      BiFunction<Byte, V, SortedMap<Byte, V>> singletonSortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonSortedMap";
    return SortedMapTestSuiteBuilder.using(new ByteSortedMapGenerator<V>(clazzV, map -> {
      Map.Entry<Byte, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonSortedMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getEmptySortedMapTests(Class<V> clazzV,
      SortedMap<Byte, V> emptyMap, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptySortedMap";
    return SortedMapTestSuiteBuilder.using(new ByteSortedMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  private static final class ByteMapGenerator<V> extends TestMapGeneratorBase<Byte, V> {
    private final Function<Map<Byte, V>, Map<Byte, V>> mapFactory;

    protected ByteMapGenerator(Class<V> clazzV, Function<Map<Byte, V>, Map<Byte, V>> mapFactory,
        SampleElements<V> valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected ByteMapGenerator(Class<V> clazzV, Function<Map<Byte, V>, Map<Byte, V>> mapFactory,
        SampleElements<V> valueSampleElements, Ordering ordering) {
      super(Byte.class, clazzV, TestSampleValues.BYTE_SAMPLE_ELEMENTS, valueSampleElements,
          ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public Map<Byte, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }

  private static final class ByteSortedMapGenerator<V> extends TestSortedMapGeneratorBase<Byte, V> {
    private final Function<Map<Byte, V>, SortedMap<Byte, V>> mapFactory;

    protected ByteSortedMapGenerator(Class<V> clazzV,
        Function<Map<Byte, V>, SortedMap<Byte, V>> mapFactory, V[] valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected ByteSortedMapGenerator(Class<V> clazzV,
        Function<Map<Byte, V>, SortedMap<Byte, V>> mapFactory, V[] valueSampleElements,
        Ordering ordering) {
      super(Byte.class, clazzV, TestSampleValues.BYTES_FOR_SORTED, valueSampleElements, ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public SortedMap<Byte, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }
}
