package com.alibaba.cobar.manager.handler;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.handler.RollbackHandler;
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
  public void constructorOutputNotNull999a1c682bc26dd7cc2() {

    // Act, creating object to test constructor
    final RollbackHandler actual = new RollbackHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInputNotNullNullPositiveOutputNullPointerException99996aa762df3f00f40() {

    // Arrange
    final String arg0 = "Unsupported statement";
    final ManagerConnection arg1 = null;
    final int arg2 = 1003;

    // Act
    thrown.expect(NullPointerException.class);
    RollbackHandler.handle(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
