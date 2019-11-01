package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowColumns;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowColumnsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid99921906d0fed88cc26() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowColumns thisObj = new ShowColumns(true, identifier, identifier1);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullNotNullNotNullOutputNotNull99969b67e677cad88a3() {

    // Arrange
    final boolean arg0 = true;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg1 = new Identifier(identifier, "aaaak");
    final Identifier arg2 = identifier;
    final String arg3 = "aaaaa";

    // Act, creating object to test constructor
    final ShowColumns actual = new ShowColumns(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getPattern());
    Assert.assertNull(actual.getWhere());
    Assert.assertTrue(actual.isFull());
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("AAAAK", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("aaaak", actual.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullNotNullNotNullOutputNotNull99968ed31e89aa5de39() {

    // Arrange
    final boolean arg0 = true;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg1 = new Identifier(identifier, "aaaak");
    final Identifier arg2 = identifier;
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg3 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final ShowColumns actual = new ShowColumns(arg0, arg1, arg2, arg3);

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
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("AAAAK", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("aaaak", actual.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullNotNullOutputNotNull9996fe2d4dddd484377() {

    // Arrange
    final boolean arg0 = true;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg1 = new Identifier(identifier, "aaaak");
    final Identifier arg2 = identifier;

    // Act, creating object to test constructor
    final ShowColumns actual = new ShowColumns(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPattern());
    Assert.assertNull(actual.getWhere());
    Assert.assertTrue(actual.isFull());
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("AAAAK", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("aaaak", actual.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getPatternOutputVoid99981af620500b4bd92() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowColumns thisObj = new ShowColumns(true, identifier, identifier1);

    // Act
    final String actual = thisObj.getPattern();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableOutputNotNull999b116065ca9120d93() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowColumns thisObj = new ShowColumns(true, identifier, identifier1);

    // Act
    final Identifier actual = thisObj.getTable();

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
  public void getWhereOutputVoid99992913841363a24e3() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowColumns thisObj = new ShowColumns(true, identifier, identifier1);

    // Act
    final Expression actual = thisObj.getWhere();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isFullOutputTrue9998977dcf64475922d() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "akaaa");
    final ShowColumns thisObj = new ShowColumns(true, identifier, identifier1);

    // Act
    final boolean actual = thisObj.isFull();

    // Assert result
    Assert.assertTrue(actual);

  }
}
