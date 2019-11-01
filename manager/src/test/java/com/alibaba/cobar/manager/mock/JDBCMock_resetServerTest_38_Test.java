package com.alibaba.cobar.manager.mock;

import com.alibaba.cobar.manager.mock.DBUtility;
import com.alibaba.cobar.manager.mock.JDBCMock;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.ConnectionImpl;
import com.mysql.jdbc.JDBC4ResultSet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.easymock.IMocksControl;
import org.easymock.internal.MocksControl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class JDBCMock_resetServerTest_38_Test {
  @Test
  public void resetServerTest() throws Exception {
    // Arrange
    JDBCMock jDBCMock = new JDBCMock();
    MocksControl mocksControl = new MocksControl(MocksControl.MockType.NICE);
    jDBCMock.control = mocksControl;
    jDBCMock.mockConnection = (ConnectionImpl) null;
    DBUtility dBUtility = Whitebox.newInstance(DBUtility.class);
    jDBCMock.mockDBUtility = dBUtility;
    jDBCMock.mockStatement = (CallableStatement) null;
    jDBCMock.rsCommand = (JDBC4ResultSet) null;
    jDBCMock.rsConnection = (JDBC4ResultSet) null;
    jDBCMock.rsConnectionSql = (JDBC4ResultSet) null;
    jDBCMock.rsDataBases = (JDBC4ResultSet) null;
    jDBCMock.rsDataNodes = (JDBC4ResultSet) null;
    jDBCMock.rsDataSources = (JDBC4ResultSet) null;
    jDBCMock.rsParser = (JDBC4ResultSet) null;
    jDBCMock.rsProcessor = (JDBC4ResultSet) null;
    jDBCMock.rsRoute = (JDBC4ResultSet) null;
    jDBCMock.rsServer = (JDBC4ResultSet) null;
    jDBCMock.rsSql = (JDBC4ResultSet) null;
    jDBCMock.rsSqlDetail = (JDBC4ResultSet) null;
    jDBCMock.rsSqlExecute = (JDBC4ResultSet) null;
    jDBCMock.rsSqlSlow = (JDBC4ResultSet) null;
    jDBCMock.rsThreadPool = (JDBC4ResultSet) null;
    jDBCMock.rsTimeCurrent = (JDBC4ResultSet) null;
    jDBCMock.rsTimeStartUp = (JDBC4ResultSet) null;
    jDBCMock.rsVersion = (JDBC4ResultSet) null;

    // Act
    jDBCMock.resetServer();

    // Assert
    String toStringResult = jDBCMock.toString();
    IMocksControl iMocksControl = jDBCMock.control;
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, jDBCMock.rsParser);
    Assert.assertEquals(null, jDBCMock.rsThreadPool);
    Assert.assertEquals(null, jDBCMock.rsTimeStartUp);
    Assert.assertEquals(null, jDBCMock.rsSqlDetail);
    Assert.assertEquals(null, jDBCMock.rsSqlExecute);
    Assert.assertEquals(null, jDBCMock.rsTimeCurrent);
    Assert.assertEquals(null, jDBCMock.rsDataBases);
    Assert.assertEquals(null, jDBCMock.rsDataNodes);
    Assert.assertSame(mocksControl, iMocksControl);
    Assert.assertTrue(iMocksControl instanceof MocksControl);
    Assert.assertSame(dBUtility, jDBCMock.mockDBUtility);
    Assert.assertSame(mocksControl, iMocksControl);
    Assert.assertEquals(null, jDBCMock.rsDataSources);
    Assert.assertEquals(null, jDBCMock.rsRoute);
    Assert.assertEquals(null, jDBCMock.rsConnectionSql);
    Assert.assertEquals(null, jDBCMock.rsSql);
    Assert.assertEquals(null, jDBCMock.rsConnection);
    Assert.assertEquals(null, jDBCMock.rsProcessor);
    Assert.assertEquals(null, jDBCMock.rsCommand);
    Assert.assertEquals(null, jDBCMock.mockStatement);
    Assert.assertEquals(null, jDBCMock.rsVersion);
    Assert.assertEquals(null, jDBCMock.rsSqlSlow);
    Assert.assertEquals(null, jDBCMock.rsServer);
    Assert.assertEquals(null, jDBCMock.getMockConnection());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
