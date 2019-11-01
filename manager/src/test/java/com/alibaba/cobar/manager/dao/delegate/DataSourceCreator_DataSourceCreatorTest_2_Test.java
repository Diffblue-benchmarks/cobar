package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.DataSourceCreator;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSourceCreator_DataSourceCreatorTest_2_Test {
  @Test
  public void DataSourceCreatorTest() throws Exception {
    // Arrange and Act
    new DataSourceCreator();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
