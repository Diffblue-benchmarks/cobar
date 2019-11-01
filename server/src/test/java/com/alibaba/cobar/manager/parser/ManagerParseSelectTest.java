package com.alibaba.cobar.manager.parser;

import com.alibaba.cobar.manager.parser.ManagerParseSelect;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ManagerParseSelectTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991a884023d87cd279() {

    // Act, creating object to test constructor
    final ManagerParseSelect actual = new ManagerParseSelect();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullPositiveOutputNegative999966ef5b43ca3b173() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 32;

    // Act
    final int actual = ManagerParseSelect.parse(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void select2CheckInputNotNullPositiveOutputNegative999d8f940f5523c2e9e() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 32;

    // Act
    final int actual = ManagerParseSelect.select2Check(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void select2SCheckInputNotNullPositiveOutputNegative99965ab2ad6c8e408fa() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 32;

    // Act
    final int actual = ManagerParseSelect.select2SCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void select2VCheckInputNotNullPositiveOutputNegative999211db777c7a860eb() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 32;

    // Act
    final int actual = ManagerParseSelect.select2VCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
