package net.greypanther.fastutil.tests;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Map.Entry;

import org.junit.Test;

import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntMaps;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public final class Int2IntMapTest {
  @Test
  public void testMapIteratorNextRemove() {
    Int2IntMap map = new Int2IntOpenHashMap();
    ObjectIterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();

    assertFalse(iterator.hasNext());
    iterator.next();
    iterator.remove();
  }

  @Test
  public void testArrayMapEntrySetSupportsRemoveAll() {
    Int2IntMap map = new Int2IntArrayMap();
    assertFalse(map.entrySet().removeAll(Collections.singleton("TEST")));
  }

  @Test(expected = IllegalStateException.class)
  public void testArrayMapEmptyEntrySetThrowsExceptionOnIteratorRemove() {
    ObjectIterator<Entry<Integer, Integer>> iterator = new Int2IntArrayMap().entrySet().iterator();

    assertFalse(iterator.hasNext());
    iterator.remove();
  }

  @Test
  public void testMapValuesShouldSupportClear() {
    Int2IntMap map = new Int2IntArrayMap(Int2IntMaps.singleton(42, 24));
    map.values().clear();
    assertTrue(map.isEmpty());
  }

  @Test
  public void testMapValuesShouldSupportRemove() {
    Int2IntMap map = new Int2IntArrayMap(Int2IntMaps.singleton(42, 24));
    map.values().remove(24);
    assertTrue(map.isEmpty());
  }

  @Test
  public void testMapValuesShouldSupportRemoveAll() {
    Int2IntMap map = new Int2IntArrayMap(Int2IntMaps.singleton(42, 24));
    map.values().removeAll(Collections.singleton(24));
    assertTrue(map.isEmpty());
  }

  @Test
  public void testSingletonMapEqualsShouldCheckTheTypeOfParamters() {
    Int2IntMap map = Int2IntMaps.singleton(1, 2);
    assertFalse(map.equals(Collections.singletonMap(null, 2)));
    assertFalse(map.equals(Collections.singletonMap(1, null)));
    assertFalse(map.equals(Collections.singletonMap("foo", 2)));
    assertFalse(map.equals(Collections.singletonMap(1, "foo")));
  }
}
