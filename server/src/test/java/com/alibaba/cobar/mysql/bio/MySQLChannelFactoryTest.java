package com.alibaba.cobar.mysql.bio;

import com.alibaba.cobar.config.model.DataNodeConfig;
import com.alibaba.cobar.config.model.DataSourceConfig;
import com.alibaba.cobar.mysql.MySQLDataNode;
import com.alibaba.cobar.mysql.MySQLDataSource;
import com.alibaba.cobar.mysql.bio.Channel;
import com.alibaba.cobar.mysql.bio.MySQLChannel;
import com.alibaba.cobar.mysql.bio.MySQLChannelFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MySQLChannelFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b5f3507ada160196() {

    // Act, creating object to test constructor
    final MySQLChannelFactory actual = new MySQLChannelFactory();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void makeInputNotNullOutputNotNull9991abf7983bae61dcf() {
//
//    // Arrange
//    final MySQLChannelFactory thisObj = new MySQLChannelFactory();
//    final DataNodeConfig dataNodeConfig = new DataNodeConfig();
//    final MySQLDataNode mySQLDataNode = new MySQLDataNode(dataNodeConfig);
//    final DataSourceConfig dataSourceConfig = new DataSourceConfig();
//    final MySQLDataSource arg0 = new MySQLDataSource(mySQLDataNode, 1, dataSourceConfig, 1);
//
//    // Act
//    final Channel actual = thisObj.make(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(((MySQLChannel) actual).getCharset());
//    Assert.assertTrue(((MySQLChannel) actual).isAutocommit());
//    Assert.assertFalse(((MySQLChannel) actual).isRunning());
//    Assert.assertEquals(1572604606756L, ((MySQLChannel) actual).getLastAcitveTime());
//
//  }
}
