package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.DataSourceCreator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSourceCreator_setMinEvictableIdleTimeMillisTest_3_Test {
  @Test
  public void setMinEvictableIdleTimeMillisTest() throws Exception {
    // Arrange
    DataSourceCreator dataSourceCreator = new DataSourceCreator();
    long minEvictableIdleTimeMillis = 1L;

    // Act
    dataSourceCreator.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);

    // Assert
    Assert.assertNotNull(dataSourceCreator.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
