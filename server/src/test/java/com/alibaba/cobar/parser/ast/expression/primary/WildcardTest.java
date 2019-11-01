package com.alibaba.cobar.parser.ast.expression.primary;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.expression.primary.Wildcard;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class WildcardTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999b94edd8ab4cc8c9e() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "*");
    final Identifier identifier1 = new Identifier(identifier2, "*");
    final Identifier identifier = new Identifier(identifier1, "*");
    final Wildcard thisObj = new Wildcard(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9994597c4a832e49c4f() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "*");
    final Identifier identifier = new Identifier(identifier1, "*");
    final Identifier arg0 = new Identifier(identifier, "*");

    // Act, creating object to test constructor
    final Wildcard actual = new Wildcard(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("*", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("*", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("*", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("*", actual.getParent().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent().getParent());
    Assert.assertEquals("*", actual.getParent().getParent().getParent().getIdText());
    Assert.assertEquals("*", actual.getParent().getParent().getIdText());
    Assert.assertEquals("*", actual.getParent().getIdText());
    Assert.assertEquals("*", actual.getIdText());

  }
}
