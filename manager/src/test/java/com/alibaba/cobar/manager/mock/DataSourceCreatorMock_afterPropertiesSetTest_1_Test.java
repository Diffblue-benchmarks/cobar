package com.alibaba.cobar.manager.mock;

import com.alibaba.cobar.manager.mock.DataSourceCreatorMock;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSourceCreatorMock_afterPropertiesSetTest_1_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    DataSourceCreatorMock dataSourceCreatorMock = new DataSourceCreatorMock();

    // Act
    dataSourceCreatorMock.afterPropertiesSet();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
