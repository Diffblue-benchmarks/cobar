package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AdapterDelegate_setCobarNodeAdapterIdleTimeTest_7_Test {
  @Test
  public void setCobarNodeAdapterIdleTimeTest() throws Exception {
    // Arrange
    AdapterDelegate adapterDelegate = new AdapterDelegate();
    long cobarNodeAdapterIdleTime = 1L;

    // Act
    adapterDelegate.setCobarNodeAdapterIdleTime(cobarNodeAdapterIdleTime);

    // Assert
    Assert.assertNotNull(adapterDelegate.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
