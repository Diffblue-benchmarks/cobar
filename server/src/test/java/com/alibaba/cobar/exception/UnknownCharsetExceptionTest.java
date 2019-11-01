package com.alibaba.cobar.exception;

import com.alibaba.cobar.exception.UnknownCharsetException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class UnknownCharsetExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991c79583220bc7dcf() {

    // Act, creating object to test constructor
    final UnknownCharsetException actual = new UnknownCharsetException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99932e26c21a6e8e803() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final UnknownCharsetException actual = new UnknownCharsetException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999936209a05a94bafd() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final UnknownCharsetException actual = new UnknownCharsetException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999133a0064669a144e() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final UnknownCharsetException actual = new UnknownCharsetException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}
