package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.MySQLMessage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MySQLMessage_readUB2Test_2_Test {
  @Test
  public void readUB2Test() throws Exception {
    // Arrange
    MySQLMessage mySQLMessage = new MySQLMessage(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    int actual = mySQLMessage.readUB2();

    // Assert
    Assert.assertEquals(0, actual);
    String toStringResult = mySQLMessage.toString();
    Assert.assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", toStringResult);
    Assert.assertTrue(mySQLMessage.hasRemaining());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
