package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.URLBroker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class URLBroker_URLBrokerTest_3_Test {
  @Test
  public void URLBrokerTest() throws Exception {
    // Arrange and Act
    URLBroker uRLBroker = new URLBroker();

    // Assert
    Assert.assertNotNull(uRLBroker.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
