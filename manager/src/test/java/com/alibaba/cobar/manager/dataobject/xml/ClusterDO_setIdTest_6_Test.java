package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDO_setIdTest_6_Test {
  @Test
  public void setIdTest() throws Exception {
    // Arrange
    ClusterDO clusterDO = new ClusterDO();
    long id = 1L;

    // Act
    clusterDO.setId(id);

    // Assert
    long id1 = clusterDO.getId();
    String name = clusterDO.getName();
    String toStringResult = clusterDO.toString();
    String onlineTime = clusterDO.getOnlineTime();
    int sortId = clusterDO.getSortId();
    String deployContact = clusterDO.getDeployContact();
    String deployDesc = clusterDO.getDeployDesc();
    Assert.assertEquals(1L, id1);
    Assert.assertEquals(null, clusterDO.getMaintContact());
    Assert.assertEquals(null, deployDesc);
    Assert.assertEquals(null, deployContact);
    Assert.assertEquals(0, sortId);
    Assert.assertEquals(null, onlineTime);
    Assert.assertEquals(
        "id:1|name:null|status:|deployContact:null|maintContact:null|onlineTime:null|deployDesc:null|sortId:0",
        toStringResult);
    Assert.assertEquals(null, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
