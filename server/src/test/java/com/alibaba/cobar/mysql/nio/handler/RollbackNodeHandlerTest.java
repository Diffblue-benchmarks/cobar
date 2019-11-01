package com.alibaba.cobar.mysql.nio.handler;

import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.mysql.nio.handler.RollbackNodeHandler;
import com.alibaba.cobar.server.session.NonBlockingSession;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class RollbackNodeHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void connectionAcquiredInputNotNullOutputNullPointerException999150b88e882e8590d() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final RollbackNodeHandler thisObj = new RollbackNodeHandler(nonBlockingSession);
    final MySQLConnection arg0 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionAcquired(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void connectionErrorInputNotNullNotNullOutputNullPointerException999714b0bcf173e839b() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final RollbackNodeHandler thisObj = new RollbackNodeHandler(nonBlockingSession);
    final Throwable arg0 = new Throwable();
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionError(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99942c5b9bef55faaab() {

    // Arrange
    final NonBlockingSession arg0 = new NonBlockingSession(null);

    // Act, creating object to test constructor
    final RollbackNodeHandler actual = new RollbackNodeHandler(arg0);

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
  public void errorResponseInput24NotNullOutputVoid9993d9c356622e6ef08() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final RollbackNodeHandler thisObj = new RollbackNodeHandler(nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.errorResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void fieldEofResponseInput24NotNull24NotNullOutputVoid999c89e534ac8774369() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final RollbackNodeHandler thisObj = new RollbackNodeHandler(nonBlockingSession);
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
  public void okResponseInput24NotNullOutputVoid999c32f65167c1366f7() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final RollbackNodeHandler thisObj = new RollbackNodeHandler(nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.okResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rollbackOutputNullPointerException9996444abb4ad1d3f24() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final RollbackNodeHandler thisObj = new RollbackNodeHandler(nonBlockingSession);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rollback();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowEofResponseInput24NotNullOutputNullPointerException99904692231b99fd1d7() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final RollbackNodeHandler thisObj = new RollbackNodeHandler(nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rowEofResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowResponseInput24NotNullOutputVoid9991532b5aaa3559e63() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final RollbackNodeHandler thisObj = new RollbackNodeHandler(nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.rowResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
