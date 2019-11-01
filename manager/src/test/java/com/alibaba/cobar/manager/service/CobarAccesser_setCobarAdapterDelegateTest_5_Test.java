package com.alibaba.cobar.manager.service;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarAccesser_setCobarAdapterDelegateTest_5_Test {
  @Test
  public void setCobarAdapterDelegateTest() throws Exception {
    // Arrange
    CobarAccesser cobarAccesser = new CobarAccesser();
    AdapterDelegate adapterDelegate = new AdapterDelegate();

    // Act
    cobarAccesser.setCobarAdapterDelegate(adapterDelegate);

    // Assert
    String toStringResult = cobarAccesser.toString();
    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(adapterDelegate, cobarAccesser.getCobarAdapterDelegate());
    Assert.assertEquals(null, xmlAccesser);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
