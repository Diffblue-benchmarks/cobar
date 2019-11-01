package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.BinaryPacket;
import com.alibaba.cobar.jdbc.packet.RowDataPacket;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RowDataPacket_readTest_2_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    RowDataPacket rowDataPacket = new RowDataPacket(1);
    rowDataPacket.packetId = (byte) 0;
    rowDataPacket.packetLength = 1;
    BinaryPacket binaryPacket = new BinaryPacket();
    binaryPacket.packetId = (byte) 0;
    binaryPacket.packetLength = 1;
    binaryPacket.value = new byte[]{0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    rowDataPacket.read(binaryPacket);

    // Assert
    byte[] byteArray = binaryPacket.value;
    Assert.assertEquals("MySQL Binary Packet{length=1,id=0}", binaryPacket.toString());
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    List<byte[]> list = rowDataPacket.fieldValues;
    Assert.assertEquals("MySQL RowData Packet{length=1,id=0}", rowDataPacket.toString());
    Assert.assertEquals(1, rowDataPacket.fieldCount);
    Assert.assertTrue(list instanceof java.util.ArrayList);
    Assert.assertEquals(1, list.size());
    byte[] getResult = list.get(0);
    Assert.assertEquals(0, getResult.length);
    Assert.assertArrayEquals(new byte[]{}, getResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
