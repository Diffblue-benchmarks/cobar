package com.alibaba.cobar.manager.util;

import com.alibaba.cobar.manager.dataobject.cobarnode.DataNodesStatus;
import com.alibaba.cobar.manager.util.SortUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SortUtil_compareDatanodesTest_6_Test {
  @Test
  public void compareDatanodesTest() throws Exception {
    // Arrange
    SortUtil<Object> sortUtil = new SortUtil<Object>();
    DataNodesStatus dataNodesStatus = new DataNodesStatus();
    DataNodesStatus dataNodesStatus1 = new DataNodesStatus();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    sortUtil.compareDatanodes(dataNodesStatus, dataNodesStatus1);
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
    Assert.assertEquals(0, idle);
    Assert.assertEquals(null, dataSource);
    Assert.assertEquals(null, poolName);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, active);
    long maxTime1 = dataNodesStatus1.getMaxTime();
    int active1 = dataNodesStatus1.getActive();
    String toStringResult1 = dataNodesStatus1.toString();
    String poolName1 = dataNodesStatus1.getPoolName();
    String dataSource1 = dataNodesStatus1.getDataSource();
    int idle1 = dataNodesStatus1.getIdle();
    int index1 = dataNodesStatus1.getIndex();
    String type1 = dataNodesStatus1.getType();
    int size1 = dataNodesStatus1.getSize();
    long maxSQL1 = dataNodesStatus1.getMaxSQL();
    long sampleTimeStamp1 = dataNodesStatus1.getSampleTimeStamp();
    long totalTime1 = dataNodesStatus1.getTotalTime();
    long executeCount1 = dataNodesStatus1.getExecuteCount();
    Assert.assertEquals(0L, maxTime1);
    Assert.assertEquals(0L, dataNodesStatus1.getRecoveryTime());
    Assert.assertEquals(0L, executeCount1);
    Assert.assertEquals(0L, totalTime1);
    Assert.assertEquals(0L, sampleTimeStamp1);
    Assert.assertEquals(0L, maxSQL1);
    Assert.assertEquals(0, size1);
    Assert.assertEquals(null, type1);
    Assert.assertEquals(0, index1);
    Assert.assertEquals(0, idle1);
    Assert.assertEquals(null, dataSource1);
    Assert.assertEquals(null, poolName1);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(0, active1);
    Assert.assertNotNull(sortUtil.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
