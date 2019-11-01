package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.EncryptUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EncryptUtil_decryptTest_1_Test {
  @Test
  public void decryptTest() throws Exception {
    // Arrange
    String data = "aaaaa";

    // Act
    String actual = EncryptUtil.decrypt(data);

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
