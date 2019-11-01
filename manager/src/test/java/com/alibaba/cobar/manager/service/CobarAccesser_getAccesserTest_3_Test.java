package com.alibaba.cobar.manager.service;

import com.alibaba.cobar.manager.dao.CobarAdapterDAO;
import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.dataobject.xml.CobarDO;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CobarAccesser_getAccesserTest_3_Test {
  @Test
  public void getAccesserTest() throws Exception {
    // Arrange
    CobarAccesser cobarAccesser = new CobarAccesser();
    CobarDO cobarDO = new CobarDO();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cobarAccesser.getAccesser(cobarDO);
    long id = cobarDO.getId();
    String password = cobarDO.getPassword();
    String name = cobarDO.getName();
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
        "id:0|clusterId:0|name:null|status:null|host:null|port:0|user:null|password:null|time_diff:null",
        toStringResult);
    Assert.assertEquals(null, name);
    Assert.assertEquals(null, password);
    String toStringResult1 = cobarAccesser.toString();
    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
    Assert.assertEquals(null, xmlAccesser);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
