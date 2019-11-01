package com.alibaba.cobar.manager.service;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarAccesser_getCobarAdapterDelegateTest_1_Test {
  @Test
  public void getCobarAdapterDelegateTest() throws Exception {
    // Arrange
    CobarAccesser cobarAccesser = new CobarAccesser();

    // Act
    AdapterDelegate actual = cobarAccesser.getCobarAdapterDelegate();

    // Assert
    Assert.assertEquals(null, actual);
    String toStringResult = cobarAccesser.toString();
    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
    Assert.assertEquals(null, xmlAccesser);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
