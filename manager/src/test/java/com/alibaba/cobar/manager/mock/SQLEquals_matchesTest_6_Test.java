package com.alibaba.cobar.manager.mock;

import com.alibaba.cobar.manager.mock.SQLEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SQLEquals_matchesTest_6_Test {
  @Test
  public void matchesTest() throws Exception {
    // Arrange
    SQLEquals sQLEquals = new SQLEquals("aaaaa");
    String actualSQL = "aaaaa";

    // Act
    boolean actual = sQLEquals.matches(actualSQL);

    // Assert
    Assert.assertTrue(actual);
    String toStringResult = sQLEquals.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, sQLEquals.getLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
