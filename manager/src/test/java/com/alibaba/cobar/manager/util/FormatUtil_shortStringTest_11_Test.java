package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FormatUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormatUtil_shortStringTest_11_Test {
  @Test
  public void shortStringTest() throws Exception {
    // Arrange
    String source = "aaaaa";
    int length = 1;

    // Act
    String actual = FormatUtil.shortString(source, length);

    // Assert
    Assert.assertEquals("...", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
