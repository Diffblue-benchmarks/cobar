package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.CobarStringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarStringUtil_toSqlEscapedStringTest_6_Test {
  @Test
  public void toSqlEscapedStringTest() throws Exception {
    // Arrange
    String obj = "aaaaa";

    // Act
    String actual = CobarStringUtil.toSqlEscapedString(obj);

    // Assert
    Assert.assertEquals("'aaaaa'", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
