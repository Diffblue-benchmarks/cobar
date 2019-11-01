package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.Driver;
import java.sql.Connection;
import java.util.Properties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Driver_connectTest_2_Test {
  @Test
  public void connectTest() throws Exception {
    // Arrange
    Driver driver = new Driver();
    String url = "aaaaa";
    Properties properties = new Properties();
    properties.put("aaaaa", "aaaaa");

    // Act
    Connection actual = driver.connect(url, properties);

    // Assert
    Assert.assertEquals(null, actual);
    Assert.assertEquals(1, properties.size());
    int majorVersion = driver.getMajorVersion();
    String toStringResult = driver.toString();
    Assert.assertEquals(5, majorVersion);
    Assert.assertEquals(1, driver.getMinorVersion());
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
