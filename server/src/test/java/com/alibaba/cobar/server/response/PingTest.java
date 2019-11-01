package com.alibaba.cobar.server.response;

import com.alibaba.cobar.net.FrontendConnection;
import com.alibaba.cobar.server.response.Ping;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PingTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99914c33edfcb4c61bc() {

    // Act, creating object to test constructor
    final Ping actual = new Ping();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void responseInputNullOutputNoClassDefFoundError999d75077fc7063a67a() {
//
//    // Arrange
//    final FrontendConnection arg0 = null;
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    Ping.response(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
