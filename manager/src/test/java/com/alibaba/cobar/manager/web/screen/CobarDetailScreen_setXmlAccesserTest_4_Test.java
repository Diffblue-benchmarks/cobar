package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.screen.CobarDetailScreen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarDetailScreen_setXmlAccesserTest_4_Test {
//failed_compile   @Test
//  public void setXmlAccesserTest() throws Exception {
//    // Arrange
//    CobarDetailScreen cobarDetailScreen = new CobarDetailScreen();
//    XmlAccesser xmlAccesser = new XmlAccesser();
//
//    // Act
//    cobarDetailScreen.setXmlAccesser(xmlAccesser);
//
//    // Assert
//    String toStringResult = xmlAccesser.toString();
//    UserDAOImple userDAO = xmlAccesser.getUserDAO();
//    ClusterDAOImple clusterDAO = xmlAccesser.getClusterDAO();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, xmlAccesser.getPropertyDAO());
//    Assert.assertEquals(null, clusterDAO);
//    Assert.assertEquals(null, userDAO);
//    boolean isRequireSessionResult = cobarDetailScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = cobarDetailScreen.isUseCacheControlHeader();
//    String toStringResult1 = cobarDetailScreen.toString();
//    String[] supportedMethods = cobarDetailScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = cobarDetailScreen.isUseExpiresHeader();
//    int cacheSeconds = cobarDetailScreen.getCacheSeconds();
//    boolean isContextRequiredResult = cobarDetailScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = cobarDetailScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(cobarDetailScreen.isSynchronizeOnSession());
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
