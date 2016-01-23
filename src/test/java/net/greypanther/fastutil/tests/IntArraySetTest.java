package net.greypanther.fastutil.tests;

import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import it.unimi.dsi.fastutil.ints.IntArraySet;

public final class IntArraySetTest {
  @Test
  public void testNullInEquals() {
    assertFalse(new IntArraySet(Arrays.asList(42)).equals(Collections.singleton(null)));
  }
}
