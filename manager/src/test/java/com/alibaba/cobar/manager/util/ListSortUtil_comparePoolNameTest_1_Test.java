package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.ListSortUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListSortUtil_comparePoolNameTest_1_Test {
  @Test
  public void comparePoolNameTest() throws Exception {
    // Arrange
    String s1 = "aaaaa";
    String s2 = "aaaaa";

    // Act
    int actual = ListSortUtil.comparePoolName(s1, s2);

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
