package com.alibaba.cobar.config.util;

import com.alibaba.cobar.config.util.BeanConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;



public class BeanConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void cloneOutputNotNull9992c1faf92e39a761b() {

    // Arrange
    final BeanConfig thisObj = new BeanConfig();

    // Act
    final Object actual = thisObj.clone();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(((BeanConfig) actual).getName());
    final HashMap<String, Object> hashMap = new HashMap<String, Object>();
    Assert.assertEquals(hashMap, ((BeanConfig) actual).getParams());
    Assert.assertNull(((BeanConfig) actual).getClassName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99914694eeb4a8ded24() {

    // Act, creating object to test constructor
    final BeanConfig actual = new BeanConfig();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getName());
    final HashMap<String, Object> hashMap = new HashMap<String, Object>();
    Assert.assertEquals(hashMap, actual.getParams());
    Assert.assertNull(actual.getClassName());

  }

  // Test written by Diffblue Cover
  @Test
  public void createInputTrueOutputNullPointerException999ec9e66d4c129d273() throws IllegalAccessException, InvocationTargetException {

    // Arrange
    final BeanConfig thisObj = new BeanConfig();
    final boolean arg0 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.create(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse999a38e737981b66d72() {

    // Arrange
    final BeanConfig thisObj = new BeanConfig();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getClassNameOutputVoid999b6196c8931f0974e() {

    // Arrange
    final BeanConfig thisObj = new BeanConfig();

    // Act
    final String actual = thisObj.getClassName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputVoid99958ccd6ac2c3cd3a2() {

    // Arrange
    final BeanConfig thisObj = new BeanConfig();

    // Act
    final String actual = thisObj.getName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getParamsOutput0999bc0d4e75e7e00caf() {

    // Arrange
    final BeanConfig thisObj = new BeanConfig();

    // Act
    final Map<String, Object> actual = thisObj.getParams();

    // Assert result
    final HashMap<String, Object> hashMap = new HashMap<String, Object>();
    Assert.assertEquals(hashMap, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive999552f286e103c0994() {

    // Arrange
    final BeanConfig thisObj = new BeanConfig();

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(37, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setClassNameInputNotNullOutputVoid9995e9d94a602766e33() {

    // Arrange
    final BeanConfig thisObj = new BeanConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setClassName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getClassName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setNameInputNotNullOutputVoid999847fa37dd46664e0() {

    // Arrange
    final BeanConfig thisObj = new BeanConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setParamsInputNotNullOutputVoid999509b96f59a6215bf() {

    // Arrange
    final BeanConfig thisObj = new BeanConfig();
    final HashMap<String, Object> arg0 = new HashMap<String, Object>();
    arg0.put("aaaaa", "aaaaa");

    // Act
    thisObj.setParams(arg0);

    // Assert side effects
    final HashMap<String, Object> hashMap = new HashMap<String, Object>();
    hashMap.put("aaaaa", "aaaaa");
    Assert.assertEquals(hashMap, thisObj.getParams());

  }
}
