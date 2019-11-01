package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.CobarStringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarStringUtil_mergeListedStringWithJoinTest_4_Test {
  @Test
  public void mergeListedStringWithJoinTest() throws Exception {
    // Arrange
    String[] stringArray = new String[]{"aaaaa", "aaaaa", "aaaaa"};
    String sep = "aaaaa";

    // Act
    String actual = CobarStringUtil.mergeListedStringWithJoin(stringArray, sep);

    // Assert
    Assert.assertEquals("aaaaa", actual);
    Assert.assertEquals(3, stringArray.length);
    Assert.assertArrayEquals(new String[]{"aaaaa", "aaaaa", "aaaaa"}, stringArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
