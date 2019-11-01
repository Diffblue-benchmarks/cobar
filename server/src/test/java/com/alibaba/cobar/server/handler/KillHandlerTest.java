package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.KillHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class KillHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992e812afec83119a0() {

    // Act, creating object to test constructor
    final KillHandler actual = new KillHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullZeroNullOutputNullPointerException999d347d2400c8bf0eb() {

    // Arrange
    final String arg0 = "Invalid connection id:";
    final int arg1 = 0;
    final ServerConnection arg2 = null;

    // Act
    thrown.expect(NullPointerException.class);
    KillHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
