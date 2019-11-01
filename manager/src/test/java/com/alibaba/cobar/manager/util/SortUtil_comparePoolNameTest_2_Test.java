package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.SortUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SortUtil_comparePoolNameTest_2_Test {
  @Test
  public void comparePoolNameTest() throws Exception {
    // Arrange
    SortUtil<Object> sortUtil = new SortUtil<Object>();
    String s1 = "aaaaa";
    String s2 = "aaaaa";

    // Act
    int actual = sortUtil.comparePoolName(s1, s2);

    // Assert
    Assert.assertEquals(0, actual);
    Assert.assertNotNull(sortUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
