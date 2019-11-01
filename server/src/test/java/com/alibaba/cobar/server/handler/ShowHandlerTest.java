package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.ShowHandler;
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
  public void constructorOutputNotNull99914ec11967bcffbd5() {

    // Act, creating object to test constructor
    final ShowHandler actual = new ShowHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullPositiveOutputNullPointerException999d7fe68cddea0e92a() {

    // Arrange
    final String arg0 = "aaaaa";
    final ServerConnection arg1 = null;
    final int arg2 = 9;

    // Act
    thrown.expect(NullPointerException.class);
    ShowHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
