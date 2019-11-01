package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.CobarNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarNode_CobarNodeTest_3_Test {
  @Test
  public void CobarNodeTest() throws Exception {
    // Arrange
    String host = "aaaaa";
    int weight = 1;

    // Act
    CobarNode cobarNode = new CobarNode(host, weight);

    // Assert
    String toStringResult = cobarNode.toString();
    String host1 = cobarNode.getHost();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(1, cobarNode.getWeight());
    Assert.assertEquals("aaaaa", host1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
