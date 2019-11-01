package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.DataSourceCreator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSourceCreator_afterPropertiesSetTest_4_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    DataSourceCreator dataSourceCreator = new DataSourceCreator();

    // Act
    dataSourceCreator.afterPropertiesSet();

    // Assert
    Assert.assertNotNull(dataSourceCreator.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
