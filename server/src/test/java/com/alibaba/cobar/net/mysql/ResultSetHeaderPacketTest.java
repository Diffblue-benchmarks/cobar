package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.ResultSetHeaderPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ResultSetHeaderPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99968bd933f67d72447() {

    // Act, creating object to test constructor
    final ResultSetHeaderPacket actual = new ResultSetHeaderPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0L, actual.extra);
    Assert.assertEquals(0, actual.fieldCount);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
