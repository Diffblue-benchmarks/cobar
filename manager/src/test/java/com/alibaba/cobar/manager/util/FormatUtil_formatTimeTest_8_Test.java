package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FormatUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormatUtil_formatTimeTest_8_Test {
  @Test
  public void formatTimeTest() throws Exception {
    // Arrange
    long millis = 1L;
    int precision = 1;

    // Act
    String actual = FormatUtil.formatTime(millis, precision);

    // Assert
    Assert.assertEquals("1ms", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
