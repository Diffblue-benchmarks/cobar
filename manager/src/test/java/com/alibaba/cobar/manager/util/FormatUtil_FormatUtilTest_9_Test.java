package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FormatUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormatUtil_FormatUtilTest_9_Test {
  @Test
  public void FormatUtilTest() throws Exception {
    // Arrange and Act
    FormatUtil formatUtil = new FormatUtil();

    // Assert
    Assert.assertNotNull(formatUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
