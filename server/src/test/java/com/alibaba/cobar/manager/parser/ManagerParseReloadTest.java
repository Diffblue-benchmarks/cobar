package com.alibaba.cobar.manager.parser;

import com.alibaba.cobar.manager.parser.ManagerParseReload;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ManagerParseReloadTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ca6e38569cf22997() {

    // Act, creating object to test constructor
    final ManagerParseReload actual = new ManagerParseReload();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullPositiveOutputNegative9991feeac86751543e7() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 3;

    // Act
    final int actual = ManagerParseReload.parse(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reload2CCheckInputNotNullPositiveOutputNegative999208f745b8c183bcd() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 3;

    // Act
    final int actual = ManagerParseReload.reload2CCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reload2CheckInputNotNullPositiveOutputNegative999e31b58623e5a337c() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 3;

    // Act
    final int actual = ManagerParseReload.reload2Check(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reload2RCheckInputNotNullPositiveOutputNegative999d9a5524adad9abd3() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 3;

    // Act
    final int actual = ManagerParseReload.reload2RCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reload2UCheckInputNotNullPositiveOutputNegative999e7e1dbee799161eb() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 3;

    // Act
    final int actual = ManagerParseReload.reload2UCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
