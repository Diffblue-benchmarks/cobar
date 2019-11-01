package com.alibaba.cobar.server.parser;

import com.alibaba.cobar.server.parser.ServerParseStart;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ServerParseStartTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999edc06ab2a767a1a2() {

    // Act, creating object to test constructor
    final ServerParseStart actual = new ServerParseStart();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullPositiveOutputNegative999a73272dc5870948c() {

    // Arrange
    final String arg0 = "A";
    final int arg1 = 32;

    // Act
    final int actual = ServerParseStart.parse(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void transactionCheckInputNotNullPositiveOutputNegative999c40900eec8c5f97e() {

    // Arrange
    final String arg0 = "A";
    final int arg1 = 32;

    // Act
    final int actual = ServerParseStart.transactionCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
