package com.alibaba.cobar.parser.ast.fragment;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.fragment.GroupBy;
import com.alibaba.cobar.parser.ast.fragment.SortOrder;
import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.LinkedList;
import java.util.List;



public class GroupByTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999059ed5acfdf80272() {

    // Arrange
    final GroupBy thisObj = new GroupBy();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addOrderByItemInputNotNullAscOutputNotNull999f5a40d0747fcadc6() {

    // Arrange
    final GroupBy thisObj = new GroupBy();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final SortOrder arg1 = SortOrder.ASC;

    // Act
    final GroupBy actual = thisObj.addOrderByItem(arg0, arg1);

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
    Assert.assertFalse(actual.isWithRollup());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999893f879582e1037e() {

    // Act, creating object to test constructor
    final GroupBy actual = new GroupBy();

    // Assert result
    Assert.assertNotNull(actual);
    final LinkedList<Pair<Expression, SortOrder>> linkedList = new LinkedList<Pair<Expression, SortOrder>>();
    Assert.assertEquals(linkedList, actual.getOrderByList());
    Assert.assertFalse(actual.isWithRollup());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullAscTrueOutputNotNull99953bc5b1705311f8b() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final SortOrder arg1 = SortOrder.ASC;
    final boolean arg2 = true;

    // Act, creating object to test constructor
    final GroupBy actual = new GroupBy(arg0, arg1, arg2);

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
    Assert.assertTrue(actual.isWithRollup());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderByListOutput09994999a215ec821607() {

    // Arrange
    final GroupBy thisObj = new GroupBy();

    // Act
    final List<Pair<Expression, SortOrder>> actual = thisObj.getOrderByList();

    // Assert result
    final LinkedList<Pair<Expression, SortOrder>> linkedList = new LinkedList<Pair<Expression, SortOrder>>();
    Assert.assertEquals(linkedList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isWithRollupOutputFalse999598ef687a7ec9e59() {

    // Arrange
    final GroupBy thisObj = new GroupBy();

    // Act
    final boolean actual = thisObj.isWithRollup();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setWithRollupOutputNotNull999045da66d9b5d93c5() {

    // Arrange
    final GroupBy thisObj = new GroupBy();

    // Act
    final GroupBy actual = thisObj.setWithRollup();

    // Assert side effects
    Assert.assertTrue(thisObj.isWithRollup());

    // Assert result
    Assert.assertNotNull(actual);
    final LinkedList<Pair<Expression, SortOrder>> linkedList = new LinkedList<Pair<Expression, SortOrder>>();
    Assert.assertEquals(linkedList, actual.getOrderByList());
    Assert.assertTrue(actual.isWithRollup());

  }
}
