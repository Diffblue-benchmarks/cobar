package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.SortUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SortUtil_SortUtilTest_1_Test {
  @Test
  public void SortUtilTest() throws Exception {
    // Arrange and Act
    SortUtil<Object> sortUtil = new SortUtil<Object>();

    // Assert
    Assert.assertNotNull(sortUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
