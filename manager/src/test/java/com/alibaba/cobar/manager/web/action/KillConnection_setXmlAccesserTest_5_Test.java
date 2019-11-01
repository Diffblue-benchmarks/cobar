package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.action.KillConnection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class KillConnection_setXmlAccesserTest_5_Test {
//failed_compile   @Test
//  public void setXmlAccesserTest() throws Exception {
//    // Arrange
//    KillConnection killConnection = new KillConnection();
//    XmlAccesser xmlAccesser = new XmlAccesser();
//
//    // Act
//    killConnection.setXmlAccesser(xmlAccesser);
//
//    // Assert
//    CobarDAOImple cobarDAO = xmlAccesser.getCobarDAO();
//    String toStringResult = xmlAccesser.toString();
//    UserDAOImple userDAO = xmlAccesser.getUserDAO();
//    ClusterDAOImple clusterDAO = xmlAccesser.getClusterDAO();
//    Assert.assertEquals(null, cobarDAO);
//    Assert.assertEquals(null, xmlAccesser.getPropertyDAO());
//    Assert.assertEquals(null, clusterDAO);
//    Assert.assertEquals(null, userDAO);
//    Assert.assertNotNull(toStringResult);
//    boolean isRequireSessionResult = killConnection.isRequireSession();
//    boolean isUseCacheControlHeaderResult = killConnection.isUseCacheControlHeader();
//    String toStringResult1 = killConnection.toString();
//    String[] supportedMethods = killConnection.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = killConnection.isUseExpiresHeader();
//    int cacheSeconds = killConnection.getCacheSeconds();
//    boolean isContextRequiredResult = killConnection.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = killConnection.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(killConnection.isSynchronizeOnSession());
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(-1, cacheSeconds);
//    Assert.assertTrue(isUseExpiresHeaderResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
