package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.BinaryPacket;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BinaryPacket_readTest_2_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    BinaryPacket binaryPacket = new BinaryPacket();
    binaryPacket.packetId = (byte) 0;
    binaryPacket.packetLength = 1;
    binaryPacket.value = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0};
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0});

    // Act
    binaryPacket.read(byteArrayInputStream);

    // Assert
    int availableResult = byteArrayInputStream.available();
    Assert.assertEquals(20, availableResult);
    Assert.assertNotNull(byteArrayInputStream.toString());
    byte[] byteArray = binaryPacket.value;
    Assert.assertEquals("MySQL Binary Packet{length=0,id=0}", binaryPacket.toString());
    Assert.assertEquals(0, byteArray.length);
    Assert.assertArrayEquals(new byte[]{}, byteArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
