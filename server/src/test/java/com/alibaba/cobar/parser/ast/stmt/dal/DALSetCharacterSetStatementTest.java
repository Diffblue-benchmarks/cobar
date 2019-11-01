package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.stmt.dal.DALSetCharacterSetStatement;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DALSetCharacterSetStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999423f8ab81634fa55() {

    // Arrange
    final DALSetCharacterSetStatement thisObj = new DALSetCharacterSetStatement();
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99919ee4a02b8995fd9() {

    // Act, creating object to test constructor
    final DALSetCharacterSetStatement actual = new DALSetCharacterSetStatement();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getCharset());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999bb94c9c614b28825() {

    // Arrange
    final String arg0 = "charsetName is null";

    // Act, creating object to test constructor
    final DALSetCharacterSetStatement actual = new DALSetCharacterSetStatement(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("charsetName is null", actual.getCharset());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharsetOutputVoid999ffade096d64a26d2() {

    // Arrange
    final DALSetCharacterSetStatement thisObj = new DALSetCharacterSetStatement();

    // Act
    final String actual = thisObj.getCharset();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isDefaultOutputTrue9993d71f7311550cc66() {

    // Arrange
    final DALSetCharacterSetStatement thisObj = new DALSetCharacterSetStatement();

    // Act
    final boolean actual = thisObj.isDefault();

    // Assert result
    Assert.assertTrue(actual);

  }
}
