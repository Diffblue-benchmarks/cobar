package com.alibaba.cobar.parser.ast.expression.arithmeic;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticDivideExpression;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;



public class ArithmeticDivideExpressionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99914a399d82367ad3f() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArithmeticDivideExpression thisObj = new ArithmeticDivideExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullNotNullOutputUnsupportedOperationException999f69b0efd74b232b9() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArithmeticDivideExpression thisObj = new ArithmeticDivideExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final Integer arg0 = new Integer(13);
    final Integer arg1 = new Integer(13);

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.calculate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullNullOutputUnsupportedOperationException999db85d0114d8565a5() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArithmeticDivideExpression thisObj = new ArithmeticDivideExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final Long arg0 = new Long(1L);
    final Long arg1 = null;

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.calculate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullNotNullOutputUnsupportedOperationException9995ff1af3827a3734f() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArithmeticDivideExpression thisObj = new ArithmeticDivideExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final BigDecimal arg0 = new BigDecimal(1.0);
    final BigDecimal arg1 = new BigDecimal(1.0);

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.calculate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullNotNullOutputUnsupportedOperationException999bf5f3f7a158ad7c5() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArithmeticDivideExpression thisObj = new ArithmeticDivideExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final byte[] myByteArray = { (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13 };
    final BigInteger arg0 = new BigInteger(myByteArray);
    final byte[] myByteArray1 = { (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13, (short) 13 };
    final BigInteger arg1 = new BigInteger(myByteArray1);

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.calculate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9995d20ec1395cddb2d() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final Expression arg1 = arithmeticAddExpression;

    // Act, creating object to test constructor
    final ArithmeticDivideExpression actual = new ArithmeticDivideExpression(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isLeftCombine());
    Assert.assertEquals(13, actual.getPrecedence());
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
  public void getOperatorOutputNotNull9994fdc1ec55e31a279() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArithmeticDivideExpression thisObj = new ArithmeticDivideExpression(arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    final String actual = thisObj.getOperator();

    // Assert result
    Assert.assertEquals("/", actual);

  }
}
