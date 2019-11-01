package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDAOImple_listAllClusterTest_2_Test {
  @Test
  public void listAllClusterTest() throws Exception {
    // Arrange
    ClusterDAOImple clusterDAOImple = new ClusterDAOImple();

    // Act
    List<ClusterDO> actual = clusterDAOImple.listAllCluster();

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(0, actual.size());
    Assert.assertNotNull(clusterDAOImple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
