package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.MySQLMessage;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class MySQLMessage_readBytesTest_12_Test {
  @Test
  public void readBytesTest() throws Exception {
    // Arrange
    MySQLMessage mySQLMessage = new MySQLMessage(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    int length = 655361;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    mySQLMessage.readBytes(length);
    String toStringResult = mySQLMessage.toString();
    Assert.assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", toStringResult);
    Assert.assertTrue(mySQLMessage.hasRemaining());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
