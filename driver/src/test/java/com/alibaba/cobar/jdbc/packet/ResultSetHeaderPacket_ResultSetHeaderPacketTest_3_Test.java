package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.ResultSetHeaderPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ResultSetHeaderPacket_ResultSetHeaderPacketTest_3_Test {
  @Test
  public void ResultSetHeaderPacketTest() throws Exception {
    // Arrange and Act
    ResultSetHeaderPacket resultSetHeaderPacket = new ResultSetHeaderPacket();

    // Assert
    Assert.assertEquals("MySQL ResultSetHeader Packet{length=0,id=0}", resultSetHeaderPacket.toString());
    Assert.assertEquals(0, resultSetHeaderPacket.fieldCount);
    Assert.assertEquals(0L, resultSetHeaderPacket.extra);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
