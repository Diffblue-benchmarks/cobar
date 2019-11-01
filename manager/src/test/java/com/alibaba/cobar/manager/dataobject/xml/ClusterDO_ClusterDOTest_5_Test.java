package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDO_ClusterDOTest_5_Test {
  @Test
  public void ClusterDOTest() throws Exception {
    // Arrange and Act
    ClusterDO clusterDO = new ClusterDO();

    // Assert
    String name = clusterDO.getName();
    String toStringResult = clusterDO.toString();
    String onlineTime = clusterDO.getOnlineTime();
    int sortId = clusterDO.getSortId();
    String deployContact = clusterDO.getDeployContact();
    String deployDesc = clusterDO.getDeployDesc();
    Assert.assertEquals(null, name);
    Assert.assertEquals(null, clusterDO.getMaintContact());
    Assert.assertEquals(null, deployDesc);
    Assert.assertEquals(null, deployContact);
    Assert.assertEquals(0, sortId);
    Assert.assertEquals(null, onlineTime);
    Assert.assertEquals(
        "id:0|name:null|status:|deployContact:null|maintContact:null|onlineTime:null|deployDesc:null|sortId:0",
        toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
