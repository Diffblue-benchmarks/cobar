package com.alibaba.cobar.parser.ast.expression.primary.literal;

import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralHexadecimal;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.HashMap;



public class LiteralHexadecimalTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999e6b0343e5ceadda9() {

    // Arrange
    final char[] myCharArray = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final LiteralHexadecimal thisObj = new LiteralHexadecimal("", myCharArray, 1, 1, "");
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void appendToInputNotNullOutputVoid999d4535a39e077de3c() {

    // Arrange
    final char[] myCharArray = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final LiteralHexadecimal thisObj = new LiteralHexadecimal("", myCharArray, 1, 1, "");
    final StringBuilder arg0 = new StringBuilder();

    // Act
    thisObj.appendTo(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals("c", arg0.toString());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNull8PositivePositiveNotNullOutputNotNull999d82a5de992c66dcf() {

    // Arrange
    final String arg0 = "";
    final char[] arg1 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final int arg2 = 1;
    final int arg3 = 1;
    final String arg4 = "";

    // Act, creating object to test constructor
    final LiteralHexadecimal actual = new LiteralHexadecimal(arg0, arg1, arg2, arg3, arg4);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("", actual.getIntroducer());

  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputStringIndexOutOfBoundsException999be12022a373d0516() {

    // Arrange
    final char[] myCharArray = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final LiteralHexadecimal thisObj = new LiteralHexadecimal("", myCharArray, 1, 1, "");
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("", null);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    thisObj.evaluationInternal(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIntroducerOutputNotNull999369e13e3e5d8687d() {

    // Arrange
    final char[] myCharArray = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final LiteralHexadecimal thisObj = new LiteralHexadecimal("", myCharArray, 1, 1, "");

    // Act
    final String actual = thisObj.getIntroducer();

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTextOutputNotNull99980905add0707f6b8() {

    // Arrange
    final char[] myCharArray = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final LiteralHexadecimal thisObj = new LiteralHexadecimal("", myCharArray, 1, 1, "");

    // Act
    final String actual = thisObj.getText();

    // Assert result
    Assert.assertEquals("c", actual);

  }
}
