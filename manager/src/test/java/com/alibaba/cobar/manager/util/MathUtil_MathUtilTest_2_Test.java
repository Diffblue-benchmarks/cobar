package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MathUtil_MathUtilTest_2_Test {
  @Test
  public void MathUtilTest() throws Exception {
    // Arrange and Act
    MathUtil mathUtil = new MathUtil();

    // Assert
    Assert.assertNotNull(mathUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
