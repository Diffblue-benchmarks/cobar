package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FormatUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FormatUtil_formatStoreTest_4_Test {
  @Test
  public void formatStoreTest() throws Exception {
    // Arrange
    long store = 1L;

    // Act
    String actual = FormatUtil.formatStore(store);

    // Assert
    Assert.assertEquals("1 B", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
