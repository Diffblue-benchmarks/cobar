package com.alibaba.cobar.config.model;

import com.alibaba.cobar.config.model.UserConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashSet;
import java.util.Set;



public class UserConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fd0b7a6267635a93() {

    // Act, creating object to test constructor
    final UserConfig actual = new UserConfig();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPassword());
    Assert.assertNull(actual.getName());
    Assert.assertNull(actual.getSchemas());

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputVoid9999da67390dfc22d6f() {

    // Arrange
    final UserConfig thisObj = new UserConfig();

    // Act
    final String actual = thisObj.getName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPasswordOutputVoid999a654473b3c3aba28() {

    // Arrange
    final UserConfig thisObj = new UserConfig();

    // Act
    final String actual = thisObj.getPassword();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSchemasOutputVoid99946bd8e681da1a03e() {

    // Arrange
    final UserConfig thisObj = new UserConfig();

    // Act
    final Set<String> actual = thisObj.getSchemas();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNameInputNotNullOutputVoid999cb3c0ee6b1827f56() {

    // Arrange
    final UserConfig thisObj = new UserConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPasswordInputNotNullOutputVoid9991d6715e6c0b9ca24() {

    // Arrange
    final UserConfig thisObj = new UserConfig();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setPassword(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getPassword());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSchemasInputNotNullOutputVoid999f591d07069c96570() {

    // Arrange
    final UserConfig thisObj = new UserConfig();
    final HashSet<String> arg0 = new HashSet<String>();
    arg0.add("aaaaa");

    // Act
    thisObj.setSchemas(arg0);

    // Assert side effects
    final HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("aaaaa");
    Assert.assertEquals(hashSet, thisObj.getSchemas());

  }
}
