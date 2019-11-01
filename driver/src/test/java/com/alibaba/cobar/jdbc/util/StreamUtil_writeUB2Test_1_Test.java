package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.StreamUtil;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamUtil_writeUB2Test_1_Test {
  @Test
  public void writeUB2Test() throws Exception {
    // Arrange
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int i = 1;

    // Act
    StreamUtil.writeUB2(byteArrayOutputStream, i);

    // Assert
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("\u0001\u0000", toStringResult);
    Assert.assertEquals(2, byteArrayOutputStream.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
