package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarDAOImple_checkNameTest_5_Test {
  @Test
  public void checkNameTest() throws Exception {
    // Arrange
    CobarDAOImple cobarDAOImple = new CobarDAOImple();
    String name = "aaaaa";
    long clusterId = 1L;
    long cobarId = 1L;

    // Act
    boolean actual = cobarDAOImple.checkName(name, clusterId, cobarId);

    // Assert
    Assert.assertTrue(actual);
    Assert.assertNotNull(cobarDAOImple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
