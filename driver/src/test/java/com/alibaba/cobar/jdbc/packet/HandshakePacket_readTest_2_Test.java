package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.BinaryPacket;
import com.alibaba.cobar.jdbc.packet.HandshakePacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakePacket_readTest_2_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    HandshakePacket handshakePacket = new HandshakePacket();
    handshakePacket.packetId = (byte) 0;
    handshakePacket.packetLength = 1;
    handshakePacket.protocolVersion = (byte) 0;
    handshakePacket.restOfScrambleBuff = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0,
        0, 0};
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0};
    handshakePacket.seed = byteArray;
    handshakePacket.serverCapabilities = 1;
    handshakePacket.serverCharsetIndex = (byte) 0;
    handshakePacket.serverStatus = 1;
    handshakePacket.serverVersion = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0};
    handshakePacket.threadId = 1L;
    BinaryPacket binaryPacket = new BinaryPacket();
    binaryPacket.packetId = (byte) 0;
    binaryPacket.packetLength = 1;
    binaryPacket.value = byteArray;

    // Act
    handshakePacket.read(binaryPacket);

    // Assert
    byte[] byteArray1 = binaryPacket.value;
    Assert.assertEquals("MySQL Binary Packet{length=1,id=0}", binaryPacket.toString());
    Assert.assertEquals(24, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 0, byteArray1[1]);
    Assert.assertEquals((byte) 0, byteArray1[2]);
    Assert.assertEquals((byte) 0, byteArray1[21]);
    Assert.assertEquals((byte) 10, byteArray1[22]);
    Assert.assertEquals((byte) 0, byteArray1[23]);
    byte[] byteArray2 = handshakePacket.seed;
    byte[] byteArray3 = handshakePacket.restOfScrambleBuff;
    byte[] byteArray4 = handshakePacket.serverVersion;
    Assert.assertEquals("MySQL Handshake Packet{length=1,id=0}", handshakePacket.toString());
    Assert.assertEquals(0, handshakePacket.serverStatus);
    Assert.assertEquals(0, byteArray4.length);
    Assert.assertArrayEquals(new byte[]{}, byteArray4);
    Assert.assertEquals((byte) 0, handshakePacket.serverCharsetIndex);
    Assert.assertEquals(0L, handshakePacket.threadId);
    Assert.assertEquals(0, handshakePacket.serverCapabilities);
    Assert.assertEquals(0, byteArray3.length);
    Assert.assertArrayEquals(new byte[]{}, byteArray3);
    Assert.assertEquals(0, byteArray2.length);
    Assert.assertArrayEquals(new byte[]{}, byteArray2);
    Assert.assertEquals((byte) 0, handshakePacket.protocolVersion);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
