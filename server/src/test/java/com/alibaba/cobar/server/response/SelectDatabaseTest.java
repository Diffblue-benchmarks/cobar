package com.alibaba.cobar.server.response;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.response.SelectDatabase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SelectDatabaseTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e50929057023a892() {

    // Act, creating object to test constructor
    final SelectDatabase actual = new SelectDatabase();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void responseInputNullOutputNullPointerException999dfad34e4cad53026() {

    // Arrange
    final ServerConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    SelectDatabase.response(arg0);

    // The method is not expected to return due to exception thrown

  }
}
