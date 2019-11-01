package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.DataSourceCreator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSourceCreator_setTimeBetweenEvictionRunsMillisTest_1_Test {
  @Test
  public void setTimeBetweenEvictionRunsMillisTest() throws Exception {
    // Arrange
    DataSourceCreator dataSourceCreator = new DataSourceCreator();
    long timeBetweenEvictionRunsMillis = 1L;

    // Act
    dataSourceCreator.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);

    // Assert
    Assert.assertNotNull(dataSourceCreator.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
