package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FluenceArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FluenceArrayList_FluenceArrayListTest_1_Test {
  @Test
  public void FluenceArrayListTest() throws Exception {
    // Arrange and Act
    FluenceArrayList<Object> fluenceArrayList = new FluenceArrayList<Object>();

    // Assert
    Assert.assertEquals(0, fluenceArrayList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
