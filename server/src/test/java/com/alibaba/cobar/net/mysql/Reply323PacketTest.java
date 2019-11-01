package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.Reply323Packet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Reply323PacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b27bd7cbb167cc05() {

    // Act, creating object to test constructor
    final Reply323Packet actual = new Reply323Packet();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.seed);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
