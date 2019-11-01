package com.alibaba.cobar.parser.util;

import com.alibaba.cobar.parser.util.ParseUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ParseUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void commentInputNotNullNegativeOutputStringIndexOutOfBoundsException99958ebd3c5470ef843() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ParseUtil.comment(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void compareInputNotNullNegative8OutputFalse99970f1595ab5c8b7d7() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;
    final char[] arg2 = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

    // Act
    final boolean actual = ParseUtil.compare(arg0, arg1, arg2);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999faa717d3f1288f50() {

    // Act, creating object to test constructor
    final ParseUtil actual = new ParseUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void currentCharIsSepInputNotNullNegativeOutputStringIndexOutOfBoundsException999090e537e5da47f8f() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ParseUtil.currentCharIsSep(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSQLIdInputNotNullOutputZero999c14e14f6f5442a3c() {

    // Arrange
    final String arg0 = " ";

    // Act
    final long actual = ParseUtil.getSQLId(arg0);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isEOFInputNotNullOutputTrue9991547d954ad11b285() {

    // Arrange
    final char arg0 = ' ';

    // Act
    final boolean actual = ParseUtil.isEOF(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void moveInputNotNullNegativeNegativeOutputStringIndexOutOfBoundsException999aabf9d107a299f71() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;
    final int arg2 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ParseUtil.move(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void nextCharIsSepInputNotNullNegativeOutputTrue99971e20161ebefd5a9() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    final boolean actual = ParseUtil.nextCharIsSep(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void nextStringIsExpectedWithIgnoreSepCharInputNotNullNegativeNotNullTrueOutputStringIndexOutOfBoundsException999625772037ba9b15f() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;
    final String arg2 = " ";
    final boolean arg3 = true;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ParseUtil.nextStringIsExpectedWithIgnoreSepChar(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void nextStringIsJsonEqInputNotNullNegativeOutputNegative999bbe811436c583643() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    final int actual = ParseUtil.nextStringIsJsonEq(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseAliasInputNotNullNegativeOutputVoid999a0f6466ee37664ab() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    final String actual = ParseUtil.parseAlias(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
