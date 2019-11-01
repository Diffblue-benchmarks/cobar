package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.UnknownPacketException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UnknownPacketException_UnknownPacketExceptionTest_1_Test {
  @Test
  public void UnknownPacketExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    UnknownPacketException unknownPacketException = new UnknownPacketException(message);

    // Assert
    String toStringResult = unknownPacketException.toString();
    Throwable[] suppressed = unknownPacketException.getSuppressed();
    String message1 = unknownPacketException.getMessage();
    Throwable cause = unknownPacketException.getCause();
    Assert.assertEquals("com.alibaba.cobar.jdbc.util.UnknownPacketException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", unknownPacketException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
