package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowCreate.Type;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowCreate;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowCreateTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99952a9924af9b6bc23() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowCreate thisObj = new ShowCreate(ShowCreate.Type.DATABASE, identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputDatabaseNotNullOutputNotNull99971f69e2f7e9a54a4() {

    // Arrange
    final ShowCreate.Type arg0 = ShowCreate.Type.DATABASE;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg1 = new Identifier(identifier, "aaaak");

    // Act, creating object to test constructor
    final ShowCreate actual = new ShowCreate(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getId());
    Assert.assertEquals("AAAAK", actual.getId().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getId().getParent());
    Assert.assertEquals("AAAAA", actual.getId().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getId().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getId().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getId().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getId().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getId().getParent().getIdText());
    Assert.assertEquals("aaaak", actual.getId().getIdText());
    Assert.assertEquals(ShowCreate.Type.DATABASE, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void getIdOutputNotNull9991d3ee2c4c06861e6() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowCreate thisObj = new ShowCreate(ShowCreate.Type.DATABASE, identifier);

    // Act
    final Identifier actual = thisObj.getId();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AKAAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("akaaa", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypeOutputDatabase999196c4f36ac865bc6() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowCreate thisObj = new ShowCreate(ShowCreate.Type.DATABASE, identifier);

    // Act
    final ShowCreate.Type actual = thisObj.getType();

    // Assert result
    Assert.assertEquals(ShowCreate.Type.DATABASE, actual);

  }
}
