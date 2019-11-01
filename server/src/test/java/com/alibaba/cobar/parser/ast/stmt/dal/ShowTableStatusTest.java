package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowTableStatus;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowTableStatusTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999560632de51ea5f3e() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowTableStatus thisObj = new ShowTableStatus(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9994e16c9635f1ce59e() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final String arg1 = "aaaaa";

    // Act, creating object to test constructor
    final ShowTableStatus actual = new ShowTableStatus(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getPattern());
    Assert.assertNull(actual.getWhere());
    Assert.assertNotNull(actual.getDatabase());
    Assert.assertEquals("AAAAA", actual.getDatabase().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getDatabase().getParent());
    Assert.assertEquals("AAAAA", actual.getDatabase().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getDatabase().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getDatabase().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getDatabase().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getDatabase().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getDatabase().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getDatabase().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull99973a9883f69099c5a() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg1 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act, creating object to test constructor
    final ShowTableStatus actual = new ShowTableStatus(arg0, arg1);

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
    Assert.assertNotNull(actual.getDatabase());
    Assert.assertEquals("AAAAA", actual.getDatabase().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getDatabase().getParent());
    Assert.assertEquals("AAAAA", actual.getDatabase().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getDatabase().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getDatabase().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getDatabase().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getDatabase().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getDatabase().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getDatabase().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999658bd88055b204d8() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act, creating object to test constructor
    final ShowTableStatus actual = new ShowTableStatus(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPattern());
    Assert.assertNull(actual.getWhere());
    Assert.assertNotNull(actual.getDatabase());
    Assert.assertEquals("AAAAA", actual.getDatabase().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getDatabase().getParent());
    Assert.assertEquals("AAAAA", actual.getDatabase().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getDatabase().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getDatabase().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getDatabase().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getDatabase().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getDatabase().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getDatabase().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getDatabaseOutputNotNull999eee60217f8474c31() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowTableStatus thisObj = new ShowTableStatus(identifier);

    // Act
    final Identifier actual = thisObj.getDatabase();

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
  public void getPatternOutputVoid9990ca329d2534c454f() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowTableStatus thisObj = new ShowTableStatus(identifier);

    // Act
    final String actual = thisObj.getPattern();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWhereOutputVoid99937ad683686ef352c() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowTableStatus thisObj = new ShowTableStatus(identifier);

    // Act
    final Expression actual = thisObj.getWhere();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDatabaseInputNotNullOutputVoid99973c26da18977ce44() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ShowTableStatus thisObj = new ShowTableStatus(identifier);
    final Identifier arg0 = identifier1;

    // Act
    thisObj.setDatabase(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getDatabase());
    Assert.assertEquals("AAAAA", thisObj.getDatabase().getIdTextUpUnescape());
    Assert.assertNotNull(thisObj.getDatabase().getParent());
    Assert.assertEquals("AAAAA", thisObj.getDatabase().getParent().getIdTextUpUnescape());
    Assert.assertNull(thisObj.getDatabase().getParent().getParent());
    Assert.assertEquals("aaaaa", thisObj.getDatabase().getParent().getIdText());
    Assert.assertEquals("aaaaa", thisObj.getDatabase().getIdText());

  }
}
