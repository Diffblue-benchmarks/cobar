package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.CobarStringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarStringUtil_htmlEscapedStringTest_3_Test {
  @Test
  public void htmlEscapedStringTest() throws Exception {
    // Arrange
    String str = "aaaaa";

    // Act
    String actual = CobarStringUtil.htmlEscapedString(str);

    // Assert
    Assert.assertEquals("aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
