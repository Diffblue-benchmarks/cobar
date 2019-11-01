package com.alibaba.cobar.manager.handler;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.handler.SwitchHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SwitchHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999848cfde33bae6799() {

    // Act, creating object to test constructor
    final SwitchHandler actual = new SwitchHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handlerInputNotNullNullPositiveOutputNullPointerException999f590de542a4fe11a() {

    // Arrange
    final String arg0 = "Unsupported statement";
    final ManagerConnection arg1 = null;
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    SwitchHandler.handler(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
