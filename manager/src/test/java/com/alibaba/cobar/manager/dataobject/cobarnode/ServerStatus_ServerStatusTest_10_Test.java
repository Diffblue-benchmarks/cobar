package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ServerStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerStatus_ServerStatusTest_10_Test {
  @Test
  public void ServerStatusTest() throws Exception {
    // Arrange and Act
    ServerStatus serverStatus = new ServerStatus();

    // Assert
    String toStringResult = serverStatus.toString();
    long maxMemory = serverStatus.getMaxMemory();
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
    Assert.assertEquals(0L, maxMemory);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
