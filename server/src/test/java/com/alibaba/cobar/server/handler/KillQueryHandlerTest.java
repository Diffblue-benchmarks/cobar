package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.KillQueryHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class KillQueryHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fc987364d1ff0855() {

    // Act, creating object to test constructor
    final KillQueryHandler actual = new KillQueryHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullZeroNullOutputNullPointerException999ffa60a2f93848110() {

    // Arrange
    final String arg0 = "Invalid connection id:";
    final int arg1 = 0;
    final ServerConnection arg2 = null;

    // Act
    thrown.expect(NullPointerException.class);
    KillQueryHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
