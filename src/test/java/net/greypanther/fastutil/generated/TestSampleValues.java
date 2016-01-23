package net.greypanther.fastutil.generated;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;

import com.google.common.collect.testing.SampleElements;

final class TestSampleValues {
  static final Byte[] BYTES =
      getArray(Byte.class, Number::byteValue, 0, Byte.MIN_VALUE, Byte.MAX_VALUE, -7, 42);
  static final SampleElements<Byte> BYTE_SAMPLE_ELEMENTS = createSampleElements(BYTES);
  static final Byte[] BYTES_FOR_SORTED = getArray(Byte.class, Number::byteValue, Byte.MIN_VALUE,
      Byte.MIN_VALUE + 1, 0, -12, 8, -7, 42, Byte.MAX_VALUE - 1, Byte.MAX_VALUE);
  static final SampleElements<Byte> BYTE_SAMPLE_ELEMENTS_FOR_SORTED =
      createSampleElementsForSorted(BYTES_FOR_SORTED);

  static final Character[] CHARS = {'\1', Character.MIN_VALUE, Character.MAX_VALUE, 'z', 'á'};
  static final SampleElements<Character> CHAR_SAMPLE_ELEMENTS = createSampleElements(CHARS);
  static final Character[] CHARS_FOR_SORTED = {Character.MIN_VALUE, Character.MIN_VALUE + 1, 'z',
      'á', '0', '9', '\uA31F', Character.MAX_VALUE - 1, Character.MAX_VALUE};
  static final SampleElements<Character> CHAR_SAMPLE_ELEMENTS_FOR_SORTED =
      createSampleElementsForSorted(CHARS_FOR_SORTED);

  static final Double[] DOUBLES = getArray(Double.class, Number::doubleValue, 0D, Double.MIN_VALUE,
      -Double.MAX_VALUE, Math.E, Double.NEGATIVE_INFINITY);
  static final SampleElements<Double> DOUBLE_SAMPLE_ELEMENTS = createSampleElements(DOUBLES);
  static final Double[] DOUBLES_FOR_SORTED =
      getArray(Double.class, Number::doubleValue, Double.NEGATIVE_INFINITY, -Double.MAX_VALUE, 0,
          -12, 8, -7, 42, Double.MAX_VALUE, Double.POSITIVE_INFINITY);
  static final SampleElements<Double> DOUBLE_SAMPLE_ELEMENTS_FOR_SORTED =
      createSampleElementsForSorted(DOUBLES_FOR_SORTED);

  static final Float[] FLOATS = getArray(Float.class, Number::floatValue, 0F, Float.MIN_VALUE,
      -Float.MAX_VALUE, Math.E, Float.NEGATIVE_INFINITY);
  static final SampleElements<Float> FLOAT_SAMPLE_ELEMENTS = createSampleElements(FLOATS);
  static final Float[] FLOATS_FOR_SORTED =
      getArray(Float.class, Number::floatValue, Float.NEGATIVE_INFINITY, -Float.MAX_VALUE, 0,
          -12, 8, -7, 42, Float.MAX_VALUE, Float.POSITIVE_INFINITY);
  static final SampleElements<Float> FLOAT_SAMPLE_ELEMENTS_FOR_SORTED =
      createSampleElementsForSorted(FLOATS_FOR_SORTED);

  static final Integer[] INTS =
      getArray(Integer.class, Number::intValue, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, -7, 42);
  static final SampleElements<Integer> INT_SAMPLE_ELEMENTS = createSampleElements(INTS);
  static final Integer[] INTS_FOR_SORTED = getArray(Integer.class, Number::intValue, Integer.MIN_VALUE,
      Integer.MIN_VALUE + 1, 0, -12, 8, -7, 42, Integer.MAX_VALUE - 1, Integer.MAX_VALUE);
  static final SampleElements<Integer> INT_SAMPLE_ELEMENTS_FOR_SORTED =
      createSampleElementsForSorted(INTS_FOR_SORTED);

  static final Long[] LONGS =
      getArray(Long.class, Number::longValue, 0, Long.MIN_VALUE, Long.MAX_VALUE, -7, 42);
  static final SampleElements<Long> LONG_SAMPLE_ELEMENTS = createSampleElements(LONGS);
  static final Long[] LONGS_FOR_SORTED = getArray(Long.class, Number::longValue, Long.MIN_VALUE,
      Long.MIN_VALUE + 1, 0, -12, 8, -7, 42, Long.MAX_VALUE - 1, Long.MAX_VALUE);
  static final SampleElements<Long> LONG_SAMPLE_ELEMENTS_FOR_SORTED =
      createSampleElementsForSorted(LONGS_FOR_SORTED);

