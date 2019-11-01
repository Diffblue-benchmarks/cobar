package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.ErrorPacketException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ErrorPacketException_ErrorPacketExceptionTest_1_Test {
  @Test
  public void ErrorPacketExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";
    Throwable throwable = new Throwable();

    // Act
    ErrorPacketException errorPacketException = new ErrorPacketException(message, throwable);

    // Assert
    String toStringResult = errorPacketException.toString();
    Throwable[] suppressed = errorPacketException.getSuppressed();
    String message1 = errorPacketException.getMessage();
    Throwable cause = errorPacketException.getCause();
    Assert.assertEquals("com.alibaba.cobar.jdbc.util.ErrorPacketException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", errorPacketException.getLocalizedMessage());
    Assert.assertSame(throwable, cause);
    String toStringResult1 = cause.toString();
    Throwable[] suppressed1 = cause.getSuppressed();
    String message2 = cause.getMessage();
    Throwable cause1 = cause.getCause();
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals(null, cause1);
    Assert.assertEquals(null, message2);
    Assert.assertSame(suppressed, suppressed1);
    Assert.assertEquals("java.lang.Throwable", toStringResult1);
    Assert.assertEquals(null, cause.getLocalizedMessage());
    Assert.assertSame(cause, throwable);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
