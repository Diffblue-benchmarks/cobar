package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.Tuple;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Tuple_getElementTest_4_Test {
  @Test
  public void getElementTest() throws Exception {
    // Arrange
    Tuple tuple = new Tuple(new Object[]{"aaaaa", "aaaaa", "aaaaa"});
    int index = 655361;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    tuple.getElement(index);
    Assert.assertNotNull(tuple.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
