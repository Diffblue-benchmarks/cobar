package com.alibaba.cobar.server.response;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.response.ShowDatabases;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowDatabasesTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991788f7d36ada543f() {

    // Act, creating object to test constructor
    final ShowDatabases actual = new ShowDatabases();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void responseInputNullOutputNullPointerException999d54c0421734c03cc() {

    // Arrange
    final ServerConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    ShowDatabases.response(arg0);

    // The method is not expected to return due to exception thrown

  }
}
