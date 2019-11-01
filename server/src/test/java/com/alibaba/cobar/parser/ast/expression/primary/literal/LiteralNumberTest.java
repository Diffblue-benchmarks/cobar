package com.alibaba.cobar.parser.ast.expression.primary.literal;

import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralNumber;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;



public class LiteralNumberTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999d75faeb9c3ceb368() {

    // Arrange
    final Integer integer = new Integer(1);
    final LiteralNumber thisObj = new LiteralNumber(integer);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999e3beedf7e9157393() {

    // Arrange
    final Integer arg0 = new Integer(1);

    // Act, creating object to test constructor
    final LiteralNumber actual = new LiteralNumber(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getNumber());

  }

  // Test written by Diffblue Cover
  @Test
  public void evaluationInternalInputNotNullOutputNotNull9992aea2a2fad391360() {

    // Arrange
    final Integer integer = new Integer(1);
    final LiteralNumber thisObj = new LiteralNumber(integer);
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("number is null!", "number is null!");

    // Act
    final Object actual = thisObj.evaluationInternal(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNumberOutputNotNull999b0d9ad4abfcfb75c() {

    // Arrange
    final Integer integer = new Integer(1);
    final LiteralNumber thisObj = new LiteralNumber(integer);

    // Act
    final Number actual = thisObj.getNumber();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
