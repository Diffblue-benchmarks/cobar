package com.alibaba.cobar.parser.ast.stmt.ddl;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.ddl.DescTableStatement;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DescTableStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999d45ddf60071814cb() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "table is null for desc table");
    final Identifier identifier1 = new Identifier(identifier2, "table is null for desc table");
    final Identifier identifier = new Identifier(identifier1, "table is null for desc table");
    final DescTableStatement thisObj = new DescTableStatement(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999940f46c41f949fe4() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "table is null for desc table");
    final Identifier identifier = new Identifier(identifier1, "table is null for desc table");
    final Identifier arg0 = new Identifier(identifier, "table is null for desc table");

    // Act, creating object to test constructor
    final DescTableStatement actual = new DescTableStatement(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("TABLE IS NULL FOR DESC TABLE", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("TABLE IS NULL FOR DESC TABLE", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent().getParent());
    Assert.assertEquals("TABLE IS NULL FOR DESC TABLE", actual.getTable().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
    Assert.assertEquals("table is null for desc table", actual.getTable().getParent().getParent().getIdText());
    Assert.assertEquals("table is null for desc table", actual.getTable().getParent().getIdText());
    Assert.assertEquals("table is null for desc table", actual.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableOutputNotNull9990a1d1f614203cebd() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "table is null for desc table");
    final Identifier identifier1 = new Identifier(identifier2, "table is null for desc table");
    final Identifier identifier = new Identifier(identifier1, "table is null for desc table");
    final DescTableStatement thisObj = new DescTableStatement(identifier);

    // Act
    final Identifier actual = thisObj.getTable();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("TABLE IS NULL FOR DESC TABLE", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("TABLE IS NULL FOR DESC TABLE", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("TABLE IS NULL FOR DESC TABLE", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("table is null for desc table", actual.getParent().getParent().getIdText());
    Assert.assertEquals("table is null for desc table", actual.getParent().getIdText());
    Assert.assertEquals("table is null for desc table", actual.getIdText());

  }
}
