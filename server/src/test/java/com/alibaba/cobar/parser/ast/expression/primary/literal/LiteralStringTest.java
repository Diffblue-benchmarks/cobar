package com.alibaba.cobar.parser.ast.expression.primary.literal;

import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralString;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;



public class LiteralStringTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999a36ec68693b78884() {

    // Arrange
    final LiteralString thisObj = new LiteralString("'", "'", true);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullTrueOutputNotNull9997353ac9c4f2a1aa2() {

    // Arrange
    final String arg0 = "'";
    final String arg1 = "'";
    final boolean arg2 = true;

    // Act, creating object to test constructor
    final LiteralString actual = new LiteralString(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("'", actual.getIntroducer());
    Assert.assertTrue(actual.isNchars());
    Assert.assertEquals("'", actual.getString());

  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputNotNull999c4492bfbab6f56f1() {

    // Arrange
    final LiteralString thisObj = new LiteralString("'", "'", true);
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("'", "'");

    // Act
    final Object actual = thisObj.evaluationInternal(arg0);

    // Assert result
    Assert.assertEquals("'", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getIntroducerOutputNotNull9992a1231b175b1da12() {

    // Arrange
    final LiteralString thisObj = new LiteralString("'", "'", true);

    // Act
    final String actual = thisObj.getIntroducer();

    // Assert result
    Assert.assertEquals("'", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getStringOutputNotNull99947b91f7bb0774f0c() {

    // Arrange
    final LiteralString thisObj = new LiteralString("'", "'", true);

    // Act
    final String actual = thisObj.getString();

    // Assert result
    Assert.assertEquals("'", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getUnescapedStringOutputNotNull9994098987275a17b81() {

    // Arrange
    final LiteralString thisObj = new LiteralString("'", "'", true);

    // Act
    final String actual = thisObj.getUnescapedString();

    // Assert result
    Assert.assertEquals("'", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getUnescapedStringInputTrueOutputNotNull999e3a1861cf071fe58() {

    // Arrange
    final LiteralString thisObj = new LiteralString("'", "'", true);
    final boolean arg0 = true;

    // Act
    final String actual = thisObj.getUnescapedString(arg0);

    // Assert result
    Assert.assertEquals("'", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getUnescapedStringInputNotNullTrueOutputNotNull9996d67a937bd74ff3d() {

    // Arrange
    final String arg0 = "'";
    final boolean arg1 = true;

    // Act
    final String actual = LiteralString.getUnescapedString(arg0, arg1);

    // Assert result
    Assert.assertEquals("'", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getUnescapedStringInputNotNullOutputNotNull9997d52e8f7125fda24() {

    // Arrange
    final String arg0 = "'";

    // Act
    final String actual = LiteralString.getUnescapedString(arg0);

    // Assert result
    Assert.assertEquals("'", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNcharsOutputTrue9990aee9d1f9e36c793() {

    // Arrange
    final LiteralString thisObj = new LiteralString("'", "'", true);

    // Act
    final boolean actual = thisObj.isNchars();

    // Assert result
    Assert.assertTrue(actual);

  }
}
