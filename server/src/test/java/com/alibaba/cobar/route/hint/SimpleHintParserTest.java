package com.alibaba.cobar.route.hint;

import com.alibaba.cobar.route.hint.CobarHint;
import com.alibaba.cobar.route.hint.SimpleHintParser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.SQLSyntaxErrorException;



public class SimpleHintParserTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99986144755a92a706c() {

    // Act, creating object to test constructor
    final SimpleHintParser actual = new SimpleHintParser();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void processInputNotNullNotNullNotNullOutputSQLSyntaxErrorException9997398e183eae6e9b4() throws SQLSyntaxErrorException {

    // Arrange
    final SimpleHintParser thisObj = new SimpleHintParser();
    final CobarHint arg0 = new CobarHint();
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(SQLSyntaxErrorException.class);
    thisObj.process(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
