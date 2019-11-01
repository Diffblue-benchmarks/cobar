package com.alibaba.cobar.config.model;

import com.alibaba.cobar.config.model.CobarNodeConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CobarNodeConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullPositivePositiveOutputNotNull99970301ba1dea99345() {

    // Arrange
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final int arg2 = 1;
    final int arg3 = 1;

    // Act, creating object to test constructor
    final CobarNodeConfig actual = new CobarNodeConfig(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getName());
    Assert.assertEquals(1, actual.getWeight());
    Assert.assertEquals("aaaaa", actual.getHost());
    Assert.assertEquals(1, actual.getPort());

  }

  // Test written by Diffblue Cover
  @Test
  public void getHostOutputNotNull9993c184d604d5fcbdf() {

    // Arrange
    final CobarNodeConfig thisObj = new CobarNodeConfig("aaaaa", "aaaaa", 1, 1);

    // Act
    final String actual = thisObj.getHost();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputNotNull9998521ea6d66e1240d() {

    // Arrange
    final CobarNodeConfig thisObj = new CobarNodeConfig("aaaaa", "aaaaa", 1, 1);

    // Act
    final String actual = thisObj.getName();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPortOutputPositive9994e728ddd29a35c14() {

    // Arrange
    final CobarNodeConfig thisObj = new CobarNodeConfig("aaaaa", "aaaaa", 1, 1);

    // Act
    final int actual = thisObj.getPort();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getWeightOutputPositive999fb1d7201560a91b1() {

    // Arrange
    final CobarNodeConfig thisObj = new CobarNodeConfig("aaaaa", "aaaaa", 1, 1);

    // Act
    final int actual = thisObj.getWeight();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setHostInputNotNullOutputVoid9994c2e43dfbdda0294() {

    // Arrange
    final CobarNodeConfig thisObj = new CobarNodeConfig("aaaaa", "aaaaa", 1, 1);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setHost(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNameInputNotNullOutputVoid9993e6b15d73aa40ee3() {

    // Arrange
    final CobarNodeConfig thisObj = new CobarNodeConfig("aaaaa", "aaaaa", 1, 1);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setName(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setPortInputPositiveOutputVoid999ba08cad1aa8b7985() {

    // Arrange
    final CobarNodeConfig thisObj = new CobarNodeConfig("aaaaa", "aaaaa", 1, 1);
    final int arg0 = 1;

    // Act
    thisObj.setPort(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setWeightInputPositiveOutputVoid9995ba3f895b06853cf() {

    // Arrange
    final CobarNodeConfig thisObj = new CobarNodeConfig("aaaaa", "aaaaa", 1, 1);
    final int arg0 = 1;

    // Act
    thisObj.setWeight(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999eea9fa6975d98d39() {

    // Arrange
    final CobarNodeConfig thisObj = new CobarNodeConfig("aaaaa", "aaaaa", 1, 1);

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("[name=aaaaa,host=aaaaa,port=1,weight=1]", actual);

  }
}
