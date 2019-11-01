package com.alibaba.cobar.parser.ast.stmt.extension;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.extension.ExtDDLCreatePolicy;
import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class ExtDDLCreatePolicyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999fdb3fb401641163d() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ExtDDLCreatePolicy thisObj = new ExtDDLCreatePolicy(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addProportionInputNotNullNotNullOutputNotNull99965e2d1e9a94b0383() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ExtDDLCreatePolicy thisObj = new ExtDDLCreatePolicy(identifier);
    final Integer arg0 = new Integer(1);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg1 = new ArithmeticAddExpression(arithmeticAddExpression, null);

    // Act
    final ExtDDLCreatePolicy actual = thisObj.addProportion(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(thisObj.getProportion());
    Assert.assertEquals(1, thisObj.getProportion().size());
    Assert.assertNotNull(thisObj.getProportion().get(0));
    Assert.assertNotNull(((Pair) thisObj.getProportion().get(0)).getKey());
    Assert.assertNotNull(((Pair) thisObj.getProportion().get(0)).getValue());
    Assert.assertTrue(((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((Pair) thisObj.getProportion().get(0)).getValue()).getRightOprand());

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getName());
    Assert.assertEquals("AAKAA", actual.getName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getName().getParent());
    Assert.assertEquals("AAAAA", actual.getName().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getName().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getName().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getName().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getName().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getName().getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getName().getIdText());
    Assert.assertNotNull(actual.getProportion());
    Assert.assertEquals(1, actual.getProportion().size());
    Assert.assertNotNull(actual.getProportion().get(0));
    Assert.assertNotNull(((Pair) actual.getProportion().get(0)).getKey());
    Assert.assertNotNull(((Pair) actual.getProportion().get(0)).getValue());
    Assert.assertTrue(((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((Pair) actual.getProportion().get(0)).getValue()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999b94f72080c3f1e71() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act, creating object to test constructor
    final ExtDDLCreatePolicy actual = new ExtDDLCreatePolicy(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getName());
    Assert.assertEquals("AAAAA", actual.getName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getName().getParent());
    Assert.assertEquals("AAAAA", actual.getName().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getName().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getName().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getName().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getName().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getName().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getName().getIdText());
    final ArrayList<Pair<Integer, Expression>> arrayList = new ArrayList<Pair<Integer, Expression>>();
    Assert.assertEquals(arrayList, actual.getProportion());

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputNotNull99998c4c56fb001025c() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ExtDDLCreatePolicy thisObj = new ExtDDLCreatePolicy(identifier);

    // Act
    final Identifier actual = thisObj.getName();

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
  public void getProportionOutput09993b85f7bf4a6e1141() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ExtDDLCreatePolicy thisObj = new ExtDDLCreatePolicy(identifier);

    // Act
    final List<Pair<Integer, Expression>> actual = thisObj.getProportion();

    // Assert result
    final ArrayList<Pair<Integer, Expression>> arrayList = new ArrayList<Pair<Integer, Expression>>();
    Assert.assertEquals(arrayList, actual);

  }
}
