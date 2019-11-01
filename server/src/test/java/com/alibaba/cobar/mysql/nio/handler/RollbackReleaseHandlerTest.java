package com.alibaba.cobar.mysql.nio.handler;

import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.mysql.nio.handler.RollbackReleaseHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class RollbackReleaseHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void connectionAcquiredInputNotNullOutputNullPointerException9999998b16f8ea3983a() {

    // Arrange
    final RollbackReleaseHandler thisObj = new RollbackReleaseHandler();
    final MySQLConnection arg0 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionAcquired(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void connectionErrorInputNotNullNotNullOutputNullPointerException999d16029c7a280af90() {

    // Arrange
    final RollbackReleaseHandler thisObj = new RollbackReleaseHandler();
    final Throwable arg0 = new Throwable();
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionError(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d07a3bccec110a2b() {

    // Act, creating object to test constructor
    final RollbackReleaseHandler actual = new RollbackReleaseHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void errorResponseInput24NotNullOutputNullPointerException99933cb8fe8ec8f34db() {

    // Arrange
    final RollbackReleaseHandler thisObj = new RollbackReleaseHandler();
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.errorResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void fieldEofResponseInput24NotNull24NotNullOutputVoid99953052e76bdbe3cdc() {

    // Arrange
    final RollbackReleaseHandler thisObj = new RollbackReleaseHandler();
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ArrayList<byte[]> arg1 = new ArrayList<byte[]>(1);
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    arg1.add(myByteArray);
    final byte[] arg2 = arg0;
    final MySQLConnection arg3 = new MySQLConnection(null);

    // Act
    thisObj.fieldEofResponse(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void okResponseInput24NotNullOutputNullPointerException999ac6dfb25dd30e7d4() {

    // Arrange
    final RollbackReleaseHandler thisObj = new RollbackReleaseHandler();
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.okResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowEofResponseInput24NotNullOutputNullPointerException999199796436ab54b0c() {

    // Arrange
    final RollbackReleaseHandler thisObj = new RollbackReleaseHandler();
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rowEofResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowResponseInput24NotNullOutputVoid99920c757acb9564318() {

    // Arrange
    final RollbackReleaseHandler thisObj = new RollbackReleaseHandler();
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.rowResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
