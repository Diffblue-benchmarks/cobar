package com.alibaba.cobar.mysql.bio.executor;

import com.alibaba.cobar.mysql.bio.executor.RollbackExecutor;
import com.alibaba.cobar.server.session.BlockingSession;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RollbackExecutorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999711de72371748baa() {

    // Act, creating object to test constructor
    final RollbackExecutor actual = new RollbackExecutor();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void rollbackInputNotNullOutputNullPointerException9996f5663ab129ccb1b() {

    // Arrange
    final RollbackExecutor thisObj = new RollbackExecutor();
    final BlockingSession arg0 = new BlockingSession(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rollback(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void terminateOutputVoid9998a0677dd4cb656eb() throws InterruptedException {

    // Arrange
    final RollbackExecutor thisObj = new RollbackExecutor();

    // Act
    thisObj.terminate();

    // The method returns void, testing that no exception is thrown

  }
}
