package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDO_setDeployDescTest_15_Test {
  @Test
  public void setDeployDescTest() throws Exception {
    // Arrange
    ClusterDO clusterDO = new ClusterDO();
    String deployDesc = "aaaaa";

    // Act
    clusterDO.setDeployDesc(deployDesc);

    // Assert
    long id = clusterDO.getId();
    String name = clusterDO.getName();
    String toStringResult = clusterDO.toString();
    String onlineTime = clusterDO.getOnlineTime();
    int sortId = clusterDO.getSortId();
    String deployContact = clusterDO.getDeployContact();
    String deployDesc1 = clusterDO.getDeployDesc();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, clusterDO.getMaintContact());
    Assert.assertEquals("aaaaa", deployDesc1);
    Assert.assertEquals(null, deployContact);
    Assert.assertEquals(0, sortId);
    Assert.assertEquals(null, onlineTime);
    Assert.assertEquals(
        "id:0|name:null|status:|deployContact:null|maintContact:null|onlineTime:null|deployDesc:aaaaa|sortId:0",
        toStringResult);
    Assert.assertEquals(null, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
