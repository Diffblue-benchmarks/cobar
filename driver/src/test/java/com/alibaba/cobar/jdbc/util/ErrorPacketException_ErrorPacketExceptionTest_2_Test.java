package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.ErrorPacketException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ErrorPacketException_ErrorPacketExceptionTest_2_Test {
  @Test
  public void ErrorPacketExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    ErrorPacketException errorPacketException = new ErrorPacketException(message);

    // Assert
    String toStringResult = errorPacketException.toString();
    Throwable[] suppressed = errorPacketException.getSuppressed();
    String message1 = errorPacketException.getMessage();
    Throwable cause = errorPacketException.getCause();
    Assert.assertEquals("com.alibaba.cobar.jdbc.util.ErrorPacketException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", errorPacketException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
