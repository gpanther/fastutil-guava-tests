package net.greypanther.fastutil.tests;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import it.unimi.dsi.fastutil.ints.Int2IntAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2IntRBTreeMap;

public final class Int2IntSortedMapTest {
  @Test
  public void testEntrySetSerializable() throws Exception {
    serialize(new Int2IntRBTreeMap().entrySet());
  }

  private static void serialize(Object object) throws Exception {
    new ObjectOutputStream(new ByteArrayOutputStream()).writeObject(object);
  }
}
