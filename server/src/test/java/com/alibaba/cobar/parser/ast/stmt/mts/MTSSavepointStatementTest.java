package com.alibaba.cobar.parser.ast.stmt.mts;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSSavepointStatement;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MTSSavepointStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999909496c384968567() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "savepoint is null");
    final Identifier identifier1 = new Identifier(identifier2, "savepoint is null");
    final Identifier identifier = new Identifier(identifier1, "savepoint is null");
    final MTSSavepointStatement thisObj = new MTSSavepointStatement(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999300572dd14872c8d() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "savepoint is null");
    final Identifier identifier = new Identifier(identifier1, "savepoint is null");
    final Identifier arg0 = new Identifier(identifier, "savepoint is null");

    // Act, creating object to test constructor
    final MTSSavepointStatement actual = new MTSSavepointStatement(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getSavepoint());
    Assert.assertEquals("SAVEPOINT IS NULL", actual.getSavepoint().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSavepoint().getParent());
    Assert.assertEquals("SAVEPOINT IS NULL", actual.getSavepoint().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSavepoint().getParent().getParent());
    Assert.assertEquals("SAVEPOINT IS NULL", actual.getSavepoint().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getSavepoint().getParent().getParent().getParent());
    Assert.assertEquals("savepoint is null", actual.getSavepoint().getParent().getParent().getIdText());
    Assert.assertEquals("savepoint is null", actual.getSavepoint().getParent().getIdText());
    Assert.assertEquals("savepoint is null", actual.getSavepoint().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getSavepointOutputNotNull9995a34600e28628a67() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "savepoint is null");
    final Identifier identifier1 = new Identifier(identifier2, "savepoint is null");
    final Identifier identifier = new Identifier(identifier1, "savepoint is null");
    final MTSSavepointStatement thisObj = new MTSSavepointStatement(identifier);

    // Act
    final Identifier actual = thisObj.getSavepoint();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("SAVEPOINT IS NULL", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("SAVEPOINT IS NULL", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("SAVEPOINT IS NULL", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("savepoint is null", actual.getParent().getParent().getIdText());
    Assert.assertEquals("savepoint is null", actual.getParent().getIdText());
    Assert.assertEquals("savepoint is null", actual.getIdText());

  }
}
