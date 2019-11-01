package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.SortUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SortUtil_compareTest_5_Test {
  @Test
  public void compareTest() throws Exception {
    // Arrange
    SortUtil<Object> sortUtil = new SortUtil<Object>();
    String arg0 = "aaaaa";
    String arg1 = "aaaaa";

    // Act
    int actual = sortUtil.compare(arg0, arg1);

    // Assert
    Assert.assertEquals(0, actual);
    Assert.assertNotNull(sortUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
