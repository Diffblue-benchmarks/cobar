package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.AuthPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AuthPacket_AuthPacketTest_2_Test {
  @Test
  public void AuthPacketTest() throws Exception {
    // Arrange and Act
    AuthPacket authPacket = new AuthPacket();

    // Assert
    String toStringResult = authPacket.toString();
    Assert.assertEquals("MySQL Authentication Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(null, authPacket.user);
    Assert.assertEquals(0L, authPacket.clientFlags);
    Assert.assertEquals(0L, authPacket.maxPacketSize);
    Assert.assertEquals(0, authPacket.charsetIndex);
    Assert.assertEquals(null, authPacket.database);
    Assert.assertEquals(null, authPacket.password);
    Assert.assertEquals(35, authPacket.getPacketLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
