package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.CobarStringUtil;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarStringUtil_mergeListedStringTest_2_Test {
  @Test
  public void mergeListedStringTest() throws Exception {
    // Arrange
    String[] stringArray = new String[]{"aaaaa", "aaaaa", "aaaaa"};

    // Act
    List<String> actual = CobarStringUtil.mergeListedString(stringArray);

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(1, actual.size());
    Assert.assertEquals("aaaaa", actual.get(0));
    Assert.assertEquals(3, stringArray.length);
    Assert.assertArrayEquals(new String[]{"aaaaa", "aaaaa", "aaaaa"}, stringArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
