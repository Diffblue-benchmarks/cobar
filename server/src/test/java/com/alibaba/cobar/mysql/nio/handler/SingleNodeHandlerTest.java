package com.alibaba.cobar.mysql.nio.handler;

import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.mysql.nio.handler.SingleNodeHandler;
import com.alibaba.cobar.route.RouteResultsetNode;
import com.alibaba.cobar.server.session.NonBlockingSession;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class SingleNodeHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void connectionAcquiredInputNotNullOutputNullPointerException9990212709fc8585698() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("routeNode is null!", "routeNode is null!");
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final SingleNodeHandler thisObj = new SingleNodeHandler(routeResultsetNode, nonBlockingSession);
    final MySQLConnection arg0 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionAcquired(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void connectionErrorInputNotNullNotNullOutputNullPointerException9991d62203d741215b4() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("routeNode is null!", "routeNode is null!");
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final SingleNodeHandler thisObj = new SingleNodeHandler(routeResultsetNode, nonBlockingSession);
    final Throwable arg0 = new Throwable();
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionError(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999710f1a56d4086aa6() {

    // Arrange
    final RouteResultsetNode arg0 = new RouteResultsetNode("routeNode is null!", "routeNode is null!");
    final NonBlockingSession arg1 = new NonBlockingSession(null);

    // Act, creating object to test constructor
    final SingleNodeHandler actual = new SingleNodeHandler(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void errorResponseInput24NotNullOutputNullPointerException9992c4f5fb75b08cafb() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("routeNode is null!", "routeNode is null!");
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final SingleNodeHandler thisObj = new SingleNodeHandler(routeResultsetNode, nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.errorResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeOutputNullPointerException9999bbff97f555be9a1() throws Exception {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("routeNode is null!", "routeNode is null!");
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final SingleNodeHandler thisObj = new SingleNodeHandler(routeResultsetNode, nonBlockingSession);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void fieldEofResponseInput24NotNull24NotNullOutputNullPointerException99961fc0e288c62dcf4() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("routeNode is null!", "routeNode is null!");
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final SingleNodeHandler thisObj = new SingleNodeHandler(routeResultsetNode, nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ArrayList<byte[]> arg1 = new ArrayList<byte[]>();
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    arg1.add(myByteArray);
    final byte[] arg2 = arg0;
    final MySQLConnection arg3 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.fieldEofResponse(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void okResponseInput24NotNullOutputNullPointerException9991debb7aaccc2d9f9() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("routeNode is null!", "routeNode is null!");
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final SingleNodeHandler thisObj = new SingleNodeHandler(routeResultsetNode, nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.okResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowEofResponseInput24NotNullOutputNullPointerException999316d2338cd0f7bc7() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("routeNode is null!", "routeNode is null!");
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final SingleNodeHandler thisObj = new SingleNodeHandler(routeResultsetNode, nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rowEofResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowResponseInput24NotNullOutputNullPointerException999bbc4942a4d3bc31f() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("routeNode is null!", "routeNode is null!");
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final SingleNodeHandler thisObj = new SingleNodeHandler(routeResultsetNode, nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rowResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
