package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.DataSources;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSources_setSchemaTest_9_Test {
  @Test
  public void setSchemaTest() throws Exception {
    // Arrange
    DataSources dataSources = new DataSources();
    String schema = "aaaaa";

    // Act
    dataSources.setSchema(schema);

    // Assert
    String name = dataSources.getName();
    String toStringResult = dataSources.toString();
    String type = dataSources.getType();
    String host = dataSources.getHost();
    String schema1 = dataSources.getSchema();
    long sampleTimeStamp = dataSources.getSampleTimeStamp();
    Assert.assertEquals(null, name);
    Assert.assertEquals(0, dataSources.getPort());
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals("aaaaa", schema1);
    Assert.assertEquals(null, host);
    Assert.assertEquals(null, type);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
