package net.greypanther.fastutil.tests;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

import it.unimi.dsi.fastutil.ints.IntBigArrayBigList;
import it.unimi.dsi.fastutil.ints.IntBigList;
import it.unimi.dsi.fastutil.ints.IntBigLists;

public final class IntBigListTest {
  @Test(expected = IndexOutOfBoundsException.class)
  public void testListIterator_tooLow() {
    new IntBigArrayBigList().listIterator(-1L);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testListIterator_tooHigh() {
    new IntBigArrayBigList().listIterator(1L);
  }

  @Test
  public void testAddWithIterator() {
    IntBigList list = new IntBigArrayBigList();
    list.iterator().add(1);
    assertEquals(IntBigLists.singleton(1), list);
  }

  @Test
  public void testRemoveAllModifiesCollection() {
    IntBigList list = new IntBigArrayBigList();
    list.removeAll(Collections.emptySet());
    assertEquals(IntBigLists.EMPTY_BIG_LIST, list);
  }
}
