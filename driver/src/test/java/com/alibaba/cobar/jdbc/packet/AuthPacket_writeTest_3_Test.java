package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.AuthPacket;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AuthPacket_writeTest_3_Test {
  @Test
  public void writeTest() throws Exception {
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
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    // Act
    authPacket.write(byteArrayOutputStream);

    // Assert
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals(
        "E\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u00051.0.0\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000aakaa\u0000\u0018\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000aaaaa\u0000",
        toStringResult);
    Assert.assertEquals(73, byteArrayOutputStream.size());
    String toStringResult1 = authPacket.toString();
    byte[] byteArray = authPacket.password;
    Assert.assertEquals("MySQL Authentication Packet{length=1,id=0}", toStringResult1);
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
