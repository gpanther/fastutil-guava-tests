package net.greypanther.fastutil.generated;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceLists;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashBigSet;
import it.unimi.dsi.fastutil.objects.ReferenceSets;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;

import it.unimi.dsi.fastutil.objects.Reference2ShortArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ShortLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ShortMap;
import it.unimi.dsi.fastutil.objects.Reference2ShortMaps;
import it.unimi.dsi.fastutil.objects.Reference2ShortOpenHashMap;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;

import it.unimi.dsi.fastutil.objects.Reference2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;

import it.unimi.dsi.fastutil.objects.Reference2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2DoubleLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMap;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Reference2DoubleOpenHashMap;

import it.unimi.dsi.fastutil.objects.Reference2FloatArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2FloatMap;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatOpenHashMap;

import it.unimi.dsi.fastutil.objects.Reference2LongArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2LongLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2LongMap;
import it.unimi.dsi.fastutil.objects.Reference2LongMaps;
import it.unimi.dsi.fastutil.objects.Reference2LongOpenHashMap;

import it.unimi.dsi.fastutil.objects.Reference2CharArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2CharLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2CharMap;
import it.unimi.dsi.fastutil.objects.Reference2CharMaps;
import it.unimi.dsi.fastutil.objects.Reference2CharOpenHashMap;

import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;

import it.unimi.dsi.fastutil.objects.Reference2ByteArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ByteMap;
import it.unimi.dsi.fastutil.objects.Reference2ByteMaps;
import it.unimi.dsi.fastutil.objects.Reference2ByteOpenHashMap;

import junit.framework.TestSuite;

