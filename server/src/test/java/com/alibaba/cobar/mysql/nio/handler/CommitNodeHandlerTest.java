package com.alibaba.cobar.mysql.nio.handler;

import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.mysql.nio.handler.CommitNodeHandler;
import com.alibaba.cobar.server.session.NonBlockingSession;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class CommitNodeHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void commitOutputNullPointerException99907f507a9c68b1b12() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler thisObj = new CommitNodeHandler(nonBlockingSession);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.commit();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void connectionAcquiredInputNotNullOutputNullPointerException99913617b86b650cfa4() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler thisObj = new CommitNodeHandler(nonBlockingSession);
    final MySQLConnection arg0 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionAcquired(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void connectionErrorInputNotNullNotNullOutputNullPointerException999fd2975bd8fc76d92() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler thisObj = new CommitNodeHandler(nonBlockingSession);
    final Throwable arg0 = new Throwable();
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionError(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999797fc14c8267f86a() {

    // Arrange
    final NonBlockingSession arg0 = new NonBlockingSession(null);

    // Act, creating object to test constructor
    final CommitNodeHandler actual = new CommitNodeHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.session);
    Assert.assertNull(actual.session.getSource());
    Assert.assertNotNull(actual.lock);
    Assert.assertNotNull(actual.isFail);
    Assert.assertEquals((short) 0, actual.packetId);

  }

  // Test written by Diffblue Cover
  @Test
  public void errorResponseInput24NotNullOutputVoid999068d7853d2becc52() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler thisObj = new CommitNodeHandler(nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.errorResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void fieldEofResponseInput24NotNull24NotNullOutputVoid999d612a1e6155f3bee() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler thisObj = new CommitNodeHandler(nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ArrayList<byte[]> arg1 = new ArrayList<byte[]>();
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 };
    arg1.add(myByteArray);
    final byte[] arg2 = arg0;
    final MySQLConnection arg3 = new MySQLConnection(null);

    // Act
    thisObj.fieldEofResponse(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void okResponseInput24NotNullOutputVoid99956c6494c2ca16e87() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler thisObj = new CommitNodeHandler(nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.okResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowEofResponseInput24NotNullOutputNullPointerException999f77f5bc61ff6714b() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler thisObj = new CommitNodeHandler(nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rowEofResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowResponseInput24NotNullOutputVoid999c7b92dc02b70e860() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler thisObj = new CommitNodeHandler(nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.rowResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
