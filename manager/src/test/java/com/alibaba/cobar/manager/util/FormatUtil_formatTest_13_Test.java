package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FormatUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormatUtil_formatTest_13_Test {
  @Test
  public void formatTest() throws Exception {
    // Arrange
    long l = 1L;
    int fillLength = 1;

    // Act
    String actual = FormatUtil.format(l, fillLength);

    // Assert
    Assert.assertEquals("1", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