@RunWith(Enclosed.class)
public final class ReferenceCollectionsTest {
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
      TestSuite suite = new TestSuite("ReferenceCollectionsTests.Lists");
      suite.addTest(getReferenceArrayListTests());
      suite.addTest(getSynchronizedReferenceArrayListTests());
      suite.addTest(getUnmodifiableReferenceArrayListTests());
      suite.addTest(getSingletonReferenceListTests());
      suite.addTest(getEmptyReferenceListTests());
      return suite;
    }

    private static junit.framework.Test getReferenceArrayListTests() {
      return getGeneralReferenceListTests("ReferenceArrayList",
          c -> new ReferenceArrayList<String>(c), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedReferenceArrayListTests() {
      return getGeneralReferenceListTests("SynchronizedReferenceArrayList",
          c -> ReferenceLists.synchronize(new ReferenceArrayList<String>(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableReferenceArrayListTests() {
      return getGeneralReferenceListTests("UnmodifiableReferenceArrayList",
          c -> ReferenceLists.unmodifiable(new ReferenceArrayList<String>(c)),
          Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonReferenceListTests() {
      final class Generator extends ReferenceGeneratorBase implements TestListGenerator<String> {
        @Override
        public List<String> create(Object... elements) {
          String value = Iterables.getOnlyElement(arrayToCollection(elements));
          return ReferenceLists.singleton(value);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("ReferenceSingletonList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyReferenceListTests() {
      final class Generator extends ReferenceGeneratorBase implements TestListGenerator<String> {
        @Override
        @SuppressWarnings("unchecked")
        public List<String> create(Object... elements) {
          assertEquals(0, elements.length);
          return ReferenceLists.EMPTY_LIST;
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("ReferenceEmptyList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }
  }


  public static final class Sets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("ReferenceCollectionsTests.Sets");
      if (RUN_ARRAYSET_TESTS) {
        suite.addTest(getReferenceArraySetTests());
        suite.addTest(getSynchronizedReferenceArraySetTests());
        suite.addTest(getUnmodifiableReferenceArraySetTests());
      }
      suite.addTest(getReferenceOpenHashSetTests());
      suite.addTest(getReferenceOpenHashBigSetTests());
      suite.addTest(getSingletonReferenceSetTests());
      suite.addTest(getEmptyReferenceSetTests());
      return suite;
    }

    private static junit.framework.Test getReferenceArraySetTests() {
      return getGeneralReferenceSetTests("ReferenceArraySet", c -> new ReferenceArraySet<String>(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedReferenceArraySetTests() {
      return getGeneralReferenceSetTests("SynchronizedReferenceArraySet",
          c -> ReferenceSets.synchronize(new ReferenceArraySet<String>(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableReferenceArraySetTests() {
      return getGeneralReferenceSetTests("UnmodifiableReferenceArraySet",
          c -> ReferenceSets.unmodifiable(new ReferenceArraySet<String>(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getReferenceOpenHashSetTests() {
      return getGeneralReferenceSetTests("ReferenceOpenHashSet",
          c -> new ReferenceOpenHashSet<String>(c), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getReferenceOpenHashBigSetTests() {
      return getGeneralReferenceSetTests("ReferenceOpenHashBigSet",
          c -> new ReferenceOpenHashBigSet<String>(c), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getGeneralReferenceSetTests(String testSuiteName,
        Function<Collection<String>, Set<String>> generator, Modifiable modifiable) {
      final class Generator extends ReferenceGeneratorBase implements TestSetGenerator<String> {
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

    private static junit.framework.Test getSingletonReferenceSetTests() {
      final class Generator extends ReferenceGeneratorBase implements TestSetGenerator<String> {
        @Override
        public Set<String> create(Object... elements) {
          String value = Iterables.getOnlyElement(arrayToCollection(elements));
          return ReferenceSets.singleton(value);
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("ReferenceSingletonSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyReferenceSetTests() {
      final class Generator extends ReferenceGeneratorBase implements TestSetGenerator<String> {
        @Override
        @SuppressWarnings("unchecked")
        public Set<String> create(Object... elements) {
          assertEquals(0, elements.length);
          return ReferenceSets.EMPTY_SET;
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("ReferenceEmptySet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }
  }

  public static final class SortedSets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("ReferenceCollectionsTests.SortedSets");
      suite.addTest(getLinkedOpenHashSetTests());
      suite.addTest(getSingletonReferenceSortedSetTests());
      suite.addTest(getEmptyReferenceSortedSetTests());
      return suite;
    }

    private static junit.framework.Test getLinkedOpenHashSetTests() {
      return getGeneralReferenceSortedSetTests("ReferenceLinkedOpenHashSet",
          c -> new ReferenceLinkedOpenHashSet<String>(c), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }


    private static junit.framework.Test getGeneralReferenceSortedSetTests(String testSuiteName,
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

      return SortedSetTestSuiteBuilder.using(new ReferenceSortedSetGenerator(ordering, generator))
          .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingletonReferenceSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new ReferenceSortedSetGenerator(Ordering.SORTED, c -> {
        String value = Iterables.getOnlyElement(c);
        return ReferenceSortedSets.singleton(value);
      })).named("ReferenceSingletonSortedSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW, CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    @SuppressWarnings("unchecked")
    private static junit.framework.Test getEmptyReferenceSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new ReferenceSortedSetGenerator(Ordering.SORTED, c -> {
        assertTrue(c.isEmpty());
        return ReferenceSortedSets.EMPTY_SET;
      })).named("ReferenceSingletonSortedSet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW, CollectionFeature.NON_STANDARD_TOSTRING)
          .createTestSuite();
    }

    private static class ReferenceSortedSetGenerator extends ReferenceGeneratorBase
        implements TestSortedSetGenerator<String> {
      private final Function<Collection<String>, SortedSet<String>> generator;

      ReferenceSortedSetGenerator(Ordering ordering,
          Function<Collection<String>, SortedSet<String>> generator) {
        super(TestSampleValues.REFERENCE_SAMPLE_ELEMENTS_FOR_SORTED, ordering);
        this.generator = generator;
      }

      @Override
      public SortedSet<String> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }

      @Override
      public String belowSamplesLesser() {
        return TestSampleValues.REFERENCES_FOR_SORTED[0];
      }

      @Override
      public String belowSamplesGreater() {
        return TestSampleValues.REFERENCES_FOR_SORTED[1];
      }

      @Override
      public String aboveSamplesLesser() {
        return TestSampleValues.REFERENCES_FOR_SORTED[7];
      }

      @Override
      public String aboveSamplesGreater() {
        return TestSampleValues.REFERENCES_FOR_SORTED[8];
      }
    }
  }

  public static final class FastutilReference2ShortMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Reference2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Short.class, Reference2ShortArrayMap::new,
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Short.class, Reference2ShortArrayMap::new,
            m -> Reference2ShortMaps.synchronize((Reference2ShortMap<String>) m),
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Short.class, Reference2ShortArrayMap::new,
            m -> Reference2ShortMaps.unmodifiable((Reference2ShortMap<String>) m),
            TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Short.class, Reference2ShortOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Short.class, Reference2ShortLinkedOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Short.class, Reference2ShortMaps::singleton,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Short.class, Reference2ShortMaps.emptyMap(),
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      return suite;
    }
  }


  public static final class FastutilReference2ReferenceMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Reference2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(String.class, Reference2ReferenceArrayMap::new,
            TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
        suite
            .addTest(getSynchronizedArrayMapTests(String.class, Reference2ReferenceArrayMap::new,
                m -> Reference2ReferenceMaps
                    .synchronize((Reference2ReferenceMap<String, String>) m),
                TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
        suite
            .addTest(getUnmodifiableArrayMapTests(String.class, Reference2ReferenceArrayMap::new,
                m -> Reference2ReferenceMaps
                    .unmodifiable((Reference2ReferenceMap<String, String>) m),
                TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(String.class, Reference2ReferenceOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Reference2ReferenceLinkedOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Reference2ReferenceMaps::singleton,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(String.class, Reference2ReferenceMaps.emptyMap(),
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      return suite;
    }
  }


  public static final class FastutilReference2IntMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Reference2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Integer.class, Reference2IntArrayMap::new,
            TestSampleValues.INT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Integer.class, Reference2IntArrayMap::new,
            m -> Reference2IntMaps.synchronize((Reference2IntMap<String>) m),
            TestSampleValues.INT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Integer.class, Reference2IntArrayMap::new,
            m -> Reference2IntMaps.unmodifiable((Reference2IntMap<String>) m),
            TestSampleValues.INT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Integer.class, Reference2IntOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Integer.class, Reference2IntLinkedOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Integer.class, Reference2IntMaps::singleton,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Integer.class, Reference2IntMaps.emptyMap(),
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      return suite;
    }
  }


  public static final class FastutilReference2DoubleMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Reference2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Double.class, Reference2DoubleArrayMap::new,
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Double.class, Reference2DoubleArrayMap::new,
            m -> Reference2DoubleMaps.synchronize((Reference2DoubleMap<String>) m),
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Double.class, Reference2DoubleArrayMap::new,
            m -> Reference2DoubleMaps.unmodifiable((Reference2DoubleMap<String>) m),
            TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Double.class, Reference2DoubleOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Double.class, Reference2DoubleLinkedOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Double.class, Reference2DoubleMaps::singleton,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Double.class, Reference2DoubleMaps.emptyMap(),
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      return suite;
    }
  }


  public static final class FastutilReference2FloatMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Reference2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Float.class, Reference2FloatArrayMap::new,
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Float.class, Reference2FloatArrayMap::new,
            m -> Reference2FloatMaps.synchronize((Reference2FloatMap<String>) m),
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Float.class, Reference2FloatArrayMap::new,
            m -> Reference2FloatMaps.unmodifiable((Reference2FloatMap<String>) m),
            TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Float.class, Reference2FloatOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Float.class, Reference2FloatLinkedOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Float.class, Reference2FloatMaps::singleton,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Float.class, Reference2FloatMaps.emptyMap(),
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      return suite;
    }
  }


  public static final class FastutilReference2LongMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Reference2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Long.class, Reference2LongArrayMap::new,
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Long.class, Reference2LongArrayMap::new,
            m -> Reference2LongMaps.synchronize((Reference2LongMap<String>) m),
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Long.class, Reference2LongArrayMap::new,
            m -> Reference2LongMaps.unmodifiable((Reference2LongMap<String>) m),
            TestSampleValues.LONG_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Long.class, Reference2LongOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Long.class, Reference2LongLinkedOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Long.class, Reference2LongMaps::singleton,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Long.class, Reference2LongMaps.emptyMap(),
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      return suite;
    }
  }


  public static final class FastutilReference2CharMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Reference2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Character.class, Reference2CharArrayMap::new,
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Character.class, Reference2CharArrayMap::new,
            m -> Reference2CharMaps.synchronize((Reference2CharMap<String>) m),
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Character.class, Reference2CharArrayMap::new,
            m -> Reference2CharMaps.unmodifiable((Reference2CharMap<String>) m),
            TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Character.class, Reference2CharOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Character.class, Reference2CharLinkedOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Character.class, Reference2CharMaps::singleton,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Character.class, Reference2CharMaps.emptyMap(),
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      return suite;
    }
  }


  public static final class FastutilReference2ObjectMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Reference2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(String.class, Reference2ObjectArrayMap::new,
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(String.class, Reference2ObjectArrayMap::new,
            m -> Reference2ObjectMaps.synchronize((Reference2ObjectMap<String, String>) m),
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(String.class, Reference2ObjectArrayMap::new,
            m -> Reference2ObjectMaps.unmodifiable((Reference2ObjectMap<String, String>) m),
            TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(String.class, Reference2ObjectOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Reference2ObjectLinkedOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Reference2ObjectMaps::singleton,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(String.class, Reference2ObjectMaps.emptyMap(),
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      return suite;
    }
  }


  public static final class FastutilReference2ByteMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Reference2ByteMaps.Maps");
      if (RUN_ARRAYMAP_TESTS) {
        suite.addTest(getMapTests(Byte.class, Reference2ByteArrayMap::new,
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
        suite.addTest(getSynchronizedArrayMapTests(Byte.class, Reference2ByteArrayMap::new,
            m -> Reference2ByteMaps.synchronize((Reference2ByteMap<String>) m),
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
        suite.addTest(getUnmodifiableArrayMapTests(Byte.class, Reference2ByteArrayMap::new,
            m -> Reference2ByteMaps.unmodifiable((Reference2ByteMap<String>) m),
            TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      }
      suite.addTest(getMapTests(Byte.class, Reference2ByteOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Byte.class, Reference2ByteLinkedOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Byte.class, Reference2ByteMaps::singleton,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getEmptyMapTests(Byte.class, Reference2ByteMaps.emptyMap(),
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      return suite;
    }
  }


  private static abstract class ReferenceGeneratorBase extends TestContainerGeneratorBase<String> {
    ReferenceGeneratorBase() {
      this(TestSampleValues.REFERENCE_SAMPLE_ELEMENTS, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    ReferenceGeneratorBase(SampleElements<String> sampleElements, Ordering ordering) {
      super(String.class, sampleElements, ordering);
    }
  }

  private static junit.framework.Test getGeneralReferenceListTests(String testSuiteName,
      Function<Collection<String>, List<String>> generator, Modifiable modifiable) {
    final class Generator extends ReferenceGeneratorBase implements TestListGenerator<String> {
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
        .using(new ReferenceMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  private static <V> junit.framework.Test getSingletonMapTests(Class<V> clazzV,
      BiFunction<String, V, Map<String, V>> singletonMapFactory,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonMap";
    return MapTestSuiteBuilder.using(new ReferenceMapGenerator<V>(clazzV, map -> {
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
    return MapTestSuiteBuilder.using(new ReferenceMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements))
        .named(testSuiteName).withFeatures(CollectionSize.ZERO,
            CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS, CollectionFeature.NON_STANDARD_TOSTRING)
        .createTestSuite();
  }


  private static final class ReferenceMapGenerator<V> extends TestMapGeneratorBase<String, V> {
    private final Function<Map<String, V>, Map<String, V>> mapFactory;

    protected ReferenceMapGenerator(Class<V> clazzV,
        Function<Map<String, V>, Map<String, V>> mapFactory,
        SampleElements<V> valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected ReferenceMapGenerator(Class<V> clazzV,
        Function<Map<String, V>, Map<String, V>> mapFactory, SampleElements<V> valueSampleElements,
        Ordering ordering) {
      super(String.class, clazzV, TestSampleValues.REFERENCE_SAMPLE_ELEMENTS, valueSampleElements,
          ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public Map<String, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }

}
