package net.greypanther.fastutil.generated;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;
import com.google.common.collect.testing.SampleElements;
import com.google.common.collect.testing.TestContainerGenerator;

abstract class TestContainerGeneratorBase<T extends Comparable<? super T>>
    implements TestContainerGenerator<Collection<T>, T> {
  private final Class<T> clazzT;
  private final SampleElements<T> sampleElements;
  private final Ordering ordering;

  protected TestContainerGeneratorBase(Class<T> clazzT, SampleElements<T> sampleElements,
      Ordering ordering) {
    this.clazzT = clazzT;
    this.sampleElements = sampleElements;
    this.ordering = ordering;
  }

  @Override
  public final SampleElements<T> samples() {
    return sampleElements;
  }

  @Override
  @SuppressWarnings("unchecked")
  public final T[] createArray(int length) {
    return (T[]) Array.newInstance(clazzT, length);
  }

  @Override
  public final Iterable<T> order(List<T> insertionOrder) {
    switch (ordering) {
      case SORTED: {
        List<T> result = Lists.newArrayList(insertionOrder);
        Collections.sort(result);
        return result;
      }
      case UNSORTED_OR_INSERTION_ORDER:
        return insertionOrder;
      default:
        throw new IllegalArgumentException(ordering.toString());
    }
  }

  @SuppressWarnings("unchecked")
  protected final Collection<T> arrayToCollection(Object... elements) {
    return Arrays.stream(elements).map(e -> (T) e).collect(Collectors.toList());
  }
}
