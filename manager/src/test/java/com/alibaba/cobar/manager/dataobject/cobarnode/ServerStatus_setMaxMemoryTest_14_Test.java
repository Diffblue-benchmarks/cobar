package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ServerStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerStatus_setMaxMemoryTest_14_Test {
  @Test
  public void setMaxMemoryTest() throws Exception {
    // Arrange
    ServerStatus serverStatus = new ServerStatus();
    long maxMemory = 1L;

    // Act
    serverStatus.setMaxMemory(maxMemory);

    // Assert
    String toStringResult = serverStatus.toString();
    long maxMemory1 = serverStatus.getMaxMemory();
    long reloadTime = serverStatus.getReloadTime();
    String uptime = serverStatus.getUptime();
    long totalMemory = serverStatus.getTotalMemory();
    long usedMemory = serverStatus.getUsedMemory();
    String status = serverStatus.getStatus();
    long rollbackTime = serverStatus.getRollbackTime();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, serverStatus.getCharSet());
    Assert.assertEquals(0L, rollbackTime);
    Assert.assertEquals(null, status);
    Assert.assertEquals(0L, usedMemory);
    Assert.assertEquals(0L, totalMemory);
    Assert.assertEquals(null, uptime);
    Assert.assertEquals(0L, reloadTime);
    Assert.assertEquals(1L, maxMemory1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
