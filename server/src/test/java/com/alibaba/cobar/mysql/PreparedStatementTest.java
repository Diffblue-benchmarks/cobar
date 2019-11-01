package com.alibaba.cobar.mysql;

import com.alibaba.cobar.mysql.PreparedStatement;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class PreparedStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveNotNullPositivePositiveOutputNotNull999fba60904b44bfc17() {

    // Arrange
    final long arg0 = 1L;
    final String arg1 = "aaaaa";
    final int arg2 = 1;
    final int arg3 = 1;

    // Act, creating object to test constructor
    final PreparedStatement actual = new PreparedStatement(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1L, actual.getId());
    Assert.assertEquals(1, actual.getParametersNumber());
    Assert.assertEquals(1, actual.getColumnsNumber());
    Assert.assertEquals("aaaaa", actual.getStatement());
    Assert.assertArrayEquals(new int[]{ 0 }, actual.getParametersType());

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnsNumberOutputPositive999afe8a37ed651eac0() {

    // Arrange
    final PreparedStatement thisObj = new PreparedStatement(1L, "aaaaa", 1, 1);

    // Act
    final int actual = thisObj.getColumnsNumber();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getIdOutputPositive9995b4519b9770d277e() {

    // Arrange
    final PreparedStatement thisObj = new PreparedStatement(1L, "aaaaa", 1, 1);

    // Act
    final long actual = thisObj.getId();

    // Assert result
    Assert.assertEquals(1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getParametersNumberOutputPositive999889b465541f48d13() {

    // Arrange
    final PreparedStatement thisObj = new PreparedStatement(1L, "aaaaa", 1, 1);

    // Act
    final int actual = thisObj.getParametersNumber();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getParametersTypeOutput1999e39588a049291bb5() {

    // Arrange
    final PreparedStatement thisObj = new PreparedStatement(1L, "aaaaa", 1, 1);

    // Act
    final int[] actual = thisObj.getParametersType();

    // Assert result
    Assert.assertArrayEquals(new int[]{ 0 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getStatementOutputNotNull999a2a6fc579389c534() {

    // Arrange
    final PreparedStatement thisObj = new PreparedStatement(1L, "aaaaa", 1, 1);

    // Act
    final String actual = thisObj.getStatement();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }
}
