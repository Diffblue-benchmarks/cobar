package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.StreamUtil;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamUtil_readLongTest_10_Test {
  @Test
  public void readLongTest() throws Exception {
    // Arrange
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    long actual = StreamUtil.readLong(byteArrayInputStream);

    // Assert
    Assert.assertEquals(0L, actual);
    int availableResult = byteArrayInputStream.available();
    Assert.assertEquals(16, availableResult);
    Assert.assertNotNull(byteArrayInputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
