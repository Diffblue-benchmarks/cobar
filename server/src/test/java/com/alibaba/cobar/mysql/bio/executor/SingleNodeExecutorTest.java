package com.alibaba.cobar.mysql.bio.executor;

import com.alibaba.cobar.mysql.bio.executor.SingleNodeExecutor;
import com.alibaba.cobar.route.RouteResultsetNode;
import com.alibaba.cobar.server.session.BlockingSession;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SingleNodeExecutorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992577afa1a00922f0() {

    // Act, creating object to test constructor
    final SingleNodeExecutor actual = new SingleNodeExecutor();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNullNotNullNegativeOutputNullPointerException999d60f3a756801c81c() {

    // Arrange
    final SingleNodeExecutor thisObj = new SingleNodeExecutor();
    final RouteResultsetNode arg0 = new RouteResultsetNode("'", "'");
    final BlockingSession arg1 = new BlockingSession(null);
    final int arg2 = -2;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void terminateOutputVoid9992c8abffeaf60d164() throws InterruptedException {

    // Arrange
    final SingleNodeExecutor thisObj = new SingleNodeExecutor();

    // Act
    thisObj.terminate();

    // The method returns void, testing that no exception is thrown

  }
}
