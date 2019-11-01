package com.alibaba.cobar;

import com.alibaba.cobar.Log4jInitializer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Log4jInitializerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void configureAndWatchInputNotNullPositiveOutputVoid99915acc743a8e6b60a() {

    // Arrange
    final String arg0 = "aaaaa";
    final long arg1 = 1L;

    // Act
    Log4jInitializer.configureAndWatch(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999943f562152852172() {

    // Act, creating object to test constructor
    final Log4jInitializer actual = new Log4jInitializer();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
