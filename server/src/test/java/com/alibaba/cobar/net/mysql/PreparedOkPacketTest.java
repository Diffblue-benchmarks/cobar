package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.PreparedOkPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PreparedOkPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999663c64d0142f998a() {

    // Act, creating object to test constructor
    final PreparedOkPacket actual = new PreparedOkPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals((short) 0, actual.filler);
    Assert.assertEquals(0, actual.columnsNumber);
    Assert.assertEquals((short) 0, actual.flag);
    Assert.assertEquals(0, actual.parametersNumber);
    Assert.assertEquals(0L, actual.statementId);
    Assert.assertEquals(0, actual.warningCount);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
