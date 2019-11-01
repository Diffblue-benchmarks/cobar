package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.HeartbeatPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class HeartbeatPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d9f1e0ace6759c39() {

    // Act, creating object to test constructor
    final HeartbeatPacket actual = new HeartbeatPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals((short) 0, actual.command);
    Assert.assertEquals(0L, actual.id);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
