package com.alibaba.cobar.manager.mock;

import com.alibaba.cobar.manager.mock.SQLEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SQLEquals_getLengthTest_3_Test {
  @Test
  public void getLengthTest() throws Exception {
    // Arrange
    SQLEquals sQLEquals = new SQLEquals("aaaaa");

    // Act
    int actual = sQLEquals.getLength();

    // Assert
    Assert.assertEquals(0, actual);
    String toStringResult = sQLEquals.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, sQLEquals.getLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
