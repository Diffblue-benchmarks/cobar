package com.alibaba.cobar.manager;

import com.alibaba.cobar.manager.ManagerConnectionFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.channels.SocketChannel;



public class ManagerConnectionFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c37a8fe58ae78f0e() {

    // Act, creating object to test constructor
    final ManagerConnectionFactory actual = new ManagerConnectionFactory();

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

  // Test written by Diffblue Cover
  @Test
  public void getConnectionInputNullOutputNullPointerException999f970a5bc8d798c0f() {

    // Arrange
    final ManagerConnectionFactory thisObj = new ManagerConnectionFactory();
    final SocketChannel arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getConnection(arg0);

    // The method is not expected to return due to exception thrown

  }
}
