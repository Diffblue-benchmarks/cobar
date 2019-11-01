package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.ByteUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ByteUtil_ByteUtilTest_3_Test {
  @Test
  public void ByteUtilTest() throws Exception {
    // Arrange and Act
    ByteUtil byteUtil = new ByteUtil();

    // Assert
    Assert.assertNotNull(byteUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
