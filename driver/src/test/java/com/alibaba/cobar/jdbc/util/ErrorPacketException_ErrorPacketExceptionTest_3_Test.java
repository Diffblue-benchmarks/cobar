package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.ErrorPacketException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ErrorPacketException_ErrorPacketExceptionTest_3_Test {
  @Test
  public void ErrorPacketExceptionTest() throws Exception {
    // Arrange
    Throwable throwable = new Throwable();

    // Act
    ErrorPacketException errorPacketException = new ErrorPacketException(throwable);

    // Assert
    String toStringResult = errorPacketException.toString();
    Throwable[] suppressed = errorPacketException.getSuppressed();
    String message = errorPacketException.getMessage();
    Throwable cause = errorPacketException.getCause();
    Assert.assertEquals("com.alibaba.cobar.jdbc.util.ErrorPacketException: java.lang.Throwable", toStringResult);
    Assert.assertEquals("java.lang.Throwable", errorPacketException.getLocalizedMessage());
    Assert.assertSame(throwable, cause);
    String toStringResult1 = cause.toString();
    Throwable[] suppressed1 = cause.getSuppressed();
    String message1 = cause.getMessage();
    Throwable cause1 = cause.getCause();
    Assert.assertEquals("java.lang.Throwable", message);
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals(null, cause1);
    Assert.assertEquals(null, message1);
    Assert.assertSame(suppressed, suppressed1);
    Assert.assertEquals("java.lang.Throwable", toStringResult1);
    Assert.assertEquals(null, cause.getLocalizedMessage());
    Assert.assertSame(cause, throwable);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
