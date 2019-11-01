package com.alibaba.cobar.parser.ast.stmt.dml;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLCallStatement;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class DMLCallStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9999609a4444dc28382() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final DMLCallStatement thisObj = new DMLCallStatement(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9995a2c9a1423d69b19() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final ArrayList<Expression> arg1 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg1.add(arithmeticAddExpression);

    // Act, creating object to test constructor
    final DMLCallStatement actual = new DMLCallStatement(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getArguments());
    Assert.assertEquals(1, actual.getArguments().size());
    Assert.assertNotNull(actual.getArguments().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) actual.getArguments().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getArguments().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getArguments().get(0)).getRightOprand());
    Assert.assertNotNull(actual.getProcedure());
    Assert.assertEquals("AAAAA", actual.getProcedure().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getProcedure().getParent());
    Assert.assertEquals("AAAAA", actual.getProcedure().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getProcedure().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getProcedure().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getProcedure().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getProcedure().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getProcedure().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getProcedure().getIdText());

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull9997470dec43b1e30cd() {
//
//    // Arrange
//    final Identifier identifier1 = new Identifier(null, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aaaaa");
//    final Identifier arg0 = new Identifier(identifier, "aaaaa");
//
//    // Act, creating object to test constructor
//    final DMLCallStatement actual = new DMLCallStatement(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getArguments());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getArguments(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getArguments(), "size"));
//    Assert.assertNotNull(actual.getProcedure());
//    Assert.assertEquals("AAAAA", actual.getProcedure().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getProcedure().getParent());
//    Assert.assertEquals("AAAAA", actual.getProcedure().getParent().getIdTextUpUnescape());
//    Assert.assertNotNull(actual.getProcedure().getParent().getParent());
//    Assert.assertEquals("AAAAA", actual.getProcedure().getParent().getParent().getIdTextUpUnescape());
//    Assert.assertNull(actual.getProcedure().getParent().getParent().getParent());
//    Assert.assertEquals("aaaaa", actual.getProcedure().getParent().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getProcedure().getParent().getIdText());
//    Assert.assertEquals("aaaaa", actual.getProcedure().getIdText());
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void getArgumentsOutputNotNull999e3f376d30136d237() {
//
//    // Arrange
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aakaa");
//    final DMLCallStatement thisObj = new DMLCallStatement(identifier);
//
//    // Act
//    final List<Expression> actual = thisObj.getArguments();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual, "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "size"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getProcedureOutputNotNull999666fa72ccd375a61() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final DMLCallStatement thisObj = new DMLCallStatement(identifier);

    // Act
    final Identifier actual = thisObj.getProcedure();

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
