package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.ErrorPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ErrorPacket_packetInfoTest_1_Test {
  @Test
  public void packetInfoTest() throws Exception {
    // Arrange
    ErrorPacket errorPacket = new ErrorPacket();
    errorPacket.errno = 1;
    errorPacket.fieldCount = (byte) 0;
    errorPacket.mark = (byte) 0;
    errorPacket.message = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0};
    errorPacket.packetId = (byte) 0;
    errorPacket.packetLength = 1;
    errorPacket.sqlState = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    String actual = errorPacket.packetInfo();

    // Assert
    Assert.assertEquals("MySQL Error Packet", actual);
    byte[] byteArray = errorPacket.message;
    byte[] byteArray1 = errorPacket.sqlState;
    Assert.assertEquals("MySQL Error Packet{length=1,id=0}", errorPacket.toString());
    Assert.assertEquals((byte) 0, errorPacket.fieldCount);
    Assert.assertEquals(1, errorPacket.errno);
    Assert.assertEquals(24, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 0, byteArray1[1]);
    Assert.assertEquals((byte) 0, byteArray1[2]);
    Assert.assertEquals((byte) 0, byteArray1[21]);
    Assert.assertEquals((byte) 0, byteArray1[22]);
    Assert.assertEquals((byte) 0, byteArray1[23]);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals((byte) 0, errorPacket.mark);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
