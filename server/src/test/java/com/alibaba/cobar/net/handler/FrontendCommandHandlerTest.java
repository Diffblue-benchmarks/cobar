package com.alibaba.cobar.net.handler;

import com.alibaba.cobar.net.FrontendConnection;
import com.alibaba.cobar.net.handler.FrontendCommandHandler;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FrontendCommandHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNullPointerException999f7cb014683b9c2d6() {

    // Arrange
    final FrontendConnection arg0 = null;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new FrontendCommandHandler(arg0);

    // The method is not expected to return due to exception thrown

  }
}
