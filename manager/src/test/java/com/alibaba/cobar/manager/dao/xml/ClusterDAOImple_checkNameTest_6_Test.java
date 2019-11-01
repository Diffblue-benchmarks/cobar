package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDAOImple_checkNameTest_6_Test {
  @Test
  public void checkNameTest() throws Exception {
    // Arrange
    ClusterDAOImple clusterDAOImple = new ClusterDAOImple();
    String name = "aaaaa";
    long id = 1L;

    // Act
    boolean actual = clusterDAOImple.checkName(name, id);

    // Assert
    Assert.assertTrue(actual);
    Assert.assertNotNull(clusterDAOImple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
