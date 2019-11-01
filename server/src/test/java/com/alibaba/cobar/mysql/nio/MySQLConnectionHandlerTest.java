package com.alibaba.cobar.mysql.nio;

import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.mysql.nio.MySQLConnectionHandler;
import com.alibaba.cobar.mysql.nio.handler.CommitNodeHandler;
import com.alibaba.cobar.server.session.NonBlockingSession;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class MySQLConnectionHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void connectionErrorInputNotNullOutputVoid9992bb2b34d42d35283() {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final MySQLConnectionHandler thisObj = new MySQLConnectionHandler(mySQLConnection);
    final Throwable arg0 = new Throwable();

    // Act
    thisObj.connectionError(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull9997b19869c324cea2a() {
//
//    // Arrange
//    final MySQLConnection arg0 = new MySQLConnection(null);
//
//    // Act, creating object to test constructor
//    final MySQLConnectionHandler actual = new MySQLConnectionHandler(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getSource());
//    Assert.assertNull(actual.getSource().getHandshake());
//    Assert.assertNull(actual.getSource().getDbCharset());
//    Assert.assertNull(actual.getSource().getCharset());
//    Assert.assertEquals(1572604603256L, actual.getSource().getLastTime());
//    Assert.assertEquals(0L, actual.getSource().getThreadId());
//    Assert.assertFalse(actual.getSource().isAuthenticated());
//    Assert.assertNull(actual.getSource().getAttachment());
//    Assert.assertTrue(actual.getSource().isAutocommit());
//    Assert.assertNull(actual.getSource().getPool());
//    Assert.assertNull(actual.getSource().getPassword());
//    Assert.assertNull(actual.getSource().getSchema());
//    Assert.assertNull(actual.getSource().getUser());
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getSource(), "isFinishConnect"));
//    Assert.assertEquals(0L, actual.getSource().getIdleTimeout());
//    Assert.assertNull(Reflector.getInstanceField(actual.getSource(), "connector"));
//    Assert.assertEquals(0L, actual.getSource().getId());
//    Assert.assertNull(actual.getSource().getHost());
//    Assert.assertNull(Reflector.getInstanceField(actual.getSource(), "handler"));
//    Assert.assertEquals(0, actual.getSource().getLocalPort());
//    Assert.assertEquals(0, actual.getSource().getPort());
//    Assert.assertEquals(1572604603256L, actual.getSource().getStartupTime());
//    Assert.assertNull(actual.getSource().getProcessor());
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getSource(), "isSocketClosed"));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getSource(), "readBufferOffset"));
//    Assert.assertNull(actual.getSource().getReadBuffer());
//    Assert.assertEquals(0, actual.getSource().getPacketHeaderSize());
//    Assert.assertNotNull(Reflector.getInstanceField(actual.getSource(), "isClosed"));
//    Assert.assertEquals(1572604603256L, actual.getSource().getLastReadTime());
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.getSource(), "isRegistered"));
//    Assert.assertNull(Reflector.getInstanceField(actual.getSource(), "processKey"));
//    Assert.assertNull(actual.getSource().getChannel());
//    Assert.assertEquals(1572604603256L, actual.getSource().getLastWriteTime());
//    Assert.assertEquals(0, actual.getSource().getWriteAttempts());
//    Assert.assertEquals(0L, actual.getSource().getNetInBytes());
//    Assert.assertNotNull(Reflector.getInstanceField(actual.getSource(), "keyLock"));
//    Assert.assertEquals(0, actual.getSource().getMaxPacketSize());
//    Assert.assertNotNull(Reflector.getInstanceField(actual.getSource(), "writeLock"));
//    Assert.assertEquals(0L, actual.getSource().getNetOutBytes());
//    Assert.assertNull(actual.getSource().getWriteQueue());
//    Assert.assertNotNull(Reflector.getInstanceField(actual, "dataQueue"));
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(Reflector.getInstanceField(actual, "dataQueue"), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(actual, "dataQueue"), "size"));
//    Assert.assertNotNull(Reflector.getInstanceField(actual, "isHandling"));
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getSourceOutputNotNull9991f3902e2af6d0f44() {
//
//    // Arrange
//    final MySQLConnection mySQLConnection = new MySQLConnection(null);
//    final MySQLConnectionHandler thisObj = new MySQLConnectionHandler(mySQLConnection);
//
//    // Act
//    final MySQLConnection actual = thisObj.getSource();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.getHandshake());
//    Assert.assertNull(actual.getDbCharset());
//    Assert.assertNull(actual.getCharset());
//    Assert.assertEquals(1572604606756L, actual.getLastTime());
//    Assert.assertEquals(0L, actual.getThreadId());
//    Assert.assertFalse(actual.isAuthenticated());
//    Assert.assertNull(actual.getAttachment());
//    Assert.assertTrue(actual.isAutocommit());
//    Assert.assertNull(actual.getPool());
//    Assert.assertNull(actual.getPassword());
//    Assert.assertNull(actual.getSchema());
//    Assert.assertNull(actual.getUser());
//    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual, "isFinishConnect"));
//    Assert.assertEquals(0L, actual.getIdleTimeout());
//    Assert.assertNull(Reflector.getInstanceField(actual, "connector"));
//    Assert.assertEquals(0L, actual.getId());
//    Assert.assertNull(actual.getHost());
//    Assert.assertNull(Reflector.getInstanceField(actual, "handler"));
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
  public void handleDataErrorInputNotNullOutputNullPointerException999879b20401957ea9e() {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final MySQLConnectionHandler thisObj = new MySQLConnectionHandler(mySQLConnection);
    final Throwable arg0 = new Throwable();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.handleDataError(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void handleDataInput24OutputNullPointerException999ed197de19e480f18() {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final MySQLConnectionHandler thisObj = new MySQLConnectionHandler(mySQLConnection);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.handleData(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInput24OutputNullPointerException9995083123859bacbe7() {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final MySQLConnectionHandler thisObj = new MySQLConnectionHandler(mySQLConnection);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.handle(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void offerDataErrorOutputRuntimeException99997fbb943c46fcd40() {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final MySQLConnectionHandler thisObj = new MySQLConnectionHandler(mySQLConnection);

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.offerDataError();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setResponseHandlerInputNotNullOutputVoid9993b2256afea079782() {

    // Arrange
    final MySQLConnection mySQLConnection = new MySQLConnection(null);
    final MySQLConnectionHandler thisObj = new MySQLConnectionHandler(mySQLConnection);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler arg0 = new CommitNodeHandler(nonBlockingSession);

    // Act
    thisObj.setResponseHandler(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
