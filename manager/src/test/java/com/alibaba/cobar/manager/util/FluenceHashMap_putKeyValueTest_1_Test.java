package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FluenceHashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FluenceHashMap_putKeyValueTest_1_Test {
  @Test
  public void putKeyValueTest() throws Exception {
    // Arrange
    FluenceHashMap<Object, Object> fluenceHashMap = new FluenceHashMap<Object, Object>();
    String string = "aaaaa";
    fluenceHashMap.put(string, "aaaaa");
    String key = "aaaaa";

    // Act
    FluenceHashMap<Object, Object> actual = fluenceHashMap.putKeyValue(key, string);

    // Assert
    Assert.assertSame(fluenceHashMap, actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertSame(actual, fluenceHashMap);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
