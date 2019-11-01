package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDO_setMaintContactTest_14_Test {
  @Test
  public void setMaintContactTest() throws Exception {
    // Arrange
    ClusterDO clusterDO = new ClusterDO();
    String maintContact = "aaaaa";

    // Act
    clusterDO.setMaintContact(maintContact);

    // Assert
    long id = clusterDO.getId();
    String name = clusterDO.getName();
    String toStringResult = clusterDO.toString();
    String onlineTime = clusterDO.getOnlineTime();
    int sortId = clusterDO.getSortId();
    String deployContact = clusterDO.getDeployContact();
    String deployDesc = clusterDO.getDeployDesc();
    Assert.assertEquals(0L, id);
    Assert.assertEquals("aaaaa", clusterDO.getMaintContact());
    Assert.assertEquals(null, deployDesc);
    Assert.assertEquals(null, deployContact);
    Assert.assertEquals(0, sortId);
    Assert.assertEquals(null, onlineTime);
    Assert.assertEquals(
        "id:0|name:null|status:|deployContact:null|maintContact:aaaaa|onlineTime:null|deployDesc:null|sortId:0",
        toStringResult);
    Assert.assertEquals(null, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
