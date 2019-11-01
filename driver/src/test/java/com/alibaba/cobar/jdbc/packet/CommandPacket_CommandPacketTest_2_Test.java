package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.CommandPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandPacket_CommandPacketTest_2_Test {
  @Test
  public void CommandPacketTest() throws Exception {
    // Arrange and Act
    CommandPacket commandPacket = new CommandPacket();

    // Assert
    Assert.assertEquals("MySQL Command Packet{length=0,id=0}", commandPacket.toString());
    Assert.assertEquals((byte) 0, commandPacket.command);
    Assert.assertEquals(null, commandPacket.arg);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
