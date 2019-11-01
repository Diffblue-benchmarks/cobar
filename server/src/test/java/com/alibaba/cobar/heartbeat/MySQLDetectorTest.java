package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.heartbeat.MySQLDetector;
import com.alibaba.cobar.heartbeat.MySQLHeartbeat;
import com.alibaba.cobar.net.mysql.HandshakePacket;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.channels.SocketChannel;



public class MySQLDetectorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void authenticateOutputNullPointerException9997324b97fdd89f788() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.authenticate();

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNullOutputNotNull999f0d4e758c4912344() {
//
//    // Arrange
//    final SocketChannel arg0 = null;
//
//    // Act, creating object to test constructor
//    final MySQLDetector actual = new MySQLDetector(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertFalse(actual.isAuthenticated());
//    Assert.assertNull(actual.getHandshake());
//    Assert.assertEquals(0L, actual.getHeartbeatTimeout());
//    Assert.assertNull(actual.getPassword());
//    Assert.assertNull(actual.getSchema());
//    Assert.assertNull(actual.getHeartbeat());
//    Assert.assertNull(actual.getUser());
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "isFinishConnect"));
//    Assert.assertEquals(0L, actual.getIdleTimeout());
//    Assert.assertNull(Reflector.getInstanceField(actual, "connector"));
//    Assert.assertEquals(0L, actual.getId());
//    Assert.assertNull(actual.getHost());
//    Assert.assertNotNull(Reflector.getInstanceField(actual, "handler"));
//    Assert.assertEquals(0, actual.getLocalPort());
//    Assert.assertEquals(0, actual.getPort());
//    Assert.assertEquals(1572604606756L, actual.getStartupTime());
//    Assert.assertNull(actual.getProcessor());
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "isSocketClosed"));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "readBufferOffset"));
//    Assert.assertNull(actual.getReadBuffer());
//    Assert.assertEquals(0, actual.getPacketHeaderSize());
//    Assert.assertNotNull(Reflector.getInstanceField(actual, "isClosed"));
//    Assert.assertEquals(1572604606756L, actual.getLastReadTime());
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "isRegistered"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "processKey"));
//    Assert.assertNull(actual.getChannel());
//    Assert.assertEquals(1572604606756L, actual.getLastWriteTime());
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
  public void errorInputNegativeNotNullOutputNullPointerException999ce59c4a19cf6a6d8() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);
    final int arg0 = -1;
    final Throwable arg1 = new Throwable();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.error(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHandshakeOutputVoid9997cbc8b68ab905210() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    final HandshakePacket actual = thisObj.getHandshake();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeartbeatOutputVoid999f18bb8fa49600f4b() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    final MySQLHeartbeat actual = thisObj.getHeartbeat();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeartbeatTimeoutOutputZero9997e015f96245cd15a() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    final long actual = thisObj.getHeartbeatTimeout();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPasswordOutputVoid999f20264da7b9f6786() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    final String actual = thisObj.getPassword();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSchemaOutputVoid99918af8588b17ce8a1() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    final String actual = thisObj.getSchema();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUserOutputVoid9992df6a492f3aaa2a2() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    final String actual = thisObj.getUser();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void heartbeatOutputNullPointerException99986a635216dd63a8c() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.heartbeat();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void idleCheckOutputVoid99918f93f0b283d3fea() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    thisObj.idleCheck();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isAuthenticatedOutputFalse99986ccb6b1991239f2() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    final boolean actual = thisObj.isAuthenticated();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isHeartbeatTimeoutOutputFalse999d715b91569e6aa12() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    final boolean actual = thisObj.isHeartbeatTimeout();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isQuitOutputFalse999872749c89eff6224() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    final boolean actual = thisObj.isQuit();

    // Assert result
    Assert.assertFalse(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void lastReadTimeOutputPositive99984ea02a14c6485c3() {
//
//    // Arrange
//    final MySQLDetector thisObj = new MySQLDetector(null);
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
//  public void lastWriteTimeOutputPositive999e65b7ab2280e0db5() {
//
//    // Arrange
//    final MySQLDetector thisObj = new MySQLDetector(null);
//
//    // Act
//    final long actual = thisObj.lastWriteTime();
//
//    // Assert result
//    Assert.assertEquals(1572604606756L, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void quitOutputVoid999b2f158f5afdb7bc8() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);

    // Act
    thisObj.quit();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAuthenticatedInputTrueOutputVoid999e4b352285a4f6aff() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);
    final boolean arg0 = true;

    // Act
    thisObj.setAuthenticated(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isAuthenticated());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharsetIndexInputNegativeOutputVoid9998e0ab5dd71657494() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);
    final int arg0 = -1;

    // Act
    thisObj.setCharsetIndex(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeartbeatInputNotNullOutputVoid99974cd7ad4184d61a7() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);
    final MySQLHeartbeat arg0 = new MySQLHeartbeat(null);

    // Act
    thisObj.setHeartbeat(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getHeartbeat());
    Assert.assertEquals(0, thisObj.getHeartbeat().getErrorCount());
    Assert.assertEquals(0, thisObj.getHeartbeat().getStatus());
    Assert.assertNull(thisObj.getHeartbeat().getDetector());
    Assert.assertNotNull(thisObj.getHeartbeat().getRecorder());
    Assert.assertNull(thisObj.getHeartbeat().getSource());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeartbeatTimeoutInputPositiveOutputVoid99900e9b7ec3bccb08d() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);
    final long arg0 = 1L;

    // Act
    thisObj.setHeartbeatTimeout(arg0);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getHeartbeatTimeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPasswordInputNotNullOutputVoid999cd947b8ed7f22e15() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setPassword(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getPassword());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSchemaInputNotNullOutputVoid9998b03dc9734455794() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setSchema(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getSchema());

  }

  // Test written by Diffblue Cover
  @Test
  public void setUserInputNotNullOutputVoid9993b0d4d685a1b0f0d() {

    // Arrange
    final MySQLDetector thisObj = new MySQLDetector(null);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setUser(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getUser());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void toStringOutputNotNull9993fd1c5a6ed4994ca() {
//
//    // Arrange
//    final MySQLDetector thisObj = new MySQLDetector(null);
//
//    // Act
//    final String actual = thisObj.toString();
//
//    // Assert result
//    Assert.assertEquals("[thread=pool-1-thread-1,class=MySQLDetector,host=null,port=0,localPort=0,schema=null]", actual);
//
//  }
}
