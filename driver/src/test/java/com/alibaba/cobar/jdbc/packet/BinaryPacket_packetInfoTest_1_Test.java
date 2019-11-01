package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.BinaryPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BinaryPacket_packetInfoTest_1_Test {
  @Test
  public void packetInfoTest() throws Exception {
    // Arrange
    BinaryPacket binaryPacket = new BinaryPacket();
    binaryPacket.packetId = (byte) 0;
    binaryPacket.packetLength = 1;
    binaryPacket.value = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0};

    // Act
    String actual = binaryPacket.packetInfo();

    // Assert
    Assert.assertEquals("MySQL Binary Packet", actual);
    byte[] byteArray = binaryPacket.value;
    Assert.assertEquals("MySQL Binary Packet{length=1,id=0}", binaryPacket.toString());
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
