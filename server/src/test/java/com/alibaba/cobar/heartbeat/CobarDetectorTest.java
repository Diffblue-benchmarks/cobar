package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.CobarNode;
import com.alibaba.cobar.config.model.CobarNodeConfig;
import com.alibaba.cobar.heartbeat.CobarDetector;
import com.alibaba.cobar.heartbeat.CobarHeartbeat;
import com.alibaba.cobar.net.mysql.HandshakePacket;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.channels.SocketChannel;



public class CobarDetectorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void authenticateOutputNullPointerException999973025bb088fa153() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.authenticate();

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNullOutputNotNull999764c51b5fb571543() {
//
//    // Arrange
//    final SocketChannel arg0 = null;
//
//    // Act, creating object to test constructor
//    final CobarDetector actual = new CobarDetector(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.getHeartbeat());
//    Assert.assertNull(actual.getPassword());
//    Assert.assertNull(actual.getHandshake());
//    Assert.assertEquals(0L, actual.getHeartbeatTimeout());
//    Assert.assertFalse(actual.isAuthenticated());
//    Assert.assertNull(actual.getUser());
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "isFinishConnect"));
//    Assert.assertEquals(0L, actual.getIdleTimeout());
//    Assert.assertNull(Reflector.getInstanceField(actual, "connector"));
//    Assert.assertEquals(0L, actual.getId());
//    Assert.assertNull(actual.getHost());
//    Assert.assertNotNull(Reflector.getInstanceField(actual, "handler"));
//    Assert.assertEquals(0, actual.getLocalPort());
//    Assert.assertEquals(0, actual.getPort());
//    Assert.assertEquals(1572604603256L, actual.getStartupTime());
//    Assert.assertNull(actual.getProcessor());
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "isSocketClosed"));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "readBufferOffset"));
//    Assert.assertNull(actual.getReadBuffer());
//    Assert.assertEquals(0, actual.getPacketHeaderSize());
//    Assert.assertNotNull(Reflector.getInstanceField(actual, "isClosed"));
//    Assert.assertEquals(1572604603256L, actual.getLastReadTime());
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "isRegistered"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "processKey"));
//    Assert.assertNull(actual.getChannel());
//    Assert.assertEquals(1572604603256L, actual.getLastWriteTime());
//    Assert.assertEquals(0, actual.getWriteAttempts());
//    Assert.assertEquals(0L, actual.getNetInBytes());
//    Assert.assertNotNull(Reflector.getInstanceField(actual, "keyLock"));
//    Assert.assertEquals(0, actual.getMaxPacketSize());
//    Assert.assertNotNull(Reflector.getInstanceField(actual, "writeLock"));
//    Assert.assertEquals(0L, actual.getNetOutBytes());
//    Assert.assertNull(actual.getWriteQueue());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void errorInputNegativeNotNullOutputNullPointerException999051d00471017fe59() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);
    final int arg0 = -1;
    final Throwable arg1 = new Throwable();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.error(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHandshakeOutputVoid9996155737a0bcaf7c8() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    final HandshakePacket actual = thisObj.getHandshake();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeartbeatOutputVoid999dff2865fddd141ff() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    final CobarHeartbeat actual = thisObj.getHeartbeat();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeartbeatTimeoutOutputZero999b39426bcdc191a1d() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    final long actual = thisObj.getHeartbeatTimeout();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPasswordOutputVoid999b35c58c6281c679b() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    final String actual = thisObj.getPassword();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUserOutputVoid999a0504d406a494a21() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    final String actual = thisObj.getUser();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void heartbeatOutputNullPointerException9993da736278e36c70c() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.heartbeat();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void idleCheckOutputVoid999e50783a41e681005() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    thisObj.idleCheck();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isAuthenticatedOutputFalse999c05cf200196399b3() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    final boolean actual = thisObj.isAuthenticated();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isHeartbeatTimeoutOutputFalse999cacd27764c19e7c3() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    final boolean actual = thisObj.isHeartbeatTimeout();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isQuitOutputFalse99946a6d6c7bb2577b0() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    final boolean actual = thisObj.isQuit();

    // Assert result
    Assert.assertFalse(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void lastReadTimeOutputPositive999af1f7fbe392b8d3a() {
//
//    // Arrange
//    final CobarDetector thisObj = new CobarDetector(null);
//
//    // Act
//    final long actual = thisObj.lastReadTime();
//
//    // Assert result
//    Assert.assertEquals(1572604606756L, actual);
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void lastWriteTimeOutputPositive999907f62c339c150f2() {
//
//    // Arrange
//    final CobarDetector thisObj = new CobarDetector(null);
//
//    // Act
//    final long actual = thisObj.lastWriteTime();
//
//    // Assert result
//    Assert.assertEquals(1572604603256L, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void quitOutputVoid99984dfad8e7b422f0a() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);

    // Act
    thisObj.quit();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAuthenticatedInputTrueOutputVoid999018a2a657e57ddf2() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);
    final boolean arg0 = true;

    // Act
    thisObj.setAuthenticated(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isAuthenticated());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharsetIndexInputNegativeOutputVoid999fe6b3d8889a5dedf() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);
    final int arg0 = -1;

    // Act
    thisObj.setCharsetIndex(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void setHeartbeatInputNotNullOutputVoid999c6a6379ae9fe1287() {
//
//    // Arrange
//    final CobarDetector thisObj = new CobarDetector(null);
//    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("@", "@", -1, -1);
//    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
//    final CobarHeartbeat arg0 = new CobarHeartbeat(cobarNode);
//
//    // Act
//    thisObj.setHeartbeat(arg0);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getHeartbeat());
//    Assert.assertNull(thisObj.getHeartbeat().getDetector());
//    Assert.assertNotNull(thisObj.getHeartbeat().getRecorder());
//    Assert.assertNotNull(thisObj.getHeartbeat().detectCount);
//    Assert.assertEquals(0L, thisObj.getHeartbeat().detectCount.get());
//    Assert.assertEquals(0, thisObj.getHeartbeat().getErrorCount());
//    Assert.assertEquals(1, thisObj.getHeartbeat().getStatus());
//    Assert.assertNotNull(thisObj.getHeartbeat().getNode());
//    Assert.assertNotNull(thisObj.getHeartbeat().getNode().getHeartbeat());
//    Assert.assertNull(thisObj.getHeartbeat().getNode().getHeartbeat().getDetector());
//    Assert.assertNotNull(thisObj.getHeartbeat().getNode().getHeartbeat().getRecorder());
//    Assert.assertNotNull(thisObj.getHeartbeat().getNode().getHeartbeat().detectCount);
//    Assert.assertEquals(0L, thisObj.getHeartbeat().getNode().getHeartbeat().detectCount.get());
//    Assert.assertEquals(0, thisObj.getHeartbeat().getNode().getHeartbeat().getErrorCount());
//    Assert.assertEquals(1, thisObj.getHeartbeat().getNode().getHeartbeat().getStatus());
//    Assert.assertNull(thisObj.getHeartbeat().getNode().getHeartbeat().getNode());
//    Assert.assertNotNull(thisObj.getHeartbeat().getNode().getConfig());
//    Assert.assertEquals("@", thisObj.getHeartbeat().getNode().getConfig().getName());
//    Assert.assertEquals(-1, thisObj.getHeartbeat().getNode().getConfig().getWeight());
//    Assert.assertEquals("@", thisObj.getHeartbeat().getNode().getConfig().getHost());
//    Assert.assertEquals(-1, thisObj.getHeartbeat().getNode().getConfig().getPort());
//    Assert.assertEquals("@", thisObj.getHeartbeat().getNode().getName());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void setHeartbeatTimeoutInputPositiveOutputVoid9991575e50ddccb5b50() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);
    final long arg0 = 1L;

    // Act
    thisObj.setHeartbeatTimeout(arg0);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getHeartbeatTimeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPasswordInputNotNullOutputVoid999ced812b9b5a8f3c5() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);
    final String arg0 = "@";

    // Act
    thisObj.setPassword(arg0);

    // Assert side effects
    Assert.assertEquals("@", thisObj.getPassword());

  }

  // Test written by Diffblue Cover
  @Test
  public void setUserInputNotNullOutputVoid999573952c245ce7f68() {

    // Arrange
    final CobarDetector thisObj = new CobarDetector(null);
    final String arg0 = "@";

    // Act
    thisObj.setUser(arg0);

    // Assert side effects
    Assert.assertEquals("@", thisObj.getUser());

  }
}
