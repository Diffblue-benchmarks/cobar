package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.FieldPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class FieldPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99999ed994d01cf1a20() {

    // Act, creating object to test constructor
    final FieldPacket actual = new FieldPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.flags);
    Assert.assertEquals((short) 0, actual.decimals);
    Assert.assertNull(actual.orgTable);
    Assert.assertArrayEquals(new byte[]{ (short) 100, (short) 101, (short) 102 }, actual.catalog);
    Assert.assertNull(actual.orgName);
    Assert.assertNull(actual.db);
    Assert.assertNull(actual.definition);
    Assert.assertEquals(0, actual.charsetIndex);
    Assert.assertNull(actual.table);
    Assert.assertNull(actual.name);
    Assert.assertEquals(0L, actual.length);
    Assert.assertEquals(0, actual.type);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
