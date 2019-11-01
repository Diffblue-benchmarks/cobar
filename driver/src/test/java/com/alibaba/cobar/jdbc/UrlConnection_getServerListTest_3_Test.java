package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.CobarNode;
import com.alibaba.cobar.jdbc.UrlConnection;
import java.util.List;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class UrlConnection_getServerListTest_3_Test {
  @Test
  public void getServerListTest() throws Exception {
    // Arrange
    UrlConnection urlConnection = new UrlConnection("aaaaa", 1, "aaaaa", "aaaaa", "aaaka");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    urlConnection.getServerList();
    Assert.assertNotNull(urlConnection.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
