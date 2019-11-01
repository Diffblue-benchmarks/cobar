package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.URLBroker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class URLBroker_redirectClusterListScreenTest_5_Test {
  @Test
  public void redirectClusterListScreenTest() throws Exception {
    // Arrange and Act
    String actual = URLBroker.redirectClusterListScreen();

    // Assert
    Assert.assertEquals("clusterList.htm", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
