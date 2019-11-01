package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FormatUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormatUtil_formatTest_12_Test {
  @Test
  public void formatTest() throws Exception {
    // Arrange
    String s = "aaaaa";
    int fillLength = 1;

    // Act
    String actual = FormatUtil.format(s, fillLength);

    // Assert
    Assert.assertEquals("aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
