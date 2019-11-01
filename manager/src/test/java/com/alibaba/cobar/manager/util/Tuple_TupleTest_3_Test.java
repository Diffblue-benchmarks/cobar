package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.util.Tuple;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Tuple_TupleTest_3_Test {
  @Test
  public void TupleTest() throws Exception {
    // Arrange
    Object[] objectArray = new Object[]{"aaaaa", "aaaaa", "aaaaa"};

    // Act
    Tuple tuple = new Tuple(objectArray);

    // Assert
    Assert.assertNotNull(tuple.toString());
    Assert.assertEquals(3, objectArray.length);
    Object object = objectArray[0];
    Object object1 = objectArray[1];
    Object object2 = objectArray[2];
    Assert.assertTrue(object instanceof String);
    Assert.assertTrue(object2 instanceof String);
    Assert.assertEquals("aaaaa", object);
    Assert.assertEquals("aaaaa", object2);
    Assert.assertTrue(object1 instanceof String);
    Assert.assertEquals("aaaaa", object1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
