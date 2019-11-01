package com.alibaba.cobar.parser.util;

import com.alibaba.cobar.parser.util.ArrayUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class ArrayUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a9904ae2dba7a337() {

    // Act, creating object to test constructor
    final ArrayUtil actual = new ArrayUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullNotNullOutputTrue9993716cab32c9f0503() {

    // Arrange
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    final boolean actual = ArrayUtil.equals(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
