package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AdapterDelegate_AdapterDelegateTest_2_Test {
  @Test
  public void AdapterDelegateTest() throws Exception {
    // Arrange and Act
    AdapterDelegate adapterDelegate = new AdapterDelegate();

    // Assert
    Assert.assertNotNull(adapterDelegate.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
