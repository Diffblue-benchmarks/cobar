package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.UrlProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UrlProvider_getMySQLUrlTest_3_Test {
  @Test
  public void getMySQLUrlTest() throws Exception {
    // Arrange
    String url = "aaaaa";

    // Act
    String actual = UrlProvider.getMySQLUrl(url);

    // Assert
    Assert.assertEquals("aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
