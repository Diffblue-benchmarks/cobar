package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.MySQLMessage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MySQLMessage_readBytesTest_3_Test {
  @Test
  public void readBytesTest() throws Exception {
    // Arrange
    MySQLMessage mySQLMessage = new MySQLMessage(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    byte[] actual = mySQLMessage.readBytes();

    // Assert
    Assert.assertEquals(24, actual.length);
    Assert.assertEquals((byte) 0, actual[0]);
    Assert.assertEquals((byte) 0, actual[1]);
    Assert.assertEquals((byte) 0, actual[2]);
    Assert.assertEquals((byte) 0, actual[3]);
    Assert.assertEquals((byte) 0, actual[4]);
    Assert.assertEquals((byte) 0, actual[5]);
    Assert.assertEquals((byte) 0, actual[18]);
    Assert.assertEquals((byte) 0, actual[19]);
    Assert.assertEquals((byte) 0, actual[20]);
    Assert.assertEquals((byte) 0, actual[21]);
    Assert.assertEquals((byte) 0, actual[22]);
    Assert.assertEquals((byte) 0, actual[23]);
    String toStringResult = mySQLMessage.toString();
    Assert.assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", toStringResult);
    Assert.assertFalse(mySQLMessage.hasRemaining());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
