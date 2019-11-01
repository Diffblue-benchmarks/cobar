package com.alibaba.cobar.parser.recognizer.mysql.lexer;

import com.alibaba.cobar.parser.recognizer.mysql.MySQLToken;
import com.alibaba.cobar.parser.recognizer.mysql.lexer.MySQLLexer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.sql.SQLSyntaxErrorException;



public class MySQLLexerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addCacheTokeInputEofOutputVoid999020bd184cd45d4ce() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);
    final MySQLToken arg0 = MySQLToken.EOF;

    // Act
    thisObj.addCacheToke(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void appendStringContentInputNotNullOutputArrayIndexOutOfBoundsException999dfecf9af88f39a01() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);
    final StringBuilder arg0 = new StringBuilder();

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    thisObj.appendStringContent(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInput8OutputNotNull999e657f7a4503c035c() throws SQLSyntaxErrorException {

    // Arrange
    final char[] arg0 = { '!', '!', '!', '!', '!', '!', '!', '!' };

    // Act, creating object to test constructor
    final MySQLLexer actual = new MySQLLexer(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.keywods);
    Assert.assertFalse(actual.inCStyleComment);
    Assert.assertFalse(actual.inCStyleCommentIgnore);
    Assert.assertEquals(8, actual.eofIndex);
    Assert.assertEquals(0, actual.getOffsetCache());
    Assert.assertEquals(1, actual.getCurrentIndex());
    Assert.assertEquals(0, actual.getSizeCache());
    Assert.assertEquals('!', actual.ch);
    Assert.assertArrayEquals(new char[]{ '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000' }, actual.sbuf);
    Assert.assertArrayEquals(new char[]{ '!', '!', '!', '!', '!', '!', '!', '!', '\u001a' }, actual.getSQL());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull999a381545edfb450a4() throws SQLSyntaxErrorException {
//
//    // Arrange
//    final String arg0 = "!";
//
//    // Act, creating object to test constructor
//    final MySQLLexer actual = new MySQLLexer(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.keywods);
//    Assert.assertFalse(actual.inCStyleComment);
//    Assert.assertFalse(actual.inCStyleCommentIgnore);
//    Assert.assertEquals(1, actual.eofIndex);
//    Assert.assertEquals(0, actual.getOffsetCache());
//    Assert.assertEquals(1, actual.getCurrentIndex());
//    Assert.assertEquals(0, actual.getSizeCache());
//    Assert.assertEquals('\u001a', actual.ch);
//    Assert.assertArrayEquals(new char[]{ 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'I', 'Z', 'E', 'D', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000' }, actual.sbuf);
//    Assert.assertArrayEquals(new char[]{ '!', '\u001a' }, actual.getSQL());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void decimalValueOutputNumberFormatException99980a11793a090657f() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.decimalValue();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void eofOutputFalse999560e80570baef032() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final boolean actual = thisObj.eof();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void errInputNotNullOutputSQLSyntaxErrorException99989b18c8f8e5e3ba6() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);
    final String arg0 = "!";

    // Act
    thrown.expect(SQLSyntaxErrorException.class);
    thisObj.err(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCurrentIndexOutputPositive999997ef23a5911418d() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final int actual = thisObj.getCurrentIndex();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOffsetCacheOutputZero99980acea107e9eac34() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final int actual = thisObj.getOffsetCache();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getSQLOutput9999f7979543484cbf93() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final char[] actual = thisObj.getSQL();

    // Assert result
    Assert.assertArrayEquals(new char[]{ '!', '!', '!', '!', '!', '!', '!', '!', '\u001a' }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getSizeCacheOutputZero999dafc74535fd24f47() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final int actual = thisObj.getSizeCache();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hasCharsInputNegativeOutputTrue9995da2391d46f3a491() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);
    final int arg0 = -1;

    // Act
    final boolean actual = thisObj.hasChars(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void integerValueOutputNotNull999da93c2b4a07036ad() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final Number actual = thisObj.integerValue();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void nextTokenOutputOp_exclamation999a5e8bb400978d43e() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final MySQLToken actual = thisObj.nextToken();

    // Assert side effects
    Assert.assertEquals(2, thisObj.getCurrentIndex());

    // Assert result
    Assert.assertEquals(MySQLToken.OP_EXCLAMATION, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void paramIndexOutputZero99963ac1941ede43cf3() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final int actual = thisObj.paramIndex();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void putCharInputNotNullNegativeOutputArrayIndexOutOfBoundsException9997a99ce0ede123f96() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);
    final char arg0 = '!';
    final int arg1 = -1;

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    thisObj.putChar(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void scanBitFieldInputTrueOutputSQLSyntaxErrorException999f1440bba6cc11f8a() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);
    final boolean arg0 = true;
    try {

      // Act
      thrown.expect(SQLSyntaxErrorException.class);
      thisObj.scanBitField(arg0);
    } catch (SQLSyntaxErrorException ex) {

      // Assert side effects
      Assert.assertEquals(1, thisObj.getOffsetCache());
      throw ex;
    }

  }

  // Test written by Diffblue Cover
  @Test
  public void scanCharOutputNotNull999d08f795c3e2714a1() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final char actual = thisObj.scanChar();

    // Assert side effects
    Assert.assertEquals(2, thisObj.getCurrentIndex());

    // Assert result
    Assert.assertEquals('!', actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void scanCharInputNegativeOutputNotNull999833eca37f59c9dc6() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);
    final int arg0 = -1;

    // Act
    final char actual = thisObj.scanChar(arg0);

    // Assert side effects
    Assert.assertEquals(0, thisObj.getCurrentIndex());

    // Assert result
    Assert.assertEquals('!', actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void scanHexaDecimalInputTrueOutputSQLSyntaxErrorException99987374224382fb46d() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);
    final boolean arg0 = true;
    try {

      // Act
      thrown.expect(SQLSyntaxErrorException.class);
      thisObj.scanHexaDecimal(arg0);
    } catch (SQLSyntaxErrorException ex) {

      // Assert side effects
      Assert.assertEquals(1, thisObj.getOffsetCache());
      throw ex;
    }

  }

  // Test written by Diffblue Cover
  @Test
  public void scanIdentifierOutputVoid999b65800dfc5b7ea01() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    thisObj.scanIdentifier();

    // Assert side effects
    Assert.assertEquals(1, thisObj.getOffsetCache());

  }

  // Test written by Diffblue Cover
  @Test
  public void scanIdentifierWithAccentOutputVoid999f28223834cc14f06() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    thisObj.scanIdentifierWithAccent();

    // Assert side effects
    Assert.assertEquals(1, thisObj.getOffsetCache());
    Assert.assertEquals(8, thisObj.getCurrentIndex());
    Assert.assertEquals(7, thisObj.getSizeCache());
    Assert.assertEquals('\u001a', thisObj.ch);

  }

  // Test written by Diffblue Cover
  @Test
  public void scanNumberOutputVoid9992ec334485967d3d4() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    thisObj.scanNumber();

    // Assert side effects
    Assert.assertEquals(1, thisObj.getOffsetCache());
    Assert.assertEquals(2, thisObj.getCurrentIndex());
    Assert.assertEquals(1, thisObj.getSizeCache());

  }

  // Test written by Diffblue Cover
  @Test
  public void scanPlaceHolderOutputVoid99990e9c28d38924ee7() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    thisObj.scanPlaceHolder();

    // Assert side effects
    Assert.assertEquals(2, thisObj.getOffsetCache());
    Assert.assertEquals(8, thisObj.getCurrentIndex());
    Assert.assertEquals(6, thisObj.getSizeCache());
    Assert.assertEquals('\u001a', thisObj.ch);

  }

  // Test written by Diffblue Cover
  @Test
  public void scanStringOutputSQLSyntaxErrorException9990e8cdd5c6b7be68a() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    thrown.expect(SQLSyntaxErrorException.class);
    thisObj.scanString();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void scanSystemVariableOutputSQLSyntaxErrorException999b9178d8bf7aa6328() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    thrown.expect(SQLSyntaxErrorException.class);
    thisObj.scanSystemVariable();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void scanUserVariableOutputSQLSyntaxErrorException99967091d0a3c6833b3() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    thrown.expect(SQLSyntaxErrorException.class);
    thisObj.scanUserVariable();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCStyleCommentVersionInputNegativeOutputPositive9997302a05c4045fe29() {

    // Arrange
    final int arg0 = -1;

    // Act
    final int actual = MySQLLexer.setCStyleCommentVersion(arg0);

    // Assert result
    Assert.assertEquals(50599, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void skipSeparatorOutputVoid99975d324a05c168b27() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    thisObj.skipSeparator();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stringValueOutputVoid999492f3cd79729c24c() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final String actual = thisObj.stringValue();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stringValueUppercaseOutputVoid999ec6344b025856577() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final String actual = thisObj.stringValueUppercase();

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void toStringOutputNotNull999346a23f7823a5862() throws SQLSyntaxErrorException {
//
//    // Arrange
//    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
//    final MySQLLexer thisObj = new MySQLLexer(myCharArray);
//
//    // Act
//    final String actual = thisObj.toString();
//
//    // Assert result
//    Assert.assertEquals("MySQLLexer@792187810{curIndex=1, ch=!, token=OP_EXCLAMATION, sqlLeft=!!!!!!!\u001a, sql=!!!!!!!!\u001a}", actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void tokenOutputOp_exclamation999800c9c1f7727f82d() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);

    // Act
    final MySQLToken actual = thisObj.token();

    // Assert result
    Assert.assertEquals(MySQLToken.OP_EXCLAMATION, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void updateStringValueInput8NegativeNegativeOutputStringIndexOutOfBoundsException99973df3c4dc879286f() throws SQLSyntaxErrorException {

    // Arrange
    final char[] myCharArray = { '!', '!', '!', '!', '!', '!', '!', '!' };
    final MySQLLexer thisObj = new MySQLLexer(myCharArray);
    final char[] arg0 = { '!', '!', '!', '0', '!', '!', '!', '!' };
    final int arg1 = -1;
    final int arg2 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    thisObj.updateStringValue(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
