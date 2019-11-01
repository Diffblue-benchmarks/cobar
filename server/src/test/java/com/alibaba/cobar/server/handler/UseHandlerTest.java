package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.UseHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class UseHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997f59f99e3a7b8e6d() {

    // Act, creating object to test constructor
    final UseHandler actual = new UseHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullZeroOutputNullPointerException9996628eaa65ffe94fb() {

    // Arrange
    final String arg0 = "'";
    final ServerConnection arg1 = null;
    final int arg2 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    UseHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
