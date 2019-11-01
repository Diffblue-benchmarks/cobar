package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.CobarDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarDAOImple_getCobarListTest_11_Test {
  @Test
  public void getCobarListTest() throws Exception {
    // Arrange
    CobarDAOImple cobarDAOImple = new CobarDAOImple();
    long clusterId = 1L;

    // Act
    List<CobarDO> actual = cobarDAOImple.getCobarList(clusterId);

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(0, actual.size());
    Assert.assertNotNull(cobarDAOImple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
