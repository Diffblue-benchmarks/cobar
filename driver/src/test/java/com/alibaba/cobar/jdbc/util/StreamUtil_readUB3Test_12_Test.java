package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.StreamUtil;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamUtil_readUB3Test_12_Test {
  @Test
  public void readUB3Test() throws Exception {
    // Arrange
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    int actual = StreamUtil.readUB3(byteArrayInputStream);

    // Assert
    Assert.assertEquals(0, actual);
    int availableResult = byteArrayInputStream.available();
    Assert.assertEquals(21, availableResult);
    Assert.assertNotNull(byteArrayInputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
