package com.alibaba.cobar.parser.ast.fragment.tableref;

import com.alibaba.cobar.parser.ast.fragment.tableref.Dual;
import com.alibaba.cobar.parser.ast.fragment.tableref.NaturalJoin;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableReference;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NaturalJoinTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999c59c0603f8ae524a() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final NaturalJoin thisObj = new NaturalJoin(true, true, dual, dual1);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueTrueNotNullNotNullOutputNotNull9990d643ac38e823970() {

    // Arrange
    final boolean arg0 = true;
    final boolean arg1 = true;
    final Dual arg2 = new Dual();
    final Dual arg3 = new Dual();

    // Act, creating object to test constructor
    final NaturalJoin actual = new NaturalJoin(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isOuter());
    Assert.assertNotNull(actual.getLeftTableRef());
    Assert.assertNotNull(actual.getRightTableRef());
    Assert.assertTrue(actual.isLeft());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLeftTableRefOutputNotNull99991ec4f3091e80cb5() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final NaturalJoin thisObj = new NaturalJoin(true, true, dual, dual1);

    // Act
    final TableReference actual = thisObj.getLeftTableRef();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPrecedenceOutputPositive999fc42d66db8e1a348() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final NaturalJoin thisObj = new NaturalJoin(true, true, dual, dual1);

    // Act
    final int actual = thisObj.getPrecedence();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRightTableRefOutputNotNull999ab1ef120455640a1() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final NaturalJoin thisObj = new NaturalJoin(true, true, dual, dual1);

    // Act
    final TableReference actual = thisObj.getRightTableRef();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isLeftOutputTrue999702769080f4f0fd7() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final NaturalJoin thisObj = new NaturalJoin(true, true, dual, dual1);

    // Act
    final boolean actual = thisObj.isLeft();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isOuterOutputTrue99915fb360b568c2f8b() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final NaturalJoin thisObj = new NaturalJoin(true, true, dual, dual1);

    // Act
    final boolean actual = thisObj.isOuter();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSingleTableOutputFalse99973c4671aa66d303c() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final NaturalJoin thisObj = new NaturalJoin(true, true, dual, dual1);

    // Act
    final boolean actual = thisObj.isSingleTable();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeLastConditionElementOutputVoid999be5b0c4c0bca2a9e() {

    // Arrange
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final NaturalJoin thisObj = new NaturalJoin(true, true, dual, dual1);

    // Act
    final Object actual = thisObj.removeLastConditionElement();

    // The method returns void, testing that no exception is thrown

  }
}
