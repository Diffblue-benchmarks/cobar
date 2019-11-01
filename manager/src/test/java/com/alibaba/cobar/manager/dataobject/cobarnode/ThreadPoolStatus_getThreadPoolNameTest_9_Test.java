package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ThreadPoolStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ThreadPoolStatus_getThreadPoolNameTest_9_Test {
  @Test
  public void getThreadPoolNameTest() throws Exception {
    // Arrange
    ThreadPoolStatus threadPoolStatus = new ThreadPoolStatus();

    // Act
    String actual = threadPoolStatus.getThreadPoolName();

    // Assert
    Assert.assertEquals(null, actual);
    int taskQueue = threadPoolStatus.getTaskQueue();
    int activeSize = threadPoolStatus.getActiveSize();
    String toStringResult = threadPoolStatus.toString();
    int poolSize = threadPoolStatus.getPoolSize();
    long totalTask = threadPoolStatus.getTotalTask();
    long completedTask = threadPoolStatus.getCompletedTask();
    Assert.assertEquals(0, taskQueue);
    Assert.assertEquals(null, threadPoolStatus.getThreadPoolName());
    Assert.assertEquals(0L, completedTask);
    Assert.assertEquals(0L, totalTask);
    Assert.assertEquals(0, poolSize);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, activeSize);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
