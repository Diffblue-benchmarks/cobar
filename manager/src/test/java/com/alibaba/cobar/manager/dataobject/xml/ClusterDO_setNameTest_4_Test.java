package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterDO_setNameTest_4_Test {
  @Test
  public void setNameTest() throws Exception {
    // Arrange
    ClusterDO clusterDO = new ClusterDO();
    String name = "aaaaa";

    // Act
    clusterDO.setName(name);

    // Assert
    long id = clusterDO.getId();
    String name1 = clusterDO.getName();
    String toStringResult = clusterDO.toString();
    String onlineTime = clusterDO.getOnlineTime();
    int sortId = clusterDO.getSortId();
    String deployContact = clusterDO.getDeployContact();
    String deployDesc = clusterDO.getDeployDesc();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, clusterDO.getMaintContact());
    Assert.assertEquals(null, deployDesc);
    Assert.assertEquals(null, deployContact);
    Assert.assertEquals(0, sortId);
    Assert.assertEquals(null, onlineTime);
    Assert.assertEquals(
        "id:0|name:aaaaa|status:|deployContact:null|maintContact:null|onlineTime:null|deployDesc:null|sortId:0",
        toStringResult);
    Assert.assertEquals("aaaaa", name1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
