package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.CobarNode;
import com.alibaba.cobar.config.model.CobarNodeConfig;
import com.alibaba.cobar.heartbeat.CobarDetectorFactory;
import com.alibaba.cobar.heartbeat.CobarHeartbeat;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;



public class CobarDetectorFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c17b85f3cb7ddbb2() {

    // Act, creating object to test constructor
    final CobarDetectorFactory actual = new CobarDetectorFactory();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(16777216, actual.getMaxPacketSize());
    Assert.assertEquals(120000L, actual.getIdleTimeout());
    Assert.assertEquals(4, actual.getPacketHeaderSize());
    Assert.assertEquals(16384, actual.getSocketRecvBuffer());
    Assert.assertEquals(8192, actual.getSocketSendBuffer());
    Assert.assertEquals(8, actual.getWriteQueueCapcity());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void makeInputNotNullOutputNoClassDefFoundError9994b41268338c38d3c() throws IOException {
//
//    // Arrange
//    final CobarDetectorFactory thisObj = new CobarDetectorFactory();
//    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("aaaaa", "aaaaa", 1, 655361);
//    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
//    final CobarHeartbeat arg0 = new CobarHeartbeat(cobarNode);
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    thisObj.make(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
