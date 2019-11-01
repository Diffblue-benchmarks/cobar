package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ThreadPoolStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ThreadPoolStatus_setCompletedTaskTest_2_Test {
  @Test
  public void setCompletedTaskTest() throws Exception {
    // Arrange
    ThreadPoolStatus threadPoolStatus = new ThreadPoolStatus();
    long completedTask = 1L;

    // Act
    threadPoolStatus.setCompletedTask(completedTask);

    // Assert
    int taskQueue = threadPoolStatus.getTaskQueue();
    int activeSize = threadPoolStatus.getActiveSize();
    String toStringResult = threadPoolStatus.toString();
    int poolSize = threadPoolStatus.getPoolSize();
    long totalTask = threadPoolStatus.getTotalTask();
    long completedTask1 = threadPoolStatus.getCompletedTask();
    Assert.assertEquals(0, taskQueue);
    Assert.assertEquals(null, threadPoolStatus.getThreadPoolName());
    Assert.assertEquals(1L, completedTask1);
    Assert.assertEquals(0L, totalTask);
    Assert.assertEquals(0, poolSize);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, activeSize);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
