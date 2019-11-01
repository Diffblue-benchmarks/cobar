package com.alibaba.cobar.parser.util;

import com.alibaba.cobar.parser.util.ParseString;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class ParseStringTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999421398df1e412481() {

    // Act, creating object to test constructor
    final ParseString actual = new ParseString();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hexString2BytesInput8NegativeNegativeOutputNegativeArraySizeException999a5cb945e6e2d422c() {

    // Arrange
    final char[] arg0 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final int arg1 = -2147483648;
    final int arg2 = -2147483648;

    // Act
    thrown.expect(NegativeArraySizeException.class);
    ParseString.hexString2Bytes(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
