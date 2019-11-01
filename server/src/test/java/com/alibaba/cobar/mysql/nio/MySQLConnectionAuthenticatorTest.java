package com.alibaba.cobar.mysql.nio;

import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.mysql.nio.MySQLConnectionAuthenticator;
import com.alibaba.cobar.mysql.nio.handler.CommitNodeHandler;
import com.alibaba.cobar.server.session.NonBlockingSession;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MySQLConnectionAuthenticatorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9995e6b3bb31aeb16c3() {

    // Arrange
    final MySQLConnection arg0 = new MySQLConnection(null);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler arg1 = new CommitNodeHandler(nonBlockingSession);

    // Act, creating object to test constructor
    final MySQLConnectionAuthenticator actual = new MySQLConnectionAuthenticator(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInput24OutputNullPointerException999b9eab458f2cc8fcd() {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler commitNodeHandler = new CommitNodeHandler(nonBlockingSession);
    final MySQLConnectionAuthenticator thisObj = new MySQLConnectionAuthenticator(mySQLConnection, commitNodeHandler);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.handle(arg0);

    // The method is not expected to return due to exception thrown

  }
}
