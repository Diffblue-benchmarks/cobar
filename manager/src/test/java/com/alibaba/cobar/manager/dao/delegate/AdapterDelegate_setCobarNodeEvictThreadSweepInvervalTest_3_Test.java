package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AdapterDelegate_setCobarNodeEvictThreadSweepInvervalTest_3_Test {
  @Test
  public void setCobarNodeEvictThreadSweepInvervalTest() throws Exception {
    // Arrange
    AdapterDelegate adapterDelegate = new AdapterDelegate();
    long cobarNodeEvictThreadSweepInverval = 1L;

    // Act
    adapterDelegate.setCobarNodeEvictThreadSweepInverval(cobarNodeEvictThreadSweepInverval);

    // Assert
    Assert.assertNotNull(adapterDelegate.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
