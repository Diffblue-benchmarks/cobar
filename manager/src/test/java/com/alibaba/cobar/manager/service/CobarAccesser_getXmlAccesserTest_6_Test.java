package com.alibaba.cobar.manager.service;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarAccesser_getXmlAccesserTest_6_Test {
  @Test
  public void getXmlAccesserTest() throws Exception {
    // Arrange
    CobarAccesser cobarAccesser = new CobarAccesser();

    // Act
    XmlAccesser actual = cobarAccesser.getXmlAccesser();

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
