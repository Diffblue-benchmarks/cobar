package com.alibaba.cobar.manager.handler;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.handler.StopHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class StopHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9993ce40fd5569cd3f6() {

    // Act, creating object to test constructor
    final StopHandler actual = new StopHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullPositiveOutputNullPointerException999342f3ac60fb2148b() {

    // Arrange
    final String arg0 = "Unsupported statement";
    final ManagerConnection arg1 = null;
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    StopHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
