package com.alibaba.cobar.parser.ast.fragment.tableref;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.fragment.tableref.Dual;
import com.alibaba.cobar.parser.ast.fragment.tableref.OuterJoin;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableReference;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class OuterJoinTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999d7c60b38501918a0() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin thisObj = new OuterJoin(true, dual, dual1, arithmeticAddExpression);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullNotNullNotNullOutputNotNull999d0fa1b53424ee868() {

    // Arrange
    final boolean arg0 = true;
    final Dual arg1 = new Dual();
    final Dual arg2 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg3 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final OuterJoin actual = new OuterJoin(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getLeftTableRef());
    Assert.assertNotNull(actual.getRightTableRef());
    Assert.assertTrue(actual.isLeftJoin());
    Assert.assertNotNull(actual.getOnCond());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getOnCond()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getOnCond()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getOnCond()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOnCond()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOnCond()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOnCond()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOnCond()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOnCond()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOnCond()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOnCond()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOnCond()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getOnCond()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getOnCond()).getRightOprand());
    Assert.assertNull(actual.getUsing());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullNotNullNotNullOutputNotNull99908327fe0cd717080() {

    // Arrange
    final boolean arg0 = true;
    final Dual arg1 = new Dual();
    final Dual arg2 = new Dual();
    final ArrayList<String> arg3 = new ArrayList<String>();
    arg3.add("aaaaa");

    // Act, creating object to test constructor
    final OuterJoin actual = new OuterJoin(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getLeftTableRef());
    Assert.assertNotNull(actual.getRightTableRef());
    Assert.assertTrue(actual.isLeftJoin());
    Assert.assertNull(actual.getOnCond());
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Assert.assertEquals(arrayList, actual.getUsing());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLeftTableRefOutputNotNull999710d54a76d69685a() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin thisObj = new OuterJoin(true, dual, dual1, arithmeticAddExpression);

    // Act
    final TableReference actual = thisObj.getLeftTableRef();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOnCondOutputNotNull999a5062608eb0a4d87() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin thisObj = new OuterJoin(true, dual, dual1, arithmeticAddExpression);

    // Act
    final Expression actual = thisObj.getOnCond();

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
  public void getPrecedenceOutputPositive999a632b0669541674b() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin thisObj = new OuterJoin(true, dual, dual1, arithmeticAddExpression);

    // Act
    final int actual = thisObj.getPrecedence();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRightTableRefOutputNotNull999a2ce8fafe0f2a207() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin thisObj = new OuterJoin(true, dual, dual1, arithmeticAddExpression);

    // Act
    final TableReference actual = thisObj.getRightTableRef();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getUsingOutputVoid9990fe965374d8bf4ea() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin thisObj = new OuterJoin(true, dual, dual1, arithmeticAddExpression);

    // Act
    final List<String> actual = thisObj.getUsing();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isLeftJoinOutputTrue99933fc814d2278ca6a() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin thisObj = new OuterJoin(true, dual, dual1, arithmeticAddExpression);

    // Act
    final boolean actual = thisObj.isLeftJoin();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSingleTableOutputFalse9992073b2ab4a58711b() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin thisObj = new OuterJoin(true, dual, dual1, arithmeticAddExpression);

    // Act
    final boolean actual = thisObj.isSingleTable();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeLastConditionElementOutputVoid9990cd363e844cf33ee() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin thisObj = new OuterJoin(true, dual, dual1, arithmeticAddExpression);

    // Act
    final Object actual = thisObj.removeLastConditionElement();

    // The method returns void, testing that no exception is thrown

  }
}
