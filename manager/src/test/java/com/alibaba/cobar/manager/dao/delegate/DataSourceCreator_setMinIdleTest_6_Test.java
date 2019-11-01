package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.DataSourceCreator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSourceCreator_setMinIdleTest_6_Test {
  @Test
  public void setMinIdleTest() throws Exception {
    // Arrange
    DataSourceCreator dataSourceCreator = new DataSourceCreator();
    int minIdle = 1;

    // Act
    dataSourceCreator.setMinIdle(minIdle);

    // Assert
    Assert.assertNotNull(dataSourceCreator.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
