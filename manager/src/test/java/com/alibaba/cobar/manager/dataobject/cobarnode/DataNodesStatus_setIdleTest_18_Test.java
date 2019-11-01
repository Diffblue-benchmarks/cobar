package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.DataNodesStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataNodesStatus_setIdleTest_18_Test {
  @Test
  public void setIdleTest() throws Exception {
    // Arrange
    DataNodesStatus dataNodesStatus = new DataNodesStatus();
    int idle = 1;

    // Act
    dataNodesStatus.setIdle(idle);

    // Assert
    long maxTime = dataNodesStatus.getMaxTime();
    int active = dataNodesStatus.getActive();
    String toStringResult = dataNodesStatus.toString();
    String poolName = dataNodesStatus.getPoolName();
    String dataSource = dataNodesStatus.getDataSource();
    int idle1 = dataNodesStatus.getIdle();
    int index = dataNodesStatus.getIndex();
    String type = dataNodesStatus.getType();
    int size = dataNodesStatus.getSize();
    long maxSQL = dataNodesStatus.getMaxSQL();
    long sampleTimeStamp = dataNodesStatus.getSampleTimeStamp();
    long totalTime = dataNodesStatus.getTotalTime();
    long executeCount = dataNodesStatus.getExecuteCount();
    Assert.assertEquals(0L, maxTime);
    Assert.assertEquals(0L, dataNodesStatus.getRecoveryTime());
    Assert.assertEquals(0L, executeCount);
    Assert.assertEquals(0L, totalTime);
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals(0L, maxSQL);
    Assert.assertEquals(0, size);
    Assert.assertEquals(null, type);
    Assert.assertEquals(0, index);
    Assert.assertEquals(1, idle1);
    Assert.assertEquals(null, dataSource);
    Assert.assertEquals(null, poolName);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, active);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
