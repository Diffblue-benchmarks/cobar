package com.alibaba.cobar.manager.mock;

import com.alibaba.cobar.manager.mock.SQLEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SQLEquals_SQLEqualsTest_2_Test {
  @Test
  public void SQLEqualsTest() throws Exception {
    // Arrange
    String expectedSQL = "aaaaa";

    // Act
    SQLEquals sQLEquals = new SQLEquals(expectedSQL);

    // Assert
    String toStringResult = sQLEquals.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, sQLEquals.getLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
