package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.OkPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OkPacket_packetInfoTest_2_Test {
  @Test
  public void packetInfoTest() throws Exception {
    // Arrange
    OkPacket okPacket = new OkPacket();
    okPacket.affectedRows = 1L;
    okPacket.fieldCount = (byte) 0;
    okPacket.insertId = 1L;
    okPacket.message = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    okPacket.packetId = (byte) 0;
    okPacket.packetLength = 1;
    okPacket.serverStatus = 1;
    okPacket.warningCount = 1;

    // Act
    String actual = okPacket.packetInfo();

    // Assert
    Assert.assertEquals("MySQL OK Packet", actual);
    byte[] byteArray = okPacket.message;
    Assert.assertEquals("MySQL OK Packet{length=1,id=0}", okPacket.toString());
    Assert.assertEquals(1, okPacket.warningCount);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals(1L, okPacket.insertId);
    Assert.assertEquals((byte) 0, okPacket.fieldCount);
    Assert.assertEquals(1, okPacket.serverStatus);
    Assert.assertEquals(1L, okPacket.affectedRows);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
