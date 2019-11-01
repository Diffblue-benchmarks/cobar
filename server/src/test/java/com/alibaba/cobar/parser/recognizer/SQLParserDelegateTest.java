package com.alibaba.cobar.parser.recognizer;

import com.alibaba.cobar.parser.ast.stmt.SQLStatement;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSRollbackStatement.CompleteType;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSRollbackStatement;
import com.alibaba.cobar.parser.recognizer.SQLParserDelegate;
import com.alibaba.cobar.parser.recognizer.mysql.lexer.MySQLLexer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.sql.SQLSyntaxErrorException;



public class SQLParserDelegateTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990e8107f4eef2e995() {

    // Act, creating object to test constructor
    final SQLParserDelegate actual = new SQLParserDelegate();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullNotNullNotNullOutputSQLSyntaxErrorException999b8ed3665688ce1b6() throws SQLSyntaxErrorException {

    // Arrange
    final String arg0 = "ROLLBACK";
    final char[] myCharArray = { '{', '{', '{', '{', '{', '{', '{', '{' };
    final MySQLLexer arg1 = new MySQLLexer(myCharArray);
    final String arg2 = "ROLLBACK";

    // Act
    thrown.expect(SQLSyntaxErrorException.class);
    SQLParserDelegate.parse(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullNotNullOutputNotNull9993b96e9155c7a099e() throws SQLSyntaxErrorException {

    // Arrange
    final String arg0 = "ROLLBACK";
    final String arg1 = "ROLLBACK";

    // Act
    final SQLStatement actual = SQLParserDelegate.parse(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(MTSRollbackStatement.CompleteType.UN_DEF, ((MTSRollbackStatement) actual).getCompleteType());
    Assert.assertNull(((MTSRollbackStatement) actual).getSavepoint());

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullOutputNotNull999ec88a681bf5c6753() throws SQLSyntaxErrorException {

    // Arrange
    final String arg0 = "ROLLBACK";

    // Act
    final SQLStatement actual = SQLParserDelegate.parse(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(MTSRollbackStatement.CompleteType.UN_DEF, ((MTSRollbackStatement) actual).getCompleteType());
    Assert.assertNull(((MTSRollbackStatement) actual).getSavepoint());

  }
}
