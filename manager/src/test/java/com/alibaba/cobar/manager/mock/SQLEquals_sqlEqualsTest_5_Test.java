package com.alibaba.cobar.manager.mock;

import com.alibaba.cobar.manager.mock.SQLEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SQLEquals_sqlEqualsTest_5_Test {
  @Test
  public void sqlEqualsTest() throws Exception {
    // Arrange
    String in = "aaaaa";

    // Act
    String actual = SQLEquals.sqlEquals(in);

    // Assert
    Assert.assertEquals("aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
