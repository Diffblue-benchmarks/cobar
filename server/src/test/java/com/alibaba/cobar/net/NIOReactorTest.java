package com.alibaba.cobar.net;

import com.alibaba.cobar.heartbeat.CobarDetector;
import com.alibaba.cobar.net.NIOConnection;
import com.alibaba.cobar.net.NIOReactor;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.concurrent.BlockingQueue;



public class NIOReactorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9995f820957d6b9e90f() throws IOException {

    // Arrange
    final String arg0 = "-R";

    // Act, creating object to test constructor
    final NIOReactor actual = new NIOReactor(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getReactCountOutputZero999677f8060ba55dc5a() throws IOException {

    // Arrange
    final NIOReactor thisObj = new NIOReactor("-R");

    // Act
    final long actual = thisObj.getReactCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void getRegisterQueueOutputNotNull999929f8b74ee2b5d5d() throws IOException {
//
//    // Arrange
//    final NIOReactor thisObj = new NIOReactor("-R");
//
//    // Act
//    final BlockingQueue<NIOConnection> actual = thisObj.getRegisterQueue();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual, "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "size"));
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void getWriteQueueOutputNotNull999d4eb38e4c69e69e6() throws IOException {
//
//    // Arrange
//    final NIOReactor thisObj = new NIOReactor("-R");
//
//    // Act
//    final BlockingQueue<NIOConnection> actual = thisObj.getWriteQueue();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual, "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "size"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void postRegisterInputNotNullOutputVoid9999d3b23287efcc4e5() throws IOException {

    // Arrange
    final NIOReactor thisObj = new NIOReactor("-R");
    final CobarDetector arg0 = new CobarDetector(null);

    // Act
    thisObj.postRegister(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void postWriteInputNotNullOutputVoid9999889be43a4e2a720() throws IOException {

    // Arrange
    final NIOReactor thisObj = new NIOReactor("-R");
    final CobarDetector arg0 = new CobarDetector(null);

    // Act
    thisObj.postWrite(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void startupOutputVoid99943108dac4a46514d() throws IOException {

    // Arrange
    final NIOReactor thisObj = new NIOReactor("-R");

    // Act
    thisObj.startup();

    // The method returns void, testing that no exception is thrown

  }
}
