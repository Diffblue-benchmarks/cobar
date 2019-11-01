package com.alibaba.cobar.config.model;

import com.alibaba.cobar.config.model.DataNodeConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DataNodeConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996873b5664e9d6a65() {

    // Act, creating object to test constructor
    final DataNodeConfig actual = new DataNodeConfig();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(600000L, actual.getIdleTimeout());
    Assert.assertEquals(10000L, actual.getWaitTimeout());
    Assert.assertEquals(30000L, actual.getHeartbeatTimeout());
    Assert.assertEquals(128, actual.getPoolSize());
    Assert.assertNull(actual.getName());
    Assert.assertNull(actual.getDataSource());
    Assert.assertNull(actual.getHeartbeatSQL());
    Assert.assertEquals(10, actual.getHeartbeatRetry());

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataSourceOutputVoid999e20171b1b86a59f7() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();

    // Act
    final String actual = thisObj.getDataSource();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeartbeatRetryOutputPositive9996c8b0501970f35d1() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();

    // Act
    final int actual = thisObj.getHeartbeatRetry();

    // Assert result
    Assert.assertEquals(10, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeartbeatSQLOutputVoid9994395682e1b8c067c() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();

    // Act
    final String actual = thisObj.getHeartbeatSQL();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeartbeatTimeoutOutputPositive99930cdace6b8ecf2cd() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();

    // Act
    final long actual = thisObj.getHeartbeatTimeout();

    // Assert result
    Assert.assertEquals(30000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getIdleTimeoutOutputPositive999909a39d3eb37ff8b() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();

    // Act
    final long actual = thisObj.getIdleTimeout();

    // Assert result
    Assert.assertEquals(600000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputVoid9999b3699f4aadf8e92() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();

    // Act
    final String actual = thisObj.getName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPoolSizeOutputPositive9998ea538bbbf70c7a5() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();

    // Act
    final int actual = thisObj.getPoolSize();

    // Assert result
    Assert.assertEquals(128, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getWaitTimeoutOutputPositive9997f935df70355812e() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();

    // Act
    final long actual = thisObj.getWaitTimeout();

    // Assert result
    Assert.assertEquals(10000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNeedHeartbeatOutputFalse99935b719b972afb37a() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();

    // Act
    final boolean actual = thisObj.isNeedHeartbeat();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataSourceInputNotNullOutputVoid999b6271e06b18b48e9() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setDataSource(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getDataSource());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeartbeatRetryInputPositiveOutputVoid99953abee2d3db058cc() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();
    final int arg0 = 10;

    // Act
    thisObj.setHeartbeatRetry(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeartbeatSQLInputNotNullOutputVoid9994c58f0bae1989fc0() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setHeartbeatSQL(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getHeartbeatSQL());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeartbeatTimeoutInputPositiveOutputVoid9995452932c8433087d() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();
    final long arg0 = 10000L;

    // Act
    thisObj.setHeartbeatTimeout(arg0);

    // Assert side effects
    Assert.assertEquals(10000L, thisObj.getHeartbeatTimeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void setIdleTimeoutInputPositiveOutputVoid999e47e79bd3d1107f0() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();
    final long arg0 = 10000L;

    // Act
    thisObj.setIdleTimeout(arg0);

    // Assert side effects
    Assert.assertEquals(10000L, thisObj.getIdleTimeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void setNameInputNotNullOutputVoid9997c1f9071b6dc99a3() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPoolSizeInputPositiveOutputVoid9998af469f83f44fa0b() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();
    final int arg0 = 10;

    // Act
    thisObj.setPoolSize(arg0);

    // Assert side effects
    Assert.assertEquals(10, thisObj.getPoolSize());

  }

  // Test written by Diffblue Cover
  @Test
  public void setWaitTimeoutInputPositiveOutputVoid9990bfe509ecee63fcb() {

    // Arrange
    final DataNodeConfig thisObj = new DataNodeConfig();
    final long arg0 = 10000L;

    // Act
    thisObj.setWaitTimeout(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
