package com.alibaba.cobar.manager.parser;

import com.alibaba.cobar.manager.parser.ManagerParseSwitch;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ManagerParseSwitchTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f0cee0d6e49d3c78() {

    // Act, creating object to test constructor
    final ManagerParseSwitch actual = new ManagerParseSwitch();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPairInputNotNullOutputStringIndexOutOfBoundsException9990f89ba2dc4a1ae2d() {

    // Arrange
    final String arg0 = " ";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ManagerParseSwitch.getPair(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullNegativeOutputStringIndexOutOfBoundsException999bd0378b2dd4972ef() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ManagerParseSwitch.parse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void switch2CheckInputNotNullNegativeOutputNegative99963acc5be9162d4c6() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    final int actual = ManagerParseSwitch.switch2Check(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
