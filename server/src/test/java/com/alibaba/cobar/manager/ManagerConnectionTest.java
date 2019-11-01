package com.alibaba.cobar.manager;

import com.alibaba.cobar.manager.ManagerConnection;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.channels.SocketChannel;



public class ManagerConnectionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNullPointerException99965983b4db91404c7() {

    // Arrange
    final SocketChannel arg0 = null;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new ManagerConnection(arg0);

    // The method is not expected to return due to exception thrown

  }
}
