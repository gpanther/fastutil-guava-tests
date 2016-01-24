package net.greypanther.fastutil.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;

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

  @Test
  public void testNullInContains() {
    assertFalse(new IntArrayList().contains(null));
  }

  @Test
  public void testNullInContainsAll() {
    assertFalse(new IntArrayList().containsAll(Collections.singleton(null)));
  }

  @Test
  public void testNullInRemove() {
    new IntArrayList().remove(null);
  }

  @Test
  public void testNullInRemoveAll() {
    new IntArrayList().removeAll(Collections.singleton(null));
  }

  @Test
  public void testRemoveAllFromListRemovesAllOccurrances() {
    testRemoveAllFromListRemovesAllOccurrances_internal(new ArrayList<>());
    testRemoveAllFromListRemovesAllOccurrances_internal(new IntArrayList());
  }

  private void testRemoveAllFromListRemovesAllOccurrances_internal(List<Integer> list) {
    list.addAll(Arrays.asList(1, 2, 1));
    list.removeAll(Arrays.asList(1));
    assertEquals(Collections.singletonList(2), list);
  }

  @Test
  public void testRemoveAllFromListRemovesAllOccurrances_using_IntCollection() {
    IntList list = new IntArrayList(new int[] {1, 2, 1});
    list.removeAll(IntLists.singleton(1));
    assertEquals(IntLists.singleton(1), list);
  }
}

