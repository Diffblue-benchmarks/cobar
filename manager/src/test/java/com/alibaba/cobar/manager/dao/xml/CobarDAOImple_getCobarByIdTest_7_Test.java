package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.CobarDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarDAOImple_getCobarByIdTest_7_Test {
  @Test
  public void getCobarByIdTest() throws Exception {
    // Arrange
    CobarDAOImple cobarDAOImple = new CobarDAOImple();
    long id = 1L;

    // Act
    CobarDO actual = cobarDAOImple.getCobarById(id);

    // Assert
    Assert.assertEquals(null, actual);
    Assert.assertNotNull(cobarDAOImple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
