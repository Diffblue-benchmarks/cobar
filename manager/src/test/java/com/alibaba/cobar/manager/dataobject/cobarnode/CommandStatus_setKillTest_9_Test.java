package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.CommandStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandStatus_setKillTest_9_Test {
  @Test
  public void setKillTest() throws Exception {
    // Arrange
    CommandStatus commandStatus = new CommandStatus();
    long kill = 1L;

    // Act
    commandStatus.setKill(kill);

    // Assert
    long query = commandStatus.getQuery();
    String toStringResult = commandStatus.toString();
    long stmtPrepared = commandStatus.getStmtPrepared();
    long other = commandStatus.getOther();
    long kill1 = commandStatus.getKill();
    String processorId = commandStatus.getProcessorId();
    long sampleTimeStamp = commandStatus.getSampleTimeStamp();
    long quit = commandStatus.getQuit();
    long initDB = commandStatus.getInitDB();
    long stmtExecute = commandStatus.getStmtExecute();
    long ping = commandStatus.getPing();
    Assert.assertEquals(0L, query);
    Assert.assertEquals(0L, commandStatus.getStmtClose());
    Assert.assertEquals(0L, ping);
    Assert.assertEquals(0L, stmtExecute);
    Assert.assertEquals(0L, initDB);
    Assert.assertEquals(0L, quit);
    Assert.assertEquals(0L, sampleTimeStamp);
    Assert.assertEquals(null, processorId);
    Assert.assertEquals(1L, kill1);
    Assert.assertEquals(0L, other);
    Assert.assertEquals(0L, stmtPrepared);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
