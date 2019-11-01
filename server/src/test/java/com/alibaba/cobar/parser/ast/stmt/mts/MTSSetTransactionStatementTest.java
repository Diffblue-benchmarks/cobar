package com.alibaba.cobar.parser.ast.stmt.mts;

import com.alibaba.cobar.parser.ast.fragment.VariableScope;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSSetTransactionStatement.IsolationLevel;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSSetTransactionStatement;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class MTSSetTransactionStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputRead_committed9991ba02e9b4f6d6165() {

    // Arrange
    final String arg0 = "READ_COMMITTED";

    // Act
    final IsolationLevel actual = IsolationLevel.valueOf(arg0);

    // Assert result
    Assert.assertEquals(IsolationLevel.READ_COMMITTED, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput49999cbe4348e30a4c6b() {

    // Act
    final IsolationLevel[] actual = IsolationLevel.values();

    // Assert result
    Assert.assertArrayEquals(new IsolationLevel[]{ IsolationLevel.READ_UNCOMMITTED, IsolationLevel.READ_COMMITTED, IsolationLevel.REPEATABLE_READ, IsolationLevel.SERIALIZABLE }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999a31cfcecb1b9c3ea() {

    // Arrange
    final MTSSetTransactionStatement thisObj = new MTSSetTransactionStatement(VariableScope.SESSION, IsolationLevel.READ_UNCOMMITTED);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputSessionRead_uncommittedOutputNotNull999a9d48a6eb6981f5f() {

    // Arrange
    final VariableScope arg0 = VariableScope.SESSION;
    final IsolationLevel arg1 = IsolationLevel.READ_UNCOMMITTED;

    // Act, creating object to test constructor
    final MTSSetTransactionStatement actual = new MTSSetTransactionStatement(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(IsolationLevel.READ_UNCOMMITTED, actual.getLevel());
    Assert.assertEquals(VariableScope.SESSION, actual.getScope());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLevelOutputRead_uncommitted9997d921d963834763c() {

    // Arrange
    final MTSSetTransactionStatement thisObj = new MTSSetTransactionStatement(VariableScope.SESSION, IsolationLevel.READ_UNCOMMITTED);

    // Act
    final IsolationLevel actual = thisObj.getLevel();

    // Assert result
    Assert.assertEquals(IsolationLevel.READ_UNCOMMITTED, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getScopeOutputSession99922ad6eaa3e853f87() {

    // Arrange
    final MTSSetTransactionStatement thisObj = new MTSSetTransactionStatement(VariableScope.SESSION, IsolationLevel.READ_UNCOMMITTED);

    // Act
    final VariableScope actual = thisObj.getScope();

    // Assert result
    Assert.assertEquals(VariableScope.SESSION, actual);

  }
}
