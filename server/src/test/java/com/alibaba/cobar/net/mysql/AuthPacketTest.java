package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.AuthPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AuthPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f5c94db6d55fdb2a() {

    // Act, creating object to test constructor
    final AuthPacket actual = new AuthPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.password);
    Assert.assertEquals(0L, actual.maxPacketSize);
    Assert.assertNull(actual.extra);
    Assert.assertEquals(0L, actual.clientFlags);
    Assert.assertEquals(0, actual.charsetIndex);
    Assert.assertNull(actual.user);
    Assert.assertNull(actual.database);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
