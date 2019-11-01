package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ThreadPoolStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ThreadPoolStatus_setActiveSizeTest_13_Test {
  @Test
  public void setActiveSizeTest() throws Exception {
    // Arrange
    ThreadPoolStatus threadPoolStatus = new ThreadPoolStatus();
    int activeSize = 1;

    // Act
    threadPoolStatus.setActiveSize(activeSize);

    // Assert
    int activeSize1 = threadPoolStatus.getActiveSize();
    String toStringResult = threadPoolStatus.toString();
    int poolSize = threadPoolStatus.getPoolSize();
    long totalTask = threadPoolStatus.getTotalTask();
    long completedTask = threadPoolStatus.getCompletedTask();
    Assert.assertEquals(1, activeSize1);
    Assert.assertEquals(null, threadPoolStatus.getThreadPoolName());
    Assert.assertEquals(0L, completedTask);
    Assert.assertEquals(0L, totalTask);
    Assert.assertEquals(0, poolSize);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
