package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.CobarNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarNode_getHostTest_1_Test {
  @Test
  public void getHostTest() throws Exception {
    // Arrange
    CobarNode cobarNode = new CobarNode("aaaaa", 1);

    // Act
    String actual = cobarNode.getHost();

    // Assert
    Assert.assertEquals("aaaaa", actual);
    String toStringResult = cobarNode.toString();
    String host = cobarNode.getHost();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(1, cobarNode.getWeight());
    Assert.assertEquals("aaaaa", host);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
