package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.screen.EditUserPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EditUserPage_setXmlAccesserTest_3_Test {
//failed_compile   @Test
//  public void setXmlAccesserTest() throws Exception {
//    // Arrange
//    EditUserPage editUserPage = new EditUserPage();
//    XmlAccesser xmlAccesser = new XmlAccesser();
//
//    // Act
//    editUserPage.setXmlAccesser(xmlAccesser);
//
//    // Assert
//    CobarDAOImple cobarDAO = xmlAccesser.getCobarDAO();
//    String toStringResult = xmlAccesser.toString();
//    UserDAOImple userDAO = xmlAccesser.getUserDAO();
//    Assert.assertEquals(null, cobarDAO);
//    Assert.assertEquals(null, xmlAccesser.getPropertyDAO());
//    Assert.assertEquals(null, userDAO);
//    Assert.assertNotNull(toStringResult);
//    boolean isRequireSessionResult = editUserPage.isRequireSession();
//    boolean isUseCacheControlHeaderResult = editUserPage.isUseCacheControlHeader();
//    String toStringResult1 = editUserPage.toString();
//    String[] supportedMethods = editUserPage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = editUserPage.isUseExpiresHeader();
//    int cacheSeconds = editUserPage.getCacheSeconds();
//    boolean isContextRequiredResult = editUserPage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = editUserPage.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(editUserPage.isSynchronizeOnSession());
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
