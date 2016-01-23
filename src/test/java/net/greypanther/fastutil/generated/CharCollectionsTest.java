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

import it.unimi.dsi.fastutil.chars.CharAVLTreeSet;
import it.unimi.dsi.fastutil.chars.CharArrayList;
import it.unimi.dsi.fastutil.chars.CharArraySet;
import it.unimi.dsi.fastutil.chars.CharBigArrayBigList;
import it.unimi.dsi.fastutil.chars.CharBigListIterator;
import it.unimi.dsi.fastutil.chars.CharBigLists;
import it.unimi.dsi.fastutil.chars.CharHash;
import com.google.common.hash.Hashing;
import it.unimi.dsi.fastutil.chars.CharLinkedOpenCustomHashSet;
import it.unimi.dsi.fastutil.chars.CharLinkedOpenHashSet;
import it.unimi.dsi.fastutil.chars.CharLists;
import it.unimi.dsi.fastutil.chars.CharOpenHashSet;
import it.unimi.dsi.fastutil.chars.CharRBTreeSet;
import it.unimi.dsi.fastutil.chars.CharSets;
import it.unimi.dsi.fastutil.chars.CharSortedSets;

import it.unimi.dsi.fastutil.chars.Char2ShortArrayMap;
import it.unimi.dsi.fastutil.chars.Char2ShortLinkedOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2ShortMap;
import it.unimi.dsi.fastutil.chars.Char2ShortMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2ShortAVLTreeMap;
import it.unimi.dsi.fastutil.chars.Char2ShortRBTreeMap;
import it.unimi.dsi.fastutil.chars.Char2ShortSortedMap;
import it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps;

import it.unimi.dsi.fastutil.chars.Char2ReferenceArrayMap;
import it.unimi.dsi.fastutil.chars.Char2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2ReferenceMap;
import it.unimi.dsi.fastutil.chars.Char2ReferenceMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.chars.Char2ReferenceRBTreeMap;
import it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap;
import it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps;

import it.unimi.dsi.fastutil.chars.Char2IntArrayMap;
import it.unimi.dsi.fastutil.chars.Char2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2IntMap;
import it.unimi.dsi.fastutil.chars.Char2IntMaps;
import it.unimi.dsi.fastutil.chars.Char2IntOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2IntAVLTreeMap;
import it.unimi.dsi.fastutil.chars.Char2IntRBTreeMap;
import it.unimi.dsi.fastutil.chars.Char2IntSortedMap;
import it.unimi.dsi.fastutil.chars.Char2IntSortedMaps;

import it.unimi.dsi.fastutil.chars.Char2DoubleArrayMap;
import it.unimi.dsi.fastutil.chars.Char2DoubleLinkedOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2DoubleMap;
import it.unimi.dsi.fastutil.chars.Char2DoubleMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2DoubleAVLTreeMap;
import it.unimi.dsi.fastutil.chars.Char2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap;
import it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps;

import it.unimi.dsi.fastutil.chars.Char2FloatArrayMap;
import it.unimi.dsi.fastutil.chars.Char2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2FloatMap;
import it.unimi.dsi.fastutil.chars.Char2FloatMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2FloatAVLTreeMap;
import it.unimi.dsi.fastutil.chars.Char2FloatRBTreeMap;
import it.unimi.dsi.fastutil.chars.Char2FloatSortedMap;
import it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps;

import it.unimi.dsi.fastutil.chars.Char2LongArrayMap;
import it.unimi.dsi.fastutil.chars.Char2LongLinkedOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2LongMap;
import it.unimi.dsi.fastutil.chars.Char2LongMaps;
import it.unimi.dsi.fastutil.chars.Char2LongOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2LongAVLTreeMap;
import it.unimi.dsi.fastutil.chars.Char2LongRBTreeMap;
import it.unimi.dsi.fastutil.chars.Char2LongSortedMap;
import it.unimi.dsi.fastutil.chars.Char2LongSortedMaps;

import it.unimi.dsi.fastutil.chars.Char2CharArrayMap;
import it.unimi.dsi.fastutil.chars.Char2CharLinkedOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2CharMap;
import it.unimi.dsi.fastutil.chars.Char2CharMaps;
import it.unimi.dsi.fastutil.chars.Char2CharOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2CharAVLTreeMap;
import it.unimi.dsi.fastutil.chars.Char2CharRBTreeMap;
import it.unimi.dsi.fastutil.chars.Char2CharSortedMap;
import it.unimi.dsi.fastutil.chars.Char2CharSortedMaps;

