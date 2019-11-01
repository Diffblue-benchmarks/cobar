package com.alibaba.cobar.manager.mock;

import com.alibaba.cobar.manager.mock.SQLEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SQLEquals_setLengthTest_1_Test {
  @Test
  public void setLengthTest() throws Exception {
    // Arrange
    SQLEquals sQLEquals = new SQLEquals("aaaaa");
    int length = 1;

    // Act
    sQLEquals.setLength(length);

    // Assert
    String toStringResult = sQLEquals.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(1, sQLEquals.getLength());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
