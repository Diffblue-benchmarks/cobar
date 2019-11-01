package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Driver_acceptsURLTest_4_Test {
  @Test
  public void acceptsURLTest() throws Exception {
    // Arrange
    Driver driver = new Driver();
    String url = "aaaaa";

    // Act
    boolean actual = driver.acceptsURL(url);

    // Assert
    Assert.assertFalse(actual);
    int majorVersion = driver.getMajorVersion();
    String toStringResult = driver.toString();
    Assert.assertEquals(5, majorVersion);
    Assert.assertEquals(1, driver.getMinorVersion());
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
