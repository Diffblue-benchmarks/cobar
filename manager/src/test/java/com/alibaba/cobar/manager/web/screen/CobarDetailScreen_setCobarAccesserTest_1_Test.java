package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.screen.CobarDetailScreen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarDetailScreen_setCobarAccesserTest_1_Test {
//failed_compile   @Test
//  public void setCobarAccesserTest() throws Exception {
//    // Arrange
//    CobarDetailScreen cobarDetailScreen = new CobarDetailScreen();
//    CobarAccesser cobarAccesser = new CobarAccesser();
//
//    // Act
//    cobarDetailScreen.setCobarAccesser(cobarAccesser);
//
//    // Assert
//    String toStringResult = cobarAccesser.toString();
//    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
//    Assert.assertEquals(null, xmlAccesser);
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