import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectRBTreeMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps;

import it.unimi.dsi.fastutil.chars.Char2ByteArrayMap;
import it.unimi.dsi.fastutil.chars.Char2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2ByteMap;
import it.unimi.dsi.fastutil.chars.Char2ByteMaps;
import it.unimi.dsi.fastutil.chars.Char2ByteOpenHashMap;
import it.unimi.dsi.fastutil.chars.Char2ByteAVLTreeMap;
import it.unimi.dsi.fastutil.chars.Char2ByteRBTreeMap;
import it.unimi.dsi.fastutil.chars.Char2ByteSortedMap;
import it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps;


import junit.framework.TestSuite;

@RunWith(Enclosed.class)
public final class CharCollectionsTest {
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
      TestSuite suite = new TestSuite("CharCollectionsTests.Lists");
      suite.addTest(getCharArrayListTests());
      suite.addTest(getSynchronizedCharArrayListTests());
      suite.addTest(getUnmodifiableCharArrayListTests());
      suite.addTest(getSingletonCharListTests());
      suite.addTest(getEmptyCharListTests());
      return suite;
    }

    private static junit.framework.Test getCharArrayListTests() {
      return getGeneralCharListTests("CharArrayList", c -> new CharArrayList(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedCharArrayListTests() {
      return getGeneralCharListTests("SynchronizedCharArrayList",
          c -> CharLists.synchronize(new CharArrayList(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableCharArrayListTests() {
      return getGeneralCharListTests("UnmodifiableCharArrayList",
          c -> CharLists.unmodifiable(new CharArrayList(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonCharListTests() {
      final class Generator extends CharGeneratorBase implements TestListGenerator<Character> {
        @Override
        public List<Character> create(Object... elements) {
          Character value = Iterables.getOnlyElement(arrayToCollection(elements));
          return CharLists.singleton(value);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("CharSingletonList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyCharListTests() {
      final class Generator extends CharGeneratorBase implements TestListGenerator<Character> {
        @Override
        public List<Character> create(Object... elements) {
          assertEquals(0, elements.length);
          return CharLists.EMPTY_LIST;
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("CharEmptyList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }
  }

  public static final class BigLists {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("CharCollectionsTests.BigLists");
      suite.addTest(getCharBigArrayBigListTests());
      suite.addTest(getSynchronizedCharBigArrayBigListTests());
      suite.addTest(getUnmodifiableCharBigArrayBigListTests());
      suite.addTest(getSingletonCharBigListTests());
      suite.addTest(getEmptyCharBigListTests());
      return suite;
    }

    private static junit.framework.Test getCharBigArrayBigListTests() {
      return getGeneralCharListTests("CharBigArrayBigList",
          c -> new CharBigList2ListAdapter(new CharBigArrayBigList(c.iterator())),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedCharBigArrayBigListTests() {
      return getGeneralCharListTests("SynchronizedCharBigArrayBigList",
          c -> new CharBigList2ListAdapter(
              CharBigLists.synchronize(new CharBigArrayBigList(c.iterator()))),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableCharBigArrayBigListTests() {
      return getGeneralCharListTests("UnmodifiableCharBigArrayBigList",
          c -> new CharBigList2ListAdapter(
              CharBigLists.unmodifiable(new CharBigArrayBigList(c.iterator()))),
          Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getSingletonCharBigListTests() {
      final class Generator extends CharGeneratorBase implements TestListGenerator<Character> {
        @Override
        public List<Character> create(Object... elements) {
          Character value = Iterables.getOnlyElement(arrayToCollection(elements));
          return new CharBigList2ListAdapter(CharBigLists.singleton(value));
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("SingletonCharBigList")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyCharBigListTests() {
      final class Generator extends CharGeneratorBase implements TestListGenerator<Character> {
        @Override
        public List<Character> create(Object... elements) {
          assertEquals(0, elements.length);
          return new CharBigList2ListAdapter(CharBigLists.EMPTY_BIG_LIST);
        }
      }

      return ListTestSuiteBuilder.using(new Generator()).named("EmptyCharBigList")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    @SuppressWarnings("serial")
    private static final class CharBigList2ListAdapter extends BigList2ListAdapter<Character> {
      private CharBigList2ListAdapter(BigList<Character> bigList) {
        super(bigList);
      }

      @Override
      public List<Character> subList(int fromIndex, int toIndex) {
        return new CharBigList2ListAdapter(bigList.subList(fromIndex, toIndex));
      }

      @Override
      void bigListIteratorSet(BigListIterator<Character> bigListIterator, Character e) {
        ((CharBigListIterator) bigListIterator).set(e);
      }

      @Override
      void bigListIteratorAdd(BigListIterator<Character> bigListIterator, Character e) {
        ((CharBigListIterator) bigListIterator).add(e);
      }
    }
  }

  public static final class Sets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("CharCollectionsTests.Sets");
      suite.addTest(getCharArraySetTests());
      suite.addTest(getSynchronizedCharArraySetTests());
      suite.addTest(getUnmodifiableCharArraySetTests());
      suite.addTest(getCharOpenHashSetTests());
      suite.addTest(getSingletonCharSetTests());
      suite.addTest(getEmptyCharSetTests());
      return suite;
    }

    private static junit.framework.Test getCharArraySetTests() {
      return getGeneralCharSetTests("CharArraySet", c -> new CharArraySet(c), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getSynchronizedCharArraySetTests() {
      return getGeneralCharSetTests("SynchronizedCharArraySet",
          c -> CharSets.synchronize(new CharArraySet(c)), Modifiable.MUTABLE);
    }

    private static junit.framework.Test getUnmodifiableCharArraySetTests() {
      return getGeneralCharSetTests("UnmodifiableCharArraySet",
          c -> CharSets.unmodifiable(new CharArraySet(c)), Modifiable.IMMUTABLE);
    }

    private static junit.framework.Test getCharOpenHashSetTests() {
      return getGeneralCharSetTests("CharOpenHashSet", c -> new CharOpenHashSet(c),
          Modifiable.MUTABLE);
    }

    private static junit.framework.Test getGeneralCharSetTests(String testSuiteName,
        Function<Collection<Character>, Set<Character>> generator, Modifiable modifiable) {
      final class Generator extends CharGeneratorBase implements TestSetGenerator<Character> {
        @Override
        public Set<Character> create(Object... elements) {
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

    private static junit.framework.Test getSingletonCharSetTests() {
      final class Generator extends CharGeneratorBase implements TestSetGenerator<Character> {
        @Override
        public Set<Character> create(Object... elements) {
          Character value = Iterables.getOnlyElement(arrayToCollection(elements));
          return CharSets.singleton(value);
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("CharSingletonSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyCharSetTests() {
      final class Generator extends CharGeneratorBase implements TestSetGenerator<Character> {
        @Override
        public Set<Character> create(Object... elements) {
          assertEquals(0, elements.length);
          return CharSets.EMPTY_SET;
        }
      }

      return SetTestSuiteBuilder.using(new Generator()).named("CharEmptySet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
          .createTestSuite();
    }
  }

  public static final class SortedSets {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("CharCollectionsTests.SortedSets");
      suite.addTest(getLinkedOpenHashSetTests());
      suite.addTest(getLinkedOpenCustomHashSetTests());
      suite.addTest(getAVLTreeSetTests());
      suite.addTest(getRBTreeSetTests());
      suite.addTest(getSynchronizedRBTreeSetTests());
      suite.addTest(getUnmodifiableRBTreeSetTests());
      suite.addTest(getSingletonCharSortedSetTests());
      suite.addTest(getEmptyCharSortedSetTests());
      return suite;
    }

    private static junit.framework.Test getLinkedOpenHashSetTests() {
      return getGeneralCharSortedSetTests("CharLinkedOpenHashSet",
          c -> new CharLinkedOpenHashSet(c), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getLinkedOpenCustomHashSetTests() {
      @SuppressWarnings("serial")
      final class HashStrategy implements CharHash.Strategy, java.io.Serializable {
        @Override
        public int hashCode(char e) {
          return Hashing.murmur3_32().hashInt(e).asInt();
        }

        @Override
        public boolean equals(char a, char b) {
          return a == b;
        }
      }

      return getGeneralCharSortedSetTests("CharLinkedOpenCustomHashSet",
          c -> new CharLinkedOpenCustomHashSet(c, new HashStrategy()), Modifiable.MUTABLE,
          Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    private static junit.framework.Test getAVLTreeSetTests() {
      return getGeneralCharSortedSetTests("CharAVLTreeSet", c -> new CharAVLTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getRBTreeSetTests() {
      return getGeneralCharSortedSetTests("CharRBTreeSet", c -> new CharRBTreeSet(c),
          Modifiable.MUTABLE, Ordering.SORTED);
    }

    private static junit.framework.Test getSynchronizedRBTreeSetTests() {
      return getGeneralCharSortedSetTests("CharRBTreeSet",
          c -> CharSortedSets.synchronize(new CharRBTreeSet(c)), Modifiable.MUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getUnmodifiableRBTreeSetTests() {
      return getGeneralCharSortedSetTests("CharRBTreeSet",
          c -> CharSortedSets.unmodifiable(new CharRBTreeSet(c)), Modifiable.IMMUTABLE,
          Ordering.SORTED);
    }

    private static junit.framework.Test getGeneralCharSortedSetTests(String testSuiteName,
        Function<Collection<Character>, SortedSet<Character>> generator, Modifiable modifiable,
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

      return SortedSetTestSuiteBuilder.using(new CharSortedSetGenerator(ordering, generator))
          .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
    }

    private static junit.framework.Test getSingletonCharSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new CharSortedSetGenerator(Ordering.SORTED, c -> {
        Character value = Iterables.getOnlyElement(c);
        return CharSortedSets.singleton(value);
      })).named("CharSingletonSortedSet")
          .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

    private static junit.framework.Test getEmptyCharSortedSetTests() {
      return SortedSetTestSuiteBuilder.using(new CharSortedSetGenerator(Ordering.SORTED, c -> {
        assertTrue(c.isEmpty());
        return CharSortedSets.EMPTY_SET;
      })).named("CharSingletonSortedSet")
          .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS,
              CollectionFeature.KNOWN_ORDER, CollectionFeature.SUBSET_VIEW,
              CollectionFeature.DESCENDING_VIEW)
          .createTestSuite();
    }

    private static class CharSortedSetGenerator extends CharGeneratorBase
        implements TestSortedSetGenerator<Character> {
      private final Function<Collection<Character>, SortedSet<Character>> generator;

      CharSortedSetGenerator(Ordering ordering,
          Function<Collection<Character>, SortedSet<Character>> generator) {
        super(TestSampleValues.CHAR_SAMPLE_ELEMENTS_FOR_SORTED, ordering);
        this.generator = generator;
      }

      @Override
      public SortedSet<Character> create(Object... elements) {
        return generator.apply(arrayToCollection(elements));
      }

      @Override
      public Character belowSamplesLesser() {
        return TestSampleValues.CHARS_FOR_SORTED[0];
      }

      @Override
      public Character belowSamplesGreater() {
        return TestSampleValues.CHARS_FOR_SORTED[1];
      }

      @Override
      public Character aboveSamplesLesser() {
        return TestSampleValues.CHARS_FOR_SORTED[7];
      }

      @Override
      public Character aboveSamplesGreater() {
        return TestSampleValues.CHARS_FOR_SORTED[8];
      }
    }
  }

  public static final class FastutilChar2ShortMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Short.class, Char2ShortArrayMap::new, TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Short.class, Char2ShortArrayMap::new,
          m -> Char2ShortMaps.synchronize((Char2ShortMap) m), TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Short.class, Char2ShortArrayMap::new,
          m -> Char2ShortMaps.unmodifiable((Char2ShortMap) m),
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Short.class, Char2ShortOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Short.class, Char2ShortLinkedOpenHashMap::new,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Short.class, Char2ShortMaps::singleton,
          TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Short.class, getEmptyMap(), TestSampleValues.SHORT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Char2ShortMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilChar2ShortSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Short.class, Char2ShortAVLTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Short.class, Char2ShortRBTreeMap::new,
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Short.class, Char2ShortRBTreeMap::new,
          m -> Char2ShortSortedMaps.synchronize((Char2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Short.class, Char2ShortRBTreeMap::new,
          m -> Char2ShortSortedMaps.unmodifiable((Char2ShortSortedMap) m),
          TestSampleValues.SHORTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Short.class, Char2ShortSortedMaps::singleton,
      // TestSampleValues.SHORTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Short.class, Char2ShortSortedMaps.EMPTY_MAP,
      // TestSampleValues.SHORTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilChar2ReferenceMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.Maps");
      suite.addTest(
          getMapTests(String.class, Char2ReferenceArrayMap::new, TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(String.class, Char2ReferenceArrayMap::new,
          m -> Char2ReferenceMaps.synchronize((Char2ReferenceMap<String>) m), TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(String.class, Char2ReferenceArrayMap::new,
          m -> Char2ReferenceMaps.unmodifiable((Char2ReferenceMap<String>) m),
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(String.class, Char2ReferenceOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Char2ReferenceLinkedOpenHashMap::new,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Char2ReferenceMaps::singleton,
          TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(String.class, getEmptyMap(), TestSampleValues.REFERENCE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Char2ReferenceMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilChar2ReferenceSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Char2ReferenceAVLTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Char2ReferenceRBTreeMap::new,
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Char2ReferenceRBTreeMap::new,
          m -> Char2ReferenceSortedMaps.synchronize((Char2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Char2ReferenceRBTreeMap::new,
          m -> Char2ReferenceSortedMaps.unmodifiable((Char2ReferenceSortedMap<String>) m),
          TestSampleValues.REFERENCES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Char2ReferenceSortedMaps::singleton,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Char2ReferenceSortedMaps.EMPTY_MAP,
      // TestSampleValues.REFERENCES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilChar2IntMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Integer.class, Char2IntArrayMap::new, TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Integer.class, Char2IntArrayMap::new,
          m -> Char2IntMaps.synchronize((Char2IntMap) m), TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Integer.class, Char2IntArrayMap::new,
          m -> Char2IntMaps.unmodifiable((Char2IntMap) m),
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Integer.class, Char2IntOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Integer.class, Char2IntLinkedOpenHashMap::new,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Integer.class, Char2IntMaps::singleton,
          TestSampleValues.INT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Integer.class, getEmptyMap(), TestSampleValues.INT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Char2IntMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilChar2IntSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Integer.class, Char2IntAVLTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Integer.class, Char2IntRBTreeMap::new,
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Integer.class, Char2IntRBTreeMap::new,
          m -> Char2IntSortedMaps.synchronize((Char2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Integer.class, Char2IntRBTreeMap::new,
          m -> Char2IntSortedMaps.unmodifiable((Char2IntSortedMap) m),
          TestSampleValues.INTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Integer.class, Char2IntSortedMaps::singleton,
      // TestSampleValues.INTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Integer.class, Char2IntSortedMaps.EMPTY_MAP,
      // TestSampleValues.INTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilChar2DoubleMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Double.class, Char2DoubleArrayMap::new, TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Double.class, Char2DoubleArrayMap::new,
          m -> Char2DoubleMaps.synchronize((Char2DoubleMap) m), TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Double.class, Char2DoubleArrayMap::new,
          m -> Char2DoubleMaps.unmodifiable((Char2DoubleMap) m),
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Double.class, Char2DoubleOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Double.class, Char2DoubleLinkedOpenHashMap::new,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Double.class, Char2DoubleMaps::singleton,
          TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Double.class, getEmptyMap(), TestSampleValues.DOUBLE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Char2DoubleMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilChar2DoubleSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Double.class, Char2DoubleAVLTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Double.class, Char2DoubleRBTreeMap::new,
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Double.class, Char2DoubleRBTreeMap::new,
          m -> Char2DoubleSortedMaps.synchronize((Char2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Double.class, Char2DoubleRBTreeMap::new,
          m -> Char2DoubleSortedMaps.unmodifiable((Char2DoubleSortedMap) m),
          TestSampleValues.DOUBLES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Double.class, Char2DoubleSortedMaps::singleton,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Double.class, Char2DoubleSortedMaps.EMPTY_MAP,
      // TestSampleValues.DOUBLES_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilChar2FloatMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Float.class, Char2FloatArrayMap::new, TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Float.class, Char2FloatArrayMap::new,
          m -> Char2FloatMaps.synchronize((Char2FloatMap) m), TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Float.class, Char2FloatArrayMap::new,
          m -> Char2FloatMaps.unmodifiable((Char2FloatMap) m),
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Float.class, Char2FloatOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Float.class, Char2FloatLinkedOpenHashMap::new,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Float.class, Char2FloatMaps::singleton,
          TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Float.class, getEmptyMap(), TestSampleValues.FLOAT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Char2FloatMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilChar2FloatSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Float.class, Char2FloatAVLTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Float.class, Char2FloatRBTreeMap::new,
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Float.class, Char2FloatRBTreeMap::new,
          m -> Char2FloatSortedMaps.synchronize((Char2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Float.class, Char2FloatRBTreeMap::new,
          m -> Char2FloatSortedMaps.unmodifiable((Char2FloatSortedMap) m),
          TestSampleValues.FLOATS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Float.class, Char2FloatSortedMaps::singleton,
      // TestSampleValues.FLOATS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Float.class, Char2FloatSortedMaps.EMPTY_MAP,
      // TestSampleValues.FLOATS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilChar2LongMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Long.class, Char2LongArrayMap::new, TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Long.class, Char2LongArrayMap::new,
          m -> Char2LongMaps.synchronize((Char2LongMap) m), TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Long.class, Char2LongArrayMap::new,
          m -> Char2LongMaps.unmodifiable((Char2LongMap) m),
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Long.class, Char2LongOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Long.class, Char2LongLinkedOpenHashMap::new,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Long.class, Char2LongMaps::singleton,
          TestSampleValues.LONG_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Long.class, getEmptyMap(), TestSampleValues.LONG_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Char2LongMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilChar2LongSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Long.class, Char2LongAVLTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Long.class, Char2LongRBTreeMap::new,
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Long.class, Char2LongRBTreeMap::new,
          m -> Char2LongSortedMaps.synchronize((Char2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Long.class, Char2LongRBTreeMap::new,
          m -> Char2LongSortedMaps.unmodifiable((Char2LongSortedMap) m),
          TestSampleValues.LONGS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Long.class, Char2LongSortedMaps::singleton,
      // TestSampleValues.LONGS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Long.class, Char2LongSortedMaps.EMPTY_MAP,
      // TestSampleValues.LONGS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilChar2CharMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Character.class, Char2CharArrayMap::new, TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Character.class, Char2CharArrayMap::new,
          m -> Char2CharMaps.synchronize((Char2CharMap) m), TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Character.class, Char2CharArrayMap::new,
          m -> Char2CharMaps.unmodifiable((Char2CharMap) m),
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Character.class, Char2CharOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Character.class, Char2CharLinkedOpenHashMap::new,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Character.class, Char2CharMaps::singleton,
          TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Character.class, getEmptyMap(), TestSampleValues.CHAR_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Char2CharMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilChar2CharSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Character.class, Char2CharAVLTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSortedMapTests(Character.class, Char2CharRBTreeMap::new,
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Character.class, Char2CharRBTreeMap::new,
          m -> Char2CharSortedMaps.synchronize((Char2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Character.class, Char2CharRBTreeMap::new,
          m -> Char2CharSortedMaps.unmodifiable((Char2CharSortedMap) m),
          TestSampleValues.CHARS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Character.class, Char2CharSortedMaps::singleton,
      // TestSampleValues.CHARS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Character.class, Char2CharSortedMaps.EMPTY_MAP,
      // TestSampleValues.CHARS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilChar2ObjectMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.Maps");
      suite.addTest(
          getMapTests(String.class, Char2ObjectArrayMap::new, TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(String.class, Char2ObjectArrayMap::new,
          m -> Char2ObjectMaps.synchronize((Char2ObjectMap<String>) m), TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(String.class, Char2ObjectArrayMap::new,
          m -> Char2ObjectMaps.unmodifiable((Char2ObjectMap<String>) m),
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(String.class, Char2ObjectOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(String.class, Char2ObjectLinkedOpenHashMap::new,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(String.class, Char2ObjectMaps::singleton,
          TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(String.class, getEmptyMap(), TestSampleValues.OBJECT_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Char2ObjectMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilChar2ObjectSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(String.class, Char2ObjectAVLTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSortedMapTests(String.class, Char2ObjectRBTreeMap::new,
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(String.class, Char2ObjectRBTreeMap::new,
          m -> Char2ObjectSortedMaps.synchronize((Char2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(String.class, Char2ObjectRBTreeMap::new,
          m -> Char2ObjectSortedMaps.unmodifiable((Char2ObjectSortedMap<String>) m),
          TestSampleValues.OBJECTS_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(String.class, Char2ObjectSortedMaps::singleton,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(String.class, Char2ObjectSortedMaps.EMPTY_MAP,
      // TestSampleValues.OBJECTS_FOR_SORTED));
      return suite;
    }
  }

  public static final class FastutilChar2ByteMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.Maps");
      suite.addTest(
          getMapTests(Byte.class, Char2ByteArrayMap::new, TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSynchronizedArrayMapTests(Byte.class, Char2ByteArrayMap::new,
          m -> Char2ByteMaps.synchronize((Char2ByteMap) m), TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getUnmodifiableArrayMapTests(Byte.class, Char2ByteArrayMap::new,
          m -> Char2ByteMaps.unmodifiable((Char2ByteMap) m),
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getMapTests(Byte.class, Char2ByteOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      // Not really a sorted set?
      suite.addTest(getMapTests(Byte.class, Char2ByteLinkedOpenHashMap::new,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(getSingletonMapTests(Byte.class, Char2ByteMaps::singleton,
          TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      suite.addTest(
          getEmptyMapTests(Byte.class, getEmptyMap(), TestSampleValues.BYTE_SAMPLE_ELEMENTS));
      return suite;
    }

    @SuppressWarnings("unchecked")
    private static <X, Y> Map<X, Y> getEmptyMap() {
      return (Map<X, Y>) Char2ByteMaps.EMPTY_MAP;
    }
  }

  public static final class FastutilChar2ByteSortedMaps {
    public static junit.framework.Test suite() {
      TestSuite suite = new TestSuite("Char2ByteMaps.SortedMaps");
      suite.addTest(getSortedMapTests(Byte.class, Char2ByteAVLTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSortedMapTests(Byte.class, Char2ByteRBTreeMap::new,
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getSynchronizedRBTreeMapTests(Byte.class, Char2ByteRBTreeMap::new,
          m -> Char2ByteSortedMaps.synchronize((Char2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));
      suite.addTest(getUnmodifiableRBTreeMapTests(Byte.class, Char2ByteRBTreeMap::new,
          m -> Char2ByteSortedMaps.unmodifiable((Char2ByteSortedMap) m),
          TestSampleValues.BYTES_FOR_SORTED));

      // Bugs?
      // suite.addTest(getSingletonSortedMapTests(Byte.class, Char2ByteSortedMaps::singleton,
      // TestSampleValues.BYTES_FOR_SORTED));
      // suite.addTest(getEmptySortedMapTests(Byte.class, Char2ByteSortedMaps.EMPTY_MAP,
      // TestSampleValues.BYTES_FOR_SORTED));
      return suite;
    }
  }

  private static abstract class CharGeneratorBase extends TestContainerGeneratorBase<Character> {
    CharGeneratorBase() {
      this(TestSampleValues.CHAR_SAMPLE_ELEMENTS, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    CharGeneratorBase(SampleElements<Character> sampleElements, Ordering ordering) {
      super(Character.class, sampleElements, ordering);
    }
  }

  private static junit.framework.Test getGeneralCharListTests(String testSuiteName,
      Function<Collection<Character>, List<Character>> generator, Modifiable modifiable) {
    final class Generator extends CharGeneratorBase implements TestListGenerator<Character> {
      @Override
      public List<Character> create(Object... elements) {
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
      Supplier<Map<Character, V>> mapFactory, SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Character, V> map = mapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedArrayMapTests(Class<V> clazzV,
      Supplier<Map<Character, V>> mapFactory, Function<Map<Character, V>, Map<Character, V>> syncrhonizeWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Character, V> map = mapFactory.get();
      map.putAll(m);
      map = syncrhonizeWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableArrayMapTests(Class<V> clazzV,
      Supplier<Map<Character, V>> mapFactory, Function<Map<Character, V>, Map<Character, V>> unmodifiableWrapper,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = mapFactory.get().getClass().getSimpleName();
    return getGeneralMapTests(clazzV, m -> {
      Map<Character, V> map = mapFactory.get();
      map.putAll(m);
      map = unmodifiableWrapper.apply(map);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralMapTests(Class<V> clazzV,
      Function<Map<Character, V>, Map<Character, V>> mapFactory, String testSuiteName,
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
        .using(new CharMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  private static <V> junit.framework.Test getSingletonMapTests(Class<V> clazzV,
      BiFunction<Character, V, Map<Character, V>> singletonMapFactory,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonMap";
    return MapTestSuiteBuilder.using(new CharMapGenerator<V>(clazzV, map -> {
      Map.Entry<Character, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getEmptyMapTests(Class<V> clazzV, Map<Character, V> emptyMap,
      SampleElements<V> valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptyMap";
    return MapTestSuiteBuilder.using(new CharMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  private static <V> junit.framework.Test getSortedMapTests(Class<V> clazzV,
      Supplier<SortedMap<Character, V>> sortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Character, V> map = sortedMapFactory.get();
      map.putAll(m);
      return map;
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getSynchronizedRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Character, V>> sortedMapFactory,
      Function<SortedMap<Character, V>, SortedMap<Character, V>> synchronziedWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Synchronized" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Character, V> map = sortedMapFactory.get();
      map.putAll(m);
      return synchronziedWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.MUTABLE);
  }

  private static <V> junit.framework.Test getUnmodifiableRBTreeMapTests(Class<V> clazzV,
      Supplier<SortedMap<Character, V>> sortedMapFactory,
      Function<SortedMap<Character, V>, SortedMap<Character, V>> unmodifiableWrapper,
      V[] valueSampleElements) {
    String testSuiteName = "Unmodifiable" + sortedMapFactory.get().getClass().getSimpleName();
    return getGeneralSortedMapTests(clazzV, m -> {
      SortedMap<Character, V> map = sortedMapFactory.get();
      map.putAll(m);
      return unmodifiableWrapper.apply(map);
    } , testSuiteName, valueSampleElements, Modifiable.IMMUTABLE);
  }

  private static <V> junit.framework.Test getGeneralSortedMapTests(Class<V> clazzV,
      Function<Map<Character, V>, SortedMap<Character, V>> mapFactory, String testSuiteName,
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
        .using(new CharSortedMapGenerator<V>(clazzV, mapFactory, valueSampleElements))
        .named(testSuiteName).withFeatures(testSuiteFeatures).createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getSingletonSortedMapTests(Class<V> clazzV,
      BiFunction<Character, V, SortedMap<Character, V>> singletonSortedMapFactory, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "SingletonSortedMap";
    return SortedMapTestSuiteBuilder.using(new CharSortedMapGenerator<V>(clazzV, map -> {
      Map.Entry<Character, V> entry = Iterables.getOnlyElement(map.entrySet());
      return singletonSortedMapFactory.apply(entry.getKey(), entry.getValue());
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  @SuppressWarnings("unused")
  private static <V> junit.framework.Test getEmptySortedMapTests(Class<V> clazzV,
      SortedMap<Character, V> emptyMap, V[] valueSampleElements) {
    String testSuiteName = clazzV.getSimpleName() + "EmptySortedMap";
    return SortedMapTestSuiteBuilder.using(new CharSortedMapGenerator<V>(clazzV, map -> {
      assertEquals(0, map.size());
      return emptyMap;
    } , valueSampleElements)).named(testSuiteName)
        .withFeatures(CollectionSize.ZERO, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite();
  }

  private static final class CharMapGenerator<V> extends TestMapGeneratorBase<Character, V> {
    private final Function<Map<Character, V>, Map<Character, V>> mapFactory;

    protected CharMapGenerator(Class<V> clazzV, Function<Map<Character, V>, Map<Character, V>> mapFactory,
        SampleElements<V> valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected CharMapGenerator(Class<V> clazzV, Function<Map<Character, V>, Map<Character, V>> mapFactory,
        SampleElements<V> valueSampleElements, Ordering ordering) {
      super(Character.class, clazzV, TestSampleValues.CHAR_SAMPLE_ELEMENTS, valueSampleElements,
          ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public Map<Character, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }

  private static final class CharSortedMapGenerator<V> extends TestSortedMapGeneratorBase<Character, V> {
    private final Function<Map<Character, V>, SortedMap<Character, V>> mapFactory;

    protected CharSortedMapGenerator(Class<V> clazzV,
        Function<Map<Character, V>, SortedMap<Character, V>> mapFactory, V[] valueSampleElements) {
      this(clazzV, mapFactory, valueSampleElements, Ordering.UNSORTED_OR_INSERTION_ORDER);
    }

    protected CharSortedMapGenerator(Class<V> clazzV,
        Function<Map<Character, V>, SortedMap<Character, V>> mapFactory, V[] valueSampleElements,
        Ordering ordering) {
      super(Character.class, clazzV, TestSampleValues.CHARS_FOR_SORTED, valueSampleElements, ordering);
      this.mapFactory = mapFactory;
    }

    @Override
    public SortedMap<Character, V> create(Object... elements) {
      return mapFactory.apply(arrayToMap(elements));
    }
  }
}