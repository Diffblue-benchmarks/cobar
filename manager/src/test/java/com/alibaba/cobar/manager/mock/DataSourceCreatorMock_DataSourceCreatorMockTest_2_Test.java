package com.alibaba.cobar.manager.mock;

import com.alibaba.cobar.manager.mock.DataSourceCreatorMock;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSourceCreatorMock_DataSourceCreatorMockTest_2_Test {
  @Test
  public void DataSourceCreatorMockTest() throws Exception {
    // Arrange and Act
    new DataSourceCreatorMock();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
