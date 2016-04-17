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

import it.unimi.dsi.fastutil.objects.ObjectAVLTreeSet;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList;
import it.unimi.dsi.fastutil.objects.ObjectBigListIterator;
import it.unimi.dsi.fastutil.objects.ObjectBigLists;
import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectLists;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashBigSet;
import it.unimi.dsi.fastutil.objects.ObjectRBTreeSet;
import it.unimi.dsi.fastutil.objects.ObjectSets;
import it.unimi.dsi.fastutil.objects.ObjectSortedSets;

import it.unimi.dsi.fastutil.objects.Object2ShortArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ShortLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ShortMap;
import it.unimi.dsi.fastutil.objects.Object2ShortMaps;
import it.unimi.dsi.fastutil.objects.Object2ShortOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ShortAVLTreeMap;
import it.unimi.dsi.fastutil.objects.Object2ShortRBTreeMap;
import it.unimi.dsi.fastutil.objects.Object2ShortSortedMap;
import it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps;

import it.unimi.dsi.fastutil.objects.Object2ReferenceArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceRBTreeMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMaps;

import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntAVLTreeMap;
import it.unimi.dsi.fastutil.objects.Object2IntRBTreeMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMaps;

import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Object2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps;

import it.unimi.dsi.fastutil.objects.Object2FloatArrayMap;
import it.unimi.dsi.fastutil.objects.Object2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2FloatAVLTreeMap;
import it.unimi.dsi.fastutil.objects.Object2FloatRBTreeMap;
import it.unimi.dsi.fastutil.objects.Object2FloatSortedMap;
import it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps;

import it.unimi.dsi.fastutil.objects.Object2LongArrayMap;
import it.unimi.dsi.fastutil.objects.Object2LongLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2LongAVLTreeMap;
import it.unimi.dsi.fastutil.objects.Object2LongRBTreeMap;
import it.unimi.dsi.fastutil.objects.Object2LongSortedMap;
import it.unimi.dsi.fastutil.objects.Object2LongSortedMaps;

import it.unimi.dsi.fastutil.objects.Object2CharArrayMap;
import it.unimi.dsi.fastutil.objects.Object2CharLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2CharMap;
import it.unimi.dsi.fastutil.objects.Object2CharMaps;
import it.unimi.dsi.fastutil.objects.Object2CharOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2CharAVLTreeMap;
import it.unimi.dsi.fastutil.objects.Object2CharRBTreeMap;
import it.unimi.dsi.fastutil.objects.Object2CharSortedMap;
import it.unimi.dsi.fastutil.objects.Object2CharSortedMaps;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectRBTreeMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;

import it.unimi.dsi.fastutil.objects.Object2ByteArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ByteMap;
import it.unimi.dsi.fastutil.objects.Object2ByteMaps;
import it.unimi.dsi.fastutil.objects.Object2ByteOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ByteAVLTreeMap;
import it.unimi.dsi.fastutil.objects.Object2ByteRBTreeMap;
import it.unimi.dsi.fastutil.objects.Object2ByteSortedMap;
import it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps;

import junit.framework.TestSuite;

