package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.DataSourceCreator;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSourceCreator_setMaxActiveTest_8_Test {
  @Test
  public void setMaxActiveTest() throws Exception {
    // Arrange
    DataSourceCreator dataSourceCreator = new DataSourceCreator();
    int maxActive = 1;

    // Act
    dataSourceCreator.setMaxActive(maxActive);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
