package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.dao.delegate.DataSourceCreator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AdapterDelegate_setDsFactoryTest_1_Test {
  @Test
  public void setDsFactoryTest() throws Exception {
    // Arrange
    AdapterDelegate adapterDelegate = new AdapterDelegate();
    DataSourceCreator dataSourceCreator = new DataSourceCreator();

    // Act
    adapterDelegate.setDsFactory(dataSourceCreator);

    // Assert
    Assert.assertNotNull(dataSourceCreator.toString());
    Assert.assertNotNull(adapterDelegate.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
