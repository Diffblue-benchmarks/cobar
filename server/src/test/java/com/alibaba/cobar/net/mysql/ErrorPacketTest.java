package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.ErrorPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class ErrorPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99951bd84220e14086e() {

    // Act, creating object to test constructor
    final ErrorPacket actual = new ErrorPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals((short) -1, actual.fieldCount);
    Assert.assertEquals(0, actual.errno);
    Assert.assertEquals((short) 35, actual.mark);
    Assert.assertNull(actual.message);
    Assert.assertArrayEquals(new byte[]{ (short) 72, (short) 89, (short) 48, (short) 48, (short) 48 }, actual.sqlState);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
