package com.alibaba.cobar.parser.util;

import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.MinusExpression;
import com.alibaba.cobar.parser.util.ExprEvalUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ExprEvalUtilsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullNotNullNotNullOutputNotNull999f18dd5dd20a8e19e() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final Integer arg1 = new Integer(0);
    final Integer arg2 = new Integer(0);

    // Act
    final Number actual = ExprEvalUtils.calculate(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullNotNullOutputNotNull9994a37aae5ca2f83e3() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final MinusExpression arg0 = new MinusExpression(arithmeticAddExpression);
    final Integer arg1 = new Integer(0);

    // Act
    final Number actual = ExprEvalUtils.calculate(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999cf99ea95f6e59632() {

    // Act, creating object to test constructor
    final ExprEvalUtils actual = new ExprEvalUtils();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void convertNum2SameLevelInputNotNullNotNullOutputIllegalArgumentException9993799de7c322a10fe() {

    // Arrange
    final Object arg0 = "unrecognized number: ";
    final Object arg1 = "unrecognized number: ";

    // Act
    thrown.expect(IllegalArgumentException.class);
    ExprEvalUtils.convertNum2SameLevel(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void obj2boolInputNotNullOutputIllegalArgumentException9991417c8a96f9d6374() {

    // Arrange
    final Object arg0 = "unrecognized number: ";

    // Act
    thrown.expect(IllegalArgumentException.class);
    ExprEvalUtils.obj2bool(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void string2NumberInputNotNullOutputIllegalArgumentException99942070d5ffe8618b9() {

    // Arrange
    final String arg0 = "unrecognized number: ";

    // Act
    thrown.expect(IllegalArgumentException.class);
    ExprEvalUtils.string2Number(arg0);

    // The method is not expected to return due to exception thrown

  }
}
