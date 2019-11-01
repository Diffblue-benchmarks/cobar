package com.alibaba.cobar.manager.service;

import com.alibaba.cobar.manager.dao.CobarAdapterDAO;
import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CobarAccesser_getAccesserTest_7_Test {
  @Test
  public void getAccesserTest() throws Exception {
    // Arrange
    CobarAccesser cobarAccesser = new CobarAccesser();
    long cobarId = 1L;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cobarAccesser.getAccesser(cobarId);
    String toStringResult = cobarAccesser.toString();
    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
    Assert.assertEquals(null, xmlAccesser);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
