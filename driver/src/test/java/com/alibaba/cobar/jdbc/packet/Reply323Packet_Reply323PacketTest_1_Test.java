package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.Reply323Packet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Reply323Packet_Reply323PacketTest_1_Test {
  @Test
  public void Reply323PacketTest() throws Exception {
    // Arrange and Act
    Reply323Packet reply323Packet = new Reply323Packet();

    // Assert
    String toStringResult = reply323Packet.toString();
    Assert.assertEquals("MySQL Auth323 Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(null, reply323Packet.seed);
    Assert.assertEquals(1, reply323Packet.getPacketLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
