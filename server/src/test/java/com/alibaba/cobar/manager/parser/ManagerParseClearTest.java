package com.alibaba.cobar.manager.parser;

import com.alibaba.cobar.manager.parser.ManagerParseClear;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ManagerParseClearTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void clear2CheckInputNotNullPositiveOutputNegative9995f1feecbe846d373() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 32;

    // Act
    final int actual = ManagerParseClear.clear2Check(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void clear2DCheckInputNotNullPositiveOutputNegative999bbcb5c69579d26d9() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 32;

    // Act
    final int actual = ManagerParseClear.clear2DCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void clear2SCheckInputNotNullPositiveOutputNegative99937caa0c36255b513() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 32;

    // Act
    final int actual = ManagerParseClear.clear2SCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void clear2WhereCheckInputNotNullPositiveOutputNegative9997c1f08ad217dd85d() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 32;

    // Act
    final int actual = ManagerParseClear.clear2WhereCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996255824aeba8bd39() {

    // Act, creating object to test constructor
    final ManagerParseClear actual = new ManagerParseClear();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullPositiveOutputNegative99982c3eae0d03535cd() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 32;

    // Act
    final int actual = ManagerParseClear.parse(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
