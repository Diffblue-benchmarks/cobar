package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.BinaryPacket;
import com.alibaba.cobar.jdbc.packet.ResultSetHeaderPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ResultSetHeaderPacket_readTest_2_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    ResultSetHeaderPacket resultSetHeaderPacket = new ResultSetHeaderPacket();
    resultSetHeaderPacket.extra = 1L;
    resultSetHeaderPacket.fieldCount = 1;
    resultSetHeaderPacket.packetId = (byte) 0;
    resultSetHeaderPacket.packetLength = 1;
    BinaryPacket binaryPacket = new BinaryPacket();
    binaryPacket.packetId = (byte) 0;
    binaryPacket.packetLength = 1;
    binaryPacket.value = (byte[]) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    resultSetHeaderPacket.read(binaryPacket);
    Assert.assertEquals("MySQL Binary Packet{length=1,id=0}", binaryPacket.toString());
    Assert.assertEquals(null, binaryPacket.value);
    Assert.assertEquals("MySQL ResultSetHeader Packet{length=1,id=0}", resultSetHeaderPacket.toString());
    Assert.assertEquals(1, resultSetHeaderPacket.fieldCount);
    Assert.assertEquals(1L, resultSetHeaderPacket.extra);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
