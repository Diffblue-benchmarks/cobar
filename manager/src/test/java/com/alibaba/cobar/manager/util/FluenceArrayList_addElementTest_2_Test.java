package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FluenceArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FluenceArrayList_addElementTest_2_Test {
  @Test
  public void addElementTest() throws Exception {
    // Arrange
    FluenceArrayList<Object> fluenceArrayList = new FluenceArrayList<Object>();
    fluenceArrayList.add("aaaaa");
    String e = "aaaaa";

    // Act
    FluenceArrayList<Object> actual = fluenceArrayList.addElement(e);

    // Assert
    Assert.assertSame(fluenceArrayList, actual);
    Assert.assertSame(actual, fluenceArrayList);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
