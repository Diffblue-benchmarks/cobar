package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.UrlConnection;
import java.net.UnknownHostException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class UrlConnection_connectTest_1_Test {
//failed_pass   @Test
//  public void connectTest() throws Exception {
//    // Arrange
//    UrlConnection urlConnection = new UrlConnection("aaaaa", 1, "aaaaa", "aaaaa", "aaaka");
//    int timeout = 1;
//
//    // Act and Assert
//    thrown.expect(UnknownHostException.class);
//    urlConnection.connect(timeout);
//    Assert.assertNotNull(urlConnection.toString());
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
