package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FormatUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormatUtil_formatNumberTest_5_Test {
  @Test
  public void formatNumberTest() throws Exception {
    // Arrange
    long number = 1L;

    // Act
    String actual = FormatUtil.formatNumber(number);

    // Assert
    Assert.assertEquals("1", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
