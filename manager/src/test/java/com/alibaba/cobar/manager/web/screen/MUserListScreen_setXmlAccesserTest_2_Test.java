package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.screen.MUserListScreen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MUserListScreen_setXmlAccesserTest_2_Test {
//failed_compile   @Test
//  public void setXmlAccesserTest() throws Exception {
//    // Arrange
//    MUserListScreen mUserListScreen = new MUserListScreen();
//    XmlAccesser xmlAccesser = new XmlAccesser();
//
//    // Act
//    mUserListScreen.setXmlAccesser(xmlAccesser);
//
//    // Assert
//    String toStringResult = xmlAccesser.toString();
//    UserDAOImple userDAO = xmlAccesser.getUserDAO();
//    ClusterDAOImple clusterDAO = xmlAccesser.getClusterDAO();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, xmlAccesser.getPropertyDAO());
//    Assert.assertEquals(null, clusterDAO);
//    Assert.assertEquals(null, userDAO);
//    boolean isRequireSessionResult = mUserListScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = mUserListScreen.isUseCacheControlHeader();
//    String toStringResult1 = mUserListScreen.toString();
//    String[] supportedMethods = mUserListScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = mUserListScreen.isUseExpiresHeader();
//    int cacheSeconds = mUserListScreen.getCacheSeconds();
//    boolean isContextRequiredResult = mUserListScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = mUserListScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(mUserListScreen.isSynchronizeOnSession());
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
