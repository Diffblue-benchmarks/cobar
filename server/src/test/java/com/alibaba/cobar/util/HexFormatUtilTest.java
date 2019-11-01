package com.alibaba.cobar.util;

import com.alibaba.cobar.util.HexFormatUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class HexFormatUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d21183be4a479521() {

    // Act, creating object to test constructor
    final HexFormatUtil actual = new HexFormatUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fromHexInputNotNullNotNullOutputVoid99900dc1a97fd1f0fd4() {

    // Arrange
    final String arg0 = " ";
    final String arg1 = " ";

    // Act
    final String actual = HexFormatUtil.fromHex(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void fromHexInputNotNullOutput0999223016411184f7f0() {

    // Arrange
    final String arg0 = " ";

    // Act
    final byte[] actual = HexFormatUtil.fromHex(arg0);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fromHex2BInputNotNullOutputArrayIndexOutOfBoundsException999221fe75d8c6d95cb() {

    // Arrange
    final String arg0 = " ";

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    HexFormatUtil.fromHex2B(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void fromHex4BInputNotNullOutputArrayIndexOutOfBoundsException999c25093ed73e7933d() {

    // Arrange
    final String arg0 = " ";

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    HexFormatUtil.fromHex4B(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void fromHex8BInputNotNullOutputArrayIndexOutOfBoundsException9992045af0b4e4fdf4c() {

    // Arrange
    final String arg0 = " ";

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    HexFormatUtil.fromHex8B(arg0);

    // The method is not expected to return due to exception thrown

  }
}
