package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowDatabases;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowDatabasesTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99955f99a74b0a403b1() {

    // Arrange
    final ShowDatabases thisObj = new ShowDatabases();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99956e738f2e3b29e84() {

    // Act, creating object to test constructor
    final ShowDatabases actual = new ShowDatabases();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPattern());
    Assert.assertNull(actual.getWhere());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999951560c659d0cfab() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final ShowDatabases actual = new ShowDatabases(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getPattern());
    Assert.assertNull(actual.getWhere());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999de7bc338e2530b53() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final ShowDatabases actual = new ShowDatabases(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPattern());
    Assert.assertNotNull(actual.getWhere());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getWhere()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getWhere()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getWhere()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getWhere()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getPatternOutputVoid999c13a1b80c35b6f12() {

    // Arrange
    final ShowDatabases thisObj = new ShowDatabases();

    // Act
    final String actual = thisObj.getPattern();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWhereOutputVoid9996f4362d97857ded5() {

    // Arrange
    final ShowDatabases thisObj = new ShowDatabases();

    // Act
    final Expression actual = thisObj.getWhere();

    // The method returns void, testing that no exception is thrown

  }
}
