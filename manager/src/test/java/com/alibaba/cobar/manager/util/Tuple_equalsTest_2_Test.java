package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.Tuple;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Tuple_equalsTest_2_Test {
  @Test
  public void equalsTest() throws Exception {
    // Arrange
    String string = "aaaaa";
    Tuple tuple = new Tuple(new Object[]{string, "aaaaa", "aaaaa"});

    // Act
    boolean actual = tuple.equals(string);

    // Assert
    Assert.assertFalse(actual);
    Assert.assertNotNull(tuple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
