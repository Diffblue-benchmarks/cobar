package com.alibaba.cobar.parser.ast.expression.misc;

import com.alibaba.cobar.parser.ast.expression.misc.UserExpression;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class UserExpressionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99924abeebec1be6737() {

    // Arrange
    final UserExpression thisObj = new UserExpression("aaaaa");
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999d1b2d0f32c9937db() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final UserExpression actual = new UserExpression(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getUserAtHost());

  }

  // Test written by Diffblue Cover
  @Test
  public void getUserAtHostOutputNotNull9998665ee3d4d66878d() {

    // Arrange
    final UserExpression thisObj = new UserExpression("aaaaa");

    // Act
    final String actual = thisObj.getUserAtHost();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }
}
