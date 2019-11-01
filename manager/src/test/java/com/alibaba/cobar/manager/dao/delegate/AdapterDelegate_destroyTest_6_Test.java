package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AdapterDelegate_destroyTest_6_Test {
  @Test
  public void destroyTest() throws Exception {
    // Arrange
    AdapterDelegate adapterDelegate = new AdapterDelegate();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    adapterDelegate.destroy();
    Assert.assertNotNull(adapterDelegate.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
