package com.alibaba.cobar.mysql;

import com.alibaba.cobar.mysql.ByteUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ByteUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b161237c5f6ff69d() {

    // Act, creating object to test constructor
    final ByteUtil actual = new ByteUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void decodeLengthInput24OutputPositive999067fc876ce93930c() {

    // Arrange
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    final int actual = ByteUtil.decodeLength(arg0);

    // Assert result
    Assert.assertEquals(25, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void decodeLengthInputPositiveOutputPositive99985c454a7d94fdc39() {

    // Arrange
    final long arg0 = 251L;

    // Act
    final int actual = ByteUtil.decodeLength(arg0);

    // Assert result
    Assert.assertEquals(3, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lengthToZeroInput24PositiveOutputZero9998533fa0f4b1dd232() {

    // Arrange
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final int arg1 = 1;

    // Act
    final int actual = ByteUtil.lengthToZero(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readLengthInput24PositiveOutputZero99914b47dbd0ed07394() {

    // Arrange
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final int arg1 = 1;

    // Act
    final long actual = ByteUtil.readLength(arg0, arg1);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readLongInput24PositiveOutputZero9990bd6211e72a2cd5d() {

    // Arrange
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final int arg1 = 1;

    // Act
    final long actual = ByteUtil.readLong(arg0, arg1);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readUB2Input24PositiveOutputZero9998a5d2dfa317dee18() {

    // Arrange
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final int arg1 = 1;

    // Act
    final int actual = ByteUtil.readUB2(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readUB3Input24PositiveOutputZero9991e11e99ba7951aa9() {

    // Arrange
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final int arg1 = 1;

    // Act
    final int actual = ByteUtil.readUB3(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readUB4Input24PositiveOutputZero999f0fde62af0933f7d() {

    // Arrange
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final int arg1 = 1;

    // Act
    final long actual = ByteUtil.readUB4(arg0, arg1);

    // Assert result
    Assert.assertEquals(0L, actual);

  }
}
