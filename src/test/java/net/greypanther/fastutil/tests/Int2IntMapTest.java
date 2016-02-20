package net.greypanther.fastutil.tests;

import static org.junit.Assert.*;

import java.util.Map.Entry;

import org.junit.Test;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
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
}
