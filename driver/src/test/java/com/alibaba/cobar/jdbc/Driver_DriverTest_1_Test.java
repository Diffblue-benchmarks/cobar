package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Driver_DriverTest_1_Test {
  @Test
  public void DriverTest() throws Exception {
    // Arrange and Act
    Driver driver = new Driver();

    // Assert
    String toStringResult = driver.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(1, driver.getMinorVersion());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
