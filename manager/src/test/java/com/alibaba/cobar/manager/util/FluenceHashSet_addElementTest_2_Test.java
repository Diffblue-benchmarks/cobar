package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FluenceHashSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FluenceHashSet_addElementTest_2_Test {
  @Test
  public void addElementTest() throws Exception {
    // Arrange
    FluenceHashSet<Object> fluenceHashSet = new FluenceHashSet<Object>();
    fluenceHashSet.add("aaaaa");
    String e = "aaaaa";

    // Act
    FluenceHashSet<Object> actual = fluenceHashSet.addElement(e);

    // Assert
    Assert.assertSame(fluenceHashSet, actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertSame(actual, fluenceHashSet);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
