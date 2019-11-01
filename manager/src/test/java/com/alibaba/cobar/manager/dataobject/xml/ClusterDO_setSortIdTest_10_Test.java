package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDO_setSortIdTest_10_Test {
  @Test
  public void setSortIdTest() throws Exception {
    // Arrange
    ClusterDO clusterDO = new ClusterDO();
    int sortId = 1;

    // Act
    clusterDO.setSortId(sortId);

    // Assert
    long id = clusterDO.getId();
    String name = clusterDO.getName();
    String toStringResult = clusterDO.toString();
    String onlineTime = clusterDO.getOnlineTime();
    int sortId1 = clusterDO.getSortId();
    String deployContact = clusterDO.getDeployContact();
    String deployDesc = clusterDO.getDeployDesc();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, clusterDO.getMaintContact());
    Assert.assertEquals(null, deployDesc);
    Assert.assertEquals(null, deployContact);
    Assert.assertEquals(1, sortId1);
    Assert.assertEquals(null, onlineTime);
    Assert.assertEquals(
        "id:0|name:null|status:|deployContact:null|maintContact:null|onlineTime:null|deployDesc:null|sortId:1",
        toStringResult);
    Assert.assertEquals(null, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
