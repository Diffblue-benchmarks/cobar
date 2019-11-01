package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FluenceHashSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FluenceHashSet_FluenceHashSetTest_1_Test {
  @Test
  public void FluenceHashSetTest() throws Exception {
    // Arrange and Act
    FluenceHashSet<Object> fluenceHashSet = new FluenceHashSet<Object>();

    // Assert
    Assert.assertEquals(0, fluenceHashSet.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
