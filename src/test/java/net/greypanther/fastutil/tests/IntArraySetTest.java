package net.greypanther.fastutil.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntSet;

public final class IntArraySetTest {
  @Test
  public void testNullInEquals() {
    assertFalse(new IntArraySet(Arrays.asList(42)).equals(Collections.singleton(null)));
  }

  @Test
  public void testRemoveFromIterator() {
    IntSet set = new IntArraySet(Arrays.asList(42));

    IntIterator iterator = set.iterator();
    assertTrue(iterator.hasNext());
    iterator.next();
    iterator.remove();

    assertTrue(set.isEmpty());
    assertEquals(0, set.size());
    assertFalse(set.contains(42));
  }
}
