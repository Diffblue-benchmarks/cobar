package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.CobarAdapterKey;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarAdapterKey_toStringTest_1_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    CobarAdapterKey cobarAdapterKey = new CobarAdapterKey("aaaaa", 1, "aaaaa", "aaaaa");

    // Act
    String actual = cobarAdapterKey.toString();

    // Assert
    Assert.assertNotNull(actual);
    Assert.assertNotNull(cobarAdapterKey.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
