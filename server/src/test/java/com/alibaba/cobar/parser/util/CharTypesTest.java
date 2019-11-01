package com.alibaba.cobar.parser.util;

import com.alibaba.cobar.parser.util.CharTypes;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CharTypesTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99963e608f77abe427d() {

    // Act, creating object to test constructor
    final CharTypes actual = new CharTypes();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isDigitInputNotNullOutputFalse999e1b4f9528134b736() {

    // Arrange
    final char arg0 = '$';

    // Act
    final boolean actual = CharTypes.isDigit(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isHexInputNotNullOutputFalse999965b8a7259acafd7() {

    // Arrange
    final char arg0 = '$';

    // Act
    final boolean actual = CharTypes.isHex(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isIdentifierCharInputNotNullOutputTrue99915a3c0a58b8c5cdb() {

    // Arrange
    final char arg0 = '$';

    // Act
    final boolean actual = CharTypes.isIdentifierChar(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isWhitespaceInputNotNullOutputFalse999ce1c6aaddff4ebf6() {

    // Arrange
    final char arg0 = '$';

    // Act
    final boolean actual = CharTypes.isWhitespace(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
