package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.OkPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OkPacket_OkPacketTest_1_Test {
  @Test
  public void OkPacketTest() throws Exception {
    // Arrange and Act
    OkPacket okPacket = new OkPacket();

    // Assert
    Assert.assertEquals("MySQL OK Packet{length=0,id=0}", okPacket.toString());
    Assert.assertEquals(0, okPacket.warningCount);
    Assert.assertEquals(null, okPacket.message);
    Assert.assertEquals(0L, okPacket.insertId);
    Assert.assertEquals((byte) 0, okPacket.fieldCount);
    Assert.assertEquals(0, okPacket.serverStatus);
    Assert.assertEquals(0L, okPacket.affectedRows);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
