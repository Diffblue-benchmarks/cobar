package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.DataSourceCreator;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataSourceCreator_createDataSourceTest_5_Test {
//failed_pass   @Test
//  public void createDataSourceTest() throws Exception {
//    // Arrange
//    DataSourceCreator dataSourceCreator = new DataSourceCreator();
//    String ip = "aaaaa";
//    int port = 1;
//    String user = "aaaaa";
//    String password = "aaaaa";
//
//    // Act
//    DataSource actual = dataSourceCreator.createDataSource(ip, port, user, password);
//
//    // Assert
//    Assert.assertTrue(actual instanceof BasicDataSource);
//    long minEvictableIdleTimeMillis = ((BasicDataSource) actual).getMinEvictableIdleTimeMillis();
//    int numTestsPerEvictionRun = ((BasicDataSource) actual).getNumTestsPerEvictionRun();
//    String username = ((BasicDataSource) actual).getUsername();
//    boolean defaultReadOnly = ((BasicDataSource) actual).getDefaultReadOnly();
//    int initialSize = ((BasicDataSource) actual).getInitialSize();
//    boolean removeAbandoned = ((BasicDataSource) actual).getRemoveAbandoned();
//    int minIdle = ((BasicDataSource) actual).getMinIdle();
//    boolean defaultAutoCommit = ((BasicDataSource) actual).getDefaultAutoCommit();
//    boolean isPoolPreparedStatementsResult = ((BasicDataSource) actual).isPoolPreparedStatements();
//    ClassLoader driverClassLoader = ((BasicDataSource) actual).getDriverClassLoader();
//    int numActive = ((BasicDataSource) actual).getNumActive();
//    boolean isClosedResult = ((BasicDataSource) actual).isClosed();
//    boolean testWhileIdle = ((BasicDataSource) actual).getTestWhileIdle();
//    String toStringResult = ((BasicDataSource) actual).toString();
//    int validationQueryTimeout = ((BasicDataSource) actual).getValidationQueryTimeout();
//    int maxOpenPreparedStatements = ((BasicDataSource) actual).getMaxOpenPreparedStatements();
//    String url = ((BasicDataSource) actual).getUrl();
//    boolean testOnBorrow = ((BasicDataSource) actual).getTestOnBorrow();
//    String driverClassName = ((BasicDataSource) actual).getDriverClassName();
//    boolean testOnReturn = ((BasicDataSource) actual).getTestOnReturn();
//    boolean logAbandoned = ((BasicDataSource) actual).getLogAbandoned();
//    long timeBetweenEvictionRunsMillis = ((BasicDataSource) actual).getTimeBetweenEvictionRunsMillis();
//    String defaultCatalog = ((BasicDataSource) actual).getDefaultCatalog();
//    boolean isAccessToUnderlyingConnectionAllowedResult = ((BasicDataSource) actual)
//        .isAccessToUnderlyingConnectionAllowed();
//    int removeAbandonedTimeout = ((BasicDataSource) actual).getRemoveAbandonedTimeout();
//    int numIdle = ((BasicDataSource) actual).getNumIdle();
//    int defaultTransactionIsolation = ((BasicDataSource) actual).getDefaultTransactionIsolation();
//    int maxActive = ((BasicDataSource) actual).getMaxActive();
//    String validationQuery = ((BasicDataSource) actual).getValidationQuery();
//    String password1 = ((BasicDataSource) actual).getPassword();
//    long maxWait = ((BasicDataSource) actual).getMaxWait();
//    Assert.assertEquals(180000L, minEvictableIdleTimeMillis);
//    Assert.assertEquals(8, ((BasicDataSource) actual).getMaxIdle());
//    Assert.assertEquals(-1L, maxWait);
//    Assert.assertEquals("aaaaa", password1);
//    Assert.assertEquals(null, validationQuery);
//    Assert.assertEquals(50, maxActive);
//    Assert.assertEquals(-1, defaultTransactionIsolation);
//    Assert.assertEquals(0, numIdle);
//    Assert.assertEquals(300, removeAbandonedTimeout);
//    Assert.assertFalse(isAccessToUnderlyingConnectionAllowedResult);
//    Assert.assertEquals(null, defaultCatalog);
//    Assert.assertEquals(60000L, timeBetweenEvictionRunsMillis);
//    Assert.assertFalse(logAbandoned);
//    Assert.assertFalse(testOnReturn);
//    Assert.assertEquals("com.mysql.jdbc.Driver", driverClassName);
//    Assert.assertFalse(testOnBorrow);
//    Assert.assertEquals("jdbc:mysql://aaaaa:1/", url);
//    Assert.assertEquals(-1, maxOpenPreparedStatements);
//    Assert.assertEquals(-1, validationQueryTimeout);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertFalse(testWhileIdle);
//    Assert.assertFalse(isClosedResult);
//    Assert.assertEquals(0, numActive);
//    Assert.assertEquals(null, driverClassLoader);
//    Assert.assertFalse(isPoolPreparedStatementsResult);
//    Assert.assertTrue(defaultAutoCommit);
//    Assert.assertEquals(0, minIdle);
//    Assert.assertFalse(removeAbandoned);
//    Assert.assertEquals(0, initialSize);
//    Assert.assertFalse(defaultReadOnly);
//    Assert.assertEquals("aaaaa", username);
//    Assert.assertEquals(-1, numTestsPerEvictionRun);
//    Assert.assertNotNull(dataSourceCreator.toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
