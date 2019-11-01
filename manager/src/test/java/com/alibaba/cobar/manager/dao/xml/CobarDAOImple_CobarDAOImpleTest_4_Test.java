package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarDAOImple_CobarDAOImpleTest_4_Test {
  @Test
  public void CobarDAOImpleTest() throws Exception {
    // Arrange and Act
    CobarDAOImple cobarDAOImple = new CobarDAOImple();

    // Assert
    Assert.assertNotNull(cobarDAOImple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
