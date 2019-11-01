package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.CobarAdapterKey;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarAdapterKey_hashCodeTest_3_Test {
  @Test
  public void hashCodeTest() throws Exception {
    // Arrange
    CobarAdapterKey cobarAdapterKey = new CobarAdapterKey("aaaaa", 1, "aaaaa", "aaaaa");

    // Act
    int actual = cobarAdapterKey.hashCode();

    // Assert
    Assert.assertEquals(97367219, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
