package com.alibaba.cobar.route;

import com.alibaba.cobar.route.RouteResultsetNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RouteResultsetNodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999d1f21e9288a20883() {

    // Arrange
    final String arg0 = ".";
    final String arg1 = ".";

    // Act, creating object to test constructor
    final RouteResultsetNode actual = new RouteResultsetNode(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1, actual.getReplicaIndex());
    Assert.assertEquals(".", actual.getName());
    Assert.assertEquals(".", actual.getStatement());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNegativeNotNullOutputNotNull9990cd62a015d86c2e5() {

    // Arrange
    final String arg0 = ".";
    final int arg1 = -1;
    final String arg2 = ".";

    // Act, creating object to test constructor
    final RouteResultsetNode actual = new RouteResultsetNode(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1, actual.getReplicaIndex());
    Assert.assertEquals(".", actual.getName());
    Assert.assertEquals(".", actual.getStatement());

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse99923b9f7872bde9d13() {

    // Arrange
    final RouteResultsetNode thisObj = new RouteResultsetNode(".", ".");
    final Object arg0 = ".";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputNotNull999acb1c2bb9c88fb69() {

    // Arrange
    final RouteResultsetNode thisObj = new RouteResultsetNode(".", ".");

    // Act
    final String actual = thisObj.getName();

    // Assert result
    Assert.assertEquals(".", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getReplicaIndexOutputNegative999e2b9c947780bef9d() {

    // Arrange
    final RouteResultsetNode thisObj = new RouteResultsetNode(".", ".");

    // Act
    final int actual = thisObj.getReplicaIndex();

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getStatementOutputNotNull999dc8bb346c23a85fe() {

    // Arrange
    final RouteResultsetNode thisObj = new RouteResultsetNode(".", ".");

    // Act
    final String actual = thisObj.getStatement();

    // Assert result
    Assert.assertEquals(".", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive99925fd64052a30f08a() {

    // Arrange
    final RouteResultsetNode thisObj = new RouteResultsetNode(".", ".");

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(46, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull9994e66022f46f7ad6a() {

    // Arrange
    final RouteResultsetNode thisObj = new RouteResultsetNode(".", ".");

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("..default{.}", actual);

  }
}
