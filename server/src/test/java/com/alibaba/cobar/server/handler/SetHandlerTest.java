package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.SetHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SetHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999eacb857078d9f485() {

    // Act, creating object to test constructor
    final SetHandler actual = new SetHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullZeroOutputNullPointerException9995ad34c2903ee75e6() {

    // Arrange
    final String arg0 = "aaaaa";
    final ServerConnection arg1 = null;
    final int arg2 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    SetHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
