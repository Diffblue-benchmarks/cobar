package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ShowProcessor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowProcessorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99918a5ecf86a65d6bd() {

    // Act, creating object to test constructor
    final ShowProcessor actual = new ShowProcessor();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNullOutputNullPointerException999a79806d95c8d81f3() {

    // Arrange
    final ManagerConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    ShowProcessor.execute(arg0);

    // The method is not expected to return due to exception thrown

  }
}
