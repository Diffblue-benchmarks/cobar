package com.alibaba.cobar.parser.ast.expression.primary.literal;

import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralNull;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;



public class LiteralNullTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9997ca6c9a4d3fcf8d3() {

    // Arrange
    final LiteralNull thisObj = new LiteralNull();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999acc91eaf0fb8e7f5() {

    // Act, creating object to test constructor
    final LiteralNull actual = new LiteralNull();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputVoid999f86723a444546e9c() {

    // Arrange
    final LiteralNull thisObj = new LiteralNull();
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("aaaaa", "aaaaa");

    // Act
    final Object actual = thisObj.evaluationInternal(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
