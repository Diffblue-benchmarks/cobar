package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.RollbackHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RollbackHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d00dbabcf53552e5() {

    // Act, creating object to test constructor
    final RollbackHandler actual = new RollbackHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullOutputNullPointerException999d7225c79558e86f7() {

    // Arrange
    final String arg0 = "aaaaa";
    final ServerConnection arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    RollbackHandler.handle(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
