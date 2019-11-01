package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.ResultSetHeaderPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ResultSetHeaderPacket_packetInfoTest_1_Test {
  @Test
  public void packetInfoTest() throws Exception {
    // Arrange
    ResultSetHeaderPacket resultSetHeaderPacket = new ResultSetHeaderPacket();
    resultSetHeaderPacket.extra = 1L;
    resultSetHeaderPacket.fieldCount = 1;
    resultSetHeaderPacket.packetId = (byte) 0;
    resultSetHeaderPacket.packetLength = 1;

    // Act
    String actual = resultSetHeaderPacket.packetInfo();

    // Assert
    Assert.assertEquals("MySQL ResultSetHeader Packet", actual);
    Assert.assertEquals("MySQL ResultSetHeader Packet{length=1,id=0}", resultSetHeaderPacket.toString());
    Assert.assertEquals(1, resultSetHeaderPacket.fieldCount);
    Assert.assertEquals(1L, resultSetHeaderPacket.extra);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
