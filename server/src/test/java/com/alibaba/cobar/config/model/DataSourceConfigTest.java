package com.alibaba.cobar.config.model;

import com.alibaba.cobar.config.model.DataSourceConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DataSourceConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992498079b40dcb9a1() {

    // Act, creating object to test constructor
    final DataSourceConfig actual = new DataSourceConfig();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPort());
    Assert.assertNull(actual.getSqlMode());
    Assert.assertNull(actual.getPassword());
    Assert.assertNull(actual.getType());
    Assert.assertNull(actual.getName());
    Assert.assertNull(actual.getHost());
    Assert.assertEquals(10, actual.getSqlRecordCount());
    Assert.assertNull(actual.getDatabase());
    Assert.assertNull(actual.getUser());

  }

  // Test written by Diffblue Cover
  @Test
  public void getDatabaseOutputVoid999bd55b2146743f614() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();

    // Act
    final String actual = thisObj.getDatabase();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHostOutputVoid9996a551d2ea01f0e73() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();

    // Act
    final String actual = thisObj.getHost();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputVoid999093e712cc3508052() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();

    // Act
    final String actual = thisObj.getName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPasswordOutputVoid99912e103fdd04b9c81() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();

    // Act
    final String actual = thisObj.getPassword();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPortOutputZero999b00dbf9d0b89f5d6() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();

    // Act
    final int actual = thisObj.getPort();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getSqlModeOutputVoid9994733e61d63b1d293() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();

    // Act
    final String actual = thisObj.getSqlMode();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSqlRecordCountOutputPositive999fe926bd5350031e9() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();

    // Act
    final int actual = thisObj.getSqlRecordCount();

    // Assert result
    Assert.assertEquals(10, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypeOutputVoid99974357352025c39d0() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();

    // Act
    final String actual = thisObj.getType();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUserOutputVoid9996ae48a83137ff16b() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();

    // Act
    final String actual = thisObj.getUser();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDatabaseInputNotNullOutputVoid999b40d9f98b3cc03a7() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setDatabase(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getDatabase());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHostInputNotNullOutputVoid9994046d77463752c71() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setHost(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getHost());

  }

  // Test written by Diffblue Cover
  @Test
  public void setNameInputNotNullOutputVoid9995cccb06c31d62d17() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPasswordInputNotNullOutputVoid999ace5f3a0a7650c98() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setPassword(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getPassword());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPortInputPositiveOutputVoid9992240181d8345a347() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();
    final int arg0 = 10;

    // Act
    thisObj.setPort(arg0);

    // Assert side effects
    Assert.assertEquals(10, thisObj.getPort());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSqlModeInputNotNullOutputVoid999fd1e515b29d38571() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setSqlMode(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getSqlMode());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSqlRecordCountInputPositiveOutputVoid9994a9f6a2e10f31166() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();
    final int arg0 = 10;

    // Act
    thisObj.setSqlRecordCount(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTypeInputNotNullOutputVoid999880515ae3edc62dd() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setType(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void setUserInputNotNullOutputVoid99923c965c51f060a28() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setUser(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getUser());

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999260056fbd42f5a57() {

    // Arrange
    final DataSourceConfig thisObj = new DataSourceConfig();

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("[name=null,host=null,port=0,database=null]", actual);

  }
}
