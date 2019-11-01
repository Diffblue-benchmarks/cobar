package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.screen.ClusterListScreen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterListScreen_setXmlAccesserTest_2_Test {
//failed_compile   @Test
//  public void setXmlAccesserTest() throws Exception {
//    // Arrange
//    ClusterListScreen clusterListScreen = new ClusterListScreen();
//    XmlAccesser xmlAccesser = new XmlAccesser();
//
//    // Act
//    clusterListScreen.setXmlAccesser(xmlAccesser);
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
//    boolean isRequireSessionResult = clusterListScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = clusterListScreen.isUseCacheControlHeader();
//    String toStringResult1 = clusterListScreen.toString();
//    String[] supportedMethods = clusterListScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = clusterListScreen.isUseExpiresHeader();
//    int cacheSeconds = clusterListScreen.getCacheSeconds();
//    boolean isContextRequiredResult = clusterListScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = clusterListScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(clusterListScreen.isSynchronizeOnSession());
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
