package com.alibaba.cobar.exception;

import com.alibaba.cobar.exception.HeartbeatException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class HeartbeatExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999844632d49f1fb8ce() {

    // Act, creating object to test constructor
    final HeartbeatException actual = new HeartbeatException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999075c6dabf6925fa6() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final HeartbeatException actual = new HeartbeatException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99973583a8ffb39fb67() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final HeartbeatException actual = new HeartbeatException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99976a9e8eb12826308() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final HeartbeatException actual = new HeartbeatException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}
