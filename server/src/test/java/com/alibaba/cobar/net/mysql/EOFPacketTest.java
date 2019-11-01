package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.EOFPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class EOFPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fdb0aa0bad11e79d() {

    // Act, creating object to test constructor
    final EOFPacket actual = new EOFPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.status);
    Assert.assertEquals((short) -2, actual.fieldCount);
    Assert.assertEquals(0, actual.warningCount);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
