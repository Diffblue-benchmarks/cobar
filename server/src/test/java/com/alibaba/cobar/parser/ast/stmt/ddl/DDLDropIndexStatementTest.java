package com.alibaba.cobar.parser.ast.stmt.ddl;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLDropIndexStatement;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DDLDropIndexStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9991a4e373eece2e20a() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final DDLDropIndexStatement thisObj = new DDLDropIndexStatement(identifier, identifier1);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9996b52d66f00121d91() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final Identifier arg1 = identifier;

    // Act, creating object to test constructor
    final DDLDropIndexStatement actual = new DDLDropIndexStatement(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getIndexName());
    Assert.assertEquals("AAAAA", actual.getIndexName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getIndexName().getParent());
    Assert.assertEquals("AAAAA", actual.getIndexName().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getIndexName().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getIndexName().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getIndexName().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getIndexName().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getIndexName().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getIndexName().getIdText());
    Assert.assertEquals(actual.getIndexName().getParent(), actual.getTable());

  }

  // Test written by Diffblue Cover
  @Test
  public void getIndexNameOutputNotNull999b2d861e2600e691d() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final DDLDropIndexStatement thisObj = new DDLDropIndexStatement(identifier, identifier1);

    // Act
    final Identifier actual = thisObj.getIndexName();

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

  // Test written by Diffblue Cover
  @Test
  public void getTableOutputNotNull99926c12f39476e718c() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final DDLDropIndexStatement thisObj = new DDLDropIndexStatement(identifier, identifier1);

    // Act
    final Identifier actual = thisObj.getTable();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AAAAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getIdText());

  }
}
