package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.URLBroker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class URLBroker_redirectIndexPageTest_1_Test {
  @Test
  public void redirectIndexPageTest() throws Exception {
    // Arrange
    String result = "aaaaa";

    // Act
    String actual = URLBroker.redirectIndexPage(result);

    // Assert
    Assert.assertEquals("index.htm?result=aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
