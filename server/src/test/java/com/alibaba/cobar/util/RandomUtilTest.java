package com.alibaba.cobar.util;

import com.alibaba.cobar.util.RandomUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class RandomUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99973c31129b71ec3a3() {

    // Act, creating object to test constructor
    final RandomUtil actual = new RandomUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void randomBytesInputZeroOutput099918bfadb7459f7e27() {

    // Arrange
    final int arg0 = 0;

    // Act
    final byte[] actual = RandomUtil.randomBytes(arg0);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ }, actual);

  }
}
