package com.alibaba.cobar.parser.ast.expression.comparison;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.comparison.BetweenAndExpression;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BetweenAndExpressionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999fd9eab69a0bc0ef4() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final BetweenAndExpression thisObj = new BetweenAndExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearReplaceExprOutputVoid999222a33f061e9104e() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final BetweenAndExpression thisObj = new BetweenAndExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);

    // Act
    thisObj.clearReplaceExpr();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullNotNullNotNullOutputNotNull9996b7151647d94e78d() {

    // Arrange
    final boolean arg0 = true;
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg1 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final Expression arg2 = arithmeticAddExpression;
    final Expression arg3 = arithmeticAddExpression1;

    // Act, creating object to test constructor
    final BetweenAndExpression actual = new BetweenAndExpression(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isNot());
    Assert.assertNotNull(actual.getSecond());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getSecond()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getSecond()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getSecond()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getSecond()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getSecond()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getSecond()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getSecond()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getSecond()).getLeftOprand(), ((ArithmeticAddExpression) actual.getSecond()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getSecond()).getLeftOprand(), actual.getThird());
    Assert.assertNotNull(actual.getFirst());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getFirst()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getFirst()).getPrecedence());
    Assert.assertEquals(actual.getSecond(), ((ArithmeticAddExpression) actual.getFirst()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getFirst()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getPrecedenceOutputPositive999ff7c32e4d5005680() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final BetweenAndExpression thisObj = new BetweenAndExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);

    // Act
    final int actual = thisObj.getPrecedence();

    // Assert result
    Assert.assertEquals(6, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNotOutputTrue9994d33228545471c51() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final BetweenAndExpression thisObj = new BetweenAndExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);

    // Act
    final boolean actual = thisObj.isNot();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setReplaceExprInputNotNullOutputVoid9990a9bad90b3313eb9() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final BetweenAndExpression thisObj = new BetweenAndExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);
    final Expression arg0 = arithmeticAddExpression;

    // Act
    thisObj.setReplaceExpr(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
