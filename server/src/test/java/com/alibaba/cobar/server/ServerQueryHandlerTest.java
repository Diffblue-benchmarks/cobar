package com.alibaba.cobar.server;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.ServerQueryHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ServerQueryHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull9992b7b6f5cf6a7ce4e() {

    // Arrange
    final ServerConnection arg0 = null;

    // Act, creating object to test constructor
    final ServerQueryHandler actual = new ServerQueryHandler(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void queryInputNotNullOutputNullPointerException999ac7a127e3857b07a() {

    // Arrange
    final ServerQueryHandler thisObj = new ServerQueryHandler(null);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.query(arg0);

    // The method is not expected to return due to exception thrown

  }
}
