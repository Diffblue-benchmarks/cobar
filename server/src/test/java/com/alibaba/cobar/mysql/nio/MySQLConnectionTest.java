package com.alibaba.cobar.mysql.nio;

import com.alibaba.cobar.config.model.DataNodeConfig;
import com.alibaba.cobar.config.model.DataSourceConfig;
import com.alibaba.cobar.mysql.MySQLDataNode;
import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.mysql.nio.MySQLConnectionPool;
import com.alibaba.cobar.mysql.nio.handler.CommitNodeHandler;
import com.alibaba.cobar.net.mysql.HandshakePacket;
import com.alibaba.cobar.route.RouteResultsetNode;
import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.session.NonBlockingSession;
import com.alibaba.cobar.statistic.SQLRecord;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.channels.SocketChannel;



public class MySQLConnectionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void authenticateOutputNullPointerException9995783c00fff2c24ef() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.authenticate();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void closeOutputNullPointerException999d3a226ba882b3423() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.close();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void commitOutputNullPointerException999da4156b8365f0a4c() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.commit();

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNullOutputNotNull99995f61bbb58b306f4() {
//
//    // Arrange
//    final SocketChannel arg0 = null;
//
//    // Act, creating object to test constructor
//    final MySQLConnection actual = new MySQLConnection(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.getHandshake());
//    Assert.assertNull(actual.getDbCharset());
//    Assert.assertNull(actual.getCharset());
//    Assert.assertEquals(1572604603256L, actual.getLastTime());
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
  public void errorInputZeroNotNullOutputNullPointerException999a787a65c8e29cbdf() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final int arg0 = 0;
    final Throwable arg1 = new Throwable();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.error(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNullNullTrueOutputNullPointerException9994abb8825147e2406() throws UnsupportedEncodingException {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final RouteResultsetNode arg0 = new RouteResultsetNode("SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED", "SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED");
    final ServerConnection arg1 = null;
    final boolean arg2 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getAttachmentOutputVoid99994f5649d20f199b1() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final Object actual = thisObj.getAttachment();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharsetOutputVoid9992aeb71f111160c8a() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final String actual = thisObj.getCharset();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDbCharsetOutputVoid999fbaafa028bf4fd79() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final String actual = thisObj.getDbCharset();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHandshakeOutputVoid999debaa3388bb89c93() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final HandshakePacket actual = thisObj.getHandshake();

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getLastTimeOutputPositive999c5bd144cf18a4745() {
//
//    // Arrange
//    final MySQLConnection thisObj = new MySQLConnection(null);
//
//    // Act
//    final long actual = thisObj.getLastTime();
//
//    // Assert result
//    Assert.assertEquals(1572604606756L, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getPasswordOutputVoid999b3d75e0e35421d3c() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final String actual = thisObj.getPassword();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPoolOutputVoid9997815481ee52c9ce1() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final MySQLConnectionPool actual = thisObj.getPool();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSchemaOutputVoid999172af4933c367898() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final String actual = thisObj.getSchema();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getThreadIdOutputZero999a980d3aad2aec032() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final long actual = thisObj.getThreadId();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getUserOutputVoid9992f25296962f751fa() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final String actual = thisObj.getUser();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isAuthenticatedOutputFalse9992a5c615e9d632199() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final boolean actual = thisObj.isAuthenticated();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isAutocommitOutputTrue9998718df91ac66b764() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final boolean actual = thisObj.isAutocommit();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isClosedOrQuitOutputFalse999ad2e8b9cebc532fc() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final boolean actual = thisObj.isClosedOrQuit();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isRunningOutputFalse999bac5333060593802() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    final boolean actual = thisObj.isRunning();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void quitOutputNullPointerException999f29be89be0390c80() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.quit();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordSqlInputNotNullNotNullNotNullOutputVoid999ce180e3e00993b19() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final String arg0 = "SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED";
    final String arg1 = "SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED";
    final String arg2 = "SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED";

    // Act
    thisObj.recordSql(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void releaseOutputNullPointerException99970fd1068cf1fd99e() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.release();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rollbackOutputNullPointerException999a28bc04b6b83a055() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rollback();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAttachmentInputNotNullOutputVoid999df8d091d91f86397() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final Object arg0 = "SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED";

    // Act
    thisObj.setAttachment(arg0);

    // Assert side effects
    Assert.assertEquals("SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED", thisObj.getAttachment());

  }

  // Test written by Diffblue Cover
  @Test
  public void setAuthenticatedInputTrueOutputVoid999c55e9bc812a0853c() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final boolean arg0 = true;

    // Act
    thisObj.setAuthenticated(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isAuthenticated());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharsetIndexInputZeroOutputVoid99982279576628421d3() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final int arg0 = 0;

    // Act
    thisObj.setCharsetIndex(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharsetInputNotNullOutputVoid999207e324ed32a4737() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final String arg0 = "SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED";

    // Act
    thisObj.setCharset(arg0);

    // Assert side effects
    Assert.assertEquals("SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED", thisObj.getCharset());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDbCharsetInputNotNullOutputVoid9993e96f91a244bf1ee() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final String arg0 = "SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED";

    // Act
    thisObj.setDbCharset(arg0);

    // Assert side effects
    Assert.assertEquals("SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED", thisObj.getDbCharset());

  }

  // Test written by Diffblue Cover
  @Test
  public void setLastTimeInputPositiveOutputVoid999439f45725639168f() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final long arg0 = 1L;

    // Act
    thisObj.setLastTime(arg0);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getLastTime());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPasswordInputNotNullOutputVoid999feec8a097bfe1069() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final String arg0 = "SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED";

    // Act
    thisObj.setPassword(arg0);

    // Assert side effects
    Assert.assertEquals("SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED", thisObj.getPassword());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPoolInputNotNullOutputVoid999e6d859a57018ad23() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLConnectionPool arg0 = new MySQLConnectionPool(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    thisObj.setPool(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getPool());
    Assert.assertEquals(0, thisObj.getPool().getIndex());
    Assert.assertNotNull(thisObj.getPool().getConfig());
    Assert.assertEquals(0, thisObj.getPool().getConfig().getPort());
    Assert.assertNull(thisObj.getPool().getConfig().getSqlMode());
    Assert.assertNull(thisObj.getPool().getConfig().getPassword());
    Assert.assertNull(thisObj.getPool().getConfig().getType());
    Assert.assertNull(thisObj.getPool().getConfig().getName());
    Assert.assertNull(thisObj.getPool().getConfig().getHost());
    Assert.assertEquals(10, thisObj.getPool().getConfig().getSqlRecordCount());
    Assert.assertNull(thisObj.getPool().getConfig().getDatabase());
    Assert.assertNull(thisObj.getPool().getConfig().getUser());
    Assert.assertNull(thisObj.getPool().getName());
    Assert.assertNotNull(thisObj.getPool().getSqlRecorder());
    Assert.assertArrayEquals(new SQLRecord[]{ null, null, null, null, null, null, null, null, null, null }, thisObj.getPool().getSqlRecorder().getRecords());

  }

  // Test written by Diffblue Cover
  @Test
  public void setResponseHandlerInputNotNullOutputFalse999f5ed0a93d4b9157e() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler arg0 = new CommitNodeHandler(nonBlockingSession);

    // Act
    final boolean actual = thisObj.setResponseHandler(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setRunningInputTrueOutputVoid999462adb85d3f70fb0() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final boolean arg0 = true;

    // Act
    thisObj.setRunning(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setSchemaInputNotNullOutputVoid99978b1e68f0d940035() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final String arg0 = "SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED";

    // Act
    thisObj.setSchema(arg0);

    // Assert side effects
    Assert.assertEquals("SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED", thisObj.getSchema());

  }

  // Test written by Diffblue Cover
  @Test
  public void setThreadIdInputPositiveOutputVoid999bbda4caa59fe94c8() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final long arg0 = 1L;

    // Act
    thisObj.setThreadId(arg0);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getThreadId());

  }

  // Test written by Diffblue Cover
  @Test
  public void setUserInputNotNullOutputVoid9997501de6aaae9d7e4() {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);
    final String arg0 = "SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED";

    // Act
    thisObj.setUser(arg0);

    // Assert side effects
    Assert.assertEquals("SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED", thisObj.getUser());

  }

  // Test written by Diffblue Cover
  @Test
  public void syncAndExcuteOutputNullPointerException9994d815f79747c728c() throws UnsupportedEncodingException {

    // Arrange
    final MySQLConnection thisObj = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.syncAndExcute();

    // The method is not expected to return due to exception thrown

  }
}
