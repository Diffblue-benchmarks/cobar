package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.DataSources;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSources_setPortTest_1_Test {
  @Test
  public void setPortTest() throws Exception {
    // Arrange
    DataSources dataSources = new DataSources();
    int port = 1;

    // Act
    dataSources.setPort(port);

    // Assert
    String name = dataSources.getName();
    String toStringResult = dataSources.toString();
    String type = dataSources.getType();
    String host = dataSources.getHost();
    String schema = dataSources.getSchema();
    long sampleTimeStamp = dataSources.getSampleTimeStamp();
    Assert.assertEquals(null, name);
    Assert.assertEquals(1, dataSources.getPort());
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals(null, schema);
    Assert.assertEquals(null, host);
    Assert.assertEquals(null, type);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
