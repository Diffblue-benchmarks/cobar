package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.Driver;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Driver_getParentLoggerTest_3_Test {
  @Test
  public void getParentLoggerTest() throws Exception {
    // Arrange
    Driver driver = new Driver();

    // Act and Assert
    thrown.expect(SQLFeatureNotSupportedException.class);
    driver.getParentLogger();
    int majorVersion = driver.getMajorVersion();
    String toStringResult = driver.toString();
    Assert.assertEquals(5, majorVersion);
    Assert.assertEquals(1, driver.getMinorVersion());
    Assert.assertNotNull(toStringResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
