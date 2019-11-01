package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.OkPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class OkPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b8df541cf78fe36a() {

    // Act, creating object to test constructor
    final OkPacket actual = new OkPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals((short) 0, actual.fieldCount);
    Assert.assertEquals(0L, actual.affectedRows);
    Assert.assertNull(actual.message);
    Assert.assertEquals(0L, actual.insertId);
    Assert.assertEquals(0, actual.serverStatus);
    Assert.assertEquals(0, actual.warningCount);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
