package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.ListSortUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListSortUtil_ListSortUtilTest_8_Test {
  @Test
  public void ListSortUtilTest() throws Exception {
    // Arrange and Act
    ListSortUtil listSortUtil = new ListSortUtil();

    // Assert
    Assert.assertNotNull(listSortUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
