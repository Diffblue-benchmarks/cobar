package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.StreamUtil;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamUtil_writeTest_9_Test {
  @Test
  public void writeTest() throws Exception {
    // Arrange
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte b = (byte) 0;

    // Act
    StreamUtil.write(byteArrayOutputStream, b);

    // Assert
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("\u0000", toStringResult);
    Assert.assertEquals(1, byteArrayOutputStream.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
