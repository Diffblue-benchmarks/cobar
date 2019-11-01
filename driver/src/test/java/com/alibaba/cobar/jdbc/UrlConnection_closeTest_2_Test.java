package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.UrlConnection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UrlConnection_closeTest_2_Test {
  @Test
  public void closeTest() throws Exception {
    // Arrange
    UrlConnection urlConnection = new UrlConnection("aaaaa", 1, "aaaaa", "aaaaa", "aaaka");

    // Act
    urlConnection.close();

    // Assert
    Assert.assertNotNull(urlConnection.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
