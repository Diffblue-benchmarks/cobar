package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDO_setDeployContactTest_11_Test {
  @Test
  public void setDeployContactTest() throws Exception {
    // Arrange
    ClusterDO clusterDO = new ClusterDO();
    String deployContact = "aaaaa";

    // Act
    clusterDO.setDeployContact(deployContact);

    // Assert
    long id = clusterDO.getId();
    String name = clusterDO.getName();
    String toStringResult = clusterDO.toString();
    String onlineTime = clusterDO.getOnlineTime();
    int sortId = clusterDO.getSortId();
    String deployContact1 = clusterDO.getDeployContact();
    String deployDesc = clusterDO.getDeployDesc();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, clusterDO.getMaintContact());
    Assert.assertEquals(null, deployDesc);
    Assert.assertEquals("aaaaa", deployContact1);
    Assert.assertEquals(0, sortId);
    Assert.assertEquals(null, onlineTime);
    Assert.assertEquals(
        "id:0|name:null|status:|deployContact:aaaaa|maintContact:null|onlineTime:null|deployDesc:null|sortId:0",
        toStringResult);
    Assert.assertEquals(null, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
