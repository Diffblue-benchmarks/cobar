package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.DataSources;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSources_DataSourcesTest_5_Test {
  @Test
  public void DataSourcesTest() throws Exception {
    // Arrange and Act
    DataSources dataSources = new DataSources();

    // Assert
    String toStringResult = dataSources.toString();
    String type = dataSources.getType();
    String host = dataSources.getHost();
    String schema = dataSources.getSchema();
    long sampleTimeStamp = dataSources.getSampleTimeStamp();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, dataSources.getPort());
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals(null, schema);
    Assert.assertEquals(null, host);
    Assert.assertEquals(null, type);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
