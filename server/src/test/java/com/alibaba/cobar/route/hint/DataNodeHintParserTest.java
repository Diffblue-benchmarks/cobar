package com.alibaba.cobar.route.hint;

import com.alibaba.cobar.route.hint.CobarHint;
import com.alibaba.cobar.route.hint.DataNodeHintParser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.SQLSyntaxErrorException;



public class DataNodeHintParserTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999160c067e3f1d5a50() {

    // Act, creating object to test constructor
    final DataNodeHintParser actual = new DataNodeHintParser();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void processInputNotNullNotNullNotNullOutputNumberFormatException9996eb8348104e723b6() throws SQLSyntaxErrorException {

    // Arrange
    final DataNodeHintParser thisObj = new DataNodeHintParser();
    final CobarHint arg0 = new CobarHint();
    final String arg1 = ".";
    final String arg2 = ".";

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.process(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
