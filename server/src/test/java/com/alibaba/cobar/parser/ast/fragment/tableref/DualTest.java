package com.alibaba.cobar.parser.ast.fragment.tableref;

import com.alibaba.cobar.parser.ast.fragment.tableref.Dual;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DualTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999e996ed0e6d2921fc() {

    // Arrange
    final Dual thisObj = new Dual();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9993e1a932fb88671e4() {

    // Act, creating object to test constructor
    final Dual actual = new Dual();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPrecedenceOutputPositive999652b1b08d3f566be() {

    // Arrange
    final Dual thisObj = new Dual();

    // Act
    final int actual = thisObj.getPrecedence();

    // Assert result
    Assert.assertEquals(2, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSingleTableOutputTrue999d716bfee6f3500ff() {

    // Arrange
    final Dual thisObj = new Dual();

    // Act
    final boolean actual = thisObj.isSingleTable();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeLastConditionElementOutputVoid99984a8bb0d59e34d5c() {

    // Arrange
    final Dual thisObj = new Dual();

    // Act
    final Object actual = thisObj.removeLastConditionElement();

    // The method returns void, testing that no exception is thrown

  }
}
