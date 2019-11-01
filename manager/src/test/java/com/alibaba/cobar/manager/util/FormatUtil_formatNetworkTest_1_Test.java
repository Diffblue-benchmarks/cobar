package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FormatUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormatUtil_formatNetworkTest_1_Test {
  @Test
  public void formatNetworkTest() throws Exception {
    // Arrange
    long network = 1L;

    // Act
    String actual = FormatUtil.formatNetwork(network);

    // Assert
    Assert.assertEquals("1 B/s", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
