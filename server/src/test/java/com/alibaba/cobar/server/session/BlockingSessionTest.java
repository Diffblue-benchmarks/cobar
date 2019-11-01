package com.alibaba.cobar.server.session;

import com.alibaba.cobar.mysql.bio.Channel;
import com.alibaba.cobar.net.FrontendConnection;
import com.alibaba.cobar.route.RouteResultset;
import com.alibaba.cobar.route.RouteResultsetNode;
import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.session.BlockingSession;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.concurrent.ConcurrentHashMap;



public class BlockingSessionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void cancelInputNullOutputNullPointerException999513c85457eae26e6() {

    // Arrange
    final BlockingSession thisObj = new BlockingSession(null);
    final FrontendConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.cancel(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearOutputVoid9991ed55a211db98456() {

    // Arrange
    final BlockingSession thisObj = new BlockingSession(null);

    // Act
    thisObj.clear();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void commitOutputNullPointerException99958760fb05d289931() {

    // Arrange
    final BlockingSession thisObj = new BlockingSession(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.commit();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull999f716a1ed0d15e886() {

    // Arrange
    final ServerConnection arg0 = null;

    // Act, creating object to test constructor
    final BlockingSession actual = new BlockingSession(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getSource());
    Assert.assertNotNull(actual.getTarget());

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNullNegativeOutputNullPointerException999f1ac1ae9fab4c3d2() {

    // Arrange
    final BlockingSession thisObj = new BlockingSession(null);
    final RouteResultset arg0 = new RouteResultset("No dataNode selected");
    final int arg1 = -1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSourceOutputVoid999ef3d61e4792485a7() {

    // Arrange
    final BlockingSession thisObj = new BlockingSession(null);

    // Act
    final ServerConnection actual = thisObj.getSource();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTargetCountOutputZero9997be98f457f10d7be() {

    // Arrange
    final BlockingSession thisObj = new BlockingSession(null);

    // Act
    final int actual = thisObj.getTargetCount();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTargetOutputNotNull999702f09036d954d72() {

    // Arrange
    final BlockingSession thisObj = new BlockingSession(null);

    // Act
    final ConcurrentHashMap<RouteResultsetNode, Channel> actual = thisObj.getTarget();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void releaseOutputVoid999de6c30c03d1837e7() {

    // Arrange
    final BlockingSession thisObj = new BlockingSession(null);

    // Act
    thisObj.release();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rollbackOutputNullPointerException999af58444efefafb98() {

    // Arrange
    final BlockingSession thisObj = new BlockingSession(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rollback();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void terminateOutputVoid999d96e72890c89eb5a() {

    // Arrange
    final BlockingSession thisObj = new BlockingSession(null);

    // Act
    thisObj.terminate();

    // The method returns void, testing that no exception is thrown

  }
}
