package com.alibaba.cobar.route;

import com.alibaba.cobar.route.RouteResultset;
import com.alibaba.cobar.route.RouteResultsetNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RouteResultsetTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99919c28eca6071f533() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final RouteResultset actual = new RouteResultset(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1L, actual.getLimitSize());
    Assert.assertEquals("aaaaa", actual.getStatement());
    Assert.assertEquals(0, actual.getFlag());
    Assert.assertNull(actual.getNodes());

  }

  // Test written by Diffblue Cover
  @Test
  public void getFlagOutputZero999b794340729727f3a() {

    // Arrange
    final RouteResultset thisObj = new RouteResultset("aaaaa");

    // Act
    final int actual = thisObj.getFlag();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLimitSizeOutputNegative9994d198a9fd18891f1() {

    // Arrange
    final RouteResultset thisObj = new RouteResultset("aaaaa");

    // Act
    final long actual = thisObj.getLimitSize();

    // Assert result
    Assert.assertEquals(-1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNodesOutputVoid9997923e5145e81c5cd() {

    // Arrange
    final RouteResultset thisObj = new RouteResultset("aaaaa");

    // Act
    final RouteResultsetNode[] actual = thisObj.getNodes();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getStatementOutputNotNull9991c6d8d7e8709fbe4() {

    // Arrange
    final RouteResultset thisObj = new RouteResultset("aaaaa");

    // Act
    final String actual = thisObj.getStatement();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setFlagInputZeroOutputVoid9999b5ca50cf8615759() {

    // Arrange
    final RouteResultset thisObj = new RouteResultset("aaaaa");
    final int arg0 = 0;

    // Act
    thisObj.setFlag(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setLimitSizeInputNegativeOutputVoid9994e6e6cac4523ac94() {

    // Arrange
    final RouteResultset thisObj = new RouteResultset("aaaaa");
    final long arg0 = -1L;

    // Act
    thisObj.setLimitSize(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNodesInput3OutputVoid99979fada2afe89776a() {

    // Arrange
    final RouteResultset thisObj = new RouteResultset("aaaaa");
    final RouteResultsetNode routeResultsetNode = new RouteResultsetNode("aaaaa", "aaaaa");
    final RouteResultsetNode routeResultsetNode1 = new RouteResultsetNode("aaaaa", "aaaaa");
    final RouteResultsetNode[] arg0 = { routeResultsetNode, routeResultsetNode, routeResultsetNode1 };

    // Act
    thisObj.setNodes(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getNodes());
    Assert.assertEquals(3, thisObj.getNodes().length);
    Assert.assertNotNull(thisObj.getNodes()[0]);
    Assert.assertEquals(-1, thisObj.getNodes()[0].getReplicaIndex());
    Assert.assertEquals("aaaaa", thisObj.getNodes()[0].getName());
    Assert.assertEquals("aaaaa", thisObj.getNodes()[0].getStatement());
    Assert.assertEquals(thisObj.getNodes()[0], thisObj.getNodes()[1]);
    Assert.assertNotNull(thisObj.getNodes()[2]);
    Assert.assertEquals(-1, thisObj.getNodes()[2].getReplicaIndex());
    Assert.assertEquals("aaaaa", thisObj.getNodes()[2].getName());
    Assert.assertEquals("aaaaa", thisObj.getNodes()[2].getStatement());

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull99983c0282e03c8da95() {

    // Arrange
    final RouteResultset thisObj = new RouteResultset("aaaaa");

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("aaaaa, route={\n}", actual);

  }
}
