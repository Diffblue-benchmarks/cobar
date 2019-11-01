package com.alibaba.cobar.mysql;

import com.alibaba.cobar.config.model.DataNodeConfig;
import com.alibaba.cobar.config.model.DataSourceConfig;
import com.alibaba.cobar.heartbeat.MySQLHeartbeat;
import com.alibaba.cobar.mysql.MySQLDataNode;
import com.alibaba.cobar.mysql.MySQLDataSource;
import com.alibaba.cobar.mysql.bio.MySQLChannel;
import com.alibaba.cobar.statistic.SQLRecord;
import com.alibaba.cobar.statistic.SQLRecorder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class MySQLDataSourceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void clearOutputVoid999289fc0754ea74a24() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    thisObj.clear();

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullZeroNotNullZeroOutputNotNull9993ce680cfef38704e() {
//
//    // Arrange
//    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
//    final MySQLDataNode arg0 = new MySQLDataNode(dataNodeConfig);
//    final int arg1 = 0;
//    final DataSourceConfig arg2 = new DataSourceConfig();
//    final int arg3 = 0;
//
//    // Act, creating object to test constructor
//    final MySQLDataSource actual = new MySQLDataSource(arg0, arg1, arg2, arg3);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.getName());
//    Assert.assertEquals(0, actual.getIdleCount());
//    Assert.assertEquals(0, actual.getIndex());
//    Assert.assertNotNull(actual.getConfig());
//    Assert.assertEquals(0, actual.getConfig().getPort());
//    Assert.assertNull(actual.getConfig().getSqlMode());
//    Assert.assertNull(actual.getConfig().getPassword());
//    Assert.assertNull(actual.getConfig().getType());
//    Assert.assertNull(actual.getConfig().getName());
//    Assert.assertNull(actual.getConfig().getHost());
//    Assert.assertEquals(10, actual.getConfig().getSqlRecordCount());
//    Assert.assertNull(actual.getConfig().getDatabase());
//    Assert.assertNull(actual.getConfig().getUser());
//    Assert.assertNotNull(actual.getHeartbeat());
//    Assert.assertEquals(0, actual.getHeartbeat().getErrorCount());
//    Assert.assertEquals(0, actual.getHeartbeat().getStatus());
//    Assert.assertNull(actual.getHeartbeat().getDetector());
//    Assert.assertNotNull(actual.getHeartbeat().getRecorder());
//    Assert.assertNull(actual.getHeartbeat().getSource());
//    Assert.assertNotNull(actual.getNode());
//    Assert.assertEquals(-1L, actual.getNode().getHeartbeatRecoveryTime());
//    Assert.assertEquals(0, actual.getNode().getActivedIndex());
//    Assert.assertNull(actual.getNode().getSources());
//    Assert.assertFalse(actual.getNode().isInitSuccess());
//    Assert.assertNull(actual.getNode().getDataSources());
//    Assert.assertNotNull(actual.getNode().getConfig());
//    Assert.assertEquals(600000L, actual.getNode().getConfig().getIdleTimeout());
//    Assert.assertEquals(10000L, actual.getNode().getConfig().getWaitTimeout());
//    Assert.assertEquals(30000L, actual.getNode().getConfig().getHeartbeatTimeout());
//    Assert.assertEquals(128, actual.getNode().getConfig().getPoolSize());
//    Assert.assertNull(actual.getNode().getConfig().getName());
//    Assert.assertNull(actual.getNode().getConfig().getDataSource());
//    Assert.assertNull(actual.getNode().getConfig().getHeartbeatSQL());
//    Assert.assertEquals(10, actual.getNode().getConfig().getHeartbeatRetry());
//    Assert.assertEquals(0L, actual.getNode().getExecuteCount());
//    Assert.assertNull(actual.getNode().getName());
//    Assert.assertEquals(0, actual.size());
//    Assert.assertEquals(0, actual.getActiveCount());
//    Assert.assertNotNull(actual.getSqlRecorder());
//    Assert.assertArrayEquals(new SQLRecord[]{ null, null, null, null, null, null, null, null, null, null }, actual.getSqlRecorder().getRecords());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void deActiveOutputVoid999ee7a13028f1c9cae() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    thisObj.deActive();

    // Assert side effects
    Assert.assertEquals(-1, thisObj.getActiveCount());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void doHeartbeatOutputVoid9999f18e76c86a69d12() {
//
//    // Arrange
//    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
//    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
//    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
//    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);
//
//    // Act
//    thisObj.doHeartbeat();
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getHeartbeat());
//    Assert.assertEquals(0, thisObj.getHeartbeat().getErrorCount());
//    Assert.assertEquals(-1, thisObj.getHeartbeat().getStatus());
//    Assert.assertNull(thisObj.getHeartbeat().getDetector());
//    Assert.assertNotNull(thisObj.getHeartbeat().getRecorder());
//    Assert.assertNull(thisObj.getHeartbeat().getSource());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getActiveCountOutputZero999e4099f45a55391eb() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    final int actual = thisObj.getActiveCount();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getChannelOutputIllegalArgumentException9992d63a8ddfb2e0867() throws Exception {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.getChannel();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getConfigOutputNotNull99928c61439d8cce16b() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    final DataSourceConfig actual = thisObj.getConfig();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getPort());
    Assert.assertNull(actual.getSqlMode());
    Assert.assertNull(actual.getPassword());
    Assert.assertNull(actual.getType());
    Assert.assertNull(actual.getName());
    Assert.assertNull(actual.getHost());
    Assert.assertEquals(10, actual.getSqlRecordCount());
    Assert.assertNull(actual.getDatabase());
    Assert.assertNull(actual.getUser());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getHeartbeatOutputNotNull99982e21df6c52c07dc() {
//
//    // Arrange
//    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
//    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
//    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
//    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);
//
//    // Act
//    final MySQLHeartbeat actual = thisObj.getHeartbeat();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(0, actual.getErrorCount());
//    Assert.assertEquals(0, actual.getStatus());
//    Assert.assertNull(actual.getDetector());
//    Assert.assertNotNull(actual.getRecorder());
//    Assert.assertNull(actual.getSource());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getIdleCountOutputZero999e51525cec376f664() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    final int actual = thisObj.getIdleCount();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getIndexOutputZero99953fe217341b4d2ef() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    final int actual = thisObj.getIndex();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputVoid99932bab92dec46745e() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    final String actual = thisObj.getName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNodeOutputNotNull99903d61b9614f6ae00() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    final MySQLDataNode actual = thisObj.getNode();

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
  public void getSqlRecorderOutputNotNull999a64ce83fe2559a11() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    final SQLRecorder actual = thisObj.getSqlRecorder();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertArrayEquals(new SQLRecord[]{ null, null, null, null, null, null, null, null, null, null }, actual.getRecords());

  }

  // Test written by Diffblue Cover
  @Test
  public void idleCheckInputPositiveOutputVoid9992d7581e080a365ef() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);
    final long arg0 = 1L;

    // Act
    thisObj.idleCheck(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void releaseChannelInputNotNullOutputVoid999b362793f4fc61dd1() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);
    final DataNodeConfig dataNodeConfig1 = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode1 = new MySQLDataNode(dataNodeConfig1);
    final DataSourceConfig dataSourceConfig1 = new DataSourceConfig();
    final MySQLDataSource mySQLDataSource = new MySQLDataSource(mySQLDataNode1, 0, dataSourceConfig1, 0);
    final MySQLChannel arg0 = new MySQLChannel(mySQLDataSource);

    // Act
    thisObj.releaseChannel(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void sizeOutputZero9991f093667c44fe98e() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    final int actual = thisObj.size();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void startHeartbeatOutputVoid999a9a7ce54fafbb705() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    thisObj.startHeartbeat();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stopHeartbeatOutputVoid999d916f78771a44ee4() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLDataSource thisObj = new MySQLDataSource(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    thisObj.stopHeartbeat();

    // The method returns void, testing that no exception is thrown

  }
}
