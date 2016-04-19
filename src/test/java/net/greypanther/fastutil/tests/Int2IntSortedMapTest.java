package net.greypanther.fastutil.tests;

import static org.junit.Assert.*;

import java.util.SortedMap;

import org.junit.Test;

import it.unimi.dsi.fastutil.ints.Int2IntAVLTreeMap;

public final class Int2IntSortedMapTest {
  @Test
  public void testAVLTreeMapEntrySetModifiable() throws Exception {
    SortedMap<Integer, Integer> map = new Int2IntAVLTreeMap();
    map.put(1, 2);
    map.entrySet().clear();
    assertTrue(map.isEmpty());
  }

  @Test
  public void testAVLTreeMapKeySetModifiable() throws Exception {
    SortedMap<Integer, Integer> map = new Int2IntAVLTreeMap();
    map.put(1, 2);
    map.keySet().clear();
    assertTrue(map.isEmpty());
  }

  @Test
  public void testAVLTreeMapValuesModifiable() throws Exception {
    SortedMap<Integer, Integer> map = new Int2IntAVLTreeMap();
    map.put(1, 2);
    map.values().clear();
    assertTrue(map.isEmpty());
  }
}
