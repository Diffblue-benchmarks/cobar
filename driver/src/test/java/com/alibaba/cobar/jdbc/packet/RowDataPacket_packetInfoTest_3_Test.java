package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.RowDataPacket;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RowDataPacket_packetInfoTest_3_Test {
  @Test
  public void packetInfoTest() throws Exception {
    // Arrange
    RowDataPacket rowDataPacket = new RowDataPacket(1);
    rowDataPacket.packetId = (byte) 0;
    rowDataPacket.packetLength = 1;

    // Act
    String actual = rowDataPacket.packetInfo();

    // Assert
    Assert.assertEquals("MySQL RowData Packet", actual);
    List<byte[]> list = rowDataPacket.fieldValues;
    Assert.assertEquals("MySQL RowData Packet{length=1,id=0}", rowDataPacket.toString());
    Assert.assertEquals(1, rowDataPacket.fieldCount);
    Assert.assertTrue(list instanceof java.util.ArrayList);
    Assert.assertEquals(0, list.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
