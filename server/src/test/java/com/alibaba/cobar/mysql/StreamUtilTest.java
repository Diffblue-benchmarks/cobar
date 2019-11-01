package com.alibaba.cobar.mysql;

import com.alibaba.cobar.mysql.StreamUtil;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;



public class StreamUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b0fae354fdc1848b() {

    // Act, creating object to test constructor
    final StreamUtil actual = new StreamUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNull24ZeroZeroOutputVoid999f9d9699a110de37f() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);
    final byte[] arg1 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final int arg2 = 0;
    final int arg3 = 0;

    // Act
    StreamUtil.read(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNotNullOutputPositive9996a42aae54efbce20() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final byte actual = StreamUtil.read(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(1, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertEquals((short) 8, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readDoubleInputNotNullOutputPositive99991968391da5c0309() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final double actual = StreamUtil.readDouble(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(8, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertEquals(0x1.8080808080808p-895 /* 5.68607e-270 */, actual, 0.0);

  }

  // Test written by Diffblue Cover
  @Test
  public void readFloatInputNotNullOutputPositive9996eaf9ddeea664341() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final float actual = StreamUtil.readFloat(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(4, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertEquals(0x1.10101p-111f /* 4.09355e-34 */, actual, 0.0f);

  }

  // Test written by Diffblue Cover
  @Test
  public void readIntInputNotNullOutputPositive99914b5b3b22c6be7cb() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final int actual = StreamUtil.readInt(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(4, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertEquals(134744072, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readLengthInputNotNullOutputPositive9997008c04b1dfaf1d5() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final long actual = StreamUtil.readLength(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(1, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertEquals(8L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readLongInputNotNullOutputPositive999cd1f4fbac95305ea() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final long actual = StreamUtil.readLong(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(8, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertEquals(578721382704613384L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readUB2InputNotNullOutputPositive99908bcc80d0f2d5e7d() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final int actual = StreamUtil.readUB2(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(2, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertEquals(2056, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readUB3InputNotNullOutputPositive9992d06ccbb6da79bc2() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final int actual = StreamUtil.readUB3(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(3, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertEquals(526344, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readUB4InputNotNullOutputPositive999514ced716a023f55() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final long actual = StreamUtil.readUB4(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(4, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertEquals(134744072L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readWithLengthInputNotNullOutput8999fc9bb9692142055b() throws IOException {

    // Arrange
    final byte[] myByteArray = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final ByteArrayInputStream arg0 = new ByteArrayInputStream(myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(arg0);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals(24, Reflector.getInstanceField(arg0, "count"));
    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "mark"));
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(9, Reflector.getInstanceField(arg0, "pos"));

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeDoubleInputNotNullPositiveOutputVoid999e5818399c6541b59() throws IOException {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final double arg1 = 1.0;

    // Act
    StreamUtil.writeDouble(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) -16, (short) 63, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(8, ((ByteArrayOutputStream) arg0).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void writeFloatInputNotNullPositiveOutputVoid9994488f65f27c51985() throws IOException {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final float arg1 = 1.0f;

    // Act
    StreamUtil.writeFloat(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) -128, (short) 63, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(4, ((ByteArrayOutputStream) arg0).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void writeIntInputNotNullZeroOutputVoid999c0eacdf9729101f6() throws IOException {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final int arg1 = 0;

    // Act
    StreamUtil.writeInt(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(4, ((ByteArrayOutputStream) arg0).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid999da761e75bd996d2b() throws IOException {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final long arg1 = 251L;

    // Act
    StreamUtil.writeLength(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertArrayEquals(new byte[]{ (short) -4, (short) -5, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(3, ((ByteArrayOutputStream) arg0).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void writeLongInputNotNullPositiveOutputVoid999da8c5eef524b6f7b() throws IOException {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final long arg1 = 251L;

    // Act
    StreamUtil.writeLong(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertArrayEquals(new byte[]{ (short) -5, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(8, ((ByteArrayOutputStream) arg0).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void writeInputNotNullPositiveOutputVoid999d264d4f9ada89a43() throws IOException {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final byte arg1 = (short) 8;

    // Act
    StreamUtil.write(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(1, ((ByteArrayOutputStream) arg0).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void writeUB2InputNotNullZeroOutputVoid99994f0a2e7a851b03b() throws IOException {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final int arg1 = 0;

    // Act
    StreamUtil.writeUB2(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(2, ((ByteArrayOutputStream) arg0).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void writeUB3InputNotNullZeroOutputVoid9994ead9ed134479741() throws IOException {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final int arg1 = 0;

    // Act
    StreamUtil.writeUB3(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(3, ((ByteArrayOutputStream) arg0).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void writeUB4InputNotNullPositiveOutputVoid9993ea61f0b505f4437() throws IOException {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final long arg1 = 251L;

    // Act
    StreamUtil.writeUB4(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertArrayEquals(new byte[]{ (short) -5, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(4, ((ByteArrayOutputStream) arg0).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void writeWithLengthInputNotNull24OutputVoid999a8844df4413dca22() throws IOException {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final byte[] arg1 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };

    // Act
    StreamUtil.writeWithLength(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertArrayEquals(new byte[]{ (short) 24, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(25, ((ByteArrayOutputStream) arg0).size());

  }

  // Test written by Diffblue Cover
  @Test
  public void writeWithNullInputNotNull24OutputVoid9991271583b9404403d() throws IOException {

    // Arrange
    final ByteArrayOutputStream arg0 = new ByteArrayOutputStream();
    final byte[] arg1 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };

    // Act
    StreamUtil.writeWithNull(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertArrayEquals(new byte[]{ (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, ((byte[]) Reflector.getInstanceField(arg0, "buf")));
    Assert.assertEquals(25, ((ByteArrayOutputStream) arg0).size());

  }
}
