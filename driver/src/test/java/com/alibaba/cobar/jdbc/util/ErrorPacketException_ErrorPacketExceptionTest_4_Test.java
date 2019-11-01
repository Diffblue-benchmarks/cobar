package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.ErrorPacketException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ErrorPacketException_ErrorPacketExceptionTest_4_Test {
  @Test
  public void ErrorPacketExceptionTest() throws Exception {
    // Arrange and Act
    ErrorPacketException errorPacketException = new ErrorPacketException();

    // Assert
    String toStringResult = errorPacketException.toString();
    Throwable[] suppressed = errorPacketException.getSuppressed();
    String message = errorPacketException.getMessage();
    Throwable cause = errorPacketException.getCause();
    Assert.assertEquals("com.alibaba.cobar.jdbc.util.ErrorPacketException", toStringResult);
    Assert.assertEquals(null, errorPacketException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
