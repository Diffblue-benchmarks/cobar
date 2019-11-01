package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.screen.DatanodesControlScreen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DatanodesControlScreen_setXmlAccesserTest_5_Test {
//failed_compile   @Test
//  public void setXmlAccesserTest() throws Exception {
//    // Arrange
//    DatanodesControlScreen datanodesControlScreen = new DatanodesControlScreen();
//    XmlAccesser xmlAccesser = new XmlAccesser();
//
//    // Act
//    datanodesControlScreen.setXmlAccesser(xmlAccesser);
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
//    boolean isRequireSessionResult = datanodesControlScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = datanodesControlScreen.isUseCacheControlHeader();
//    String toStringResult1 = datanodesControlScreen.toString();
//    String[] supportedMethods = datanodesControlScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = datanodesControlScreen.isUseExpiresHeader();
//    int cacheSeconds = datanodesControlScreen.getCacheSeconds();
//    boolean isContextRequiredResult = datanodesControlScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = datanodesControlScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(datanodesControlScreen.isSynchronizeOnSession());
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
