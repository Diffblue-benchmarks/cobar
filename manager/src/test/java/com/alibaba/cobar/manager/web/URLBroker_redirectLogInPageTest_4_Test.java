package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.URLBroker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class URLBroker_redirectLogInPageTest_4_Test {
  @Test
  public void redirectLogInPageTest() throws Exception {
    // Arrange
    String result = "aaaaa";

    // Act
    String actual = URLBroker.redirectLogInPage(result);

    // Assert
    Assert.assertEquals("login.htm?result=aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
