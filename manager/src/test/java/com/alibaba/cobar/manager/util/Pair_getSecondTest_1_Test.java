package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Pair_getSecondTest_1_Test {
  @Test
  public void getSecondTest() throws Exception {
    // Arrange
    Pair<Object, Object> pair = new Pair<Object, Object>("aaaaa", "aaaaa");

    // Act
    Object actual = pair.getSecond();

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
