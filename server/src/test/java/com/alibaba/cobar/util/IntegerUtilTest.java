package com.alibaba.cobar.util;

import com.alibaba.cobar.util.IntegerUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class IntegerUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996bc54bb08dfb4d04() {

    // Act, creating object to test constructor
    final IntegerUtil actual = new IntegerUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getBytesInputNegativeNegative24OutputArrayIndexOutOfBoundsException9994f3976f72f8f5c8d() {

    // Arrange
    final int arg0 = -2147483648;
    final int arg1 = -2147483648;
    final byte[] arg2 = { (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9 };

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    IntegerUtil.getBytes(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stringSizeInputNegativeOutputPositive999a8b87423991af675() {

    // Arrange
    final int arg0 = -2147483648;

    // Act
    final int actual = IntegerUtil.stringSize(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toBytesInputNegativeOutput11999e213c3967e43a138() {

    // Arrange
    final int arg0 = -2147483648;

    // Act
    final byte[] actual = IntegerUtil.toBytes(arg0);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 45, (short) 50, (short) 49, (short) 52, (short) 55, (short) 52, (short) 56, (short) 51, (short) 54, (short) 52, (short) 56 }, actual);

  }
}
