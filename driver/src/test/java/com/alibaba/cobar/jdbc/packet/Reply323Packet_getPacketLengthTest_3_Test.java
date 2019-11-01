package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.Reply323Packet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Reply323Packet_getPacketLengthTest_3_Test {
  @Test
  public void getPacketLengthTest() throws Exception {
    // Arrange
    Reply323Packet reply323Packet = new Reply323Packet();
    reply323Packet.packetId = (byte) 0;
    reply323Packet.packetLength = 1;
    reply323Packet.seed = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0};

    // Act
    int actual = reply323Packet.getPacketLength();

    // Assert
    Assert.assertEquals(25, actual);
    byte[] byteArray = reply323Packet.seed;
    Assert.assertEquals(25, reply323Packet.getPacketLength());
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
