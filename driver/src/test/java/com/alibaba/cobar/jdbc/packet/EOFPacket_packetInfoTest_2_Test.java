package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.EOFPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EOFPacket_packetInfoTest_2_Test {
  @Test
  public void packetInfoTest() throws Exception {
    // Arrange
    EOFPacket eOFPacket = new EOFPacket();
    eOFPacket.fieldCount = (byte) 0;
    eOFPacket.packetId = (byte) 0;
    eOFPacket.packetLength = 1;
    eOFPacket.status = 1;
    eOFPacket.warningCount = 1;

    // Act
    String actual = eOFPacket.packetInfo();

    // Assert
    Assert.assertEquals("MySQL EOF Packet", actual);
    Assert.assertEquals("MySQL EOF Packet{length=1,id=0}", eOFPacket.toString());
    Assert.assertEquals((byte) 0, eOFPacket.fieldCount);
    Assert.assertEquals(1, eOFPacket.status);
    Assert.assertEquals(1, eOFPacket.warningCount);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
