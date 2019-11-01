package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Pair_getFirstTest_3_Test {
  @Test
  public void getFirstTest() throws Exception {
    // Arrange
    Pair<Object, Object> pair = new Pair<Object, Object>("aaaaa", "aaaaa");

    // Act
    Object actual = pair.getFirst();

    // Assert
    Assert.assertTrue(actual instanceof String);
    Assert.assertEquals("aaaaa", actual);
    Object second = pair.getSecond();
    String toStringResult = pair.toString();
    Object first = pair.getFirst();
    Assert.assertTrue(second instanceof String);
    Assert.assertTrue(first instanceof String);
    Assert.assertEquals("aaaaa", second);
    Assert.assertEquals("aaaaa", first);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
