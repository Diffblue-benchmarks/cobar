package com.alibaba.cobar.parser.recognizer.mysql;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.FunctionExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.arithmetic.Abs;
import com.alibaba.cobar.parser.recognizer.mysql.MySQLFunctionManager.FunctionParsingStrategy;
import com.alibaba.cobar.parser.recognizer.mysql.MySQLFunctionManager;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;



public class MySQLFunctionManagerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputAvg999815062c72aed823b() {

    // Arrange
    final String arg0 = "AVG";

    // Act
    final FunctionParsingStrategy actual = FunctionParsingStrategy.valueOf(arg0);

    // Assert result
    Assert.assertEquals(FunctionParsingStrategy.AVG, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput199990b2ae98b5ff78c24() {

    // Act
    final FunctionParsingStrategy[] actual = FunctionParsingStrategy.values();

    // Assert result
    Assert.assertArrayEquals(new FunctionParsingStrategy[]{ FunctionParsingStrategy._DEFAULT, FunctionParsingStrategy._ORDINARY, FunctionParsingStrategy.CAST, FunctionParsingStrategy.POSITION, FunctionParsingStrategy.SUBSTRING, FunctionParsingStrategy.TRIM, FunctionParsingStrategy.AVG, FunctionParsingStrategy.COUNT, FunctionParsingStrategy.GROUP_CONCAT, FunctionParsingStrategy.MAX, FunctionParsingStrategy.MIN, FunctionParsingStrategy.SUM, FunctionParsingStrategy.ROW, FunctionParsingStrategy.CHAR, FunctionParsingStrategy.CONVERT, FunctionParsingStrategy.EXTRACT, FunctionParsingStrategy.TIMESTAMPADD, FunctionParsingStrategy.TIMESTAMPDIFF, FunctionParsingStrategy.GET_FORMAT }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void addExtendFunctionInputNotNullOutputVoid9993a9401ca00e94e28() {

    // Arrange
    final MySQLFunctionManager thisObj = new MySQLFunctionManager(true);
    final HashMap<String, FunctionExpression> arg0 = new HashMap<String, FunctionExpression>();
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    arrayList.add(arithmeticAddExpression);
    final Abs abs = new Abs(arrayList);
    arg0.put("' is MySQL's predefined function!", abs);

    // Act
    thisObj.addExtendFunction(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueOutputNotNull999986bb2bc8ba80482() {

    // Arrange
    final boolean arg0 = true;

    // Act, creating object to test constructor
    final MySQLFunctionManager actual = new MySQLFunctionManager(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void createFunctionExpressionInputNotNullNotNullOutputVoid9993227a51f9ff4a1d5() {

    // Arrange
    final MySQLFunctionManager thisObj = new MySQLFunctionManager(true);
    final String arg0 = "' is MySQL's predefined function!";
    final ArrayList<Expression> arg1 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg1.add(arithmeticAddExpression);

    // Act
    final FunctionExpression actual = thisObj.createFunctionExpression(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getParsingStrategyInputNotNullOutput_default9994e92fbb31a249286() {

    // Arrange
    final MySQLFunctionManager thisObj = new MySQLFunctionManager(true);
    final String arg0 = "' is MySQL's predefined function!";

    // Act
    final FunctionParsingStrategy actual = thisObj.getParsingStrategy(arg0);

    // Assert result
    Assert.assertEquals(FunctionParsingStrategy._DEFAULT, actual);

  }
}
