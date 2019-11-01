package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ClusterDAOImple_addClusterTest_3_Test {
  @Test
  public void addClusterTest() throws Exception {
    // Arrange
    ClusterDAOImple clusterDAOImple = new ClusterDAOImple();
    ClusterDO clusterDO = new ClusterDO();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    clusterDAOImple.addCluster(clusterDO);
    long id = clusterDO.getId();
    String name = clusterDO.getName();
    String toStringResult = clusterDO.toString();
    String onlineTime = clusterDO.getOnlineTime();
    int sortId = clusterDO.getSortId();
    String deployContact = clusterDO.getDeployContact();
    String deployDesc = clusterDO.getDeployDesc();
    Assert.assertEquals(-9223372036854775807L, id);
    Assert.assertEquals(null, clusterDO.getMaintContact());
    Assert.assertEquals(null, deployDesc);
    Assert.assertEquals(null, deployContact);
    Assert.assertEquals(0, sortId);
    Assert.assertEquals(null, onlineTime);
    Assert.assertEquals(
        "id:-9223372036854775807|name:null|status:|deployContact:null|maintContact:null|onlineTime:null|deployDesc:null|sortId:0",
        toStringResult);
    Assert.assertEquals(null, name);
    Assert.assertNotNull(clusterDAOImple.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
