package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.PingPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PingPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999238d66efbb326a55() {

    // Act, creating object to test constructor
    final PingPacket actual = new PingPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
