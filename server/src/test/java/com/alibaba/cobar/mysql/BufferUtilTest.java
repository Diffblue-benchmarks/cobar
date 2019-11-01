package com.alibaba.cobar.mysql;

import com.alibaba.cobar.mysql.BufferUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.ByteBuffer;



public class BufferUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999656a09986e13b493() {

    // Act, creating object to test constructor
    final BufferUtil actual = new BufferUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLengthInput24OutputPositive99945b1001f6fefc606() {

    // Arrange
    final byte[] arg0 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };

    // Act
    final int actual = BufferUtil.getLength(arg0);

    // Assert result
    Assert.assertEquals(25, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLengthInputPositiveOutputPositive9996448006995b80aab() {

    // Arrange
    final long arg0 = 251L;

    // Act
    final int actual = BufferUtil.getLength(arg0);

    // Assert result
    Assert.assertEquals(3, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void writeDoubleInputNullPositiveOutputNullPointerException99948f92515e3befb55() {

    // Arrange
    final ByteBuffer arg0 = null;
    final double arg1 = 1.0;

    // Act
    thrown.expect(NullPointerException.class);
    BufferUtil.writeDouble(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeFloatInputNullPositiveOutputNullPointerException9999df6a187205f9e77() {

    // Arrange
    final ByteBuffer arg0 = null;
    final float arg1 = 1.0f;

    // Act
    thrown.expect(NullPointerException.class);
    BufferUtil.writeFloat(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeIntInputNullZeroOutputNullPointerException99970fb840aa9075db1() {

    // Arrange
    final ByteBuffer arg0 = null;
    final int arg1 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    BufferUtil.writeInt(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeLengthInputNullPositiveOutputNullPointerException999fe4ee9bbf8ea6267() {

    // Arrange
    final ByteBuffer arg0 = null;
    final long arg1 = 251L;

    // Act
    thrown.expect(NullPointerException.class);
    BufferUtil.writeLength(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeLongInputNullPositiveOutputNullPointerException9992242d42e22cfe5b1() {

    // Arrange
    final ByteBuffer arg0 = null;
    final long arg1 = 251L;

    // Act
    thrown.expect(NullPointerException.class);
    BufferUtil.writeLong(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeUB2InputNullZeroOutputNullPointerException999025b0ec9f372a721() {

    // Arrange
    final ByteBuffer arg0 = null;
    final int arg1 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    BufferUtil.writeUB2(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeUB3InputNullZeroOutputNullPointerException999385ba05e19166e11() {

    // Arrange
    final ByteBuffer arg0 = null;
    final int arg1 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    BufferUtil.writeUB3(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeUB4InputNullPositiveOutputNullPointerException99975d7ef79477d7355() {

    // Arrange
    final ByteBuffer arg0 = null;
    final long arg1 = 251L;

    // Act
    thrown.expect(NullPointerException.class);
    BufferUtil.writeUB4(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeWithLengthInputNull24PositiveOutputNullPointerException9991475cabf7a461ea0() {

    // Arrange
    final ByteBuffer arg0 = null;
    final byte[] arg1 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 24, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };
    final byte arg2 = (short) 8;

    // Act
    thrown.expect(NullPointerException.class);
    BufferUtil.writeWithLength(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeWithLengthInputNull24OutputNullPointerException9992382ac19f12502d1() {

    // Arrange
    final ByteBuffer arg0 = null;
    final byte[] arg1 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 24, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };

    // Act
    thrown.expect(NullPointerException.class);
    BufferUtil.writeWithLength(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeWithNullInputNull24OutputNullPointerException999ed5814708609516e() {

    // Arrange
    final ByteBuffer arg0 = null;
    final byte[] arg1 = { (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 24, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8, (short) 8 };

    // Act
    thrown.expect(NullPointerException.class);
    BufferUtil.writeWithNull(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
