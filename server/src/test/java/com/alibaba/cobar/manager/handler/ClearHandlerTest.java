package com.alibaba.cobar.manager.handler;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.handler.ClearHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ClearHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999dbd096a21d158101() {

    // Act, creating object to test constructor
    final ClearHandler actual = new ClearHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullPositiveOutputNullPointerException9996b6af2d4a4411255() {

    // Arrange
    final String arg0 = "Unsupported statement";
    final ManagerConnection arg1 = null;
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    ClearHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
