package com.alibaba.cobar.parser.ast.fragment.tableref;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.fragment.tableref.Dual;
import com.alibaba.cobar.parser.ast.fragment.tableref.StraightJoin;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableReference;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class StraightJoinTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9997554ec95cd5d441b() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final StraightJoin thisObj = new StraightJoin(dual, dual1);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull999c6fd6a87171029b1() {

    // Arrange
    final Dual arg0 = new Dual();
    final Dual arg1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg2 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final StraightJoin actual = new StraightJoin(arg0, arg1, arg2);

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
    Assert.assertNotNull(actual.getLeftTableRef());
    Assert.assertNotNull(actual.getRightTableRef());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99934cf4b5c487e8f94() {

    // Arrange
    final Dual arg0 = new Dual();
    final Dual arg1 = new Dual();

    // Act, creating object to test constructor
    final StraightJoin actual = new StraightJoin(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getOnCond());
    Assert.assertNotNull(actual.getLeftTableRef());
    Assert.assertNotNull(actual.getRightTableRef());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLeftTableRefOutputNotNull9995f0cc93d3991cd7e() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final StraightJoin thisObj = new StraightJoin(dual, dual1);

    // Act
    final TableReference actual = thisObj.getLeftTableRef();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOnCondOutputVoid99951bdae76e994f769() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final StraightJoin thisObj = new StraightJoin(dual, dual1);

    // Act
    final Expression actual = thisObj.getOnCond();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPrecedenceOutputPositive999ae2f2905fa37f661() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final StraightJoin thisObj = new StraightJoin(dual, dual1);

    // Act
    final int actual = thisObj.getPrecedence();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRightTableRefOutputNotNull99921225c33224a449a() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final StraightJoin thisObj = new StraightJoin(dual, dual1);

    // Act
    final TableReference actual = thisObj.getRightTableRef();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSingleTableOutputFalse9996b089fbdcb94c21f() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final StraightJoin thisObj = new StraightJoin(dual, dual1);

    // Act
    final boolean actual = thisObj.isSingleTable();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeLastConditionElementOutputVoid999af39e8806f0bfac4() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final StraightJoin thisObj = new StraightJoin(dual, dual1);

    // Act
    final Object actual = thisObj.removeLastConditionElement();

    // The method returns void, testing that no exception is thrown

  }
}
