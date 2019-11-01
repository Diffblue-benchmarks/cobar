package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDO_setOnlineTimeTest_9_Test {
  @Test
  public void setOnlineTimeTest() throws Exception {
    // Arrange
    ClusterDO clusterDO = new ClusterDO();
    String onlineTime = "aaaaa";

    // Act
    clusterDO.setOnlineTime(onlineTime);

    // Assert
    long id = clusterDO.getId();
    String name = clusterDO.getName();
    String toStringResult = clusterDO.toString();
    String onlineTime1 = clusterDO.getOnlineTime();
    int sortId = clusterDO.getSortId();
    String deployContact = clusterDO.getDeployContact();
    String deployDesc = clusterDO.getDeployDesc();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, clusterDO.getMaintContact());
    Assert.assertEquals(null, deployDesc);
    Assert.assertEquals(null, deployContact);
    Assert.assertEquals(0, sortId);
    Assert.assertEquals("aaaaa", onlineTime1);
    Assert.assertEquals(
        "id:0|name:null|status:|deployContact:null|maintContact:null|onlineTime:aaaaa|deployDesc:null|sortId:0",
        toStringResult);
    Assert.assertEquals(null, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
