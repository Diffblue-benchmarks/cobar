package com.alibaba.cobar.mysql;

import com.alibaba.cobar.mysql.SecurityUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;



public class SecurityUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994d6f9d686fea9822() {

    // Act, creating object to test constructor
    final SecurityUtil actual = new SecurityUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void scramble323InputNotNullNotNullOutputNotNull999e081015f4045def5() {

    // Arrange
    final String arg0 = " ";
    final String arg1 = " ";

    // Act
    final String actual = SecurityUtil.scramble323(arg0, arg1);

    // Assert result
    Assert.assertEquals("@", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void scramble411Input2424Output20999dd7e20034db938d1() throws NoSuchAlgorithmException {

    // Arrange
    final byte[] arg0 = { (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32 };
    final byte[] arg1 = { (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32 };

    // Act
    final byte[] actual = SecurityUtil.scramble411(arg0, arg1);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) -36, (short) -100, (short) 111, (short) 115, (short) 118, (short) 33, (short) 52, (short) -111, (short) 81, (short) -32, (short) 115, (short) -83, (short) -128, (short) -89, (short) -72, (short) -29, (short) -114, (short) -52, (short) 11, (short) -20 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void scrambleCachingSha2Input2424Output329996a6d31975eff4f10() throws DigestException {

    // Arrange
    final byte[] arg0 = { (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32 };
    final byte[] arg1 = { (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32, (short) 32 };

    // Act
    final byte[] actual = SecurityUtil.scrambleCachingSha2(arg0, arg1);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) -107, (short) 100, (short) 68, (short) 3, (short) -13, (short) 61, (short) -25, (short) 88, (short) -123, (short) -78, (short) 26, (short) 94, (short) 119, (short) -39, (short) 58, (short) 47, (short) -7, (short) -40, (short) -81, (short) -13, (short) 45, (short) 67, (short) -114, (short) -108, (short) 35, (short) 45, (short) -18, (short) 101, (short) -4, (short) 105, (short) 50, (short) -34 }, actual);

  }
}
