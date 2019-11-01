package com.alibaba.cobar.mysql.bio.executor;

import com.alibaba.cobar.mysql.bio.executor.MultiNodeExecutor.SimpleErrInfo;
import com.alibaba.cobar.mysql.bio.executor.MultiNodeExecutor;
import com.alibaba.cobar.route.RouteResultsetNode;
import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.session.BlockingSession;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MultiNodeExecutorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b2ffc3419dcd35e8() {

    // Act, creating object to test constructor
    final MultiNodeExecutor actual = new MultiNodeExecutor();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInput3TrueNotNullNegativeOutputNullPointerException99981b80e12e8cfc51d() {

    // Arrange
    final MultiNodeExecutor thisObj = new MultiNodeExecutor();
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("'", "'");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("'", "'");
    final RouteResultsetNode[] arg0 = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };
    final boolean arg1 = true;
    final BlockingSession arg2 = new BlockingSession(null);
    final int arg3 = -2;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void terminateOutputVoid9993ab1528579a30d40() throws InterruptedException {

    // Arrange
    final MultiNodeExecutor thisObj = new MultiNodeExecutor();

    // Act
    thisObj.terminate();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullPositiveNullNotNullOutputNotNull999b859c366688f7c0c() {

    // Arrange
    final Exception arg0 = new Exception();
    final int arg1 = 1;
    final ServerConnection arg2 = null;
    final RouteResultsetNode arg3 = new RouteResultsetNode("aaaaa", "aaaaa");

    // Act, creating object to test constructor
    final MultiNodeExecutor.SimpleErrInfo actual = new MultiNodeExecutor.SimpleErrInfo(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getErrNo());

  }

  // Test written by Diffblue Cover
  @Test
  public void getErrMsgOutputNotNull9990950b3d12f09eac5() {

    // Arrange
    final Exception exception = new Exception();
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("aaaaa", "aaaak");
    final MultiNodeExecutor.SimpleErrInfo thisObj = new MultiNodeExecutor.SimpleErrInfo(exception, 1, null, routeResultsetNode);

    // Act
    final String actual = thisObj.getErrMsg();

    // Assert result
    Assert.assertEquals("Exception", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getErrNoOutputPositive999254e3f0c3324a1b8() {

    // Arrange
    final Exception exception = new Exception();
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("aaaaa", "aaaak");
    final MultiNodeExecutor.SimpleErrInfo thisObj = new MultiNodeExecutor.SimpleErrInfo(exception, 1, null, routeResultsetNode);

    // Act
    final int actual = thisObj.getErrNo();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void logErrOutputVoid99984401d9f197977a2() {

    // Arrange
    final Exception exception = new Exception();
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("aaaaa", "aaaak");
    final MultiNodeExecutor.SimpleErrInfo thisObj = new MultiNodeExecutor.SimpleErrInfo(exception, 1, null, routeResultsetNode);

    // Act
    thisObj.logErr();

    // The method returns void, testing that no exception is thrown

  }
}
