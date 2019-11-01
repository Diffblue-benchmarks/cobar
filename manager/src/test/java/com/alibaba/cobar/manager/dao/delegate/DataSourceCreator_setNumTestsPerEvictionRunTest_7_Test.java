package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.DataSourceCreator;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSourceCreator_setNumTestsPerEvictionRunTest_7_Test {
  @Test
  public void setNumTestsPerEvictionRunTest() throws Exception {
    // Arrange
    DataSourceCreator dataSourceCreator = new DataSourceCreator();
    int numTestsPerEvictionRun = 1;

    // Act
    dataSourceCreator.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
