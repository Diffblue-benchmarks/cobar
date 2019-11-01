package com.alibaba.cobar.mysql.nio.handler;

import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.mysql.nio.handler.MultiNodeQueryHandler;
import com.alibaba.cobar.route.RouteResultsetNode;
import com.alibaba.cobar.server.session.NonBlockingSession;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class MultiNodeQueryHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void connectionAcquiredInputNotNullOutputNullPointerException9993f7b3c28bc9d9ee3() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode[] routeResultsetNodeArray = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final MultiNodeQueryHandler thisObj = new MultiNodeQueryHandler(routeResultsetNodeArray, true, nonBlockingSession);
    final MySQLConnection arg0 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionAcquired(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void connectionErrorInputNotNullNotNullOutputNullPointerException999935cf80586eac38d() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode[] routeResultsetNodeArray = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final MultiNodeQueryHandler thisObj = new MultiNodeQueryHandler(routeResultsetNodeArray, true, nonBlockingSession);
    final Throwable arg0 = new Throwable();
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.connectionError(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInput3TrueNotNullOutputNotNull9992d31e1472d987680() {
//
//    // Arrange
//    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("connection err!", "connection err!");
//    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("connection err!", "connection err!");
//    final RouteResultsetNode[] arg0 = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };
//    final boolean arg1 = true;
//    final NonBlockingSession arg2 = new NonBlockingSession(null);
//
//    // Act, creating object to test constructor
//    final MultiNodeQueryHandler actual = new MultiNodeQueryHandler(arg0, arg1, arg2);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.session);
//    Assert.assertNull(actual.session.getSource());
//    Assert.assertNotNull(actual.lock);
//    Assert.assertNotNull(actual.isFail);
//    Assert.assertEquals((short) 0, actual.packetId);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void errorResponseInput24NotNullOutputVoid9991a732d980001693e() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode[] routeResultsetNodeArray = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final MultiNodeQueryHandler thisObj = new MultiNodeQueryHandler(routeResultsetNodeArray, true, nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thisObj.errorResponse(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeOutputNullPointerException999046dd025d8f01ae7() throws Exception {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode[] routeResultsetNodeArray = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final MultiNodeQueryHandler thisObj = new MultiNodeQueryHandler(routeResultsetNodeArray, true, nonBlockingSession);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void fieldEofResponseInput24NotNull24NotNullOutputNullPointerException999a8a7307ef2d8a3ac() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode[] routeResultsetNodeArray = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final MultiNodeQueryHandler thisObj = new MultiNodeQueryHandler(routeResultsetNodeArray, true, nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ArrayList<byte[]> arg1 = new ArrayList<byte[]>(0);
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    arg1.add(myByteArray);
    final byte[] arg2 = arg0;
    final MySQLConnection arg3 = new MySQLConnection(null);
    try {

      // Act
      thrown.expect(NullPointerException.class);
      thisObj.fieldEofResponse(arg0, arg1, arg2, arg3);
    } catch (NullPointerException ex) {

      // Assert side effects
      Assert.assertEquals((short) 1, thisObj.packetId);
      Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 1, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, arg2);
      Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 1, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, arg0);
      throw ex;
    }

  }

  // Test written by Diffblue Cover
  @Test
  public void okResponseInput24NotNullOutputNullPointerException999ca2b3355464ba2c7() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode[] routeResultsetNodeArray = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final MultiNodeQueryHandler thisObj = new MultiNodeQueryHandler(routeResultsetNodeArray, true, nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.okResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recycleResourcesOutputVoid999cbee7b183c0bbb0d() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode[] routeResultsetNodeArray = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final MultiNodeQueryHandler thisObj = new MultiNodeQueryHandler(routeResultsetNodeArray, true, nonBlockingSession);

    // Act
    thisObj.recycleResources();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowEofResponseInput24NotNullOutputNullPointerException999f2c3e8ba6bc28af1() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode[] routeResultsetNodeArray = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final MultiNodeQueryHandler thisObj = new MultiNodeQueryHandler(routeResultsetNodeArray, true, nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rowEofResponse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowResponseInput24NotNullOutputNullPointerException999e9996d309df6d7f0() {

    // Arrange
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("connection err!", "connection err!");
    final RouteResultsetNode[] routeResultsetNodeArray = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final MultiNodeQueryHandler thisObj = new MultiNodeQueryHandler(routeResultsetNodeArray, true, nonBlockingSession);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final MySQLConnection arg1 = new MySQLConnection(null);
    try {

      // Act
      thrown.expect(NullPointerException.class);
      thisObj.rowResponse(arg0, arg1);
    } catch (NullPointerException ex) {

      // Assert side effects
      Assert.assertEquals((short) 1, thisObj.packetId);
      Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 1, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 }, arg0);
      throw ex;
    }

  }
}
