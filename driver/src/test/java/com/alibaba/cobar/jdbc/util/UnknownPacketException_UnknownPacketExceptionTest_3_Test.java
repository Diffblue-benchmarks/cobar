package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.UnknownPacketException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UnknownPacketException_UnknownPacketExceptionTest_3_Test {
  @Test
  public void UnknownPacketExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";
    Throwable throwable = new Throwable();

    // Act
    UnknownPacketException unknownPacketException = new UnknownPacketException(message, throwable);

    // Assert
    Throwable[] suppressed = unknownPacketException.getSuppressed();
    String message1 = unknownPacketException.getMessage();
    Throwable cause = unknownPacketException.getCause();
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals("aaaaa", unknownPacketException.getLocalizedMessage());
    Assert.assertSame(throwable, cause);
    String toStringResult = cause.toString();
    Throwable[] suppressed1 = cause.getSuppressed();
    String message2 = cause.getMessage();
    Throwable cause1 = cause.getCause();
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(null, cause.getLocalizedMessage());
    Assert.assertEquals(null, cause1);
    Assert.assertEquals(null, message2);
    Assert.assertSame(suppressed, suppressed1);
    Assert.assertEquals("java.lang.Throwable", toStringResult);
    Assert.assertSame(cause, throwable);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
