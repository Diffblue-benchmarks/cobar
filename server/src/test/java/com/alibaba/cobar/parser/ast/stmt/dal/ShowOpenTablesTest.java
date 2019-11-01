package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowOpenTables;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowOpenTablesTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999fe585bc3405b686c() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowOpenTables thisObj = new ShowOpenTables(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999f243af556f657cd3() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final String arg1 = "aaaaa";

    // Act, creating object to test constructor
    final ShowOpenTables actual = new ShowOpenTables(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getSchema());
    Assert.assertEquals("AAAAA", actual.getSchema().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getSchema().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getSchema().getIdText());
    Assert.assertEquals("aaaaa", actual.getPattern());
    Assert.assertNull(actual.getWhere());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9993f73430df5064e7e() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg1 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final ShowOpenTables actual = new ShowOpenTables(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getSchema());
    Assert.assertEquals("AAAAA", actual.getSchema().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getSchema().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getSchema().getIdText());
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

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999dde1c6bde312da1a() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act, creating object to test constructor
    final ShowOpenTables actual = new ShowOpenTables(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getSchema());
    Assert.assertEquals("AAAAA", actual.getSchema().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getSchema().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getSchema().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getSchema().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getSchema().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getSchema().getIdText());
    Assert.assertNull(actual.getPattern());
    Assert.assertNull(actual.getWhere());

  }

  // Test written by Diffblue Cover
  @Test
  public void getPatternOutputVoid99983bd07dbbb624bc6() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowOpenTables thisObj = new ShowOpenTables(identifier);

    // Act
    final String actual = thisObj.getPattern();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSchemaOutputNotNull9998eb988a49a55b131() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowOpenTables thisObj = new ShowOpenTables(identifier);

    // Act
    final Identifier actual = thisObj.getSchema();

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
  public void getWhereOutputVoid999afa0b109bb307147() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowOpenTables thisObj = new ShowOpenTables(identifier);

    // Act
    final Expression actual = thisObj.getWhere();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setSchemaInputNotNullOutputVoid99914938701a2d5ed3f() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowOpenTables thisObj = new ShowOpenTables(identifier);
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
