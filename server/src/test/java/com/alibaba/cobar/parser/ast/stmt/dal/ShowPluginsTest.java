package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.stmt.dal.ShowPlugins;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowPluginsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9991e4a1284a929c71e() {

    // Arrange
    final ShowPlugins thisObj = new ShowPlugins();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999359a5f80363d56fd() {

    // Act, creating object to test constructor
    final ShowPlugins actual = new ShowPlugins();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
