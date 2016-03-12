package net.greypanther.guava.tests.tests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import com.google.common.collect.testing.MapTestSuiteBuilder;
import com.google.common.collect.testing.SampleElements;
import com.google.common.collect.testing.TestMapGenerator;
import com.google.common.collect.testing.features.CollectionFeature;
import com.google.common.collect.testing.features.CollectionSize;
import com.google.common.collect.testing.features.Feature;
import com.google.common.collect.testing.features.MapFeature;

import junit.framework.TestSuite;

public final class CustomToStringTest {
  public static junit.framework.Test suite() {
    TestSuite suite = new TestSuite("CustomToStringTest");

    List<Feature<?>> testSuiteFeatures =
        Arrays.asList(CollectionSize.ANY, CollectionFeature.NON_STANDARD_TOSTRING,
            CollectionFeature.SERIALIZABLE, MapFeature.GENERAL_PURPOSE, MapFeature.ALLOWS_NULL_KEYS,
            MapFeature.ALLOWS_NULL_VALUES, MapFeature.FAILS_FAST_ON_CONCURRENT_MODIFICATION);

    TestMapGenerator<Integer, String> generator = new TestMapGenerator<Integer, String>() {
      @Override
      public SampleElements<Entry<Integer, String>> samples() {
        return new SampleElements<Map.Entry<Integer, String>>(Maps.immutableEntry(0, "a"),
            Maps.immutableEntry(1, "b"), Maps.immutableEntry(2, "c"), Maps.immutableEntry(3, "d"),
            Maps.immutableEntry(4, "e"));
      }

      @Override
      public Map<Integer, String> create(Object... elements) {
        Map<Integer, String> result = new MapWithCustomToString<Integer, String>();
        for (Object element : elements) {
          @SuppressWarnings("unchecked")
          Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) element;
          result.put(entry.getKey(), entry.getValue());
        }
        return result;
      }

      @Override
      @SuppressWarnings("unchecked")
      public Entry<Integer, String>[] createArray(int length) {
        return new Entry[length];
      }

      @Override
      public Iterable<Entry<Integer, String>> order(List<Entry<Integer, String>> insertionOrder) {
        return insertionOrder;
      }

      @Override
      public Integer[] createKeyArray(int length) {
        return new Integer[length];
      }

      @Override
      public String[] createValueArray(int length) {
        return new String[length];
      }

    };

    suite.addTest(MapTestSuiteBuilder.using(generator).named("CustomToStringTest")
        .withFeatures(testSuiteFeatures).createTestSuite());
    return suite;
  }

  @SuppressWarnings("serial")
  private static final class MapWithCustomToString<K, V> extends HashMap<K, V> {
    @Override
    public String toString() {
      StringBuilder result = new StringBuilder();
      result.append('[');
      result.append(Joiner.on(", ")
          .join(entrySet().stream().map(e -> e.getKey() + "=>" + e.getValue()).iterator()));
      result.append(']');
      return result.toString();
    }
  }
}
