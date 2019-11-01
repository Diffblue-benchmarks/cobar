package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.MySQLMessage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MySQLMessage_readBytesWithNullTest_13_Test {
  @Test
  public void readBytesWithNullTest() throws Exception {
    // Arrange
    MySQLMessage mySQLMessage = new MySQLMessage(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    byte[] actual = mySQLMessage.readBytesWithNull();

    // Assert
    Assert.assertEquals(0, actual.length);
    Assert.assertArrayEquals(new byte[]{}, actual);
    Assert.assertTrue(mySQLMessage.hasRemaining());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
