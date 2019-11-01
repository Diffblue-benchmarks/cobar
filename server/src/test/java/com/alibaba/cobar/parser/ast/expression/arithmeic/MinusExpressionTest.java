package com.alibaba.cobar.parser.ast.expression.arithmeic;

import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.MinusExpression;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;



public class MinusExpressionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullOutputNotNull999339a35ad441cfa18() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final MinusExpression thisObj = new MinusExpression(arithmeticAddExpression);
    final Integer arg0 = new Integer(-2147483648);

    // Act
    final Number actual = thisObj.calculate(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullOutputNotNull999bed6618f02da57fa() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final MinusExpression thisObj = new MinusExpression(arithmeticAddExpression);
    final Long arg0 = new Long(-9223372036854775808L);

    // Act
    final Number actual = thisObj.calculate(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullOutputNotNull999b8dbde05de218b2e() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final MinusExpression thisObj = new MinusExpression(arithmeticAddExpression);
    final BigDecimal arg0 = new BigDecimal(1.0);

    // Act
    final Number actual = thisObj.calculate(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullOutputNotNull99900729859cba07ee5() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final MinusExpression thisObj = new MinusExpression(arithmeticAddExpression);
    final byte[] myByteArray = { (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15, (short) 15 };
    final BigInteger arg0 = new BigInteger(myByteArray);

    // Act
    final Number actual = thisObj.calculate(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertArrayEquals(new int[]{ 252645135, 252645135, 252645135, 252645135, 252645135, 252645135 }, ((int[]) Reflector.getInstanceField(actual, "mag")));
    Assert.assertEquals(-1, Reflector.getInstanceField(actual, "signum"));

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999d2da4737eaa2b972() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final MinusExpression actual = new MinusExpression(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getOperand());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getOperand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getOperand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getOperand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOperand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOperand()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOperand()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOperand()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOperand()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOperand()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOperand()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOperand()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOperand()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getOperand()).getRightOprand());
    Assert.assertEquals(15, actual.getPrecedence());

  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputNullPointerException999a810ecf41244e16b() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final MinusExpression thisObj = new MinusExpression(arithmeticAddExpression);
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("aaaak", "aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.evaluationInternal(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getOperatorOutputNotNull999f8ddee6f181f9afc() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final MinusExpression thisObj = new MinusExpression(arithmeticAddExpression);

    // Act
    final String actual = thisObj.getOperator();

    // Assert result
    Assert.assertEquals("-", actual);

  }
}
