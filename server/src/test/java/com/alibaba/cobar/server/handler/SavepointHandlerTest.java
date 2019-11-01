package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.SavepointHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SavepointHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ff5192aeb92ff6d3() {

    // Act, creating object to test constructor
    final SavepointHandler actual = new SavepointHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullOutputNullPointerException9994ddd0a08118a4ab9() {

    // Arrange
    final String arg0 = "Unsupported statement";
    final ServerConnection arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    SavepointHandler.handle(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
