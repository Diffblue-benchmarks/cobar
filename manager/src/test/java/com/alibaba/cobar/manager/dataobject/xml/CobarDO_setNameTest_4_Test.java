package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.CobarDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarDO_setNameTest_4_Test {
  @Test
  public void setNameTest() throws Exception {
    // Arrange
    CobarDO cobarDO = new CobarDO();
    String name = "aaaaa";

    // Act
    cobarDO.setName(name);

    // Assert
    long id = cobarDO.getId();
    String password = cobarDO.getPassword();
    String name1 = cobarDO.getName();
    String toStringResult = cobarDO.toString();
    String host = cobarDO.getHost();
    int serverPort = cobarDO.getServerPort();
    String time_diff = cobarDO.getTime_diff();
    long clusterId = cobarDO.getClusterId();
    String user = cobarDO.getUser();
    String status = cobarDO.getStatus();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(0, cobarDO.getPort());
    Assert.assertEquals(null, status);
    Assert.assertEquals(null, user);
    Assert.assertEquals(0L, clusterId);
    Assert.assertEquals(null, time_diff);
    Assert.assertEquals(0, serverPort);
    Assert.assertEquals(null, host);
    Assert.assertEquals(
        "id:0|clusterId:0|name:aaaaa|status:null|host:null|port:0|user:null|password:null|time_diff:null",
        toStringResult);
    Assert.assertEquals("aaaaa", name1);
    Assert.assertEquals(null, password);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
