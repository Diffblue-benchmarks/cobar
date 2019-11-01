package com.alibaba.cobar.mysql;

import com.alibaba.cobar.mysql.MySQLMessage;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;



public class MySQLMessageTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void bytesOutput249994095c8bfeb078800() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final byte[] actual = thisObj.bytes();

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInput24OutputNotNull999fe0166ec56048ea5() {

    // Arrange
    final byte[] arg0 = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };

    // Act, creating object to test constructor
    final MySQLMessage actual = new MySQLMessage(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hasRemainingOutputTrue999a07104715e16c4f3() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final boolean actual = thisObj.hasRemaining();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lengthOutputPositive9999f5980f763f03ca6() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final int actual = thisObj.length();

    // Assert result
    Assert.assertEquals(24, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void moveInputNegativeOutputVoid9992905ebcb1a08f8fe() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);
    final int arg0 = -1;

    // Act
    thisObj.move(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void positionOutputZero999c26a8b3f1d31d7ae() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final int actual = thisObj.position();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void positionInputNegativeOutputVoid999685218321142e470() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);
    final int arg0 = -1;

    // Act
    thisObj.position(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readOutputPositive9991c99f96555a03f4a() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final byte actual = thisObj.read();

    // Assert result
    Assert.assertEquals((short) 11, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readInputNegativeOutputArrayIndexOutOfBoundsException9996e4caff89cd49818() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);
    final int arg0 = -1;

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    thisObj.read(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readBigDecimalOutputNumberFormatException9992ed34272a8d9a950() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.readBigDecimal();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readBytesOutput2499916f3cf1f49ba06bc() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final byte[] actual = thisObj.readBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readBytesInputNegativeOutputNegativeArraySizeException999eea3c8f4ec787470() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);
    final int arg0 = -1;

    // Act
    thrown.expect(NegativeArraySizeException.class);
    thisObj.readBytes(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readBytesWithLengthOutput1199921481b9c23d37174() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final byte[] actual = thisObj.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readBytesWithNullOutput2499978f2246adb99bc1c() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final byte[] actual = thisObj.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readDateOutputNotNull9990297faf38b1c90bc() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final Date actual = thisObj.readDate();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(185273099, ((Timestamp) actual).getNanos());

  }

  // Test written by Diffblue Cover
  @Test
  public void readDoubleOutputPositive999a0c31e6036e5da42() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final double actual = thisObj.readDouble();

    // Assert result
    Assert.assertEquals(0x1.b0b0b0b0b0b0bp-847 /* 1.80107e-255 */, actual, 0.0);

  }

  // Test written by Diffblue Cover
  @Test
  public void readFloatOutputPositive999498de3d6ba0bb570() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final float actual = thisObj.readFloat();

    // Assert result
    Assert.assertEquals(0x1.161616p-105f /* 2.67787e-32 */, actual, 0.0f);

  }

  // Test written by Diffblue Cover
  @Test
  public void readIntOutputPositive99948eee27378d36222() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final int actual = thisObj.readInt();

    // Assert result
    Assert.assertEquals(185273099, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readLengthOutputPositive99977408936cacd6054() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final long actual = thisObj.readLength();

    // Assert result
    Assert.assertEquals(11L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readLongOutputPositive99951e7f56a18467513() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final long actual = thisObj.readLong();

    // Assert result
    Assert.assertEquals(795741901218843403L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readStringOutputNotNull999551042a15c582f8d() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final String actual = thisObj.readString();

    // Assert result
    Assert.assertEquals("\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readStringInputNotNullOutputUnsupportedEncodingException999745c75855a192ef7() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    thisObj.readString(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readStringWithLengthOutputNotNull9994956eddd53c88dc1() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final String actual = thisObj.readStringWithLength();

    // Assert result
    Assert.assertEquals("\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readStringWithLengthInputNotNullOutputUnsupportedEncodingException999e130ce37b836d55b() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    thisObj.readStringWithLength(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readStringWithNullOutputNotNull9990f098371ebf74489() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final String actual = thisObj.readStringWithNull();

    // Assert result
    Assert.assertEquals("\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b\u000b", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException999970e8d0aeb6988a8() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    thisObj.readStringWithNull(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readTimeOutputNotNull9992a422c9e4a58afd3() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final Time actual = thisObj.readTime();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readUB2OutputPositive999577acba08e03bde9() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final int actual = thisObj.readUB2();

    // Assert result
    Assert.assertEquals(2827, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readUB3OutputPositive999a4f65d6ffec0bc4a() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final int actual = thisObj.readUB3();

    // Assert result
    Assert.assertEquals(723723, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void readUB4OutputPositive9990cff992c3e409c74() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final long actual = thisObj.readUB4();

    // Assert result
    Assert.assertEquals(185273099L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull99945cdd4720e4a4022() {

    // Arrange
    final byte[] myByteArray = { (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11, (short) 11 };
    final MySQLMessage thisObj = new MySQLMessage(myByteArray);

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("[11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11]", actual);

  }
}
