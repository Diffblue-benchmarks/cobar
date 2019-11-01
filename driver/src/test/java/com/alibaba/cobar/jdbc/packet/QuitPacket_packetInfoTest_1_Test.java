package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.QuitPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QuitPacket_packetInfoTest_1_Test {
  @Test
  public void packetInfoTest() throws Exception {
    // Arrange
    QuitPacket quitPacket = new QuitPacket();
    quitPacket.packetId = (byte) 0;
    quitPacket.packetLength = 1;

    // Act
    String actual = quitPacket.packetInfo();

    // Assert
    Assert.assertEquals("MySQL Quit Packet", actual);
    Assert.assertEquals("MySQL Quit Packet{length=1,id=0}", quitPacket.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
