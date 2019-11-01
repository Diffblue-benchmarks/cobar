package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.screen.ChooseStoptimePage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChooseStoptimePage_setXmlAccesserTest_3_Test {
//failed_compile   @Test
//  public void setXmlAccesserTest() throws Exception {
//    // Arrange
//    ChooseStoptimePage chooseStoptimePage = new ChooseStoptimePage();
//    XmlAccesser xmlAccesser = new XmlAccesser();
//
//    // Act
//    chooseStoptimePage.setXmlAccesser(xmlAccesser);
//
//    // Assert
//    String toStringResult = xmlAccesser.toString();
//    UserDAOImple userDAO = xmlAccesser.getUserDAO();
//    ClusterDAOImple clusterDAO = xmlAccesser.getClusterDAO();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, xmlAccesser.getPropertyDAO());
//    Assert.assertEquals(null, clusterDAO);
//    Assert.assertEquals(null, userDAO);
//    boolean isRequireSessionResult = chooseStoptimePage.isRequireSession();
//    boolean isUseCacheControlHeaderResult = chooseStoptimePage.isUseCacheControlHeader();
//    String toStringResult1 = chooseStoptimePage.toString();
//    String[] supportedMethods = chooseStoptimePage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = chooseStoptimePage.isUseExpiresHeader();
//    int cacheSeconds = chooseStoptimePage.getCacheSeconds();
//    boolean isContextRequiredResult = chooseStoptimePage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = chooseStoptimePage.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(chooseStoptimePage.isSynchronizeOnSession());
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
