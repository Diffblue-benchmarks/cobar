package com.alibaba.cobar.parser.ast.expression.primary;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.MatchExpression.Modifier;
import com.alibaba.cobar.parser.ast.expression.primary.MatchExpression;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class MatchExpressionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9997a59292b8c5f0d30() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final MatchExpression thisObj = new MatchExpression(arrayList, arithmeticAddExpression2, MatchExpression.Modifier._DEFAULT);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNull_defaultOutputNotNull999ddb1d5c8233424a1() {

    // Arrange
    final ArrayList<Expression> arg0 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg0.add(arithmeticAddExpression);
    final Expression arg1 = arithmeticAddExpression1;
    final MatchExpression.Modifier arg2 = MatchExpression.Modifier._DEFAULT;

    // Act, creating object to test constructor
    final MatchExpression actual = new MatchExpression(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(MatchExpression.Modifier._DEFAULT, actual.getModifier());
    Assert.assertNotNull(actual.getColumns());
    Assert.assertEquals(1, actual.getColumns().size());
    Assert.assertNotNull(actual.getColumns().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColumns().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColumns().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getColumns().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0)).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0)).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0)).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0)).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0)).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getColumns().get(0)).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColumns().get(0)).getLeftOprand(), actual.getPattern());

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnsOutput1999a9901dd16ce3b6d9() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final MatchExpression thisObj = new MatchExpression(arrayList, arithmeticAddExpression2, MatchExpression.Modifier._DEFAULT);

    // Act
    final List<Expression> actual = thisObj.getColumns();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertTrue(((ArithmeticAddExpression) actual.get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.get(0)).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.get(0)).getLeftOprand(), ((ArithmeticAddExpression) actual.get(0)).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getModifierOutput_default999e96a8a8f8d5af90c() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final MatchExpression thisObj = new MatchExpression(arrayList, arithmeticAddExpression2, MatchExpression.Modifier._DEFAULT);

    // Act
    final MatchExpression.Modifier actual = thisObj.getModifier();

    // Assert result
    Assert.assertEquals(MatchExpression.Modifier._DEFAULT, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPatternOutputNotNull999bc1254814e356de5() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final MatchExpression thisObj = new MatchExpression(arrayList, arithmeticAddExpression2, MatchExpression.Modifier._DEFAULT);

    // Act
    final Expression actual = thisObj.getPattern();

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
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) actual).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputIn_boolean_mode999e1d4c7973770734e() {

    // Arrange
    final String arg0 = "IN_BOOLEAN_MODE";

    // Act
    final MatchExpression.Modifier actual = MatchExpression.Modifier.valueOf(arg0);

    // Assert result
    Assert.assertEquals(MatchExpression.Modifier.IN_BOOLEAN_MODE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput5999937cec0e04cb469f() {

    // Act
    final MatchExpression.Modifier[] actual = MatchExpression.Modifier.values();

    // Assert result
    Assert.assertArrayEquals(new MatchExpression.Modifier[]{ MatchExpression.Modifier._DEFAULT, MatchExpression.Modifier.IN_BOOLEAN_MODE, MatchExpression.Modifier.IN_NATURAL_LANGUAGE_MODE, MatchExpression.Modifier.IN_NATURAL_LANGUAGE_MODE_WITH_QUERY_EXPANSION, MatchExpression.Modifier.WITH_QUERY_EXPANSION }, actual);

  }
}
