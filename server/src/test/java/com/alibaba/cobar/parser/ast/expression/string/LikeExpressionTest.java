package com.alibaba.cobar.parser.ast.expression.string;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.string.LikeExpression;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LikeExpressionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999915a670baf617067() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final LikeExpression thisObj = new LikeExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullNotNullNotNullOutputNotNull99990e0caad55228522() {

    // Arrange
    final boolean arg0 = true;
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg1 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final Expression arg2 = arithmeticAddExpression;
    final Expression arg3 = arithmeticAddExpression1;

    // Act, creating object to test constructor
    final LikeExpression actual = new LikeExpression(arg0, arg1, arg2, arg3);

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
  public void getPrecedenceOutputPositive999fbc2251a51e66d02() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final LikeExpression thisObj = new LikeExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);

    // Act
    final int actual = thisObj.getPrecedence();

    // Assert result
    Assert.assertEquals(7, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNotOutputTrue9993b19dafbf275c762() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final LikeExpression thisObj = new LikeExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);

    // Act
    final boolean actual = thisObj.isNot();

    // Assert result
    Assert.assertTrue(actual);

  }
}
