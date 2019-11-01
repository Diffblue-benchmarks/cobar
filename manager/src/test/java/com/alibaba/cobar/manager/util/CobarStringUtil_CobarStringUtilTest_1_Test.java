package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.CobarStringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarStringUtil_CobarStringUtilTest_1_Test {
  @Test
  public void CobarStringUtilTest() throws Exception {
    // Arrange and Act
    CobarStringUtil cobarStringUtil = new CobarStringUtil();

    // Assert
    Assert.assertNotNull(cobarStringUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
