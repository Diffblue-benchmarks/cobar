package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.StreamUtil;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamUtil_readLengthTest_14_Test {
  @Test
  public void readLengthTest() throws Exception {
    // Arrange
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    long actual = StreamUtil.readLength(byteArrayInputStream);

    // Assert
    Assert.assertEquals(0L, actual);
    Assert.assertNotNull(byteArrayInputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
