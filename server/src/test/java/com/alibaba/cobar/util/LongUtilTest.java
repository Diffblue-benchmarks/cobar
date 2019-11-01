package com.alibaba.cobar.util;

import com.alibaba.cobar.util.LongUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class LongUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99984e520709059ceb7() {

    // Act, creating object to test constructor
    final LongUtil actual = new LongUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getBytesInputNegativeZero24OutputArrayIndexOutOfBoundsException99988a47872eacf4f52() {

    // Arrange
    final long arg0 = -9223372036854775808L;
    final int arg1 = 0;
    final byte[] arg2 = { (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19, (short) 19 };

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    LongUtil.getBytes(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stringSizeInputNegativeOutputPositive9993fb5dfee22bb4db3() {

    // Arrange
    final long arg0 = -9223372036854775808L;

    // Act
    final int actual = LongUtil.stringSize(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toBytesInputNegativeOutput20999979a02667146a529() {

    // Arrange
    final long arg0 = -9223372036854775808L;

    // Act
    final byte[] actual = LongUtil.toBytes(arg0);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 45, (short) 57, (short) 50, (short) 50, (short) 51, (short) 51, (short) 55, (short) 50, (short) 48, (short) 51, (short) 54, (short) 56, (short) 53, (short) 52, (short) 55, (short) 55, (short) 53, (short) 56, (short) 48, (short) 56 }, actual);

  }
}
