package com.alibaba.cobar.config.util;

import com.alibaba.cobar.config.util.ConfigException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConfigExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f77ef0c868e51f8d() {

    // Act, creating object to test constructor
    final ConfigException actual = new ConfigException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9995a12493d40aaa65b() {

    // Arrange
    final String arg0 = "aaaaa";
    final Throwable arg1 = new Throwable();

    // Act, creating object to test constructor
    final ConfigException actual = new ConfigException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9999fda6ab5a83ee3d7() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final ConfigException actual = new ConfigException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999e566eedb989e81a6() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final ConfigException actual = new ConfigException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }
}
