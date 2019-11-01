package com.alibaba.cobar.exception;

import com.alibaba.cobar.exception.UnknownPacketException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class UnknownPacketExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b1425a55130ef37f() {

    // Act, creating object to test constructor
    final UnknownPacketException actual = new UnknownPacketException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999ff804f3cf9aeb40f() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final UnknownPacketException actual = new UnknownPacketException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999f2ea8e11b2541468() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final UnknownPacketException actual = new UnknownPacketException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999ff66b23d53cae4e0() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final UnknownPacketException actual = new UnknownPacketException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}
