package com.alibaba.cobar.parser.ast.expression.primary;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.CaseWhenOperatorExpression;
import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class CaseWhenOperatorExpressionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99959858a55e2a31700() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArrayList<Pair<Expression, Expression>> arrayList = new ArrayList<Pair<Expression, Expression>>();
    final Pair<Expression, Expression> pair = new Pair<Expression, Expression>(arithmeticAddExpression, arithmeticAddExpression1);
    arrayList.add(pair);
    final CaseWhenOperatorExpression thisObj = new CaseWhenOperatorExpression(arithmeticAddExpression, arrayList, arithmeticAddExpression2);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull999df4faa85e65df0a6() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final ArrayList<Pair<Expression, Expression>> arg1 = new ArrayList<Pair<Expression, Expression>>();
    final Pair<Expression, Expression> pair = new Pair<Expression, Expression>(arg0, arithmeticAddExpression);
    arg1.add(pair);
    final Expression arg2 = arithmeticAddExpression1;

    // Act, creating object to test constructor
    final CaseWhenOperatorExpression actual = new CaseWhenOperatorExpression(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getElseResult());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getElseResult()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getElseResult()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) actual.getElseResult()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getElseResult()).getRightOprand());
    Assert.assertNotNull(actual.getComparee());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getComparee()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getComparee()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getComparee()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getComparee()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getComparee()).getLeftOprand()).getPrecedence());
    Assert.assertEquals(actual.getElseResult(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getComparee()).getLeftOprand()).getLeftOprand());
    Assert.assertEquals(actual.getElseResult(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getComparee()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getComparee()).getRightOprand());
    Assert.assertNotNull(actual.getWhenList());
    Assert.assertEquals(1, actual.getWhenList().size());
    Assert.assertNotNull(actual.getWhenList().get(0));
    Assert.assertEquals(actual.getComparee(), ((Pair) actual.getWhenList().get(0)).getKey());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getComparee()).getLeftOprand(), ((Pair) actual.getWhenList().get(0)).getValue());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCompareeOutputNotNull9990ded153f903efd74() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArrayList<Pair<Expression, Expression>> arrayList = new ArrayList<Pair<Expression, Expression>>();
    final Pair<Expression, Expression> pair = new Pair<Expression, Expression>(arithmeticAddExpression, arithmeticAddExpression1);
    arrayList.add(pair);
    final CaseWhenOperatorExpression thisObj = new CaseWhenOperatorExpression(arithmeticAddExpression, arrayList, arithmeticAddExpression2);

    // Act
    final Expression actual = thisObj.getComparee();

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
  public void getElseResultOutputNotNull9995bba05719c12b2d6() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArrayList<Pair<Expression, Expression>> arrayList = new ArrayList<Pair<Expression, Expression>>();
    final Pair<Expression, Expression> pair = new Pair<Expression, Expression>(arithmeticAddExpression, arithmeticAddExpression1);
    arrayList.add(pair);
    final CaseWhenOperatorExpression thisObj = new CaseWhenOperatorExpression(arithmeticAddExpression, arrayList, arithmeticAddExpression2);

    // Act
    final Expression actual = thisObj.getElseResult();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(((ArithmeticAddExpression) actual).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) actual).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getWhenListOutput1999b2da356a0a7205da() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArrayList<Pair<Expression, Expression>> arrayList = new ArrayList<Pair<Expression, Expression>>();
    final Pair<Expression, Expression> pair = new Pair<Expression, Expression>(arithmeticAddExpression, arithmeticAddExpression1);
    arrayList.add(pair);
    final CaseWhenOperatorExpression thisObj = new CaseWhenOperatorExpression(arithmeticAddExpression, arrayList, arithmeticAddExpression2);

    // Act
    final List<Pair<Expression, Expression>> actual = thisObj.getWhenList();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertNotNull(((Pair) actual.get(0)).getKey());
    Assert.assertTrue(((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((Pair) actual.get(0)).getKey()).getLeftOprand(), ((Pair) actual.get(0)).getValue());

  }
}
