package com.alibaba.cobar.mysql.nio.handler;

import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.mysql.nio.handler.CommitNodeHandler;
import com.alibaba.cobar.mysql.nio.handler.DelegateResponseHandler;
import com.alibaba.cobar.server.session.NonBlockingSession;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class DelegateResponseHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void connectionAcquiredInputNotNullOutputNullPointerException99953c9b3bae3740084() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler commitNodeHandler = new CommitNodeHandler(nonBlockingSession);
    final DelegateResponseHandler thisObj = new DelegateResponseHandler(commitNodeHandler);
    final MySQLConnection arg0 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionAcquired(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void connectionErrorInputNotNullNotNullOutputNullPointerException999af48f41640050ab3() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler commitNodeHandler = new CommitNodeHandler(nonBlockingSession);
    final DelegateResponseHandler thisObj = new DelegateResponseHandler(commitNodeHandler);
    final Throwable arg0 = new Throwable();
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionError(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999fb1f9461ab9963ec() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler arg0 = new CommitNodeHandler(nonBlockingSession);

    // Act, creating object to test constructor
    final DelegateResponseHandler actual = new DelegateResponseHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void errorResponseInput24NotNullOutputVoid999737a9eec79cd4d9a() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler commitNodeHandler = new CommitNodeHandler(nonBlockingSession);
    final DelegateResponseHandler thisObj = new DelegateResponseHandler(commitNodeHandler);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.errorResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void fieldEofResponseInput24NotNull24NotNullOutputVoid999809ffc219a20ecf6() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler commitNodeHandler = new CommitNodeHandler(nonBlockingSession);
    final DelegateResponseHandler thisObj = new DelegateResponseHandler(commitNodeHandler);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ArrayList<byte[]> arg1 = new ArrayList<byte[]>();
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    arg1.add(myByteArray);
    final byte[] arg2 = arg0;
    final MySQLConnection arg3 = new MySQLConnection(null);

    // Act
    thisObj.fieldEofResponse(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void okResponseInput24NotNullOutputVoid9996a8100b74cd31ba1() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler commitNodeHandler = new CommitNodeHandler(nonBlockingSession);
    final DelegateResponseHandler thisObj = new DelegateResponseHandler(commitNodeHandler);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.okResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowEofResponseInput24NotNullOutputNullPointerException9990d1ddb0b3ac929ee() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler commitNodeHandler = new CommitNodeHandler(nonBlockingSession);
    final DelegateResponseHandler thisObj = new DelegateResponseHandler(commitNodeHandler);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rowEofResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowResponseInput24NotNullOutputVoid999dd61587f1abf223f() {

    // Arrange
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler commitNodeHandler = new CommitNodeHandler(nonBlockingSession);
    final DelegateResponseHandler thisObj = new DelegateResponseHandler(commitNodeHandler);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.rowResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
