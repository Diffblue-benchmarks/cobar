package com.alibaba.cobar.config.util;

import com.alibaba.cobar.config.util.JVMInfo;
import com.alibaba.cobar.config.util.ReflectionProvider;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class JVMInfoTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void canUseSun14ReflectionProviderOutputFalse999ba76405b9a61a5bf() {

    // Arrange
    final JVMInfo thisObj = new JVMInfo();

    // Act
    final boolean actual = thisObj.canUseSun14ReflectionProvider();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99996282d7bc9f8e2c5() {

    // Act, creating object to test constructor
    final JVMInfo actual = new JVMInfo();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMajorJavaVersionInputNotNullOutputPositive999f50ebb13b3c57e55() {

    // Arrange
    final String arg0 = "Apple";

    // Act
    final float actual = JVMInfo.getMajorJavaVersion(arg0);

    // Assert result
    Assert.assertEquals(0x1.4cccccp+0f /* 1.3 */, actual, 0.0f);

  }

  // Test written by Diffblue Cover
  @Test
  public void getReflectionProviderOutputNotNull99917fd6770e1bfc9fb() {

    // Arrange
    final JVMInfo thisObj = new JVMInfo();

    // Act
    final ReflectionProvider actual = thisObj.getReflectionProvider();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void is14OutputTrue9992e9ad52774bd305a() {

    // Act
    final boolean actual = JVMInfo.is14();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void is15OutputTrue999f7b48ede88f6f73a() {

    // Act
    final boolean actual = JVMInfo.is15();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void is16OutputTrue9991d40858caca78828() {

    // Act
    final boolean actual = JVMInfo.is16();

    // Assert result
    Assert.assertTrue(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void loadClassInputNotNullOutputVoid9990136a128b9c0d9ac() {
//
//    // Arrange
//    final JVMInfo thisObj = new JVMInfo();
//    final String arg0 = "Apple";
//
//    // Act
//    final Class<Object> actual = thisObj.loadClass(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void reverseFieldDefinitionOutputFalse999945e6d7f85f6a45f() {

    // Act
    final boolean actual = JVMInfo.reverseFieldDefinition();

    // Assert result
    Assert.assertFalse(actual);

  }
}
