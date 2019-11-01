package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.MySQLMessage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MySQLMessage_positionTest_5_Test {
  @Test
  public void positionTest() throws Exception {
    // Arrange
    MySQLMessage mySQLMessage = new MySQLMessage(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    int actual = mySQLMessage.position();

    // Assert
    Assert.assertEquals(0, actual);
    Assert.assertTrue(mySQLMessage.hasRemaining());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
