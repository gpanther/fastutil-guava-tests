package net.greypanther.fastutil.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

import it.unimi.dsi.fastutil.ints.IntArrayList;

public final class IntArrayListTest {
  @Test
  public void testAddUsingIteratorToTheFirstPosition() {
    testAddUsingIteratorToTheFirstPosition_internal(new ArrayList<>());
    testAddUsingIteratorToTheFirstPosition_internal(new IntArrayList());
  }

  private void testAddUsingIteratorToTheFirstPosition_internal(List<Integer> list) {
    list.add(24);
    ListIterator<Integer> it = list.listIterator();
    it.add(42);
    assertTrue(it.hasNext());
    assertEquals(Arrays.asList(42, 24), list);
  }

  @Test
  public void testNextElementSetToNullByToArray() {
    testNextElementSetToNullByToArray_internal(new ArrayList<>());
    testNextElementSetToNullByToArray_internal(new IntArrayList());
  }

  private void testNextElementSetToNullByToArray_internal(List<Integer> list) {
    list.add(42);
    Integer[] arr = {1, 2, 3};
    list.toArray(arr);

    Integer[] expected = {42, null, 3};
    assertArrayEquals(expected, arr);
  }
}
