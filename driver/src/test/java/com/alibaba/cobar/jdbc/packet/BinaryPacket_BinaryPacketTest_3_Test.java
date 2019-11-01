package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.BinaryPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BinaryPacket_BinaryPacketTest_3_Test {
  @Test
  public void BinaryPacketTest() throws Exception {
    // Arrange and Act
    BinaryPacket binaryPacket = new BinaryPacket();

    // Assert
    Assert.assertEquals("MySQL Binary Packet{length=0,id=0}", binaryPacket.toString());
    Assert.assertEquals(null, binaryPacket.value);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
