package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.CobarDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarDO_setStatusTest_15_Test {
  @Test
  public void setStatusTest() throws Exception {
    // Arrange
    CobarDO cobarDO = new CobarDO();
    String status = "aaaaa";

    // Act
    cobarDO.setStatus(status);

    // Assert
    long id = cobarDO.getId();
    String password = cobarDO.getPassword();
    String name = cobarDO.getName();
    String toStringResult = cobarDO.toString();
    String host = cobarDO.getHost();
    int serverPort = cobarDO.getServerPort();
    String time_diff = cobarDO.getTime_diff();
    long clusterId = cobarDO.getClusterId();
    String user = cobarDO.getUser();
    String status1 = cobarDO.getStatus();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(0, cobarDO.getPort());
    Assert.assertEquals("aaaaa", status1);
    Assert.assertEquals(null, user);
    Assert.assertEquals(0L, clusterId);
    Assert.assertEquals(null, time_diff);
    Assert.assertEquals(0, serverPort);
    Assert.assertEquals(null, host);
    Assert.assertEquals(
        "id:0|clusterId:0|name:null|status:aaaaa|host:null|port:0|user:null|password:null|time_diff:null",
        toStringResult);
    Assert.assertEquals(null, name);
    Assert.assertEquals(null, password);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
