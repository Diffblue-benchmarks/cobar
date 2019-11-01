package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.dataobject.xml.ClusterDO;
import com.alibaba.cobar.manager.util.SortUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SortUtil_compareClusterTest_3_Test {
  @Test
  public void compareClusterTest() throws Exception {
    // Arrange
    SortUtil<Object> sortUtil = new SortUtil<Object>();
    ClusterDO clusterDO = new ClusterDO();
    ClusterDO clusterDO1 = new ClusterDO();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    sortUtil.compareCluster(clusterDO, clusterDO1);
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
    long id = clusterDO1.getId();
    String name1 = clusterDO1.getName();
    String toStringResult1 = clusterDO1.toString();
    String onlineTime1 = clusterDO1.getOnlineTime();
    int sortId1 = clusterDO1.getSortId();
    String deployContact1 = clusterDO1.getDeployContact();
    String deployDesc1 = clusterDO1.getDeployDesc();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, clusterDO1.getMaintContact());
    Assert.assertEquals(null, deployDesc1);
    Assert.assertEquals(null, deployContact1);
    Assert.assertEquals(0, sortId1);
    Assert.assertEquals(null, onlineTime1);
    Assert.assertEquals(
        "id:0|name:null|status:|deployContact:null|maintContact:null|onlineTime:null|deployDesc:null|sortId:0",
        toStringResult1);
    Assert.assertEquals(null, name1);
    Assert.assertNotNull(sortUtil.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
