package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.CobarStringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarStringUtil_toSqlEscapedObjectTest_7_Test {
  @Test
  public void toSqlEscapedObjectTest() throws Exception {
    // Arrange
    String obj = "aaaaa";

    // Act
    String actual = CobarStringUtil.toSqlEscapedObject(obj);

    // Assert
    Assert.assertEquals("'aaaaa'", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
