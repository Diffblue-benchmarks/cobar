package com.alibaba.cobar.exception;

import com.alibaba.cobar.exception.UnknownDataNodeException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class UnknownDataNodeExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99927b9db2f719903b1() {

    // Act, creating object to test constructor
    final UnknownDataNodeException actual = new UnknownDataNodeException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99909321c82bc593f71() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final UnknownDataNodeException actual = new UnknownDataNodeException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999a0a09e7e1f96773d() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final UnknownDataNodeException actual = new UnknownDataNodeException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9998db1781b5a85a194() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final UnknownDataNodeException actual = new UnknownDataNodeException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}
