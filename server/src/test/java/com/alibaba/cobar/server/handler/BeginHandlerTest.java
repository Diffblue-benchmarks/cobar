package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.BeginHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BeginHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999689265c7db24e201() {

    // Act, creating object to test constructor
    final BeginHandler actual = new BeginHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullOutputNullPointerException999701e975860d00401() {

    // Arrange
    final String arg0 = "Unsupported statement";
    final ServerConnection arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    BeginHandler.handle(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
