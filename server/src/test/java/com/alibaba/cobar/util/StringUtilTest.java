package com.alibaba.cobar.util;

import com.alibaba.cobar.util.StringUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class StringUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99922bffb4c540e0c64() {

    // Act, creating object to test constructor
    final StringUtil actual = new StringUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void countCharInputNotNullNotNullOutputZero9990da0799ff33b51d4() {

    // Arrange
    final String arg0 = "";
    final char arg1 = ' ';

    // Act
    final int actual = StringUtil.countChar(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void decodeInput24NotNullOutputNotNull999444391c4c4050cd1() {

    // Arrange
    final byte[] arg0 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final String arg1 = "";

    // Act
    final String actual = StringUtil.decode(arg0, arg1);

    // Assert result
    Assert.assertEquals("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void decodeInput24NegativeNegativeNotNullOutputStringIndexOutOfBoundsException999c6c8ff9a508dd868() {

    // Arrange
    final byte[] arg0 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final int arg1 = -2147483648;
    final int arg2 = -2147483648;
    final String arg3 = "";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    StringUtil.decode(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void dumpAsHexInput24NegativeOutputNotNull999d02a7ac61a19b589() {

    // Arrange
    final byte[] arg0 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final int arg1 = -2147483648;

    // Act
    final String actual = StringUtil.dumpAsHex(arg0, arg1);

    // Assert result
    Assert.assertEquals("                            \n", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void encodeInputNotNullNotNullOutput099916a36cf365e24321() {

    // Arrange
    final String arg0 = "";
    final String arg1 = "";

    // Act
    final byte[] actual = StringUtil.encode(arg0, arg1);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsIgnoreCaseInputNotNullNotNullOutputTrue999ecd41776aabd9c1e() {

    // Arrange
    final String arg0 = "";
    final String arg1 = "";

    // Act
    final boolean actual = StringUtil.equalsIgnoreCase(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void escapeEasternUnicodeByteStreamInput24NotNullNegativeNegativeOutputStringIndexOutOfBoundsException9994f10e36de885da59() {

    // Arrange
    final byte[] arg0 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final String arg1 = "";
    final int arg2 = -2147483648;
    final int arg3 = -2147483648;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    StringUtil.escapeEasternUnicodeByteStream(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRandomStringInputNegativeOutputNegativeArraySizeException9991c877698e877462d() {

    // Arrange
    final int arg0 = -2147483648;

    // Act
    thrown.expect(NegativeArraySizeException.class);
    StringUtil.getRandomString(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void hashInputNotNullNegativeNegativeOutputZero999c29d50a219d48327() {

    // Arrange
    final String arg0 = "";
    final int arg1 = -2147483648;
    final int arg2 = -2147483648;

    // Act
    final long actual = StringUtil.hash(arg0, arg1, arg2);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hexString2BytesInput8NegativeNegativeOutputNegativeArraySizeException9998d6c84fd525ad100() {

    // Arrange
    final char[] arg0 = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
    final int arg1 = -2147483648;
    final int arg2 = -2147483648;

    // Act
    thrown.expect(NegativeArraySizeException.class);
    StringUtil.hexString2Bytes(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isEmptyInputNotNullOutputTrue99980416d10a1ef2e77() {

    // Arrange
    final String arg0 = "";

    // Act
    final boolean actual = StringUtil.isEmpty(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void replaceInputNotNullNotNullNotNullNegativeOutputNotNull9999da361ed649f90fe() {

    // Arrange
    final String arg0 = "";
    final String arg1 = "";
    final String arg2 = "";
    final int arg3 = -2147483648;

    // Act
    final String actual = StringUtil.replace(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void replaceInputNotNullNotNullNotNullOutputNotNull999fa2d874d185d9815() {

    // Arrange
    final String arg0 = "";
    final String arg1 = "";
    final String arg2 = "";

    // Act
    final String actual = StringUtil.replace(arg0, arg1, arg2);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void replaceCharsInputNotNullNotNullNotNullOutputNotNull9997d468114a79d5f0a() {

    // Arrange
    final String arg0 = "";
    final char arg1 = ' ';
    final char arg2 = ' ';

    // Act
    final String actual = StringUtil.replaceChars(arg0, arg1, arg2);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void replaceCharsInputNotNullNotNullNotNullOutputNotNull99984f8274c31647a73() {

    // Arrange
    final String arg0 = "";
    final String arg1 = "";
    final String arg2 = "";

    // Act
    final String actual = StringUtil.replaceChars(arg0, arg1, arg2);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void replaceOnceInputNotNullNotNullNotNullOutputNotNull999e5dc8ee94691b94c() {

    // Arrange
    final String arg0 = "";
    final String arg1 = "";
    final String arg2 = "";

    // Act
    final String actual = StringUtil.replaceOnce(arg0, arg1, arg2);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void safeToStringInputNotNullOutputNotNull99939cc7936028c9869() {

    // Arrange
    final Object arg0 = "";

    // Act
    final String actual = StringUtil.safeToString(arg0);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringInput24OutputNotNull999f5bf23c0bc649b52() {

    // Arrange
    final byte[] arg0 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };

    // Act
    final String actual = StringUtil.toString(arg0);

    // Assert result
    Assert.assertEquals("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b", actual);

  }
}
