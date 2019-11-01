package com.alibaba.cobar.parser.ast.expression.primary;

import com.alibaba.cobar.parser.ast.expression.primary.ParamMarker;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;



public class ParamMarkerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999a1bbde46f7716d98() {

    // Arrange
    final ParamMarker thisObj = new ParamMarker(1);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull99999036ef105a88b1c() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final ParamMarker actual = new ParamMarker(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getParamIndex());

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse99983e31b3e3a4aa281() {

    // Arrange
    final ParamMarker thisObj = new ParamMarker(1);
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputVoid999bb568786fec494bf() {

    // Arrange
    final ParamMarker thisObj = new ParamMarker(1);
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("aaaaa", "aaaaa");

    // Act
    final Object actual = thisObj.evaluationInternal(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getParamIndexOutputPositive999dad5795a507c59b0() {

    // Arrange
    final ParamMarker thisObj = new ParamMarker(1);

    // Act
    final int actual = thisObj.getParamIndex();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive999975f3f5779d59a5e() {

    // Arrange
    final ParamMarker thisObj = new ParamMarker(1);

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
