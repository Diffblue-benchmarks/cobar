package com.alibaba.cobar.parser.ast.expression.bit;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.bit.BitAndExpression;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BitAndExpressionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9996c590e47f4b06cdc() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final BitAndExpression thisObj = new BitAndExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99959afb9b2fd4bac06() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final Expression arg1 = arithmeticAddExpression;

    // Act, creating object to test constructor
    final BitAndExpression actual = new BitAndExpression(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isLeftCombine());
    Assert.assertEquals(10, actual.getPrecedence());
    Assert.assertNotNull(actual.getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getLeftOprand()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getLeftOprand()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getLeftOprand()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getLeftOprand()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getLeftOprand()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getLeftOprand()).getLeftOprand(), actual.getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOperatorOutputNotNull9998b5f822690b182b1() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final BitAndExpression thisObj = new BitAndExpression(arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    final String actual = thisObj.getOperator();

    // Assert result
    Assert.assertEquals("&", actual);

  }
}
