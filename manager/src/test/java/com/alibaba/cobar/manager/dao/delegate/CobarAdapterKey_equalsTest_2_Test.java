package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.CobarAdapterKey;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarAdapterKey_equalsTest_2_Test {
  @Test
  public void equalsTest() throws Exception {
    // Arrange
    CobarAdapterKey cobarAdapterKey = new CobarAdapterKey("aaaaa", 1, "aaaaa", "aaaaa");
    String obj = "akaaa";

    // Act
    boolean actual = cobarAdapterKey.equals(obj);

    // Assert
    Assert.assertFalse(actual);
    Assert.assertNotNull(cobarAdapterKey.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
