package com.alibaba.cobar.manager.handler;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.handler.ShowHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999df5c6a24c5302576() {

    // Act, creating object to test constructor
    final ShowHandler actual = new ShowHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullPositiveOutputNullPointerException9991522cb51f7f02515() {

    // Arrange
    final String arg0 = "Unsupported statement";
    final ManagerConnection arg1 = null;
    final int arg2 = 8;

    // Act
    thrown.expect(NullPointerException.class);
    ShowHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
