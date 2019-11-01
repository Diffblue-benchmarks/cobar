package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.EncryptUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EncryptUtil_encryptTest_5_Test {
  @Test
  public void encryptTest() throws Exception {
    // Arrange
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    byte[] byteArray1 = new byte[]{0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    byte[] actual = EncryptUtil.encrypt(byteArray, byteArray1);

    // Assert
    Assert.assertEquals(32, actual.length);
    Assert.assertEquals((byte) 102, actual[0]);
    Assert.assertEquals((byte) -43, actual[1]);
    Assert.assertEquals((byte) -80, actual[2]);
    Assert.assertEquals((byte) -81, actual[3]);
    Assert.assertEquals((byte) 63, actual[4]);
    Assert.assertEquals((byte) 39, actual[5]);
    Assert.assertEquals((byte) 104, actual[26]);
    Assert.assertEquals((byte) -13, actual[27]);
    Assert.assertEquals((byte) -43, actual[28]);
    Assert.assertEquals((byte) -35, actual[29]);
    Assert.assertEquals((byte) 29, actual[30]);
    Assert.assertEquals((byte) 53, actual[31]);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[3]);
    Assert.assertEquals((byte) 0, byteArray[4]);
    Assert.assertEquals((byte) 0, byteArray[5]);
    Assert.assertEquals((byte) 0, byteArray[18]);
    Assert.assertEquals((byte) 0, byteArray[19]);
    Assert.assertEquals((byte) 0, byteArray[20]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals(24, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 0, byteArray1[1]);
    Assert.assertEquals((byte) 0, byteArray1[2]);
    Assert.assertEquals((byte) 10, byteArray1[3]);
    Assert.assertEquals((byte) 0, byteArray1[4]);
    Assert.assertEquals((byte) 0, byteArray1[5]);
    Assert.assertEquals((byte) 0, byteArray1[18]);
    Assert.assertEquals((byte) 0, byteArray1[19]);
    Assert.assertEquals((byte) 0, byteArray1[20]);
    Assert.assertEquals((byte) 0, byteArray1[21]);
    Assert.assertEquals((byte) 0, byteArray1[22]);
    Assert.assertEquals((byte) 0, byteArray1[23]);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
