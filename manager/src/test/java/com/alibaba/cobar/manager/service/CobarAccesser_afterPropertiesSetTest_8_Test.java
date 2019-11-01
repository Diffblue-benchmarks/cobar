package com.alibaba.cobar.manager.service;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CobarAccesser_afterPropertiesSetTest_8_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    CobarAccesser cobarAccesser = new CobarAccesser();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    cobarAccesser.afterPropertiesSet();
    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
    Assert.assertEquals(null, xmlAccesser);
    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
