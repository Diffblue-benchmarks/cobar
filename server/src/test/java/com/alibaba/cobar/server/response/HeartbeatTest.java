package com.alibaba.cobar.server.response;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.response.Heartbeat;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class HeartbeatTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999cf472956ceb704d6() {

    // Act, creating object to test constructor
    final Heartbeat actual = new Heartbeat();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void responseInputNull24OutputNoClassDefFoundError999ff58da883027cc74() {
//
//    // Arrange
//    final ServerConnection arg0 = null;
//    final byte[] arg1 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    Heartbeat.response(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
