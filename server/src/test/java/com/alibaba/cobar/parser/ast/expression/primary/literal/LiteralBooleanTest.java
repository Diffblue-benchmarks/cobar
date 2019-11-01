package com.alibaba.cobar.parser.ast.expression.primary.literal;

import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralBoolean;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;



public class LiteralBooleanTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999bf741f3db50959ff() {

    // Arrange
    final LiteralBoolean thisObj = new LiteralBoolean(true);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueOutputNotNull99997bd7c278c914617() {

    // Arrange
    final boolean arg0 = true;

    // Act, creating object to test constructor
    final LiteralBoolean actual = new LiteralBoolean(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isTrue());

  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputNotNull999a56c396f636349d2() {

    // Arrange
    final LiteralBoolean thisObj = new LiteralBoolean(true);
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("aaaaa", "aaaaa");

    // Act
    final Object actual = thisObj.evaluationInternal(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isTrueOutputTrue99928e8809432560200() {

    // Arrange
    final LiteralBoolean thisObj = new LiteralBoolean(true);

    // Act
    final boolean actual = thisObj.isTrue();

    // Assert result
    Assert.assertTrue(actual);

  }
}
