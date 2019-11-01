package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.FluenceHashMap;
import com.alibaba.cobar.manager.util.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FluenceHashMap_putKeyValueTest_2_Test {
  @Test
  public void putKeyValueTest() throws Exception {
    // Arrange
    FluenceHashMap<Object, Object> fluenceHashMap = new FluenceHashMap<Object, Object>();
    String string = "aaaaa";
    String string1 = "aaaaa";
    fluenceHashMap.put(string, string1);
    Pair<Object, Object> pair = new Pair<Object, Object>(string, string1);

    // Act
    FluenceHashMap<Object, Object> actual = fluenceHashMap.putKeyValue(pair);

    // Assert
    Assert.assertSame(fluenceHashMap, actual);
    Assert.assertEquals(1, actual.size());
    Object second = pair.getSecond();
    String toStringResult = pair.toString();
    Object first = pair.getFirst();
    Assert.assertTrue(second instanceof String);
    Assert.assertTrue(first instanceof String);
    Assert.assertEquals("aaaaa", second);
    Assert.assertEquals("aaaaa", first);
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(actual, fluenceHashMap);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
