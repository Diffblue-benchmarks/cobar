package com.alibaba.cobar.server.parser;

import com.alibaba.cobar.server.parser.ServerParseSet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ServerParseSetTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998d45829b5758e1c0() {

    // Act, creating object to test constructor
    final ServerParseSet actual = new ServerParseSet();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullNegativeOutputStringIndexOutOfBoundsException99973a4151978b60f1f() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ServerParseSet.parse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
