package com.alibaba.cobar.parser.util;

import com.alibaba.cobar.parser.util.Pair;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PairTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999321c2afb4c8212f3() {

    // Arrange
    final Object arg0 = "aaaaa";
    final Object arg1 = "aaaaa";

    // Act, creating object to test constructor
    final Pair<Object, Object> actual = new Pair<Object, Object>(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getKey());
    Assert.assertEquals("aaaaa", actual.getValue());

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse9997b4345bfb88dee4f() {

    // Arrange
    final Pair<Object, Object> thisObj = new Pair<Object, Object>("aaaaa", "aaaaa");
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getKeyOutputNotNull999fb057dc6741b805d() {

    // Arrange
    final Pair<Object, Object> thisObj = new Pair<Object, Object>("aaaaa", "aaaaa");

    // Act
    final Object actual = thisObj.getKey();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getValueOutputNotNull9990abdcc2ce4d7f67c() {

    // Arrange
    final Pair<Object, Object> thisObj = new Pair<Object, Object>("aaaaa", "aaaaa");

    // Act
    final Object actual = thisObj.getValue();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputZero999c074975c91769ec3() {

    // Arrange
    final Pair<Object, Object> thisObj = new Pair<Object, Object>("aaaaa", "aaaaa");

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999911a3be5582ff3ab() {

    // Arrange
    final Pair<Object, Object> thisObj = new Pair<Object, Object>("aaaaa", "aaaaa");

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("(aaaaa, aaaaa)", actual);

  }
}
