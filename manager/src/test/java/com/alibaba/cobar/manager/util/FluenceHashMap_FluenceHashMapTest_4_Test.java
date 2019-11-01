package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FluenceHashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FluenceHashMap_FluenceHashMapTest_4_Test {
  @Test
  public void FluenceHashMapTest() throws Exception {
    // Arrange and Act
    FluenceHashMap<Object, Object> fluenceHashMap = new FluenceHashMap<Object, Object>();

    // Assert
    Assert.assertEquals(0, fluenceHashMap.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
