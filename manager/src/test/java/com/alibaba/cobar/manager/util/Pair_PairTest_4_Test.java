package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Pair_PairTest_4_Test {
  @Test
  public void PairTest() throws Exception {
    // Arrange
    String first = "aaaaa";
    String second = "aaaaa";

    // Act
    Pair<Object, Object> pair = new Pair<Object, Object>(first, second);

    // Assert
    Object second1 = pair.getSecond();
    String toStringResult = pair.toString();
    Object first1 = pair.getFirst();
    Assert.assertTrue(second1 instanceof String);
    Assert.assertTrue(first1 instanceof String);
    Assert.assertEquals("aaaaa", second1);
    Assert.assertEquals("aaaaa", first1);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
