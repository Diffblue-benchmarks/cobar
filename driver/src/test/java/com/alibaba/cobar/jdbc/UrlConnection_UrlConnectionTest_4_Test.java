package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.UrlConnection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UrlConnection_UrlConnectionTest_4_Test {
  @Test
  public void UrlConnectionTest() throws Exception {
    // Arrange
    String host = "aaaaa";
    int port = 1;
    String user = "aaaaa";
    String password = "aaaaa";
    String database = "aaaaa";

    // Act
    UrlConnection urlConnection = new UrlConnection(host, port, user, password, database);

    // Assert
    Assert.assertNotNull(urlConnection.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
