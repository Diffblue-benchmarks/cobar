package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.ExplainHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ExplainHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d5f675ac0fa6759f() {

    // Act, creating object to test constructor
    final ExplainHandler actual = new ExplainHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullZeroOutputNullPointerException999eef1f00a5b8fcec3() {

    // Arrange
    final String arg0 = "SQL";
    final ServerConnection arg1 = null;
    final int arg2 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    ExplainHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
