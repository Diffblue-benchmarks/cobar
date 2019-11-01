package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.CommandPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CommandPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996dd10e94283e5541() {

    // Act, creating object to test constructor
    final CommandPacket actual = new CommandPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.arg);
    Assert.assertEquals((short) 0, actual.command);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
