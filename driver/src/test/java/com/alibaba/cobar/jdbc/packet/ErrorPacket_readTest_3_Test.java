package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.BinaryPacket;
import com.alibaba.cobar.jdbc.packet.ErrorPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ErrorPacket_readTest_3_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    ErrorPacket errorPacket = new ErrorPacket();
    errorPacket.errno = 1;
    errorPacket.fieldCount = (byte) 0;
    errorPacket.mark = (byte) 0;
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0};
    errorPacket.message = byteArray;
    errorPacket.packetId = (byte) 0;
    errorPacket.packetLength = 1;
    errorPacket.sqlState = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0};
    BinaryPacket binaryPacket = new BinaryPacket();
    binaryPacket.packetId = (byte) 0;
    binaryPacket.packetLength = 1;
    binaryPacket.value = byteArray;

    // Act
    errorPacket.read(binaryPacket);

    // Assert
    byte[] byteArray1 = binaryPacket.value;
    Assert.assertEquals("MySQL Binary Packet{length=1,id=0}", binaryPacket.toString());
    Assert.assertEquals(24, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 0, byteArray1[1]);
    Assert.assertEquals((byte) 0, byteArray1[2]);
    Assert.assertEquals((byte) 0, byteArray1[21]);
    Assert.assertEquals((byte) 0, byteArray1[22]);
    Assert.assertEquals((byte) 0, byteArray1[23]);
    byte[] byteArray2 = errorPacket.message;
    byte[] byteArray3 = errorPacket.sqlState;
    Assert.assertEquals("MySQL Error Packet{length=1,id=0}", errorPacket.toString());
    Assert.assertEquals((byte) 0, errorPacket.fieldCount);
    Assert.assertEquals(0, errorPacket.errno);
    Assert.assertEquals(24, byteArray3.length);
    Assert.assertEquals((byte) 0, byteArray3[0]);
    Assert.assertEquals((byte) 0, byteArray3[1]);
    Assert.assertEquals((byte) 0, byteArray3[2]);
    Assert.assertEquals((byte) 0, byteArray3[21]);
    Assert.assertEquals((byte) 0, byteArray3[22]);
    Assert.assertEquals((byte) 0, byteArray3[23]);
    Assert.assertEquals(21, byteArray2.length);
    Assert.assertEquals((byte) 0, byteArray2[0]);
    Assert.assertEquals((byte) 0, byteArray2[1]);
    Assert.assertEquals((byte) 0, byteArray2[2]);
    Assert.assertEquals((byte) 0, byteArray2[18]);
    Assert.assertEquals((byte) 0, byteArray2[19]);
    Assert.assertEquals((byte) 0, byteArray2[20]);
    Assert.assertEquals((byte) 0, errorPacket.mark);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
