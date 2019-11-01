package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDAOImple_checkNameTest_4_Test {
  @Test
  public void checkNameTest() throws Exception {
    // Arrange
    ClusterDAOImple clusterDAOImple = new ClusterDAOImple();
    String name = "aaaaa";

    // Act
    boolean actual = clusterDAOImple.checkName(name);

    // Assert
    Assert.assertTrue(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
