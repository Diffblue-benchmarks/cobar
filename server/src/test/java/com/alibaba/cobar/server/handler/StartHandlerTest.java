package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.StartHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class StartHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995776dc6cf6a79832() {

    // Act, creating object to test constructor
    final StartHandler actual = new StartHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullPositiveOutputNullPointerException9991150dbd1f0883a93() {

    // Arrange
    final String arg0 = "aaaaa";
    final ServerConnection arg1 = null;
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    StartHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
