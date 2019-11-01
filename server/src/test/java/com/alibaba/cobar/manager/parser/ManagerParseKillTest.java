package com.alibaba.cobar.manager.parser;

import com.alibaba.cobar.manager.parser.ManagerParseKill;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ManagerParseKillTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f09ef5d7c3573f9e() {

    // Act, creating object to test constructor
    final ManagerParseKill actual = new ManagerParseKill();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void kill2CheckInputNotNullPositiveOutputNegative9997e59b68206463fce() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 10;

    // Act
    final int actual = ManagerParseKill.kill2Check(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullPositiveOutputNegative999d3e9a761f432b1f9() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = 10;

    // Act
    final int actual = ManagerParseKill.parse(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
