package com.alibaba.cobar.server;

import com.alibaba.cobar.server.ServerConnection;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.channels.SocketChannel;



public class ServerConnectionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNullPointerException99933a3af64afa8ca63() {

    // Arrange
    final SocketChannel arg0 = null;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new ServerConnection(arg0);

    // The method is not expected to return due to exception thrown

  }
}
