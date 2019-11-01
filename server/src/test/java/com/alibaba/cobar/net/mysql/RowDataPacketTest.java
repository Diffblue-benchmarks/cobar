package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.net.mysql.RowDataPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class RowDataPacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroOutputNotNull999003c723b19254be6() {

    // Arrange
    final int arg0 = 0;

    // Act, creating object to test constructor
    final RowDataPacket actual = new RowDataPacket(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.fieldCount);
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    Assert.assertEquals(arrayList, actual.fieldValues);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
