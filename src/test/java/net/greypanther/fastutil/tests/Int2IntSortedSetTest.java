package net.greypanther.fastutil.tests;

import java.util.Arrays;
import java.util.SortedSet;

import org.junit.Test;
import static org.junit.Assert.*;

import it.unimi.dsi.fastutil.ints.IntLinkedOpenHashSet;

public final class Int2IntSortedSetTest {
  @Test
  public void testOrderShouldBePreservedByComparatorComparator() {
    SortedSet<Integer> set = new IntLinkedOpenHashSet();
    set.addAll(Arrays.asList(0, -1, -2));

    Integer[] values = set.toArray(new Integer[0]);
    Integer[] sortedValues = set.toArray(new Integer[0]);
    Arrays.sort(sortedValues, set.comparator());

    assertArrayEquals(String.format("Expected arrays to be equal but were: %s and %s",
        Arrays.toString(values), Arrays.toString(sortedValues)), values, sortedValues);
  }
}
