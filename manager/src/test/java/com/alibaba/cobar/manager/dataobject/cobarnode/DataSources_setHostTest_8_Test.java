package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.DataSources;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSources_setHostTest_8_Test {
  @Test
  public void setHostTest() throws Exception {
    // Arrange
    DataSources dataSources = new DataSources();
    String host = "aaaaa";

    // Act
    dataSources.setHost(host);

    // Assert
    String name = dataSources.getName();
    String toStringResult = dataSources.toString();
    String type = dataSources.getType();
    String host1 = dataSources.getHost();
    String schema = dataSources.getSchema();
    long sampleTimeStamp = dataSources.getSampleTimeStamp();
    Assert.assertEquals(null, name);
    Assert.assertEquals(0, dataSources.getPort());
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals(null, schema);
    Assert.assertEquals("aaaaa", host1);
    Assert.assertEquals(null, type);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
