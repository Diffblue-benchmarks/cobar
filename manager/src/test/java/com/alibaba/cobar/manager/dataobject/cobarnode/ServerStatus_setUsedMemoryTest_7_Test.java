package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ServerStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerStatus_setUsedMemoryTest_7_Test {
  @Test
  public void setUsedMemoryTest() throws Exception {
    // Arrange
    ServerStatus serverStatus = new ServerStatus();
    long usedMemory = 1L;

    // Act
    serverStatus.setUsedMemory(usedMemory);

    // Assert
    String toStringResult = serverStatus.toString();
    long maxMemory = serverStatus.getMaxMemory();
    long reloadTime = serverStatus.getReloadTime();
    String uptime = serverStatus.getUptime();
    long totalMemory = serverStatus.getTotalMemory();
    long usedMemory1 = serverStatus.getUsedMemory();
    String status = serverStatus.getStatus();
    long rollbackTime = serverStatus.getRollbackTime();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, serverStatus.getCharSet());
    Assert.assertEquals(0L, rollbackTime);
    Assert.assertEquals(null, status);
    Assert.assertEquals(1L, usedMemory1);
    Assert.assertEquals(0L, totalMemory);
    Assert.assertEquals(null, uptime);
    Assert.assertEquals(0L, reloadTime);
    Assert.assertEquals(0L, maxMemory);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
