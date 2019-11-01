package com.alibaba.cobar.jdbc.packet;

import com.alibaba.cobar.jdbc.packet.Reply323Packet;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Reply323Packet_writeTest_2_Test {
  @Test
  public void writeTest() throws Exception {
    // Arrange
    Reply323Packet reply323Packet = new Reply323Packet();
    reply323Packet.packetId = (byte) 0;
    reply323Packet.packetLength = 1;
    reply323Packet.seed = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0};
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    // Act
    reply323Packet.write(byteArrayOutputStream);

    // Assert
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals(
        "\u0019\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\u0000\u0000\u0000\u0000\u0000",
        toStringResult);
    Assert.assertEquals(29, byteArrayOutputStream.size());
    String toStringResult1 = reply323Packet.toString();
    byte[] byteArray = reply323Packet.seed;
    Assert.assertEquals("MySQL Auth323 Packet{length=1,id=0}", toStringResult1);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals(25, reply323Packet.getPacketLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
