package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowTriggers;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowTriggersTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999995191d8a63b51fa() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowTriggers thisObj = new ShowTriggers(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9997f5f09391b33d4ac() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final String arg1 = "aaaaa";

    // Act, creating object to test constructor
    final ShowTriggers actual = new ShowTriggers(arg0, arg1);

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
  public void constructorInputNotNullNotNullOutputNotNull9997309c5bfe260d88d() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg1 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final ShowTriggers actual = new ShowTriggers(arg0, arg1);

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
  public void constructorInputNotNullOutputNotNull9990b41c82f167eae61() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act, creating object to test constructor
    final ShowTriggers actual = new ShowTriggers(arg0);

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
  public void getPatternOutputVoid999e067db9f608593e5() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowTriggers thisObj = new ShowTriggers(identifier);

    // Act
    final String actual = thisObj.getPattern();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSchemaOutputNotNull99922c10d41fd7dc9b5() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowTriggers thisObj = new ShowTriggers(identifier);

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
  public void getWhereOutputVoid999d173dbff21efecc1() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowTriggers thisObj = new ShowTriggers(identifier);

    // Act
    final Expression actual = thisObj.getWhere();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setSchemaInputNotNullOutputVoid999bd4b95b1f8efe86f() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowTriggers thisObj = new ShowTriggers(identifier);
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
