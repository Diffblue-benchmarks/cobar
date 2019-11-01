package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FormatUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormatUtil_formatVersionTest_3_Test {
  @Test
  public void formatVersionTest() throws Exception {
    // Arrange
    String src = "aaaaa";

    // Act
    String actual = FormatUtil.formatVersion(src);

    // Assert
    Assert.assertEquals("aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
