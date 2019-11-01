package com.alibaba.cobar.parser.ast.expression.primary;

import com.alibaba.cobar.parser.ast.expression.primary.UsrDefVarPrimary;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class UsrDefVarPrimaryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999f8e76aab42a7a1de() {

    // Arrange
    final UsrDefVarPrimary thisObj = new UsrDefVarPrimary("aaaaa");
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999c6b5ba05fbc45770() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final UsrDefVarPrimary actual = new UsrDefVarPrimary(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getVarText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getVarTextOutputNotNull9991702ad6c91b3a27b() {

    // Arrange
    final UsrDefVarPrimary thisObj = new UsrDefVarPrimary("aaaaa");

    // Act
    final String actual = thisObj.getVarText();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }
}
