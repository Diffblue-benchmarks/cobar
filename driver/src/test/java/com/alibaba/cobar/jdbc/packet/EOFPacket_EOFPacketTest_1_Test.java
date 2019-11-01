package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.EOFPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EOFPacket_EOFPacketTest_1_Test {
  @Test
  public void EOFPacketTest() throws Exception {
    // Arrange and Act
    EOFPacket eOFPacket = new EOFPacket();

    // Assert
    Assert.assertEquals("MySQL EOF Packet{length=0,id=0}", eOFPacket.toString());
    Assert.assertEquals((byte) -2, eOFPacket.fieldCount);
    Assert.assertEquals(2, eOFPacket.status);
    Assert.assertEquals(0, eOFPacket.warningCount);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
