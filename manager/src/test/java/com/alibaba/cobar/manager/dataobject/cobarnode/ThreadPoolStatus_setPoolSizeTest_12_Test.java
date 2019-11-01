package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ThreadPoolStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ThreadPoolStatus_setPoolSizeTest_12_Test {
  @Test
  public void setPoolSizeTest() throws Exception {
    // Arrange
    ThreadPoolStatus threadPoolStatus = new ThreadPoolStatus();
    int poolSize = 1;

    // Act
    threadPoolStatus.setPoolSize(poolSize);

    // Assert
    int taskQueue = threadPoolStatus.getTaskQueue();
    int activeSize = threadPoolStatus.getActiveSize();
    String toStringResult = threadPoolStatus.toString();
    int poolSize1 = threadPoolStatus.getPoolSize();
    long totalTask = threadPoolStatus.getTotalTask();
    long completedTask = threadPoolStatus.getCompletedTask();
    Assert.assertEquals(0, taskQueue);
    Assert.assertEquals(null, threadPoolStatus.getThreadPoolName());
    Assert.assertEquals(0L, completedTask);
    Assert.assertEquals(0L, totalTask);
    Assert.assertEquals(1, poolSize1);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, activeSize);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
