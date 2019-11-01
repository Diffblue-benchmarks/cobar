package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ThreadPoolStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ThreadPoolStatus_setTaskQueueTest_8_Test {
  @Test
  public void setTaskQueueTest() throws Exception {
    // Arrange
    ThreadPoolStatus threadPoolStatus = new ThreadPoolStatus();
    int taskQueue = 1;

    // Act
    threadPoolStatus.setTaskQueue(taskQueue);

    // Assert
    int taskQueue1 = threadPoolStatus.getTaskQueue();
    int activeSize = threadPoolStatus.getActiveSize();
    String toStringResult = threadPoolStatus.toString();
    int poolSize = threadPoolStatus.getPoolSize();
    long totalTask = threadPoolStatus.getTotalTask();
    long completedTask = threadPoolStatus.getCompletedTask();
    Assert.assertEquals(1, taskQueue1);
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
