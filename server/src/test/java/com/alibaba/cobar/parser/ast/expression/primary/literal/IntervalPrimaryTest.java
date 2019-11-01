package com.alibaba.cobar.parser.ast.expression.primary.literal;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.literal.IntervalPrimary.Unit;
import com.alibaba.cobar.parser.ast.expression.primary.literal.IntervalPrimary;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class IntervalPrimaryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999301eaa970d0218d9() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IntervalPrimary thisObj = new IntervalPrimary(arithmeticAddExpression, IntervalPrimary.Unit.MICROSECOND);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullMicrosecondOutputNotNull999c23b9cebcb49c7f0() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final IntervalPrimary.Unit arg1 = IntervalPrimary.Unit.MICROSECOND;

    // Act, creating object to test constructor
    final IntervalPrimary actual = new IntervalPrimary(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getQuantity());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getQuantity()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getQuantity()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getQuantity()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getQuantity()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getQuantity()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getQuantity()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getQuantity()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getQuantity()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getQuantity()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getQuantity()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getQuantity()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getQuantity()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getQuantity()).getRightOprand());
    Assert.assertEquals(IntervalPrimary.Unit.MICROSECOND, actual.getUnit());

  }

  // Test written by Diffblue Cover
  @Test
  public void getIntervalUnitInputNotNullOutputVoid999756cba34e62f2d75() {

    // Arrange
    final String arg0 = "quantity expression is null";

    // Act
    final IntervalPrimary.Unit actual = IntervalPrimary.getIntervalUnit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getQuantityOutputNotNull999d1d5b6adebb540c5() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IntervalPrimary thisObj = new IntervalPrimary(arithmeticAddExpression, IntervalPrimary.Unit.MICROSECOND);

    // Act
    final Expression actual = thisObj.getQuantity();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(((ArithmeticAddExpression) actual).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getUnitOutputMicrosecond999f83b6424d66ac14d() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IntervalPrimary thisObj = new IntervalPrimary(arithmeticAddExpression, IntervalPrimary.Unit.MICROSECOND);

    // Act
    final IntervalPrimary.Unit actual = thisObj.getUnit();

    // Assert result
    Assert.assertEquals(IntervalPrimary.Unit.MICROSECOND, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputDay99991bc746c0ed875d1() {

    // Arrange
    final String arg0 = "DAY";

    // Act
    final IntervalPrimary.Unit actual = IntervalPrimary.Unit.valueOf(arg0);

    // Assert result
    Assert.assertEquals(IntervalPrimary.Unit.DAY, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput2099929cb8a5896c14434() {

    // Act
    final IntervalPrimary.Unit[] actual = IntervalPrimary.Unit.values();

    // Assert result
    Assert.assertArrayEquals(new IntervalPrimary.Unit[]{ IntervalPrimary.Unit.MICROSECOND, IntervalPrimary.Unit.SECOND, IntervalPrimary.Unit.MINUTE, IntervalPrimary.Unit.HOUR, IntervalPrimary.Unit.DAY, IntervalPrimary.Unit.WEEK, IntervalPrimary.Unit.MONTH, IntervalPrimary.Unit.QUARTER, IntervalPrimary.Unit.YEAR, IntervalPrimary.Unit.SECOND_MICROSECOND, IntervalPrimary.Unit.MINUTE_MICROSECOND, IntervalPrimary.Unit.MINUTE_SECOND, IntervalPrimary.Unit.HOUR_MICROSECOND, IntervalPrimary.Unit.HOUR_SECOND, IntervalPrimary.Unit.HOUR_MINUTE, IntervalPrimary.Unit.DAY_MICROSECOND, IntervalPrimary.Unit.DAY_SECOND, IntervalPrimary.Unit.DAY_MINUTE, IntervalPrimary.Unit.DAY_HOUR, IntervalPrimary.Unit.YEAR_MONTH }, actual);

  }
}
