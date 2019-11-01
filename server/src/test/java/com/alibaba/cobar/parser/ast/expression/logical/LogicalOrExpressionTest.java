package com.alibaba.cobar.parser.ast.expression.logical;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.logical.LogicalOrExpression;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;



public class LogicalOrExpressionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9991063235939096964() {

    // Arrange
    final LogicalOrExpression thisObj = new LogicalOrExpression();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99941670c7a64c6972b() {

    // Act, creating object to test constructor
    final LogicalOrExpression actual = new LogicalOrExpression();

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    Assert.assertEquals(arrayList, Reflector.getInstanceField(actual, "operands"));
    Assert.assertEquals(2, actual.getPrecedence());

  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputNotNull999a307673ba2d645ca() {

    // Arrange
    final LogicalOrExpression thisObj = new LogicalOrExpression();
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("aaaaa", "aaaaa");

    // Act
    final Object actual = thisObj.evaluationInternal(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOperatorOutputNotNull999b16b2babd22abc12() {

    // Arrange
    final LogicalOrExpression thisObj = new LogicalOrExpression();

    // Act
    final String actual = thisObj.getOperator();

    // Assert result
    Assert.assertEquals("OR", actual);

  }
}
