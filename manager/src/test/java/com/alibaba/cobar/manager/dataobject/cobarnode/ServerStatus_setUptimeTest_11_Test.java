package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.ServerStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerStatus_setUptimeTest_11_Test {
  @Test
  public void setUptimeTest() throws Exception {
    // Arrange
    ServerStatus serverStatus = new ServerStatus();
    String uptime = "aaaaa";

    // Act
    serverStatus.setUptime(uptime);

    // Assert
    long maxMemory = serverStatus.getMaxMemory();
    long reloadTime = serverStatus.getReloadTime();
    String uptime1 = serverStatus.getUptime();
    long totalMemory = serverStatus.getTotalMemory();
    long usedMemory = serverStatus.getUsedMemory();
    String status = serverStatus.getStatus();
    long rollbackTime = serverStatus.getRollbackTime();
    Assert.assertEquals(0L, maxMemory);
    Assert.assertEquals(null, serverStatus.getCharSet());
    Assert.assertEquals(0L, rollbackTime);
    Assert.assertEquals(null, status);
    Assert.assertEquals(0L, usedMemory);
    Assert.assertEquals(0L, totalMemory);
    Assert.assertEquals("aaaaa", uptime1);
    Assert.assertEquals(0L, reloadTime);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
