package com.alibaba.cobar.exception;

import com.alibaba.cobar.exception.UnknownTxIsolationException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class UnknownTxIsolationExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999de3deb750acc8f9d() {

    // Act, creating object to test constructor
    final UnknownTxIsolationException actual = new UnknownTxIsolationException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999395ce3465f59d524() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final UnknownTxIsolationException actual = new UnknownTxIsolationException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99967d70b0fbdfd912c() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final UnknownTxIsolationException actual = new UnknownTxIsolationException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99902041a6b7905e81c() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final UnknownTxIsolationException actual = new UnknownTxIsolationException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}
