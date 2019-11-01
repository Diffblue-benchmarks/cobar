package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.DataSources;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSources_getSchemaTest_11_Test {
  @Test
  public void getSchemaTest() throws Exception {
    // Arrange
    DataSources dataSources = new DataSources();

    // Act
    String actual = dataSources.getSchema();

    // Assert
    Assert.assertEquals(null, actual);
    String name = dataSources.getName();
    String toStringResult = dataSources.toString();
    String type = dataSources.getType();
    String host = dataSources.getHost();
    String schema = dataSources.getSchema();
    long sampleTimeStamp = dataSources.getSampleTimeStamp();
    Assert.assertEquals(null, name);
    Assert.assertEquals(0, dataSources.getPort());
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals(null, schema);
    Assert.assertEquals(null, host);
    Assert.assertEquals(null, type);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
