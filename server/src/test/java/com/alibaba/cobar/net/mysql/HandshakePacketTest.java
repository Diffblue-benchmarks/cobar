package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.HandshakePacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class HandshakePacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b362e1739c3ce29c() {

    // Act, creating object to test constructor
    final HandshakePacket actual = new HandshakePacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals((short) 0, actual.serverCharsetIndex);
    Assert.assertEquals(0, actual.serverCapabilities);
    Assert.assertEquals(0L, actual.threadId);
    Assert.assertEquals(0, actual.serverStatus);
    Assert.assertNull(actual.seed);
    Assert.assertEquals((short) 0, actual.protocolVersion);
    Assert.assertNull(actual.restOfScrambleBuff);
    Assert.assertNull(actual.serverVersion);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
