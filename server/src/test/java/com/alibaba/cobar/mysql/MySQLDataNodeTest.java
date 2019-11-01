package com.alibaba.cobar.mysql;

import com.alibaba.cobar.config.model.DataNodeConfig;
import com.alibaba.cobar.config.model.DataSourceConfig;
import com.alibaba.cobar.mysql.MySQLDataNode;
import com.alibaba.cobar.mysql.MySQLDataSource;
import com.alibaba.cobar.mysql.nio.MySQLConnectionPool;
import com.alibaba.cobar.mysql.nio.handler.CommitNodeHandler;
import com.alibaba.cobar.server.session.NonBlockingSession;
import com.alibaba.cobar.statistic.SQLRecord;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class MySQLDataNodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999c7445e948aa73e4d() {

    // Arrange
    final DataNodeConfig arg0 = new DataNodeConfig();

    // Act, creating object to test constructor
    final MySQLDataNode actual = new MySQLDataNode(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1L, actual.getHeartbeatRecoveryTime());
    Assert.assertEquals(0, actual.getActivedIndex());
    Assert.assertNull(actual.getSources());
    Assert.assertFalse(actual.isInitSuccess());
    Assert.assertNull(actual.getDataSources());
    Assert.assertNotNull(actual.getConfig());
    Assert.assertEquals(600000L, actual.getConfig().getIdleTimeout());
    Assert.assertEquals(10000L, actual.getConfig().getWaitTimeout());
    Assert.assertEquals(30000L, actual.getConfig().getHeartbeatTimeout());
    Assert.assertEquals(128, actual.getConfig().getPoolSize());
    Assert.assertNull(actual.getConfig().getName());
    Assert.assertNull(actual.getConfig().getDataSource());
    Assert.assertNull(actual.getConfig().getHeartbeatSQL());
    Assert.assertEquals(10, actual.getConfig().getHeartbeatRetry());
    Assert.assertEquals(0L, actual.getExecuteCount());
    Assert.assertNull(actual.getName());

  }

  // Test written by Diffblue Cover
  @Test
  public void doHeartbeatOutputVoid999bd46606d95f47770() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    thisObj.doHeartbeat();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getActivedIndexOutputZero999413b66836a65654d() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    final int actual = thisObj.getActivedIndex();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getChannelOutputIllegalArgumentException9991106166ab41600dc() throws Exception {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.getChannel();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getChannelInputZeroOutputIllegalArgumentException999eabb50fb31469ab9() throws Exception {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);
    final int arg0 = 0;

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.getChannel(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getConfigOutputNotNull9990de1806ab03d9b60() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    final DataNodeConfig actual = thisObj.getConfig();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(600000L, actual.getIdleTimeout());
    Assert.assertEquals(10000L, actual.getWaitTimeout());
    Assert.assertEquals(30000L, actual.getHeartbeatTimeout());
    Assert.assertEquals(128, actual.getPoolSize());
    Assert.assertNull(actual.getName());
    Assert.assertNull(actual.getDataSource());
    Assert.assertNull(actual.getHeartbeatSQL());
    Assert.assertEquals(10, actual.getHeartbeatRetry());

  }

  // Test written by Diffblue Cover
  @Test
  public void getConnectionInputNotNullNotNullZeroOutputIllegalArgumentException999378ad001e325713a() throws Exception {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler arg0 = new CommitNodeHandler(nonBlockingSession);
    final Object arg1 = " init success";
    final int arg2 = 0;

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.getConnection(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getConnectionInputNotNullNotNullOutputIllegalArgumentException99966783650ff54de43() throws Exception {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);
    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
    final CommitNodeHandler arg0 = new CommitNodeHandler(nonBlockingSession);
    final Object arg1 = " init success";

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.getConnection(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataSourcesOutputVoid999ccd5f757b35b64f1() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    final MySQLConnectionPool[] actual = thisObj.getDataSources();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getExecuteCountOutputZero999f65f948adf051574() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    final long actual = thisObj.getExecuteCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeartbeatRecoveryTimeOutputNegative9994fc0ece1b21a1e03() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    final long actual = thisObj.getHeartbeatRecoveryTime();

    // Assert result
    Assert.assertEquals(-1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeartbeatSQLOutputVoid9990ba8181176ee2471() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    final String actual = thisObj.getHeartbeatSQL();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeartbeatOutputNullPointerException999701cb1111c19307f() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getHeartbeat();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputVoid999d282a7326b39ecce() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    final String actual = thisObj.getName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSourceOutputNullPointerException99933b53fea540d80cf() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getSource();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSourcesOutputVoid9993fb3d6c986d8e302() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    final MySQLDataSource[] actual = thisObj.getSources();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void idleCheckOutputNullPointerException9995e835fe7f0131246() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.idleCheck();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void initInputZeroZeroOutputNullPointerException9994ef8234c9f5f35d1() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);
    final int arg0 = 0;
    final int arg1 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.init(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isInitSuccessOutputFalse9998eded6a1839961e9() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    final boolean actual = thisObj.isInitSuccess();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void nextInputZeroOutputNullPointerException99934fee7e5cf23397a() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);
    final int arg0 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.next(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataSourcesInput3OutputVoid999cdf90ab2a364fa3c() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);
    final DataNodeConfig dataNodeConfig1 = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig1);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLConnectionPool mySQLConnectionPool = new MySQLConnectionPool(mySQLDataNode, 0, dataSourceConfig, 0);
    final DataNodeConfig dataNodeConfig2 = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode1 = new MySQLDataNode(dataNodeConfig2);
    final DataSourceConfig dataSourceConfig1 = new DataSourceConfig();
    final MySQLConnectionPool mySQLConnectionPool1 = new MySQLConnectionPool(mySQLDataNode1, 0, dataSourceConfig1, 0);
    final MySQLConnectionPool mySQLConnectionPool2 = new MySQLConnectionPool(thisObj, 0, dataSourceConfig1, 0);
    final MySQLConnectionPool[] arg0 = { mySQLConnectionPool, mySQLConnectionPool1, mySQLConnectionPool2 };

    // Act
    thisObj.setDataSources(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getDataSources());
    Assert.assertEquals(3, thisObj.getDataSources().length);
    Assert.assertNotNull(thisObj.getDataSources()[0]);
    Assert.assertEquals(0, thisObj.getDataSources()[0].getIndex());
    Assert.assertNotNull(thisObj.getDataSources()[0].getConfig());
    Assert.assertEquals(0, thisObj.getDataSources()[0].getConfig().getPort());
    Assert.assertNull(thisObj.getDataSources()[0].getConfig().getSqlMode());
    Assert.assertNull(thisObj.getDataSources()[0].getConfig().getPassword());
    Assert.assertNull(thisObj.getDataSources()[0].getConfig().getType());
    Assert.assertNull(thisObj.getDataSources()[0].getConfig().getName());
    Assert.assertNull(thisObj.getDataSources()[0].getConfig().getHost());
    Assert.assertEquals(10, thisObj.getDataSources()[0].getConfig().getSqlRecordCount());
    Assert.assertNull(thisObj.getDataSources()[0].getConfig().getDatabase());
    Assert.assertNull(thisObj.getDataSources()[0].getConfig().getUser());
    Assert.assertNull(thisObj.getDataSources()[0].getName());
    Assert.assertNotNull(thisObj.getDataSources()[0].getSqlRecorder());
    Assert.assertArrayEquals(new SQLRecord[]{ null, null, null, null, null, null, null, null, null, null }, thisObj.getDataSources()[0].getSqlRecorder().getRecords());
    Assert.assertNotNull(thisObj.getDataSources()[1]);
    Assert.assertEquals(0, thisObj.getDataSources()[1].getIndex());
    Assert.assertNotNull(thisObj.getDataSources()[1].getConfig());
    Assert.assertEquals(0, thisObj.getDataSources()[1].getConfig().getPort());
    Assert.assertNull(thisObj.getDataSources()[1].getConfig().getSqlMode());
    Assert.assertNull(thisObj.getDataSources()[1].getConfig().getPassword());
    Assert.assertNull(thisObj.getDataSources()[1].getConfig().getType());
    Assert.assertNull(thisObj.getDataSources()[1].getConfig().getName());
    Assert.assertNull(thisObj.getDataSources()[1].getConfig().getHost());
    Assert.assertEquals(10, thisObj.getDataSources()[1].getConfig().getSqlRecordCount());
    Assert.assertNull(thisObj.getDataSources()[1].getConfig().getDatabase());
    Assert.assertNull(thisObj.getDataSources()[1].getConfig().getUser());
    Assert.assertNull(thisObj.getDataSources()[1].getName());
    Assert.assertNotNull(thisObj.getDataSources()[1].getSqlRecorder());
    Assert.assertArrayEquals(new SQLRecord[]{ null, null, null, null, null, null, null, null, null, null }, thisObj.getDataSources()[1].getSqlRecorder().getRecords());
    Assert.assertNotNull(thisObj.getDataSources()[2]);
    Assert.assertEquals(0, thisObj.getDataSources()[2].getIndex());
    Assert.assertEquals(thisObj.getDataSources()[1].getConfig(), thisObj.getDataSources()[2].getConfig());
    Assert.assertNull(thisObj.getDataSources()[2].getName());
    Assert.assertNotNull(thisObj.getDataSources()[2].getSqlRecorder());
    Assert.assertArrayEquals(new SQLRecord[]{ null, null, null, null, null, null, null, null, null, null }, thisObj.getDataSources()[2].getSqlRecorder().getRecords());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeartbeatRecoveryTimeInputNegativeOutputVoid999a70b0931386635e4() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);
    final long arg0 = -1L;

    // Act
    thisObj.setHeartbeatRecoveryTime(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void setSourcesInput3OutputVoid999458b1057130807b3() {
//
//    // Arrange
//    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
//    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);
//    final DataNodeConfig dataNodeConfig1 = new DataNodeConfig();
//    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig1);
//    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
//    final MySQLDataSource mySQLDataSource = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);
//    final DataNodeConfig dataNodeConfig2 = new DataNodeConfig();
//    final MySQLDataNode mySQLDataNode1 = new MySQLDataNode(dataNodeConfig2);
//    final DataSourceConfig dataSourceConfig1 = new DataSourceConfig();
//    final MySQLDataSource mySQLDataSource1 = new MySQLDataSource(mySQLDataNode1, 0, dataSourceConfig1, 0);
//    final MySQLDataSource mySQLDataSource2 = new MySQLDataSource(thisObj, 0, dataSourceConfig1, 0);
//    final MySQLDataSource[] arg0 = { mySQLDataSource, mySQLDataSource1, mySQLDataSource2 };
//
//    // Act
//    thisObj.setSources(arg0);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getSources());
//    Assert.assertEquals(3, thisObj.getSources().length);
//    Assert.assertNotNull(thisObj.getSources()[0]);
//    Assert.assertNull(thisObj.getSources()[0].getName());
//    Assert.assertEquals(0, thisObj.getSources()[0].getIdleCount());
//    Assert.assertEquals(0, thisObj.getSources()[0].getIndex());
//    Assert.assertNotNull(thisObj.getSources()[0].getConfig());
//    Assert.assertEquals(0, thisObj.getSources()[0].getConfig().getPort());
//    Assert.assertNull(thisObj.getSources()[0].getConfig().getSqlMode());
//    Assert.assertNull(thisObj.getSources()[0].getConfig().getPassword());
//    Assert.assertNull(thisObj.getSources()[0].getConfig().getType());
//    Assert.assertNull(thisObj.getSources()[0].getConfig().getName());
//    Assert.assertNull(thisObj.getSources()[0].getConfig().getHost());
//    Assert.assertEquals(10, thisObj.getSources()[0].getConfig().getSqlRecordCount());
//    Assert.assertNull(thisObj.getSources()[0].getConfig().getDatabase());
//    Assert.assertNull(thisObj.getSources()[0].getConfig().getUser());
//    Assert.assertNotNull(thisObj.getSources()[0].getHeartbeat());
//    Assert.assertEquals(0, thisObj.getSources()[0].getHeartbeat().getErrorCount());
//    Assert.assertEquals(0, thisObj.getSources()[0].getHeartbeat().getStatus());
//    Assert.assertNull(thisObj.getSources()[0].getHeartbeat().getDetector());
//    Assert.assertNotNull(thisObj.getSources()[0].getHeartbeat().getRecorder());
//    Assert.assertNull(thisObj.getSources()[0].getHeartbeat().getSource());
//    Assert.assertNotNull(thisObj.getSources()[0].getNode());
//    Assert.assertEquals(-1L, thisObj.getSources()[0].getNode().getHeartbeatRecoveryTime());
//    Assert.assertEquals(0, thisObj.getSources()[0].getNode().getActivedIndex());
//    Assert.assertNull(thisObj.getSources()[0].getNode().getSources());
//    Assert.assertFalse(thisObj.getSources()[0].getNode().isInitSuccess());
//    Assert.assertNull(thisObj.getSources()[0].getNode().getDataSources());
//    Assert.assertNotNull(thisObj.getSources()[0].getNode().getConfig());
//    Assert.assertEquals(600000L, thisObj.getSources()[0].getNode().getConfig().getIdleTimeout());
//    Assert.assertEquals(10000L, thisObj.getSources()[0].getNode().getConfig().getWaitTimeout());
//    Assert.assertEquals(30000L, thisObj.getSources()[0].getNode().getConfig().getHeartbeatTimeout());
//    Assert.assertEquals(128, thisObj.getSources()[0].getNode().getConfig().getPoolSize());
//    Assert.assertNull(thisObj.getSources()[0].getNode().getConfig().getName());
//    Assert.assertNull(thisObj.getSources()[0].getNode().getConfig().getDataSource());
//    Assert.assertNull(thisObj.getSources()[0].getNode().getConfig().getHeartbeatSQL());
//    Assert.assertEquals(10, thisObj.getSources()[0].getNode().getConfig().getHeartbeatRetry());
//    Assert.assertEquals(0L, thisObj.getSources()[0].getNode().getExecuteCount());
//    Assert.assertNull(thisObj.getSources()[0].getNode().getName());
//    Assert.assertEquals(0, thisObj.getSources()[0].size());
//    Assert.assertEquals(0, thisObj.getSources()[0].getActiveCount());
//    Assert.assertNotNull(thisObj.getSources()[0].getSqlRecorder());
//    Assert.assertArrayEquals(new SQLRecord[]{ null, null, null, null, null, null, null, null, null, null }, thisObj.getSources()[0].getSqlRecorder().getRecords());
//    Assert.assertNotNull(thisObj.getSources()[1]);
//    Assert.assertNull(thisObj.getSources()[1].getName());
//    Assert.assertEquals(0, thisObj.getSources()[1].getIdleCount());
//    Assert.assertEquals(0, thisObj.getSources()[1].getIndex());
//    Assert.assertNotNull(thisObj.getSources()[1].getConfig());
//    Assert.assertEquals(0, thisObj.getSources()[1].getConfig().getPort());
//    Assert.assertNull(thisObj.getSources()[1].getConfig().getSqlMode());
//    Assert.assertNull(thisObj.getSources()[1].getConfig().getPassword());
//    Assert.assertNull(thisObj.getSources()[1].getConfig().getType());
//    Assert.assertNull(thisObj.getSources()[1].getConfig().getName());
//    Assert.assertNull(thisObj.getSources()[1].getConfig().getHost());
//    Assert.assertEquals(10, thisObj.getSources()[1].getConfig().getSqlRecordCount());
//    Assert.assertNull(thisObj.getSources()[1].getConfig().getDatabase());
//    Assert.assertNull(thisObj.getSources()[1].getConfig().getUser());
//    Assert.assertNotNull(thisObj.getSources()[1].getHeartbeat());
//    Assert.assertEquals(0, thisObj.getSources()[1].getHeartbeat().getErrorCount());
//    Assert.assertEquals(0, thisObj.getSources()[1].getHeartbeat().getStatus());
//    Assert.assertNull(thisObj.getSources()[1].getHeartbeat().getDetector());
//    Assert.assertNotNull(thisObj.getSources()[1].getHeartbeat().getRecorder());
//    Assert.assertNull(thisObj.getSources()[1].getHeartbeat().getSource());
//    Assert.assertNotNull(thisObj.getSources()[1].getNode());
//    Assert.assertEquals(-1L, thisObj.getSources()[1].getNode().getHeartbeatRecoveryTime());
//    Assert.assertEquals(0, thisObj.getSources()[1].getNode().getActivedIndex());
//    Assert.assertNull(thisObj.getSources()[1].getNode().getSources());
//    Assert.assertFalse(thisObj.getSources()[1].getNode().isInitSuccess());
//    Assert.assertNull(thisObj.getSources()[1].getNode().getDataSources());
//    Assert.assertNotNull(thisObj.getSources()[1].getNode().getConfig());
//    Assert.assertEquals(600000L, thisObj.getSources()[1].getNode().getConfig().getIdleTimeout());
//    Assert.assertEquals(10000L, thisObj.getSources()[1].getNode().getConfig().getWaitTimeout());
//    Assert.assertEquals(30000L, thisObj.getSources()[1].getNode().getConfig().getHeartbeatTimeout());
//    Assert.assertEquals(128, thisObj.getSources()[1].getNode().getConfig().getPoolSize());
//    Assert.assertNull(thisObj.getSources()[1].getNode().getConfig().getName());
//    Assert.assertNull(thisObj.getSources()[1].getNode().getConfig().getDataSource());
//    Assert.assertNull(thisObj.getSources()[1].getNode().getConfig().getHeartbeatSQL());
//    Assert.assertEquals(10, thisObj.getSources()[1].getNode().getConfig().getHeartbeatRetry());
//    Assert.assertEquals(0L, thisObj.getSources()[1].getNode().getExecuteCount());
//    Assert.assertNull(thisObj.getSources()[1].getNode().getName());
//    Assert.assertEquals(0, thisObj.getSources()[1].size());
//    Assert.assertEquals(0, thisObj.getSources()[1].getActiveCount());
//    Assert.assertNotNull(thisObj.getSources()[1].getSqlRecorder());
//    Assert.assertArrayEquals(new SQLRecord[]{ null, null, null, null, null, null, null, null, null, null }, thisObj.getSources()[1].getSqlRecorder().getRecords());
//    Assert.assertNotNull(thisObj.getSources()[2]);
//    Assert.assertNull(thisObj.getSources()[2].getName());
//    Assert.assertEquals(0, thisObj.getSources()[2].getIdleCount());
//    Assert.assertEquals(0, thisObj.getSources()[2].getIndex());
//    Assert.assertEquals(thisObj.getSources()[1].getConfig(), thisObj.getSources()[2].getConfig());
//    Assert.assertNotNull(thisObj.getSources()[2].getHeartbeat());
//    Assert.assertEquals(0, thisObj.getSources()[2].getHeartbeat().getErrorCount());
//    Assert.assertEquals(0, thisObj.getSources()[2].getHeartbeat().getStatus());
//    Assert.assertNull(thisObj.getSources()[2].getHeartbeat().getDetector());
//    Assert.assertNotNull(thisObj.getSources()[2].getHeartbeat().getRecorder());
//    Assert.assertNull(thisObj.getSources()[2].getHeartbeat().getSource());
//    Assert.assertNull(thisObj.getSources()[2].getNode());
//    Assert.assertEquals(0, thisObj.getSources()[2].size());
//    Assert.assertEquals(0, thisObj.getSources()[2].getActiveCount());
//    Assert.assertNotNull(thisObj.getSources()[2].getSqlRecorder());
//    Assert.assertArrayEquals(new SQLRecord[]{ null, null, null, null, null, null, null, null, null, null }, thisObj.getSources()[2].getSqlRecorder().getRecords());
//    Assert.assertNotNull(arg0);
//    Assert.assertEquals(3, arg0.length);
//    Assert.assertEquals(thisObj.getSources()[0], arg0[0]);
//    Assert.assertEquals(thisObj.getSources()[1], arg0[1]);
//    Assert.assertEquals(thisObj.getSources()[2], arg0[2]);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void startHeartbeatOutputNullPointerException999771b2f131e99fa6a() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.startHeartbeat();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stopHeartbeatOutputNullPointerException9997fbced2a7080144a() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.stopHeartbeat();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void switchSourceInputZeroTrueNotNullOutputNullPointerException999265e55270f6c8a65() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode thisObj = new MySQLDataNode(dataNodeConfig);
    final int arg0 = 0;
    final boolean arg1 = true;
    final String arg2 = " init success";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.switchSource(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
