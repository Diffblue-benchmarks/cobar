package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.ErrorPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ErrorPacket_ErrorPacketTest_2_Test {
  @Test
  public void ErrorPacketTest() throws Exception {
    // Arrange and Act
    ErrorPacket errorPacket = new ErrorPacket();

    // Assert
    byte[] byteArray = errorPacket.sqlState;
    Assert.assertEquals("MySQL Error Packet{length=0,id=0}", errorPacket.toString());
    Assert.assertEquals((byte) -1, errorPacket.fieldCount);
    Assert.assertEquals(0, errorPacket.errno);
    Assert.assertEquals(5, byteArray.length);
    Assert.assertArrayEquals(new byte[]{72, 89, 48, 48, 48}, byteArray);
    Assert.assertEquals(null, errorPacket.message);
    Assert.assertEquals((byte) 35, errorPacket.mark);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
