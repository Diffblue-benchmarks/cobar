package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.stmt.dal.DALSetNamesStatement;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DALSetNamesStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999d3dfa94118dea545() {

    // Arrange
    final DALSetNamesStatement thisObj = new DALSetNamesStatement();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b430217635058b39() {

    // Act, creating object to test constructor
    final DALSetNamesStatement actual = new DALSetNamesStatement();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getCharsetName());
    Assert.assertNull(actual.getCollationName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999adfbc27ac5369701() {

    // Arrange
    final String arg0 = "charsetName is null";
    final String arg1 = "charsetName is null";

    // Act, creating object to test constructor
    final DALSetNamesStatement actual = new DALSetNamesStatement(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("charsetName is null", actual.getCharsetName());
    Assert.assertEquals("charsetName is null", actual.getCollationName());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharsetNameOutputVoid999572daa199dd6e589() {

    // Arrange
    final DALSetNamesStatement thisObj = new DALSetNamesStatement();

    // Act
    final String actual = thisObj.getCharsetName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCollationNameOutputVoid99928bffed65f65ee82() {

    // Arrange
    final DALSetNamesStatement thisObj = new DALSetNamesStatement();

    // Act
    final String actual = thisObj.getCollationName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isDefaultOutputTrue99961b834f40b61d2ca() {

    // Arrange
    final DALSetNamesStatement thisObj = new DALSetNamesStatement();

    // Act
    final boolean actual = thisObj.isDefault();

    // Assert result
    Assert.assertTrue(actual);

  }
}
