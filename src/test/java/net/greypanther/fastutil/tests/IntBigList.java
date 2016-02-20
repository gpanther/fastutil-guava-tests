package net.greypanther.fastutil.tests;

import org.junit.Test;

import it.unimi.dsi.fastutil.ints.IntBigArrayBigList;

public final class IntBigList {
  @Test(expected=IndexOutOfBoundsException.class)
  public void testListIterator_tooLow() {
    new IntBigArrayBigList().listIterator(-1L);
  }

  @Test(expected=IndexOutOfBoundsException.class)
  public void testListIterator_tooHigh() {
    new IntBigArrayBigList().listIterator(1L);
  }
}
