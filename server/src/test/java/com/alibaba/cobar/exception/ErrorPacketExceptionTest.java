package com.alibaba.cobar.exception;

import com.alibaba.cobar.exception.ErrorPacketException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ErrorPacketExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999732772bdfb4b491d() {

    // Act, creating object to test constructor
    final ErrorPacketException actual = new ErrorPacketException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999c2eec509ac42b754() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final ErrorPacketException actual = new ErrorPacketException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9998c7fd996b0cc26f1() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final ErrorPacketException actual = new ErrorPacketException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99936de38d129b71365() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final ErrorPacketException actual = new ErrorPacketException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}
