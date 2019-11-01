package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.CobarDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarDO_setClusterIdTest_13_Test {
  @Test
  public void setClusterIdTest() throws Exception {
    // Arrange
    CobarDO cobarDO = new CobarDO();
    long clusterId = 1L;

    // Act
    cobarDO.setClusterId(clusterId);

    // Assert
    long id = cobarDO.getId();
    String password = cobarDO.getPassword();
    String name = cobarDO.getName();
    String toStringResult = cobarDO.toString();
    String host = cobarDO.getHost();
    int serverPort = cobarDO.getServerPort();
    String time_diff = cobarDO.getTime_diff();
    long clusterId1 = cobarDO.getClusterId();
    String user = cobarDO.getUser();
    String status = cobarDO.getStatus();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(0, cobarDO.getPort());
    Assert.assertEquals(null, status);
    Assert.assertEquals(null, user);
    Assert.assertEquals(1L, clusterId1);
    Assert.assertEquals(null, time_diff);
    Assert.assertEquals(0, serverPort);
    Assert.assertEquals(null, host);
    Assert.assertEquals(
        "id:0|clusterId:1|name:null|status:null|host:null|port:0|user:null|password:null|time_diff:null",
        toStringResult);
    Assert.assertEquals(null, name);
    Assert.assertEquals(null, password);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
