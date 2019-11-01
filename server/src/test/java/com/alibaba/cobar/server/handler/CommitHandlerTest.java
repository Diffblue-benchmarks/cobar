package com.alibaba.cobar.server.handler;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.handler.CommitHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CommitHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a14c71f97c24b2be() {

    // Act, creating object to test constructor
    final CommitHandler actual = new CommitHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNullOutputNullPointerException999fee029110886ab87() {

    // Arrange
    final ServerConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    CommitHandler.handle(arg0);

    // The method is not expected to return due to exception thrown

  }
}
