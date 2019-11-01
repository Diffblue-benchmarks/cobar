package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.Tuple;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Tuple_hashCodeTest_1_Test {
  @Test
  public void hashCodeTest() throws Exception {
    // Arrange
    Tuple tuple = new Tuple(new Object[]{"aaaaa", "aaaaa", "aaaaa"});

    // Act
    int actual = tuple.hashCode();

    // Assert
    Assert.assertEquals(1394434316, actual);
    Assert.assertNotNull(tuple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
