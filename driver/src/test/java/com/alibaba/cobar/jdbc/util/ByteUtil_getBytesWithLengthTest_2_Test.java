package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.ByteUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteUtil_getBytesWithLengthTest_2_Test {
  @Test
  public void getBytesWithLengthTest() throws Exception {
    // Arrange
    int length = 1;

    // Act
    byte[] actual = ByteUtil.getBytesWithLength(length);

    // Assert
    Assert.assertEquals(1, actual.length);
    Assert.assertArrayEquals(new byte[]{1}, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
