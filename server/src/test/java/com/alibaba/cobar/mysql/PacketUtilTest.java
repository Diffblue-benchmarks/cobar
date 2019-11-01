package com.alibaba.cobar.mysql;

import com.alibaba.cobar.mysql.PacketUtil;
import com.alibaba.cobar.net.mysql.ErrorPacket;
import com.alibaba.cobar.net.mysql.FieldPacket;
import com.alibaba.cobar.net.mysql.ResultSetHeaderPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class PacketUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9993129ce462058e1d3() {

    // Act, creating object to test constructor
    final PacketUtil actual = new PacketUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void encodeInputNotNullNotNullOutput69991654ccaeed98a0d0() {

    // Arrange
    final String arg0 = "Cp1252";
    final String arg1 = "Cp1252";

    // Act
    final byte[] actual = PacketUtil.encode(arg0, arg1);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 67, (short) 112, (short) 49, (short) 50, (short) 53, (short) 50 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getFieldInputNotNullNotNullPositiveOutputNotNull999c8367ed26c34e7a0() {

    // Arrange
    final String arg0 = "Cp1252";
    final String arg1 = "Cp1252";
    final int arg2 = 1;

    // Act
    final FieldPacket actual = PacketUtil.getField(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.flags);
    Assert.assertEquals((short) 0, actual.decimals);
    Assert.assertNull(actual.orgTable);
    Assert.assertArrayEquals(new byte[]{ (short) 100, (short) 101, (short) 102 }, actual.catalog);
    Assert.assertArrayEquals(new byte[]{ (short) 67, (short) 112, (short) 49, (short) 50, (short) 53, (short) 50 }, actual.orgName);
    Assert.assertNull(actual.db);
    Assert.assertNull(actual.definition);
    Assert.assertEquals(0, actual.charsetIndex);
    Assert.assertNull(actual.table);
    Assert.assertArrayEquals(new byte[]{ (short) 67, (short) 112, (short) 49, (short) 50, (short) 53, (short) 50 }, actual.name);
    Assert.assertEquals(0L, actual.length);
    Assert.assertEquals(1, actual.type);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }

  // Test written by Diffblue Cover
  @Test
  public void getFieldInputNotNullPositiveOutputNotNull99901b7bc61c4451a74() {

    // Arrange
    final String arg0 = "Cp1252";
    final int arg1 = 1;

    // Act
    final FieldPacket actual = PacketUtil.getField(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.flags);
    Assert.assertEquals((short) 0, actual.decimals);
    Assert.assertNull(actual.orgTable);
    Assert.assertArrayEquals(new byte[]{ (short) 100, (short) 101, (short) 102 }, actual.catalog);
    Assert.assertNull(actual.orgName);
    Assert.assertNull(actual.db);
    Assert.assertNull(actual.definition);
    Assert.assertEquals(0, actual.charsetIndex);
    Assert.assertNull(actual.table);
    Assert.assertArrayEquals(new byte[]{ (short) 67, (short) 112, (short) 49, (short) 50, (short) 53, (short) 50 }, actual.name);
    Assert.assertEquals(0L, actual.length);
    Assert.assertEquals(1, actual.type);
    Assert.assertEquals((short) 0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeaderInputPositiveOutputNotNull9995519dc0db7dd2d7f() {

    // Arrange
    final int arg0 = 1;

    // Act
    final ResultSetHeaderPacket actual = PacketUtil.getHeader(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0L, actual.extra);
    Assert.assertEquals(1, actual.fieldCount);
    Assert.assertEquals((short) 1, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }

  // Test written by Diffblue Cover
  @Test
  public void getShutdownOutputNotNull99930a1c7dbd89c65ff() {

    // Act
    final ErrorPacket actual = PacketUtil.getShutdown();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals((short) -1, actual.fieldCount);
    Assert.assertEquals(1053, actual.errno);
    Assert.assertEquals((short) 35, actual.mark);
    Assert.assertArrayEquals(new byte[]{ (short) 84, (short) 104, (short) 101, (short) 32, (short) 115, (short) 101, (short) 114, (short) 118, (short) 101, (short) 114, (short) 32, (short) 104, (short) 97, (short) 115, (short) 32, (short) 98, (short) 101, (short) 101, (short) 110, (short) 32, (short) 115, (short) 104, (short) 117, (short) 116, (short) 100, (short) 111, (short) 119, (short) 110 }, actual.message);
    Assert.assertArrayEquals(new byte[]{ (short) 72, (short) 89, (short) 48, (short) 48, (short) 48 }, actual.sqlState);
    Assert.assertEquals((short) 1, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);

  }
}
