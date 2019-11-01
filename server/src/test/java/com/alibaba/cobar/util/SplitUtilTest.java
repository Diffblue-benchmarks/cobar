package com.alibaba.cobar.util;

import com.alibaba.cobar.util.SplitUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class SplitUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c654801a519b80b8() {

    // Act, creating object to test constructor
    final SplitUtil actual = new SplitUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void splitInputNotNull0TrueOutput09991f4fcc55916ba9f1() {

    // Arrange
    final String arg0 = "0";
    final char arg1 = '0';
    final boolean arg2 = true;

    // Act
    final String[] actual = SplitUtil.split(arg0, arg1, arg2);

    // Assert result
    Assert.assertArrayEquals(new String[]{ }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void splitInputNotNull00000Output0999339bde653373ec3a() {

    // Arrange
    final String arg0 = "0";
    final char arg1 = '0';
    final char arg2 = '0';
    final char arg3 = '0';
    final char arg4 = '0';
    final char arg5 = '0';

    // Act
    final String[] actual = SplitUtil.split(arg0, arg1, arg2, arg3, arg4, arg5);

    // Assert result
    Assert.assertArrayEquals(new String[]{ }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void splitInputNotNull0000OutputArrayIndexOutOfBoundsException999ca7d0d954e8878f3() {

    // Arrange
    final String arg0 = "0";
    final char arg1 = '0';
    final char arg2 = '0';
    final char arg3 = '0';
    final char arg4 = '0';

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    SplitUtil.split(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void splitInputNotNull000Output099918f0e60cf56ae93b() {

    // Arrange
    final String arg0 = "0";
    final char arg1 = '0';
    final char arg2 = '0';
    final char arg3 = '0';

    // Act
    final String[] actual = SplitUtil.split(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertArrayEquals(new String[]{ }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void splitInputNotNull0Output0999d8adaa2a706b67fb() {

    // Arrange
    final String arg0 = "0";
    final char arg1 = '0';

    // Act
    final String[] actual = SplitUtil.split(arg0, arg1);

    // Assert result
    Assert.assertArrayEquals(new String[]{ }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void splitInputNotNullNotNullNegativeOutput0999168b151bf82e4490() {

    // Arrange
    final String arg0 = "0";
    final String arg1 = "0";
    final int arg2 = -1;

    // Act
    final String[] actual = SplitUtil.split(arg0, arg1, arg2);

    // Assert result
    Assert.assertArrayEquals(new String[]{ }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void splitInputNotNullNotNullOutput099953be493c8d249b5f() {

    // Arrange
    final String arg0 = "0";
    final String arg1 = "0";

    // Act
    final String[] actual = SplitUtil.split(arg0, arg1);

    // Assert result
    Assert.assertArrayEquals(new String[]{ }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void splitInputNotNullOutput1999ef9b5577ecd16c1e() {

    // Arrange
    final String arg0 = "0";

    // Act
    final String[] actual = SplitUtil.split(arg0);

    // Assert result
    Assert.assertArrayEquals(new String[]{ "0" }, actual);

  }
}
