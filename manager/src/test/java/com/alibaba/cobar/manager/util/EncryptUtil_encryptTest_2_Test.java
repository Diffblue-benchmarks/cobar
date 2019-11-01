package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.EncryptUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EncryptUtil_encryptTest_2_Test {
  @Test
  public void encryptTest() throws Exception {
    // Arrange
    String password = "aaaaa";

    // Act
    String actual = EncryptUtil.encrypt(password);

    // Assert
    Assert.assertEquals("958E7E17258C16FB", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
