package com.alibaba.cobar.route.function;

import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.route.function.ExpressionAdapter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;



public class ExpressionAdapterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void calculateInputNotNullOutputNullPointerException999e423a8fda4a57a95() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ExpressionAdapter thisObj = new ExpressionAdapter(arithmeticAddExpression);
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("rule calculate err: result of route function is wrong type or null: ", "rule calculate err: result of route function is wrong type or null: ");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.calculate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9995d4f35305c371844() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final ExpressionAdapter actual = new ExpressionAdapter(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initializeOutputVoid999f9cb3a44a3d47c5a() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ExpressionAdapter thisObj = new ExpressionAdapter(arithmeticAddExpression);

    // Act
    thisObj.initialize();

    // The method returns void, testing that no exception is thrown

  }
}
