package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.ServerPrepareHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ServerPrepareHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void closeOutputVoid9996db08b4c7e2d46c0() {

    // Arrange
    final ServerPrepareHandler thisObj = new ServerPrepareHandler(null);

    // Act
    thisObj.close();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull999d4033073381cdc4b() {

    // Arrange
    final ServerConnection arg0 = null;

    // Act, creating object to test constructor
    final ServerPrepareHandler actual = new ServerPrepareHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInput24OutputNullPointerException99904259e6e28e6d557() {

    // Arrange
    final ServerPrepareHandler thisObj = new ServerPrepareHandler(null);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void prepareInputNotNullOutputNullPointerException99927dce85b6c7b6672() {

    // Arrange
    final ServerPrepareHandler thisObj = new ServerPrepareHandler(null);
    final String arg0 = "Unknown pstmtId when executing.";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.prepare(arg0);

    // The method is not expected to return due to exception thrown

  }
}
