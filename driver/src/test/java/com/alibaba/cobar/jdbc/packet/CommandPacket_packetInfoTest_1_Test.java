package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.CommandPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandPacket_packetInfoTest_1_Test {
  @Test
  public void packetInfoTest() throws Exception {
    // Arrange
    CommandPacket commandPacket = new CommandPacket();
    commandPacket.arg = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    commandPacket.command = (byte) 0;
    commandPacket.packetId = (byte) 0;
    commandPacket.packetLength = 1;

    // Act
    String actual = commandPacket.packetInfo();

    // Assert
    Assert.assertEquals("MySQL Command Packet", actual);
    String toStringResult = commandPacket.toString();
    byte[] byteArray = commandPacket.arg;
    Assert.assertEquals("MySQL Command Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, commandPacket.command);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals(25, commandPacket.getPacketLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
