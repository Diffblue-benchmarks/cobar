package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.EncryptUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EncryptUtil_hex2byteTest_7_Test {
  @Test
  public void hex2byteTest() throws Exception {
    // Arrange
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act and Assert
    thrown.expect(NumberFormatException.class);
    EncryptUtil.hex2byte(byteArray);
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
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
