package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.SelectHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SelectHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992dd8e37a53c703f9() {

    // Act, creating object to test constructor
    final SelectHandler actual = new SelectHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullPositiveOutputNullPointerException999afd97b6bacec56e9() {

    // Arrange
    final String arg0 = "aaaaa";
    final ServerConnection arg1 = null;
    final int arg2 = 7;

    // Act
    thrown.expect(NullPointerException.class);
    SelectHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
