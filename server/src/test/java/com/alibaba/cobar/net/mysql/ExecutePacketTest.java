package com.alibaba.cobar.net.mysql;

import com.alibaba.cobar.mysql.BindValue;
import com.alibaba.cobar.mysql.PreparedStatement;
import com.alibaba.cobar.net.mysql.ExecutePacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class ExecutePacketTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999e2320ba8f91d2947() {

    // Arrange
    final PreparedStatement arg0 = new PreparedStatement(1L, "aaaaa", 0, 0);

    // Act, creating object to test constructor
    final ExecutePacket actual = new ExecutePacket(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.pstmt);
    Assert.assertEquals(1L, actual.pstmt.getId());
    Assert.assertEquals(0, actual.pstmt.getParametersNumber());
    Assert.assertEquals(0, actual.pstmt.getColumnsNumber());
    Assert.assertEquals("aaaaa", actual.pstmt.getStatement());
    Assert.assertArrayEquals(new int[]{ }, actual.pstmt.getParametersType());
    Assert.assertEquals((short) 0, actual.newParameterBoundFlag);
    Assert.assertNull(actual.nullBitMap);
    Assert.assertEquals(0L, actual.iterationCount);
    Assert.assertEquals((short) 0, actual.code);
    Assert.assertEquals((short) 0, actual.flags);
    Assert.assertArrayEquals(new BindValue[]{ }, actual.values);
    Assert.assertEquals(0L, actual.statementId);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
