package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.DataNodesStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataNodesStatus_setExecuteCountTest_21_Test {
  @Test
  public void setExecuteCountTest() throws Exception {
    // Arrange
    DataNodesStatus dataNodesStatus = new DataNodesStatus();
    long executeCount = 1L;

    // Act
    dataNodesStatus.setExecuteCount(executeCount);

    // Assert
    long maxTime = dataNodesStatus.getMaxTime();
    int active = dataNodesStatus.getActive();
    String toStringResult = dataNodesStatus.toString();
    String poolName = dataNodesStatus.getPoolName();
    String dataSource = dataNodesStatus.getDataSource();
    int idle = dataNodesStatus.getIdle();
    int index = dataNodesStatus.getIndex();
    String type = dataNodesStatus.getType();
    int size = dataNodesStatus.getSize();
    long maxSQL = dataNodesStatus.getMaxSQL();
    long sampleTimeStamp = dataNodesStatus.getSampleTimeStamp();
    long totalTime = dataNodesStatus.getTotalTime();
    long executeCount1 = dataNodesStatus.getExecuteCount();
    Assert.assertEquals(0L, maxTime);
    Assert.assertEquals(0L, dataNodesStatus.getRecoveryTime());
    Assert.assertEquals(1L, executeCount1);
    Assert.assertEquals(0L, totalTime);
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals(0L, maxSQL);
    Assert.assertEquals(0, size);
    Assert.assertEquals(null, type);
    Assert.assertEquals(0, index);
    Assert.assertEquals(0, idle);
    Assert.assertEquals(null, dataSource);
    Assert.assertEquals(null, poolName);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, active);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
