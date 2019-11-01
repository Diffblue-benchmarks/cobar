package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.screen.CobarListScreen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarListScreen_setCobarAccesserTest_2_Test {
//failed_compile   @Test
//  public void setCobarAccesserTest() throws Exception {
//    // Arrange
//    CobarListScreen cobarListScreen = new CobarListScreen();
//    CobarAccesser cobarAccesser = new CobarAccesser();
//
//    // Act
//    cobarListScreen.setCobarAccesser(cobarAccesser);
//
//    // Assert
//    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
//    Assert.assertEquals(null, xmlAccesser);
//    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
//    boolean isRequireSessionResult = cobarListScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = cobarListScreen.isUseCacheControlHeader();
//    String toStringResult = cobarListScreen.toString();
//    String[] supportedMethods = cobarListScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = cobarListScreen.isUseExpiresHeader();
//    int cacheSeconds = cobarListScreen.getCacheSeconds();
//    boolean isContextRequiredResult = cobarListScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = cobarListScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(cobarListScreen.isSynchronizeOnSession());
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
