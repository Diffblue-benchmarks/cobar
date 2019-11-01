package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.UnknownPacketException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UnknownPacketException_UnknownPacketExceptionTest_4_Test {
  @Test
  public void UnknownPacketExceptionTest() throws Exception {
    // Arrange and Act
    UnknownPacketException unknownPacketException = new UnknownPacketException();

    // Assert
    String toStringResult = unknownPacketException.toString();
    Throwable[] suppressed = unknownPacketException.getSuppressed();
    Throwable cause = unknownPacketException.getCause();
    Assert.assertEquals("com.alibaba.cobar.jdbc.util.UnknownPacketException", toStringResult);
    Assert.assertEquals(null, unknownPacketException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
