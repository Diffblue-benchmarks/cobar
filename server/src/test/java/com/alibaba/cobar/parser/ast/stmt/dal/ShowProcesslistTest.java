package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.stmt.dal.ShowProcesslist;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowProcesslistTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999a7b54ac3930653ce() {

    // Arrange
    final ShowProcesslist thisObj = new ShowProcesslist(true);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueOutputNotNull99909f6b8b7244fffa6() {

    // Arrange
    final boolean arg0 = true;

    // Act, creating object to test constructor
    final ShowProcesslist actual = new ShowProcesslist(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isFull());

  }

  // Test written by Diffblue Cover
  @Test
  public void isFullOutputTrue999c62992364fb29876() {

    // Arrange
    final ShowProcesslist thisObj = new ShowProcesslist(true);

    // Act
    final boolean actual = thisObj.isFull();

    // Assert result
    Assert.assertTrue(actual);

  }
}
