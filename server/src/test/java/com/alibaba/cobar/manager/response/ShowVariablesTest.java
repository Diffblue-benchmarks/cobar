package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ShowVariables;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowVariablesTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d29eb4805d4e49f5() {

    // Act, creating object to test constructor
    final ShowVariables actual = new ShowVariables();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNullOutputNullPointerException999f5c100dfe4455481() {

    // Arrange
    final ManagerConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    ShowVariables.execute(arg0);

    // The method is not expected to return due to exception thrown

  }
}
