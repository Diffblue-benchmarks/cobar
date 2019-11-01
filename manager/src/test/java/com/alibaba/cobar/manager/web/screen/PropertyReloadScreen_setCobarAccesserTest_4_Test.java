package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.screen.PropertyReloadScreen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PropertyReloadScreen_setCobarAccesserTest_4_Test {
//failed_compile   @Test
//  public void setCobarAccesserTest() throws Exception {
//    // Arrange
//    PropertyReloadScreen propertyReloadScreen = new PropertyReloadScreen();
//    CobarAccesser cobarAccesser = new CobarAccesser();
//
//    // Act
//    propertyReloadScreen.setCobarAccesser(cobarAccesser);
//
//    // Assert
//    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
//    Assert.assertEquals(null, xmlAccesser);
//    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
//    boolean isRequireSessionResult = propertyReloadScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = propertyReloadScreen.isUseCacheControlHeader();
//    String toStringResult = propertyReloadScreen.toString();
//    String[] supportedMethods = propertyReloadScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = propertyReloadScreen.isUseExpiresHeader();
//    int cacheSeconds = propertyReloadScreen.getCacheSeconds();
//    boolean isContextRequiredResult = propertyReloadScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = propertyReloadScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(propertyReloadScreen.isSynchronizeOnSession());
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(-1, cacheSeconds);
//    Assert.assertTrue(isUseExpiresHeaderResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
