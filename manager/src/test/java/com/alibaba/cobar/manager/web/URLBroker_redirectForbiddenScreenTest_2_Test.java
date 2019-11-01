package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.URLBroker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class URLBroker_redirectForbiddenScreenTest_2_Test {
  @Test
  public void redirectForbiddenScreenTest() throws Exception {
    // Arrange and Act
    String actual = URLBroker.redirectForbiddenScreen();

    // Assert
    Assert.assertEquals("forbidden.htm", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
