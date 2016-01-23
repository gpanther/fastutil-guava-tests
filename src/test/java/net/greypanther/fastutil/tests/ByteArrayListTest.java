package net.greypanther.fastutil.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;

public final class ByteArrayListTest {
  @Test
  public void testAddUsingIteratorToTheFirstPosition() {
    testAddUsingIteratorToTheFirstPosition_internal(new ArrayList<>());
    testAddUsingIteratorToTheFirstPosition_internal(new ByteArrayList());
  }

  private void testAddUsingIteratorToTheFirstPosition_internal(List<Byte> list) {
    list.add((byte)24);
    ListIterator<Byte> it = list.listIterator();
    it.add((byte)42);
    assertTrue(it.hasNext());
    assertEquals(Arrays.asList((byte)42, (byte)24), list);
  }
}
