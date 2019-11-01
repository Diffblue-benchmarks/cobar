package com.alibaba.cobar.parser.ast.stmt.extension;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.stmt.extension.ExtDDLDropPolicy;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ExtDDLDropPolicyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999f62a89f8a2956e12() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ExtDDLDropPolicy thisObj = new ExtDDLDropPolicy(identifier);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9993c73123289b01a78() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act, creating object to test constructor
    final ExtDDLDropPolicy actual = new ExtDDLDropPolicy(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getPolicyName());
    Assert.assertEquals("AAAAA", actual.getPolicyName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getPolicyName().getParent());
    Assert.assertEquals("AAAAA", actual.getPolicyName().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getPolicyName().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getPolicyName().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getPolicyName().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getPolicyName().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getPolicyName().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getPolicyName().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void getPolicyNameOutputNotNull9995b340ec71f9829c0() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ExtDDLDropPolicy thisObj = new ExtDDLDropPolicy(identifier);

    // Act
    final Identifier actual = thisObj.getPolicyName();

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
