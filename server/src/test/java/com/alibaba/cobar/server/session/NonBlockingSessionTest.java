package com.alibaba.cobar.server.session;

import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.net.FrontendConnection;
import com.alibaba.cobar.route.RouteResultset;
import com.alibaba.cobar.route.RouteResultsetNode;
import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.session.NonBlockingSession;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.Set;



public class NonBlockingSessionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void bindConnectionInputNotNullNotNullOutputVoid999b6e5488e3239c5a2() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);
    final RouteResultsetNode arg0 = new RouteResultsetNode("No dataNode selected", "No dataNode selected");
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    final MySQLConnection actual = thisObj.bindConnection(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void cancelInputNullOutputVoid9991c8392bca28029b3() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);
    final FrontendConnection arg0 = null;

    // Act
    thisObj.cancel(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearConnectionsOutputVoid999c331c9d2c06c26d5() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);

    // Act
    thisObj.clearConnections();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void closeConnectionInputNotNullOutputFalse9990e90076d2f7dc123() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);
    final RouteResultsetNode arg0 = new RouteResultsetNode("No dataNode selected", "No dataNode selected");

    // Act
    final boolean actual = thisObj.closeConnection(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void closedOutputNullPointerException99921cc68de269c5073() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.closed();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void commitOutputNullPointerException999649cf919bd0c0762() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.commit();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull9998689d95b09fdd74d() {

    // Arrange
    final ServerConnection arg0 = null;

    // Act, creating object to test constructor
    final NonBlockingSession actual = new NonBlockingSession(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getSource());

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNullZeroOutputNullPointerException99987552683c20892f2() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);
    final RouteResultset arg0 = new RouteResultset("No dataNode selected");
    final int arg1 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSourceOutputVoid999f8ecdbf2143a8b19() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);

    // Act
    final ServerConnection actual = thisObj.getSource();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTargetCountOutputZero999e3f203babb1404b7() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);

    // Act
    final int actual = thisObj.getTargetCount();

    // Assert result
    Assert.assertEquals(0, actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void getTargetKeysOutputNotNull999ca8bf78691b9dac3() {
//
//    // Arrange
//    final NonBlockingSession thisObj = new NonBlockingSession(null);
//
//    // Act
//    final Set<RouteResultsetNode> actual = thisObj.getTargetKeys();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "size"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getTargetInputNotNullOutputVoid999d2fedd729a58c0e8() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);
    final RouteResultsetNode arg0 = new RouteResultsetNode("No dataNode selected", "No dataNode selected");

    // Act
    final MySQLConnection actual = thisObj.getTarget(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void releaseConnectionsOutputVoid999fd952dadaf601e34() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);

    // Act
    thisObj.releaseConnections();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void removeTargetInputNotNullOutputVoid999ded48fbcb27a6467() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);
    final RouteResultsetNode arg0 = new RouteResultsetNode("No dataNode selected", "No dataNode selected");

    // Act
    final MySQLConnection actual = thisObj.removeTarget(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rollbackOutputNullPointerException99994898dce0986fced() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rollback();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setConnectionRunningInput3OutputVoid999c356c034a31865c3() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("No dataNode selected", "No dataNode selected");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("No dataNode selected", "No dataNode selected");
    final RouteResultsetNode[] arg0 = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };

    // Act
    thisObj.setConnectionRunning(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void terminateOutputVoid999e13c2a1ab23f9cc2() {

    // Arrange
    final NonBlockingSession thisObj = new NonBlockingSession(null);

    // Act
    thisObj.terminate();

    // The method returns void, testing that no exception is thrown

  }
}
