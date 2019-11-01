package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.EncryptUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EncryptUtil_EncryptUtilTest_6_Test {
  @Test
  public void EncryptUtilTest() throws Exception {
    // Arrange and Act
    EncryptUtil encryptUtil = new EncryptUtil();

    // Assert
    Assert.assertNotNull(encryptUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
