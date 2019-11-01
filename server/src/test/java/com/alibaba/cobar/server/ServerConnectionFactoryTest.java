package com.alibaba.cobar.server;

import com.alibaba.cobar.server.ServerConnectionFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.channels.SocketChannel;



public class ServerConnectionFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ba0c9ec548231daf() {

    // Act, creating object to test constructor
    final ServerConnectionFactory actual = new ServerConnectionFactory();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("utf8", actual.getCharset());
    Assert.assertEquals(16777216, actual.getMaxPacketSize());
    Assert.assertEquals(16, actual.getWriteQueueCapcity());
    Assert.assertEquals(4, actual.getPacketHeaderSize());
    Assert.assertEquals(8192, actual.getSocketRecvBuffer());
    Assert.assertEquals(16384, actual.getSocketSendBuffer());
    Assert.assertEquals(28800000L, actual.getIdleTimeout());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getConnectionInputNullOutputNoClassDefFoundError99903f3b2031e30ffdc() {
//
//    // Arrange
//    final ServerConnectionFactory thisObj = new ServerConnectionFactory();
//    final SocketChannel arg0 = null;
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    thisObj.getConnection(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
