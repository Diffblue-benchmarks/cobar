package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.StreamUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamUtil_StreamUtilTest_8_Test {
  @Test
  public void StreamUtilTest() throws Exception {
    // Arrange and Act
    StreamUtil streamUtil = new StreamUtil();

    // Assert
    Assert.assertNotNull(streamUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
