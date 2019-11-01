package com.alibaba.cobar.mysql.nio;

import com.alibaba.cobar.config.model.DataNodeConfig;
import com.alibaba.cobar.config.model.DataSourceConfig;
import com.alibaba.cobar.mysql.MySQLDataNode;
import com.alibaba.cobar.mysql.nio.MySQLConnectionFactory;
import com.alibaba.cobar.mysql.nio.MySQLConnectionPool;
import com.alibaba.cobar.mysql.nio.handler.ResponseHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;



public class MySQLConnectionFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990ae0ea9f76fc8434() {

    // Act, creating object to test constructor
    final MySQLConnectionFactory actual = new MySQLConnectionFactory();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(16777216, actual.getMaxPacketSize());
    Assert.assertEquals(28800000L, actual.getIdleTimeout());
    Assert.assertEquals(4, actual.getPacketHeaderSize());
    Assert.assertEquals(16384, actual.getSocketRecvBuffer());
    Assert.assertEquals(8192, actual.getSocketSendBuffer());
    Assert.assertEquals(8, actual.getWriteQueueCapcity());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void makeInputNotNullNullOutputNoClassDefFoundError9997417b8e2d73d4bf7() throws IOException {
//
//    // Arrange
//    final MySQLConnectionFactory thisObj = new MySQLConnectionFactory();
//    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
//    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
//    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
//    final MySQLConnectionPool arg0 = new MySQLConnectionPool(mySQLDataNode, 1, dataSourceConfig, 1);
//    final ResponseHandler arg1 = null;
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    thisObj.make(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
