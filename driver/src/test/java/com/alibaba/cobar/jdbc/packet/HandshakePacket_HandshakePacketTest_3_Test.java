package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.HandshakePacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakePacket_HandshakePacketTest_3_Test {
  @Test
  public void HandshakePacketTest() throws Exception {
    // Arrange and Act
    HandshakePacket handshakePacket = new HandshakePacket();

    // Assert
    Assert.assertEquals("MySQL Handshake Packet{length=0,id=0}", handshakePacket.toString());
    Assert.assertEquals(0, handshakePacket.serverStatus);
    Assert.assertEquals(null, handshakePacket.serverVersion);
    Assert.assertEquals((byte) 0, handshakePacket.serverCharsetIndex);
    Assert.assertEquals(0L, handshakePacket.threadId);
    Assert.assertEquals(0, handshakePacket.serverCapabilities);
    Assert.assertEquals(null, handshakePacket.restOfScrambleBuff);
    Assert.assertEquals(null, handshakePacket.seed);
    Assert.assertEquals((byte) 0, handshakePacket.protocolVersion);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
