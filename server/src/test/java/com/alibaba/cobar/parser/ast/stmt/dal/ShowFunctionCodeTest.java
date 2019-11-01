package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowFunctionCode;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowFunctionCodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999b5c37da57b8addc5() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowFunctionCode thisObj = new ShowFunctionCode(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999396a14ba4e92a2fe() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act, creating object to test constructor
    final ShowFunctionCode actual = new ShowFunctionCode(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getFunctionName());
    Assert.assertEquals("AAAAA", actual.getFunctionName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getFunctionName().getParent());
    Assert.assertEquals("AAAAA", actual.getFunctionName().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getFunctionName().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getFunctionName().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getFunctionName().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getFunctionName().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getFunctionName().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getFunctionName().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getFunctionNameOutputNotNull9991db6ff4f1d338eb8() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowFunctionCode thisObj = new ShowFunctionCode(identifier);

    // Act
    final Identifier actual = thisObj.getFunctionName();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getIdText());

  }
}
