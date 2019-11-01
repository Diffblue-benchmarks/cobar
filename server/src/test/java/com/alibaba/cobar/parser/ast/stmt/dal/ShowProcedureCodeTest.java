package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowProcedureCode;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowProcedureCodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9995770d070eb66e4c3() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowProcedureCode thisObj = new ShowProcedureCode(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999897934e0885f998e() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act, creating object to test constructor
    final ShowProcedureCode actual = new ShowProcedureCode(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getProcedureName());
    Assert.assertEquals("AAAAA", actual.getProcedureName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getProcedureName().getParent());
    Assert.assertEquals("AAAAA", actual.getProcedureName().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getProcedureName().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getProcedureName().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getProcedureName().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getProcedureName().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getProcedureName().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getProcedureName().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getProcedureNameOutputNotNull9998a37d0ca94fc435b() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowProcedureCode thisObj = new ShowProcedureCode(identifier);

    // Act
    final Identifier actual = thisObj.getProcedureName();

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
