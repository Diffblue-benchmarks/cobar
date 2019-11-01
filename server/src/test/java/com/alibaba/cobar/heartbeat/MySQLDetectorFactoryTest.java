package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.config.model.DataNodeConfig;
import com.alibaba.cobar.config.model.DataSourceConfig;
import com.alibaba.cobar.heartbeat.MySQLDetectorFactory;
import com.alibaba.cobar.heartbeat.MySQLHeartbeat;
import com.alibaba.cobar.mysql.MySQLDataNode;
import com.alibaba.cobar.mysql.MySQLDataSource;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;



public class MySQLDetectorFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996dbe5a4d79dfaee5() {

    // Act, creating object to test constructor
    final MySQLDetectorFactory actual = new MySQLDetectorFactory();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(16777216, actual.getMaxPacketSize());
    Assert.assertEquals(300000L, actual.getIdleTimeout());
    Assert.assertEquals(4, actual.getPacketHeaderSize());
    Assert.assertEquals(16384, actual.getSocketRecvBuffer());
    Assert.assertEquals(8192, actual.getSocketSendBuffer());
    Assert.assertEquals(8, actual.getWriteQueueCapcity());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void makeInputNotNullOutputNoClassDefFoundError999b7855fe9cf4008b0() throws IOException {
//
//    // Arrange
//    final MySQLDetectorFactory thisObj = new MySQLDetectorFactory();
//    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
//    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
//    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
//    final MySQLDataSource mySQLDataSource = new MySQLDataSource(mySQLDataNode, 1, dataSourceConfig, 1);
//    final MySQLHeartbeat arg0 = new MySQLHeartbeat(mySQLDataSource);
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    thisObj.make(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
