package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDAOImple_getClusterByIdTest_1_Test {
  @Test
  public void getClusterByIdTest() throws Exception {
    // Arrange
    ClusterDAOImple clusterDAOImple = new ClusterDAOImple();
    long id = 1L;

    // Act
    ClusterDO actual = clusterDAOImple.getClusterById(id);

    // Assert
    Assert.assertEquals(null, actual);
    Assert.assertNotNull(clusterDAOImple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
