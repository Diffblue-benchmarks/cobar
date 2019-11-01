package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.BinaryPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BinaryPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999975b2a11a65723e2() {

    // Act, creating object to test constructor
    final BinaryPacket actual = new BinaryPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.data);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
