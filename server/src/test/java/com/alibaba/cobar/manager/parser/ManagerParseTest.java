package com.alibaba.cobar.manager.parser;

import com.alibaba.cobar.manager.parser.ManagerParse;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ManagerParseTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991e792151409bab9b() {

    // Act, creating object to test constructor
    final ManagerParse actual = new ManagerParse();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullOutputNegative9990ec3a7c7f4e50d5b() {

    // Arrange
    final String arg0 = " ";

    // Act
    final int actual = ManagerParse.parse(arg0);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
