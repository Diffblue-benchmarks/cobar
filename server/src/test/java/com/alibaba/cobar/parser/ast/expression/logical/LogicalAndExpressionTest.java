package com.alibaba.cobar.parser.ast.expression.logical;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.logical.LogicalAndExpression;
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



public class LogicalAndExpressionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999fee6085686725652() {

    // Arrange
    final LogicalAndExpression thisObj = new LogicalAndExpression();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999be349f614c36dca1() {

    // Act, creating object to test constructor
    final LogicalAndExpression actual = new LogicalAndExpression();

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    Assert.assertEquals(arrayList, Reflector.getInstanceField(actual, "operands"));
    Assert.assertEquals(4, actual.getPrecedence());

  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputNotNull999a0ad3f8247d7972c() {

    // Arrange
    final LogicalAndExpression thisObj = new LogicalAndExpression();
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("aaaaa", "aaaaa");

    // Act
    final Object actual = thisObj.evaluationInternal(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOperatorOutputNotNull999edd883e292a82ba6() {

    // Arrange
    final LogicalAndExpression thisObj = new LogicalAndExpression();

    // Act
    final String actual = thisObj.getOperator();

    // Assert result
    Assert.assertEquals("AND", actual);

  }
}
