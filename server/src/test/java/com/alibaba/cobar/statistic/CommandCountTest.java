package com.alibaba.cobar.statistic;

import com.alibaba.cobar.statistic.CommandCount;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CommandCountTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f08664c7fe8d11cb() {

    // Act, creating object to test constructor
    final CommandCount actual = new CommandCount();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void doHeartbeatOutputVoid99933cf0f377c4b1f6f() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    thisObj.doHeartbeat();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void doInitDBOutputVoid999d5ad573169b1999f() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    thisObj.doInitDB();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void doKillOutputVoid99958319afdb28ac434() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    thisObj.doKill();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void doOtherOutputVoid9998217ef7075d0b3d4() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    thisObj.doOther();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void doPingOutputVoid9996a90ca795c332241() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    thisObj.doPing();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void doQueryOutputVoid9997630e34292bce94c() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    thisObj.doQuery();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void doQuitOutputVoid999612962b67bbc1b30() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    thisObj.doQuit();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void doStmtCloseOutputVoid999a140691009f2e093() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    thisObj.doStmtClose();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void doStmtExecuteOutputVoid9995cc2000c7f6d6bac() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    thisObj.doStmtExecute();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void doStmtPrepareOutputVoid999dd64ca619b7243cc() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    thisObj.doStmtPrepare();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void heartbeatOutputZero999f59f6408e78ef770() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    final long actual = thisObj.heartbeat();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initDBCountOutputZero9999b0c952d96b95e3b() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    final long actual = thisObj.initDBCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void killCountOutputZero999af371add698bd29f() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    final long actual = thisObj.killCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void otherCountOutputZero99994a70eab0ea98542() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    final long actual = thisObj.otherCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void pingCountOutputZero999580ee222c91b9e6e() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    final long actual = thisObj.pingCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void queryCountOutputZero999c07295bd83c45545() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    final long actual = thisObj.queryCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void quitCountOutputZero9997d6286ad653764ef() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    final long actual = thisObj.quitCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void stmtCloseCountOutputZero9990b0914380f052d18() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    final long actual = thisObj.stmtCloseCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void stmtExecuteCountOutputZero999ab1e05f31b770c56() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    final long actual = thisObj.stmtExecuteCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void stmtPrepareCountOutputZero9990a555a8373b939c6() {

    // Arrange
    final CommandCount thisObj = new CommandCount();

    // Act
    final long actual = thisObj.stmtPrepareCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }
}
