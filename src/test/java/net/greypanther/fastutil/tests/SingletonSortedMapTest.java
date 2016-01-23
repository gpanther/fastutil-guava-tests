package net.greypanther.fastutil.tests;

import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.testing.SampleElements;
import com.google.common.collect.testing.SortedMapTestSuiteBuilder;
import com.google.common.collect.testing.TestSortedMapGenerator;
import com.google.common.collect.testing.features.CollectionFeature;
import com.google.common.collect.testing.features.CollectionSize;

import junit.framework.TestSuite;

public final class SingletonSortedMapTest {
  public static junit.framework.Test suite() {
    TestSuite suite = new TestSuite("SingletonSortedMapTest");
    suite.addTest(SortedMapTestSuiteBuilder.using(new SortedMapGenerator() {
      @Override
      public SortedMap<Integer, String> create(Object... elements) {
        Map.Entry<Integer, String> entry = Iterables.getOnlyElement(
            SingletonSortedMapTest.<Integer, String>arrayToMap(elements).entrySet());
        SortedMap<Integer, String> result = Maps.newTreeMap();
        result.put(entry.getKey(), entry.getValue());
        return result;
      }
    }).named("SingletonSortedMapTest")
        .withFeatures(CollectionSize.ONE, CollectionFeature.SERIALIZABLE_INCLUDING_VIEWS)
        .createTestSuite());
    return suite;
  }

  private static abstract class SortedMapGenerator
      implements TestSortedMapGenerator<Integer, String> {
    @Override
    public Integer[] createKeyArray(int length) {
      return new Integer[length];
    }

    @Override
    public String[] createValueArray(int length) {
      return new String[length];
    }

    @Override
    public SampleElements<Map.Entry<Integer, String>> samples() {
      return new SampleElements<Map.Entry<Integer, String>>(
          new AbstractMap.SimpleEntry<Integer, String>(0, "X"),
          new AbstractMap.SimpleEntry<Integer, String>(7, "Y"),
          new AbstractMap.SimpleEntry<Integer, String>(2, "Z"),
          new AbstractMap.SimpleEntry<Integer, String>(5, "Q"),
          new AbstractMap.SimpleEntry<Integer, String>(9, "R"));
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map.Entry<Integer, String>[] createArray(int length) {
      return (Map.Entry<Integer, String>[]) Array.newInstance(Map.Entry.class, length);
    }

    @Override
    public Iterable<Map.Entry<Integer, String>> order(
        List<Map.Entry<Integer, String>> insertionOrder) {
      return insertionOrder;
    }

    @Override
    public Map.Entry<Integer, String> belowSamplesLesser() {
      return new AbstractMap.SimpleEntry<Integer, String>(-2, "T");
    }

    @Override
    public Map.Entry<Integer, String> belowSamplesGreater() {
      return new AbstractMap.SimpleEntry<Integer, String>(-1, "U");
    }

    @Override
    public Map.Entry<Integer, String> aboveSamplesLesser() {
      return new AbstractMap.SimpleEntry<Integer, String>(11, "V");
    }

    @Override
    public Map.Entry<Integer, String> aboveSamplesGreater() {
      return new AbstractMap.SimpleEntry<Integer, String>(12, "W");
    }
  }

  @SuppressWarnings("unchecked")
  private static <K, V> Map<K, V> arrayToMap(Object... elements) {
    Map<K, V> result = Maps.newLinkedHashMap();
    for (Object element : elements) {
      Map.Entry<K, V> entry = (Map.Entry<K, V>) element;
      result.put(entry.getKey(), entry.getValue());
    }
    return result;
  }
}
