package com.alibaba.cobar.parser.ast.fragment.tableref;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.fragment.tableref.Dual;
import com.alibaba.cobar.parser.ast.fragment.tableref.InnerJoin;
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



public class InnerJoinTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999d9ad617031b4c095() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final InnerJoin thisObj = new InnerJoin(dual, dual1);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull999a7b16e8194500972() {

    // Arrange
    final Dual arg0 = new Dual();
    final Dual arg1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg2 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final InnerJoin actual = new InnerJoin(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
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
    Assert.assertNotNull(actual.getRightTableRef());
    Assert.assertNotNull(actual.getLeftTableRef());
    Assert.assertNull(actual.getUsing());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull999f67da7db65ae99ef() {

    // Arrange
    final Dual arg0 = new Dual();
    final Dual arg1 = new Dual();
    final ArrayList<String> arg2 = new ArrayList<String>();
    arg2.add("aaaaa");

    // Act, creating object to test constructor
    final InnerJoin actual = new InnerJoin(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getOnCond());
    Assert.assertNotNull(actual.getRightTableRef());
    Assert.assertNotNull(actual.getLeftTableRef());
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    Assert.assertEquals(arrayList, actual.getUsing());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999c2fdee8e4fdf76e0() {

    // Arrange
    final Dual arg0 = new Dual();
    final Dual arg1 = new Dual();

    // Act, creating object to test constructor
    final InnerJoin actual = new InnerJoin(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getOnCond());
    Assert.assertNotNull(actual.getRightTableRef());
    Assert.assertNotNull(actual.getLeftTableRef());
    Assert.assertNull(actual.getUsing());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLeftTableRefOutputNotNull99974b404a2aa51d453() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final InnerJoin thisObj = new InnerJoin(dual, dual1);

    // Act
    final TableReference actual = thisObj.getLeftTableRef();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOnCondOutputVoid9993979044974303e71() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final InnerJoin thisObj = new InnerJoin(dual, dual1);

    // Act
    final Expression actual = thisObj.getOnCond();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPrecedenceOutputPositive999328bb1034a010e67() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final InnerJoin thisObj = new InnerJoin(dual, dual1);

    // Act
    final int actual = thisObj.getPrecedence();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRightTableRefOutputNotNull999725ed4d2c7ba7a8e() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final InnerJoin thisObj = new InnerJoin(dual, dual1);

    // Act
    final TableReference actual = thisObj.getRightTableRef();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getUsingOutputVoid999219c1eb434b92c3d() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final InnerJoin thisObj = new InnerJoin(dual, dual1);

    // Act
    final List<String> actual = thisObj.getUsing();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isSingleTableOutputFalse999f830f18b733e092a() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final InnerJoin thisObj = new InnerJoin(dual, dual1);

    // Act
    final boolean actual = thisObj.isSingleTable();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeLastConditionElementOutputVoid999114950819716ca9a() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final InnerJoin thisObj = new InnerJoin(dual, dual1);

    // Act
    final Object actual = thisObj.removeLastConditionElement();

    // The method returns void, testing that no exception is thrown

  }
}
