package com.alibaba.cobar.manager.dataobject.cobarnode;

import com.alibaba.cobar.manager.dataobject.cobarnode.CommandStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandStatus_CommandStatusTest_8_Test {
  @Test
  public void CommandStatusTest() throws Exception {
    // Arrange and Act
    CommandStatus commandStatus = new CommandStatus();

    // Assert
    long query = commandStatus.getQuery();
    String toStringResult = commandStatus.toString();
    long stmtPrepared = commandStatus.getStmtPrepared();
    long other = commandStatus.getOther();
    long kill = commandStatus.getKill();
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
    Assert.assertEquals(0L, kill);
    Assert.assertEquals(0L, other);
    Assert.assertEquals(0L, stmtPrepared);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
