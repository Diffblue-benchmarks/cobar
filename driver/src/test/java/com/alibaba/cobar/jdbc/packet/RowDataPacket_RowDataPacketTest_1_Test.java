package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.RowDataPacket;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RowDataPacket_RowDataPacketTest_1_Test {
  @Test
  public void RowDataPacketTest() throws Exception {
    // Arrange
    int fieldCount = 1;

    // Act
    RowDataPacket rowDataPacket = new RowDataPacket(fieldCount);

    // Assert
    List<byte[]> list = rowDataPacket.fieldValues;
    Assert.assertEquals("MySQL RowData Packet{length=0,id=0}", rowDataPacket.toString());
    Assert.assertEquals(1, rowDataPacket.fieldCount);
    Assert.assertTrue(list instanceof java.util.ArrayList);
    Assert.assertEquals(0, list.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
