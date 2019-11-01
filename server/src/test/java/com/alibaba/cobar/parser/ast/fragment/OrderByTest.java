package com.alibaba.cobar.parser.ast.fragment;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.fragment.OrderBy;
import com.alibaba.cobar.parser.ast.fragment.SortOrder;
import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class OrderByTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999f14313813878f301() {

    // Arrange
    final OrderBy thisObj = new OrderBy();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addOrderByItemInputNotNullAscOutputNotNull9997dcfef03cb1b2522() {

    // Arrange
    final OrderBy thisObj = new OrderBy();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final SortOrder arg1 = SortOrder.ASC;

    // Act
    final OrderBy actual = thisObj.addOrderByItem(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(thisObj.getOrderByList());
    Assert.assertEquals(1, thisObj.getOrderByList().size());
    Assert.assertNotNull(thisObj.getOrderByList().get(0));
    Assert.assertNotNull(((Pair) thisObj.getOrderByList().get(0)).getKey());
    Assert.assertTrue(((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((Pair) thisObj.getOrderByList().get(0)).getKey()).getRightOprand());
    Assert.assertEquals(SortOrder.ASC, ((Pair) thisObj.getOrderByList().get(0)).getValue());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getOrderByList());
    Assert.assertEquals(1, actual.getOrderByList().size());
    Assert.assertNotNull(actual.getOrderByList().get(0));
    Assert.assertNotNull(((Pair) actual.getOrderByList().get(0)).getKey());
    Assert.assertTrue(((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getRightOprand());
    Assert.assertEquals(SortOrder.ASC, ((Pair) actual.getOrderByList().get(0)).getValue());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995614c573e3e7df4f() {

    // Act, creating object to test constructor
    final OrderBy actual = new OrderBy();

    // Assert result
    Assert.assertNotNull(actual);
    final LinkedList<Pair<Expression, SortOrder>> linkedList = new LinkedList<Pair<Expression, SortOrder>>();
    Assert.assertEquals(linkedList, actual.getOrderByList());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullAscOutputNotNull999caeecac7265798da() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final SortOrder arg1 = SortOrder.ASC;

    // Act, creating object to test constructor
    final OrderBy actual = new OrderBy(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getOrderByList());
    Assert.assertEquals(1, actual.getOrderByList().size());
    Assert.assertNotNull(actual.getOrderByList().get(0));
    Assert.assertNotNull(((Pair) actual.getOrderByList().get(0)).getKey());
    Assert.assertTrue(((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getRightOprand());
    Assert.assertEquals(SortOrder.ASC, ((Pair) actual.getOrderByList().get(0)).getValue());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999c6456389b14e5934() {

    // Arrange
    final ArrayList<Pair<Expression, SortOrder>> arg0 = new ArrayList<Pair<Expression, SortOrder>>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final Pair<Expression, SortOrder> pair = new Pair<Expression, SortOrder>(arithmeticAddExpression, SortOrder.ASC);
    arg0.add(pair);

    // Act, creating object to test constructor
    final OrderBy actual = new OrderBy(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getOrderByList());
    Assert.assertEquals(1, actual.getOrderByList().size());
    Assert.assertNotNull(actual.getOrderByList().get(0));
    Assert.assertNotNull(((Pair) actual.getOrderByList().get(0)).getKey());
    Assert.assertTrue(((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getLeftOprand(), ((ArithmeticAddExpression) ((Pair) actual.getOrderByList().get(0)).getKey()).getRightOprand());
    Assert.assertEquals(SortOrder.ASC, ((Pair) actual.getOrderByList().get(0)).getValue());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderByListOutput0999ae3a261b4a7d990c() {

    // Arrange
    final OrderBy thisObj = new OrderBy();

    // Act
    final List<Pair<Expression, SortOrder>> actual = thisObj.getOrderByList();

    // Assert result
    final LinkedList<Pair<Expression, SortOrder>> linkedList = new LinkedList<Pair<Expression, SortOrder>>();
    Assert.assertEquals(linkedList, actual);

  }
}
