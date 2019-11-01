package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.UrlProvider;
import java.util.Properties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UrlProvider_getUrlTest_2_Test {
  @Test
  public void getUrlTest() throws Exception {
    // Arrange
    String url = "aaaaa";
    Properties properties = new Properties();
    properties.put("aaaaa", "aaaaa");

    // Act
    String actual = UrlProvider.getUrl(url, properties);

    // Assert
    Assert.assertEquals("aaaaa", actual);
    Assert.assertEquals(1, properties.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