@RunWith(Enclosed.class)
public final class ObjectCollectionsTest {
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
      TestSuite suite = new TestSuite("ObjectCollectionsTests.Lists");
      suite.addTest(getObjectArrayListTests());
      suite.addTest(getSynchronizedObjectArrayListTests());
      suite.addTest(getUnmodifiableObjectArrayListTests());
      suite.addTest(getSingletonObjectListTests());
      suite.addTest(getEmptyObjectListTests());
      return suite;
    }

    private static junit.framework.Test getObjectArrayListTests() {
      return getGeneralObjectListTests("ObjectArrayList", c -> new ObjectArrayList<String>(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedObjectArrayListTests() {
      return getGeneralObjectListTests("SynchronizedObjectArrayList",
          c -> ObjectLists.synchronize(new ObjectArrayList<String>(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableObjectArrayListTests() {
      return getGeneralObjectListTests("UnmodifiableObjectArrayList",
          c -> ObjectLists.unmodifiable(new ObjectArrayList<String>(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonObjectListTests() {
      final class Generator extends ObjectGeneratorBase implements TestListGenerator<String> {
        @Override
        public List<String> create(Object... elements) {
          String value = Iterables.getOnlyElement(arrayToCollection(elements));
          return ObjectLists.singleton(value);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("ObjectSingletonList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyObjectListTests() {
      final class Generator extends ObjectGeneratorBase implements TestListGenerator<String> {
        @Override
        @SuppressWarnings("unchecked")
        public List<String> create(Object... elements) {
          assertEquals(0, elements.length);
          return ObjectLists.EMPTY_LIST;
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("ObjectEmptyList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }
  }

  public static final class BigLists {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("ObjectCollectionsTests.BigLists");
      suite.addTest(getObjectBigArrayBigListTests());
      suite.addTest(getSynchronizedObjectBigArrayBigListTests());
      suite.addTest(getUnmodifiableObjectBigArrayBigListTests());
      suite.addTest(getSingletonObjectBigListTests());
      suite.addTest(getEmptyObjectBigListTests());
      return suite;
    }

    private static junit.framework.Test getObjectBigArrayBigListTests() {
      return getGeneralObjectListTests("ObjectBigArrayBigList",
          c -> new ObjectBigList2ListAdapter(new ObjectBigArrayBigList<String>(c.iterator())),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedObjectBigArrayBigListTests() {
      return getGeneralObjectListTests("SynchronizedObjectBigArrayBigList",
          c -> new ObjectBigList2ListAdapter(
              ObjectBigLists.synchronize(new ObjectBigArrayBigList<String>(c.iterator()))),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableObjectBigArrayBigListTests() {
      return getGeneralObjectListTests("UnmodifiableObjectBigArrayBigList",
          c -> new ObjectBigList2ListAdapter(
              ObjectBigLists.unmodifiable(new ObjectBigArrayBigList<String>(c.iterator()))),
          Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonObjectBigListTests() {
      final class Generator extends ObjectGeneratorBase implements TestListGenerator<String> {
        @Override
        public List<String> create(Object... elements) {
          String value = Iterables.getOnlyElement(arrayToCollection(elements));
          return new ObjectBigList2ListAdapter(ObjectBigLists.singleton(value));
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("SingletonObjectBigList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyObjectBigListTests() {
      final class Generator extends ObjectGeneratorBase implements TestListGenerator<String> {
        @Override
        @SuppressWarnings("unchecked")
        public List<String> create(Object... elements) {
          assertEquals(0, elements.length);
          return new ObjectBigList2ListAdapter(ObjectBigLists.EMPTY_BIG_LIST);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("EmptyObjectBigList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    @SuppressWarnings("serial")
    private static final class ObjectBigList2ListAdapter extends BigList2ListAdapter<String> {
      private ObjectBigList2ListAdapter(BigList<String> bigList) {
        super(bigList);
      }

      @Override
      public List<String> subList(int fromIndex, int toIndex) {
        return new ObjectBigList2ListAdapter(bigList.subList(fromIndex, toIndex));
      }

      @Override
      void bigListIteratorSet(BigListIterator<String> bigListIterator, String e) {
        ((ObjectBigListIterator<String>) bigListIterator).set(e);
      }

      @Override
      void bigListIteratorAdd(BigListIterator<String> bigListIterator, String e) {
        ((ObjectBigListIterator<String>) bigListIterator).add(e);
      }
    }
  }

  public static final class Sets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("ObjectCollectionsTests.Sets");
      if (RUN_ARRAYSET_TESTS) {
        suite.addTest(getObjectArraySetTests());
        suite.addTest(getSynchronizedObjectArraySetTests());
        suite.addTest(getUnmodifiableObjectArraySetTests());
      }
      suite.addTest(getObjectOpenHashSetTests());
      suite.addTest(getObjectOpenHashBigSetTests());
      suite.addTest(getSingletonObjectSetTests());
      suite.addTest(getEmptyObjectSetTests());
      return suite;
    }

    private static junit.framework.Test getObjectArraySetTests() {
      return getGeneralObjectSetTests("ObjectArraySet", c -> new ObjectArraySet<String>(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedObjectArraySetTests() {
      return getGeneralObjectSetTests("SynchronizedObjectArraySet",
          c -> ObjectSets.synchronize(new ObjectArraySet<String>(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableObjectArraySetTests() {
      return getGeneralObjectSetTests("UnmodifiableObjectArraySet",
          c -> ObjectSets.unmodifiable(new ObjectArraySet<String>(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getObjectOpenHashSetTests() {
      return getGeneralObjectSetTests("ObjectOpenHashSet", c -> new ObjectOpenHashSet<String>(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getObjectOpenHashBigSetTests() {
      return getGeneralObjectSetTests("ObjectOpenHashBigSet",
          c -> new ObjectOpenHashBigSet<String>(c), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getGeneralObjectSetTests(String testSuiteName,
        Function<Collection<String>, Set<String>> generator, Modifiable modifiable) {
      final class Generator extends ObjectGeneratorBase implements TestSetGenerator<String> {
        @Override
        public Set<String> create(Object... elements) {
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

    private static junit.framework.Test getSingletonObjectSetTests() {
      final class Generator extends ObjectGeneratorBase implements TestSetGenerator<String> {
        @Override
        public Set<String> create(Object... elements) {
          String value = Iterables.getOnlyElement(arrayToCollection(elements));
          return ObjectSets.singleton(value);
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("ObjectSingletonSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyObjectSetTests() {
      final class Generator extends ObjectGeneratorBase implements TestSetGenerator<String> {
        @Override
        @SuppressWarnings("unchecked")
        public Set<String> create(Object... elements) {
          assertEquals(0, elements.length);
          return ObjectSets.EMPTY_SET;
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("ObjectEmptySet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }
  }

  public static final class SortedSets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("ObjectCollectionsTests.SortedSets");
      suite.addTest(getLinkedOpenHashSetTests());
      suite.addTest(getLinkedOpenCustomHashSetTests());
      suite.addTest(getAVLTreeSetTests());
      suite.addTest(getRBTreeSetTests());
      suite.addTest(getSynchronizedRBTreeSetTests());
      suite.addTest(getUnmodifiableRBTreeSetTests());
      suite.addTest(getSingletonObjectSortedSetTests());
      suite.addTest(getEmptyObjectSortedSetTests());
      return suite;
    }

    private static junit.framework.Test getLinkedOpenHashSetTests() {
      return getGeneralObjectSortedSetTests("ObjectLinkedOpenHashSet",
          c -> new ObjectLinkedOpenHashSet<String>(c), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getLinkedOpenCustomHashSetTests() {
      final class HashStrategy implements Hash.Strategy<String> {
        @Override
        public int hashCode(String o) {
          return o.hashCode();
        }

        @Override
        public boolean equals(String a, String b) {
          return java.util.Objects.equals(a, b);
        }
      }

      return getGeneralObjectSortedSetTests("ObjectLinkedOpenCustomHashSet",
          c -> new ObjectLinkedOpenCustomHashSet<String>(c, new HashStrategy()), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getAVLTreeSetTests() {
      return getGeneralObjectSortedSetTests("ObjectAVLTreeSet",
          c -> new ObjectAVLTreeSet<String>(c), Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getRBTreeSetTests() {
      return getGeneralObjectSortedSetTests("ObjectRBTreeSet", c -> new ObjectRBTreeSet<String>(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getSynchronizedRBTreeSetTests() {
      return getGeneralObjectSortedSetTests("ObjectRBTreeSet",
          c -> ObjectSortedSets.synchronize(new ObjectRBTreeSet<String>(c)), Modifiable.MUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getUnmodifiableRBTreeSetTests() {
      return getGeneralObjectSortedSetTests("ObjectRBTreeSet",
          c -> ObjectSortedSets.unmodifiable(new ObjectRBTreeSet<String>(c)), Modifiable.IMMUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getGeneralObjectSortedSetTests(String testSuiteName,
        Function<Collection<String>, SortedSet<String>> generator, Modifiable modifiable,
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

      return SortedSetTestSuiteBuilder.using(new ObjectSortedSetGenerator(ordering, generator))
          .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingletonObjectSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new ObjectSortedSetGenerator(Ordering.SORTED, c -> {
        String value = Iterables.getOnlyElement(c);
        return ObjectSortedSets.singleton(value);
      })).named("ObjectSingletonSortedSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW, CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    @SuppressWarnings("unchecked")
    private static junit.framework.Test getEmptyObjectSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new ObjectSortedSetGenerator(Ordering.SORTED, c -> {
        assertTrue(c.isEmpty());
        return ObjectSortedSets.EMPTY_SET;
      })).named("ObjectSingletonSortedSet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW, CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    private static class ObjectSortedSetGenerator extends ObjectGeneratorBase
        implements TestSortedSetGenerator<String> {
      private final Function<Collection<String>, SortedSet<String>> generator;

      ObjectSortedSetGenerator(Ordering ordering,
          Function<Collection<String>, SortedSet<String>> generator) {
        super(TestSampleValues.OBJECT_SAMPLE_ELEMENTS_FOR_SORTED, ordering);
        this.generator = generator;
      }

      @Override
      public SortedSet<String> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }

      @Override
      public String belowSamplesLesser() {
        return TestSampleValues.OBJECTS_FOR_SORTED[0];
      }

      @Override
      public String belowSamplesGreater() {
        return TestSampleValues.OBJECTS_FOR_SORTED[1];
      }

      @Override
      public String aboveSamplesLesser() {
        return TestSampleValues.OBJECTS_FOR_SORTED[7];
      }

      @Override
      public String aboveSamplesGreater() {
        return TestSampleValues.OBJECTS_FOR_SORTED[8];
      }
    }
  }

  public static final class FastutilObject2ShortMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Short.class, Object2ShortArrayMap::new,
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Short.class, Object2ShortArrayMap::new,
            m -> Object2ShortMaps.synchronize((Object2ShortMap<String>) m),
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Short.class, Object2ShortArrayMap::new,
            m -> Object2ShortMaps.unmodifiable((Object2ShortMap<String>) m),
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Short.class, Object2ShortOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Short.class, Object2ShortLinkedOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Short.class, Object2ShortMaps::singleton,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Short.class, Object2ShortMaps.emptyMap(),
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilObject2ShortSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Short.class, Object2ShortAVLTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Short.class, Object2ShortRBTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Short.class, Object2ShortRBTreeMap::new,
          m -> Object2ShortSortedMaps.synchronize((Object2ShortSortedMap<String>) m),
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Short.class, Object2ShortRBTreeMap::new,
          m -> Object2ShortSortedMaps.unmodifiable((Object2ShortSortedMap<String>) m),
          TestSampleValues.SHORTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Short.class, Object2ShortSortedMaps::singleton,
      // TestSampleValues.SHORTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Short.class, Object2ShortSortedMaps.EMPTY_MAP,
      // TestSampleValues.SHORTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilObject2ReferenceMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(String.class, Object2ReferenceArrayMap::new,
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(String.class, Object2ReferenceArrayMap::new,
            m -> Object2ReferenceMaps.synchronize((Object2ReferenceMap<String, String>) m),
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(String.class, Object2ReferenceArrayMap::new,
            m -> Object2ReferenceMaps.unmodifiable((Object2ReferenceMap<String, String>) m),
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(String.class, Object2ReferenceOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Object2ReferenceLinkedOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Object2ReferenceMaps::singleton,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(String.class, Object2ReferenceMaps.emptyMap(),
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilObject2ReferenceSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Object2ReferenceAVLTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Object2ReferenceRBTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Object2ReferenceRBTreeMap::new,
          m -> Object2ReferenceSortedMaps
              .synchronize((Object2ReferenceSortedMap<String, String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Object2ReferenceRBTreeMap::new,
          m -> Object2ReferenceSortedMaps
              .unmodifiable((Object2ReferenceSortedMap<String, String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class,
      // Object2ReferenceSortedMaps::singleton,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Object2ReferenceSortedMaps.EMPTY_MAP,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilObject2IntMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Integer.class, Object2IntArrayMap::new,
            TestSampleValues.INT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Integer.class, Object2IntArrayMap::new,
            m -> Object2IntMaps.synchronize((Object2IntMap<String>) m),
            TestSampleValues.INT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Integer.class, Object2IntArrayMap::new,
            m -> Object2IntMaps.unmodifiable((Object2IntMap<String>) m),
            TestSampleValues.INT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Integer.class, Object2IntOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Integer.class, Object2IntLinkedOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Integer.class, Object2IntMaps::singleton,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Integer.class, Object2IntMaps.emptyMap(),
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilObject2IntSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Integer.class, Object2IntAVLTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Integer.class, Object2IntRBTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Integer.class, Object2IntRBTreeMap::new,
          m -> Object2IntSortedMaps.synchronize((Object2IntSortedMap<String>) m),
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Integer.class, Object2IntRBTreeMap::new,
          m -> Object2IntSortedMaps.unmodifiable((Object2IntSortedMap<String>) m),
          TestSampleValues.INTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Integer.class, Object2IntSortedMaps::singleton,
      // TestSampleValues.INTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Integer.class, Object2IntSortedMaps.EMPTY_MAP,
      // TestSampleValues.INTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilObject2DoubleMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Double.class, Object2DoubleArrayMap::new,
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Double.class, Object2DoubleArrayMap::new,
            m -> Object2DoubleMaps.synchronize((Object2DoubleMap<String>) m),
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Double.class, Object2DoubleArrayMap::new,
            m -> Object2DoubleMaps.unmodifiable((Object2DoubleMap<String>) m),
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Double.class, Object2DoubleOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Double.class, Object2DoubleLinkedOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Double.class, Object2DoubleMaps::singleton,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Double.class, Object2DoubleMaps.emptyMap(),
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilObject2DoubleSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Double.class, Object2DoubleAVLTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Double.class, Object2DoubleRBTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Double.class, Object2DoubleRBTreeMap::new,
          m -> Object2DoubleSortedMaps.synchronize((Object2DoubleSortedMap<String>) m),
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Double.class, Object2DoubleRBTreeMap::new,
          m -> Object2DoubleSortedMaps.unmodifiable((Object2DoubleSortedMap<String>) m),
          TestSampleValues.DOUBLES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Double.class, Object2DoubleSortedMaps::singleton,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Double.class, Object2DoubleSortedMaps.EMPTY_MAP,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilObject2FloatMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Float.class, Object2FloatArrayMap::new,
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Float.class, Object2FloatArrayMap::new,
            m -> Object2FloatMaps.synchronize((Object2FloatMap<String>) m),
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Float.class, Object2FloatArrayMap::new,
            m -> Object2FloatMaps.unmodifiable((Object2FloatMap<String>) m),
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Float.class, Object2FloatOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Float.class, Object2FloatLinkedOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Float.class, Object2FloatMaps::singleton,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Float.class, Object2FloatMaps.emptyMap(),
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilObject2FloatSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Float.class, Object2FloatAVLTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Float.class, Object2FloatRBTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Float.class, Object2FloatRBTreeMap::new,
          m -> Object2FloatSortedMaps.synchronize((Object2FloatSortedMap<String>) m),
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Float.class, Object2FloatRBTreeMap::new,
          m -> Object2FloatSortedMaps.unmodifiable((Object2FloatSortedMap<String>) m),
          TestSampleValues.FLOATS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Float.class, Object2FloatSortedMaps::singleton,
      // TestSampleValues.FLOATS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Float.class, Object2FloatSortedMaps.EMPTY_MAP,
      // TestSampleValues.FLOATS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilObject2LongMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Long.class, Object2LongArrayMap::new,
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Long.class, Object2LongArrayMap::new,
            m -> Object2LongMaps.synchronize((Object2LongMap<String>) m),
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Long.class, Object2LongArrayMap::new,
            m -> Object2LongMaps.unmodifiable((Object2LongMap<String>) m),
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Long.class, Object2LongOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Long.class, Object2LongLinkedOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Long.class, Object2LongMaps::singleton,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Long.class, Object2LongMaps.emptyMap(),
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilObject2LongSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Long.class, Object2LongAVLTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Long.class, Object2LongRBTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Long.class, Object2LongRBTreeMap::new,
          m -> Object2LongSortedMaps.synchronize((Object2LongSortedMap<String>) m),
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Long.class, Object2LongRBTreeMap::new,
          m -> Object2LongSortedMaps.unmodifiable((Object2LongSortedMap<String>) m),
          TestSampleValues.LONGS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Long.class, Object2LongSortedMaps::singleton,
      // TestSampleValues.LONGS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Long.class, Object2LongSortedMaps.EMPTY_MAP,
      // TestSampleValues.LONGS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilObject2CharMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Character.class, Object2CharArrayMap::new,
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Character.class, Object2CharArrayMap::new,
            m -> Object2CharMaps.synchronize((Object2CharMap<String>) m),
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Character.class, Object2CharArrayMap::new,
            m -> Object2CharMaps.unmodifiable((Object2CharMap<String>) m),
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Character.class, Object2CharOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Character.class, Object2CharLinkedOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Character.class, Object2CharMaps::singleton,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Character.class, Object2CharMaps.emptyMap(),
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilObject2CharSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Character.class, Object2CharAVLTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Character.class, Object2CharRBTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Character.class, Object2CharRBTreeMap::new,
          m -> Object2CharSortedMaps.synchronize((Object2CharSortedMap<String>) m),
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Character.class, Object2CharRBTreeMap::new,
          m -> Object2CharSortedMaps.unmodifiable((Object2CharSortedMap<String>) m),
          TestSampleValues.CHARS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Character.class, Object2CharSortedMaps::singleton,
      // TestSampleValues.CHARS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Character.class, Object2CharSortedMaps.EMPTY_MAP,
      // TestSampleValues.CHARS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilObject2ObjectMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(String.class, Object2ObjectArrayMap::new,
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(String.class, Object2ObjectArrayMap::new,
            m -> Object2ObjectMaps.synchronize((Object2ObjectMap<String, String>) m),
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(String.class, Object2ObjectArrayMap::new,
            m -> Object2ObjectMaps.unmodifiable((Object2ObjectMap<String, String>) m),
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(String.class, Object2ObjectOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Object2ObjectLinkedOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Object2ObjectMaps::singleton,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(String.class, Object2ObjectMaps.emptyMap(),
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilObject2ObjectSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Object2ObjectAVLTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Object2ObjectRBTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Object2ObjectRBTreeMap::new,
          m -> Object2ObjectSortedMaps.synchronize((Object2ObjectSortedMap<String, String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Object2ObjectRBTreeMap::new,
          m -> Object2ObjectSortedMaps.unmodifiable((Object2ObjectSortedMap<String, String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Object2ObjectSortedMaps::singleton,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Object2ObjectSortedMaps.EMPTY_MAP,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilObject2ByteMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Byte.class, Object2ByteArrayMap::new,
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Byte.class, Object2ByteArrayMap::new,
            m -> Object2ByteMaps.synchronize((Object2ByteMap<String>) m),
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Byte.class, Object2ByteArrayMap::new,
            m -> Object2ByteMaps.unmodifiable((Object2ByteMap<String>) m),
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Byte.class, Object2ByteOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Byte.class, Object2ByteLinkedOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Byte.class, Object2ByteMaps::singleton,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Byte.class, Object2ByteMaps.emptyMap(),
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      return suite;
    }
  }

  public static final class FastutilObject2ByteSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Object2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Byte.class, Object2ByteAVLTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Byte.class, Object2ByteRBTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Byte.class, Object2ByteRBTreeMap::new,
          m -> Object2ByteSortedMaps.synchronize((Object2ByteSortedMap<String>) m),
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Byte.class, Object2ByteRBTreeMap::new,
          m -> Object2ByteSortedMaps.unmodifiable((Object2ByteSortedMap<String>) m),
          TestSampleValues.BYTES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Byte.class, Object2ByteSortedMaps::singleton,
      // TestSampleValues.BYTES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Byte.class, Object2ByteSortedMaps.EMPTY_MAP,
      // TestSampleValues.BYTES_FOR_SORTED));
      return suite;
    }
  }

  private static abstract class ObjectGeneratorBase extends TestContainerGeneratorBase<String> {
    ObjectGeneratorBase() {
      this(TestSampleValues.OBJECT_SAMPLE_ELEMENTS, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    ObjectGeneratorBase(SampleElements<String> sampleElements, Ordering ordering) {
      super(String.class, sampleElements, ordering);
    }
  }

  private static junit.framework.Test getGeneralObjectListTests(String testSuiteName,
      Function<Collection<String>, List<String>> generator, Modifiable modifiable) {
    final class Generator extends ObjectGeneratorBase implements TestListGenerator<String> {
      @Override
      public List<String> create(Object... elements) {
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
      Supplier<Map<String, V>> mapFactory, SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<String, V> map = mapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedArrayMapTests(Class<V> clazzV,
      Supplier<Map<String, V>> mapFactory,
      Function<Map<String, V>, Map<String, V>> syncrhonizeWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<String, V> map = mapFactory.get();
      map.putAll(m);
      map = syncrhonizeWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableArrayMapTests(Class<V> clazzV,
      Supplier<Map<String, V>> mapFactory,
      Function<Map<String, V>, Map<String, V>> unmodifiableWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<String, V> map = mapFactory.get();
      map.putAll(m);
      map = unmodifiableWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralMapTests(Class<V> clazzV,
      Function<Map<String, V>, Map<String, V>> mapFactory, String testSuiteName,
      SampleElements<V> valueSampleElements, Modifiable modifiable) {
    List<Feature<?>> testSuiteFeatures = new ArrayList<>(5);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS);
    testSuiteFeatures.add(CollectionFeature.NON_STANDARD_TOSTRING);
    testSuiteFeatures.add(CollectionFeature.REMOVE_OPERATIONS);
    testSuiteFeatures.add(MapFeature.ALLOWS_NULL_KEYS);
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
        .using(new ObjectMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  private static <V> junit.framework.Test getSingletonMapTests(Class<V> clazzV,
      BiFunction<String, V, Map<String, V>> singletonMapFactory,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonMap";
    return MapTestSuiteBuilder.using(new ObjectMapGenerator<V>(clazzV, map -> {
      Map.Entry<String, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements))
        .named(testSuiteName).withFeatures(CollectionSize.ONE,
            CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS, CollectionFeature.NON_STANDARD_TOSTRING)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getEmptyMapTests(Class<V> clazzV, Map<String, V> emptyMap,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptyMap";
    return MapTestSuiteBuilder.using(new ObjectMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements))
        .named(testSuiteName).withFeatures(CollectionSize.ZERO,
            CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS, CollectionFeature.NON_STANDARD_TOSTRING)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getSortedMapTests(Class<V> clazzV,
      Supplier<SortedMap<String, V>> sortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<String, V> map = sortedMapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<String, V>> sortedMapFactory,
      Function<SortedMap<String, V>, SortedMap<String, V>> synchronziedWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Synchronized" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<String, V> map = sortedMapFactory.get();
      map.putAll(m);
      return synchronziedWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<String, V>> sortedMapFactory,
      Function<SortedMap<String, V>, SortedMap<String, V>> unmodifiableWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Unmodifiable" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<String, V> map = sortedMapFactory.get();
      map.putAll(m);
      return unmodifiableWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralSortedMapTests(Class<V> clazzV,
      Function<Map<String, V>, SortedMap<String, V>> mapFactory, String testSuiteName,
      V[] valueSampleElements, Modifiable modifiable) {
    List<Feature<?>> testSuiteFeatures = new ArrayList<>(8);
    testSuiteFeatures.add(CollectionSize.ANY);
    testSuiteFeatures.add(CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS);
    testSuiteFeatures.add(CollectionFeature.NON_STANDARD_TOSTRING);
    testSuiteFeatures.add(CollectionFeature.KNOWN_ORDER);
    testSuiteFeatures.add(CollectionFeature.SUBSET_VIEW);
    testSuiteFeatures.add(CollectionFeature.DESCENDING_VIEW);
    testSuiteFeatures.add(MapFeature.ALLOWS_NULL_KEYS);
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
        .using(new ObjectSortedMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getSingletonSortedMapTests(Class<V> clazzV,
      BiFunction<String, V, SortedMap<String, V>> singletonSortedMapFactory,
      V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonSortedMap";
    return SortedMapTestSuiteBuilder.using(new ObjectSortedMapGenerator<V>(clazzV, map -> {
      Map.Entry<String, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonSortedMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getEmptySortedMapTests(Class<V> clazzV,
      SortedMap<String, V> emptyMap, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptySortedMap";
    return SortedMapTestSuiteBuilder.using(new ObjectSortedMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  private static final class ObjectMapGenerator<V> extends TestMapGeneratorBase<String, V> {
    private final Function<Map<String, V>, Map<String, V>> mapFactory;

    protected ObjectMapGenerator(Class<V> clazzV,
        Function<Map<String, V>, Map<String, V>> mapFactory,
        SampleElements<V> valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected ObjectMapGenerator(Class<V> clazzV,
        Function<Map<String, V>, Map<String, V>> mapFactory, SampleElements<V> valueSampleElements,
        Ordering ordering) {
      super(String.class, clazzV, TestSampleValues.OBJECT_SAMPLE_ELEMENTS, valueSampleElements,
          ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public Map<String, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }

  private static final class ObjectSortedMapGenerator<V>
      extends TestSortedMapGeneratorBase<String, V> {
    private final Function<Map<String, V>, SortedMap<String, V>> mapFactory;

    protected ObjectSortedMapGenerator(Class<V> clazzV,
        Function<Map<String, V>, SortedMap<String, V>> mapFactory, V[] valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected ObjectSortedMapGenerator(Class<V> clazzV,
        Function<Map<String, V>, SortedMap<String, V>> mapFactory, V[] valueSampleElements,
        Ordering ordering) {
      super(String.class, clazzV, TestSampleValues.OBJECTS_FOR_SORTED, valueSampleElements,
          ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public SortedMap<String, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }
}
