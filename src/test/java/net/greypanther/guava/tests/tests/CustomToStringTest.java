package net.greypanther.guava.tests.tests;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.google.common.base.Joiner;
import com.google.common.collect.ForwardingCollection;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ForwardingSet;
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
            CollectionFeature.SERIALIZABLE, CollectionFeature.REMOVE_OPERATIONS,
            MapFeature.GENERAL_PURPOSE, MapFeature.ALLOWS_NULL_KEYS, MapFeature.ALLOWS_NULL_VALUES,
            MapFeature.FAILS_FAST_ON_CONCURRENT_MODIFICATION);

    TestMapGenerator<Integer, String> generator = new TestMapGenerator<Integer, String>() {
      @Override
      public SampleElements<Entry<Integer, String>> samples() {
        return new SampleElements<Map.Entry<Integer, String>>(Maps.immutableEntry(0, "a"),
            Maps.immutableEntry(1, "b"), Maps.immutableEntry(2, "c"), Maps.immutableEntry(3, "d"),
            Maps.immutableEntry(4, "e"));
      }

      @Override
      public Map<Integer, String> create(Object... elements) {
        Map<Integer, String> result = new MapWithCustomToString<>(new HashMap<>());
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
  private static final class MapWithCustomToString<K, V> extends ForwardingMap<K, V>
      implements Serializable {
    private final Map<K, V> wrapped;

    private MapWithCustomToString(Map<K, V> wrapped) {
      this.wrapped = wrapped;
    }

    @Override
    protected Map<K, V> delegate() {
      return wrapped;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
      return new SetWithCustomToString<>(wrapped.entrySet());
    }

    @Override
    public Set<K> keySet() {
      return new SetWithCustomToString<>(wrapped.keySet());
    }

    @Override
    public Collection<V> values() {
      return new CollectionWithCustomToString<>(wrapped.values());
    }

    @Override
    public String toString() {
      return String.format("Map<%s>", Joiner.on(", ").join(entrySet().stream()
          .map(e -> String.format("%s => %s", e.getKey(), e.getValue())).iterator()));
    }
  }

  private static final class SetWithCustomToString<E> extends ForwardingSet<E> {
    private final Set<E> wrapped;

    private SetWithCustomToString(Set<E> wrapped) {
      this.wrapped = wrapped;
    }

    @Override
    protected Set<E> delegate() {
      return wrapped;
    }

    @Override
    public String toString() {
      return String.format("Set<%s>", Joiner.on(", ").useForNull("null").join(wrapped));
    }
  }

  private static final class CollectionWithCustomToString<E> extends ForwardingCollection<E> {
    private final Collection<E> wrapped;

    private CollectionWithCustomToString(Collection<E> wrapped) {
      this.wrapped = wrapped;
    }

    @Override
    protected Collection<E> delegate() {
      return wrapped;
    }

    @Override
    public String toString() {
      return String.format("Collection<%s>", Joiner.on(", ").useForNull("null").join(wrapped));
    }
  }
}
