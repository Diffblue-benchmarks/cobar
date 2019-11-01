package com.alibaba.cobar.mysql.nio;

import com.alibaba.cobar.config.model.DataNodeConfig;
import com.alibaba.cobar.config.model.DataSourceConfig;
import com.alibaba.cobar.mysql.MySQLDataNode;
import com.alibaba.cobar.mysql.nio.MySQLConnection;
import com.alibaba.cobar.mysql.nio.MySQLConnectionPool;
import com.alibaba.cobar.mysql.nio.handler.CommitNodeHandler;
import com.alibaba.cobar.server.session.NonBlockingSession;
import com.alibaba.cobar.statistic.SQLRecord;
import com.alibaba.cobar.statistic.SQLRecorder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class MySQLConnectionPoolTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullZeroNotNullZeroOutputNotNull999abe1008ad1bee68f() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode arg0 = new MySQLDataNode(dataNodeConfig);
    final int arg1 = 0;
    final DataSourceConfig arg2 = new DataSourceConfig();
    final int arg3 = 0;

    // Act, creating object to test constructor
    final MySQLConnectionPool actual = new MySQLConnectionPool(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getIndex());
    Assert.assertNotNull(actual.getConfig());
    Assert.assertEquals(0, actual.getConfig().getPort());
    Assert.assertNull(actual.getConfig().getSqlMode());
    Assert.assertNull(actual.getConfig().getPassword());
    Assert.assertNull(actual.getConfig().getType());
    Assert.assertNull(actual.getConfig().getName());
    Assert.assertNull(actual.getConfig().getHost());
    Assert.assertEquals(10, actual.getConfig().getSqlRecordCount());
    Assert.assertNull(actual.getConfig().getDatabase());
    Assert.assertNull(actual.getConfig().getUser());
    Assert.assertNull(actual.getName());
    Assert.assertNotNull(actual.getSqlRecorder());
    Assert.assertArrayEquals(new SQLRecord[]{ null, null, null, null, null, null, null, null, null, null }, actual.getSqlRecorder().getRecords());

  }

  // Test written by Diffblue Cover
  @Test
  public void deActiveOutputVoid999cb39e26aa194574a() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLConnectionPool thisObj = new MySQLConnectionPool(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    thisObj.deActive();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getConfigOutputNotNull999c011793d4d67b891() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLConnectionPool thisObj = new MySQLConnectionPool(mySQLDataNode, 0, dataSourceConfig, 0);

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
//  public void getConnectionInputNotNullNotNullOutputNoClassDefFoundError999c861b9d051a4c418() throws Exception {
//
//    // Arrange
//    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
//    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
//    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
//    final MySQLConnectionPool thisObj = new MySQLConnectionPool(mySQLDataNode, 0, dataSourceConfig, 0);
//    final NonBlockingSession nonBlockingSession = new NonBlockingSession(null);
//    final CommitNodeHandler arg0 = new CommitNodeHandler(nonBlockingSession);
//    final Object arg1 = "alarm";
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    thisObj.getConnection(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getIndexOutputZero999691dee2ffad54a12() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLConnectionPool thisObj = new MySQLConnectionPool(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    final int actual = thisObj.getIndex();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputVoid99921501c6c2b87ab9f() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLConnectionPool thisObj = new MySQLConnectionPool(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    final String actual = thisObj.getName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSqlRecorderOutputNotNull9999ad269a6edeb39c6() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLConnectionPool thisObj = new MySQLConnectionPool(mySQLDataNode, 0, dataSourceConfig, 0);

    // Act
    final SQLRecorder actual = thisObj.getSqlRecorder();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertArrayEquals(new SQLRecord[]{ null, null, null, null, null, null, null, null, null, null }, actual.getRecords());

  }

  // Test written by Diffblue Cover
  @Test
  public void releaseChannelInputNotNullOutputNullPointerException999fc657bdee8e6ede0() {

    // Arrange
    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
    final MySQLConnectionPool thisObj = new MySQLConnectionPool(mySQLDataNode, 0, dataSourceConfig, 0);
    final MySQLConnection arg0 = new MySQLConnection(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.releaseChannel(arg0);

    // The method is not expected to return due to exception thrown

  }
}
