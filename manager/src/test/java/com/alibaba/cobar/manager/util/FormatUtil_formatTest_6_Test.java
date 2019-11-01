package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FormatUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormatUtil_formatTest_6_Test {
  @Test
  public void formatTest() throws Exception {
    // Arrange
    int i = 1;
    int fillLength = 1;

    // Act
    String actual = FormatUtil.format(i, fillLength);

    // Assert
    Assert.assertEquals("1", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
