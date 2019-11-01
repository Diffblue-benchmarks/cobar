package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.UrlProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UrlProvider_UrlProviderTest_1_Test {
  @Test
  public void UrlProviderTest() throws Exception {
    // Arrange and Act
    UrlProvider urlProvider = new UrlProvider();

    // Assert
    Assert.assertNotNull(urlProvider.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
