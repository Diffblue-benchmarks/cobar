package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Pair_toStringTest_5_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    Pair<Object, Object> pair = new Pair<Object, Object>("aaaaa", "aaaaa");

    // Act
    String actual = pair.toString();

    // Assert
    Assert.assertNotNull(actual);
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
