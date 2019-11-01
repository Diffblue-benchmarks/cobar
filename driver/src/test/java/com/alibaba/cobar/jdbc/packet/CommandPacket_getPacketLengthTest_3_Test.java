package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.CommandPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandPacket_getPacketLengthTest_3_Test {
  @Test
  public void getPacketLengthTest() throws Exception {
    // Arrange
    CommandPacket commandPacket = new CommandPacket();
    commandPacket.arg = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    commandPacket.command = (byte) 0;
    commandPacket.packetId = (byte) 0;
    commandPacket.packetLength = 1;

    // Act
    int actual = commandPacket.getPacketLength();

    // Assert
    Assert.assertEquals(25, actual);
    byte[] byteArray = commandPacket.arg;
    Assert.assertEquals(25, commandPacket.getPacketLength());
    Assert.assertEquals((byte) 0, commandPacket.command);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
