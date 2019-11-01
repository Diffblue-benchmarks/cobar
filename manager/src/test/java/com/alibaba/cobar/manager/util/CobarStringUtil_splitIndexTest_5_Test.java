package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.CobarStringUtil;
import com.alibaba.cobar.manager.util.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarStringUtil_splitIndexTest_5_Test {
  @Test
  public void splitIndexTest() throws Exception {
    // Arrange
    String src = "aaaaa";
    char l = 'c';
    char r = 'c';

    // Act
    Pair<String, Integer> actual = CobarStringUtil.splitIndex(src, l, r);

    // Assert
    Integer second = actual.getSecond();
    String toStringResult = actual.toString();
    Assert.assertEquals(Integer.valueOf(-1), second);
    Assert.assertEquals("aaaaa", actual.getFirst());
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
