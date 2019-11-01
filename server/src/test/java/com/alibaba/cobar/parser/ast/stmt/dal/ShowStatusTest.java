package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.fragment.VariableScope;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowStatus;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowStatusTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99976e095a49385d831() {

    // Arrange
    final ShowStatus thisObj = new ShowStatus(VariableScope.SESSION);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputSessionNotNullOutputNotNull999a2b22fcd21c68d79() {

    // Arrange
    final VariableScope arg0 = VariableScope.SESSION;
    final String arg1 = "aaaaa";

    // Act, creating object to test constructor
    final ShowStatus actual = new ShowStatus(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(VariableScope.SESSION, actual.getScope());
    Assert.assertEquals("aaaaa", actual.getPattern());
    Assert.assertNull(actual.getWhere());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputSessionNotNullOutputNotNull999b3801704aef461d1() {

    // Arrange
    final VariableScope arg0 = VariableScope.SESSION;
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg1 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final ShowStatus actual = new ShowStatus(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(VariableScope.SESSION, actual.getScope());
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
  public void constructorInputSessionOutputNotNull9995e79c29ecbf9eab1() {

    // Arrange
    final VariableScope arg0 = VariableScope.SESSION;

    // Act, creating object to test constructor
    final ShowStatus actual = new ShowStatus(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(VariableScope.SESSION, actual.getScope());
    Assert.assertNull(actual.getPattern());
    Assert.assertNull(actual.getWhere());

  }

  // Test written by Diffblue Cover
  @Test
  public void getPatternOutputVoid99917591d535c45d66b() {

    // Arrange
    final ShowStatus thisObj = new ShowStatus(VariableScope.SESSION);

    // Act
    final String actual = thisObj.getPattern();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getScopeOutputSession999040a2a06bc655908() {

    // Arrange
    final ShowStatus thisObj = new ShowStatus(VariableScope.SESSION);

    // Act
    final VariableScope actual = thisObj.getScope();

    // Assert result
    Assert.assertEquals(VariableScope.SESSION, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getWhereOutputVoid999f9c2638bfdb31b87() {

    // Arrange
    final ShowStatus thisObj = new ShowStatus(VariableScope.SESSION);

    // Act
    final Expression actual = thisObj.getWhere();

    // The method returns void, testing that no exception is thrown

  }
}