  static final Short[] SHORTS =
      getArray(Short.class, Number::shortValue, 0, Short.MIN_VALUE, Short.MAX_VALUE, -7, 42);
  static final SampleElements<Short> SHORT_SAMPLE_ELEMENTS = createSampleElements(SHORTS);
  static final Short[] SHORTS_FOR_SORTED = getArray(Short.class, Number::shortValue, Short.MIN_VALUE,
      Short.MIN_VALUE + 1, 0, -12, 8, -7, 42, Short.MAX_VALUE - 1, Short.MAX_VALUE);
  static final SampleElements<Short> SHORT_SAMPLE_ELEMENTS_FOR_SORTED =
      createSampleElementsForSorted(SHORTS_FOR_SORTED);

  static final String[] OBJECTS = {"f", "z", "á", "0", "丑"};
  static final SampleElements<String> OBJECT_SAMPLE_ELEMENTS = createSampleElements(OBJECTS);
  static final String[] OBJECTS_FOR_SORTED = {"0", "1", "2", "3", "5", "6", "7", "8", "9"};
  static final SampleElements<String> OBJECT_SAMPLE_ELEMENTS_FOR_SORTED =
      createSampleElementsForSorted(OBJECTS_FOR_SORTED);

  static final String[] REFERENCES = {"f", "z", "á", "0", "丑"};
  static final SampleElements<String> REFERENCE_SAMPLE_ELEMENTS = createSampleElements(REFERENCES);
  static final String[] REFERENCES_FOR_SORTED = {"0", "1", "2", "3", "5", "6", "7", "8", "9"};
  static final SampleElements<String> REFERENCE_SAMPLE_ELEMENTS_FOR_SORTED =
      createSampleElementsForSorted(REFERENCES_FOR_SORTED);

  private static <T extends Number> T[] getArray(Class<T> clazz, Function<Number, T> convertor,
      Number n0, Number n1, Number n2, Number n3, Number n4) {
    @SuppressWarnings("unchecked")
    T[] result = (T[]) Array.newInstance(clazz, 5);
    result[0] = convertor.apply(n0);
    result[1] = convertor.apply(n1);
    result[2] = convertor.apply(n2);
    result[3] = convertor.apply(n3);
    result[4] = convertor.apply(n4);

    Set<T> values = new HashSet<>(Arrays.asList(result));
    assertEquals("Non-unique values: " + Arrays.toString(result), result.length, values.size());

    return result;
  }

  private static <T extends Number> T[] getArray(Class<T> clazz, Function<Number, T> convertor,
      Number n0, Number n1, Number n2, Number n3, Number n4, Number n5, Number n6, Number n7,
      Number n8) {
    @SuppressWarnings("unchecked")
    T[] result = (T[]) Array.newInstance(clazz, 9);
    result[0] = convertor.apply(n0);
    result[1] = convertor.apply(n1);
    result[2] = convertor.apply(n2);
    result[3] = convertor.apply(n3);
    result[4] = convertor.apply(n4);
    result[5] = convertor.apply(n5);
    result[6] = convertor.apply(n6);
    result[7] = convertor.apply(n7);
    result[8] = convertor.apply(n8);

    SortedSet<T> values = new TreeSet<>(Arrays.asList(result));
    assertEquals("Non-unique values: " + Arrays.toString(result), result.length, values.size());

    Iterator<T> it = values.iterator();
    assertEquals(result[0], it.next());
    assertEquals(result[1], it.next());
    for (int i = 2; i < 7; ++i) {
      it.next();
    }
    assertEquals(result[7], it.next());
    assertEquals(result[8], it.next());

    return result;
  }

  private static <T> SampleElements<T> createSampleElements(T[] values) {
    assertEquals(5, values.length);
    return new SampleElements<T>(values[0], values[1], values[2], values[3], values[4]);
  }

  static <T> SampleElements<T> createSampleElementsForSorted(T[] values) {
    assertEquals(9, values.length);
    return new SampleElements<T>(values[2], values[3], values[4], values[5], values[6]);
  }
}
