package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.AuthPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AuthPacket_packetInfoTest_1_Test {
  @Test
  public void packetInfoTest() throws Exception {
    // Arrange
    AuthPacket authPacket = new AuthPacket();
    authPacket.charsetIndex = 1;
    authPacket.clientFlags = 1L;
    authPacket.database = "aaaaa";
    authPacket.maxPacketSize = 1L;
    authPacket.packetId = (byte) 0;
    authPacket.packetLength = 1;
    authPacket.password = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    authPacket.user = "aakaa";

    // Act
    String actual = authPacket.packetInfo();

    // Assert
    Assert.assertEquals("MySQL Authentication Packet", actual);
    String toStringResult = authPacket.toString();
    byte[] byteArray = authPacket.password;
    Assert.assertEquals("MySQL Authentication Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals("aakaa", authPacket.user);
    Assert.assertEquals(1L, authPacket.clientFlags);
    Assert.assertEquals(1L, authPacket.maxPacketSize);
    Assert.assertEquals(1, authPacket.charsetIndex);
    Assert.assertEquals("aaaaa", authPacket.database);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals(69, authPacket.getPacketLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
