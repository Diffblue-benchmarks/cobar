package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowTables;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowTablesTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9995c18df3552afc067() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowTables thisObj = new ShowTables(true, identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullNotNullOutputNotNull999ef8cde37267a964b() {

    // Arrange
    final boolean arg0 = true;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg1 = new Identifier(identifier, "aaaak");
    final String arg2 = "aaaaa";

    // Act, creating object to test constructor
    final ShowTables actual = new ShowTables(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getPattern());
    Assert.assertNull(actual.getWhere());
    Assert.assertTrue(actual.isFull());
    Assert.assertNotNull(actual.getSchema());
    Assert.assertEquals("AAAAK", actual.getSchema().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getSchema().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getIdText());
    Assert.assertEquals("aaaak", actual.getSchema().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullNotNullOutputNotNull99919e4c7d786420eea() {

    // Arrange
    final boolean arg0 = true;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg1 = new Identifier(identifier, "aaaak");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg2 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final ShowTables actual = new ShowTables(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPattern());
    Assert.assertNotNull(actual.getWhere());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getWhere()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getWhere()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getWhere()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getWhere()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getWhere()).getRightOprand());
    Assert.assertTrue(actual.isFull());
    Assert.assertNotNull(actual.getSchema());
    Assert.assertEquals("AAAAK", actual.getSchema().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getSchema().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getIdText());
    Assert.assertEquals("aaaak", actual.getSchema().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullOutputNotNull9992cf85e9c2ed6da3d() {

    // Arrange
    final boolean arg0 = true;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg1 = new Identifier(identifier, "aaaak");

    // Act, creating object to test constructor
    final ShowTables actual = new ShowTables(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPattern());
    Assert.assertNull(actual.getWhere());
    Assert.assertTrue(actual.isFull());
    Assert.assertNotNull(actual.getSchema());
    Assert.assertEquals("AAAAK", actual.getSchema().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getSchema().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getIdText());
    Assert.assertEquals("aaaak", actual.getSchema().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getPatternOutputVoid999705929ec7be7478a() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowTables thisObj = new ShowTables(true, identifier);

    // Act
    final String actual = thisObj.getPattern();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSchemaOutputNotNull9991d226c88e3496092() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowTables thisObj = new ShowTables(true, identifier);

    // Act
    final Identifier actual = thisObj.getSchema();

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
  public void getWhereOutputVoid999646ee0e18b5f89b0() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowTables thisObj = new ShowTables(true, identifier);

    // Act
    final Expression actual = thisObj.getWhere();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isFullOutputTrue999d71ba34977036206() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowTables thisObj = new ShowTables(true, identifier);

    // Act
    final boolean actual = thisObj.isFull();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setSchemaInputNotNullOutputVoid99984b4e984b22d5de0() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowTables thisObj = new ShowTables(true, identifier);
    final Identifier arg0 = identifier1;

    // Act
    thisObj.setSchema(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getSchema());
    Assert.assertEquals("AAAAA", thisObj.getSchema().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getSchema().getParent());
    Assert.assertEquals("AAAAA", thisObj.getSchema().getParent().getIdTextUpUnescape());
    Assert.assertNull(thisObj.getSchema().getParent().getParent());
    Assert.assertEquals("aaaaa", thisObj.getSchema().getParent().getIdText());
    Assert.assertEquals("aaaaa", thisObj.getSchema().getIdText());

  }
}
