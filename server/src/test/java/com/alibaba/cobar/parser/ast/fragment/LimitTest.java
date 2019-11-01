package com.alibaba.cobar.parser.ast.fragment;

import com.alibaba.cobar.parser.ast.expression.primary.ParamMarker;
import com.alibaba.cobar.parser.ast.fragment.Limit;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LimitTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99955c62b9ba191e18c() {

    // Arrange
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit thisObj = new Limit(paramMarker, paramMarker1);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9998f8a58dd2254cc93() {

    // Arrange
    final ParamMarker arg0 = new ParamMarker(1);
    final ParamMarker arg1 = new ParamMarker(1);

    // Act, creating object to test constructor
    final Limit actual = new Limit(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99923cddbf67074d708() {

    // Arrange
    final ParamMarker arg0 = new ParamMarker(1);
    final Integer arg1 = new Integer(1);

    // Act, creating object to test constructor
    final Limit actual = new Limit(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999a878717475e2bd7a() {

    // Arrange
    final Integer arg0 = new Integer(1);
    final ParamMarker arg1 = new ParamMarker(1);

    // Act, creating object to test constructor
    final Limit actual = new Limit(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9997caf7f10393ef639() {

    // Arrange
    final Integer arg0 = new Integer(1);
    final Integer arg1 = new Integer(1);

    // Act, creating object to test constructor
    final Limit actual = new Limit(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOffsetOutputNotNull99959a2ac24848cd2f5() {

    // Arrange
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit thisObj = new Limit(paramMarker, paramMarker1);

    // Act
    final Object actual = thisObj.getOffset();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, ((ParamMarker) actual).getParamIndex());

  }

  // Test written by Diffblue Cover
  @Test
  public void getSizeOutputNotNull99989a04f26f7b8a958() {

    // Arrange
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit thisObj = new Limit(paramMarker, paramMarker1);

    // Act
    final Object actual = thisObj.getSize();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, ((ParamMarker) actual).getParamIndex());

  }
}
