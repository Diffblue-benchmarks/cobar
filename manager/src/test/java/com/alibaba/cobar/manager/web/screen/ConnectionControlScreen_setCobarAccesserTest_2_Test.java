package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.screen.ConnectionControlScreen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ConnectionControlScreen_setCobarAccesserTest_2_Test {
//failed_compile   @Test
//  public void setCobarAccesserTest() throws Exception {
//    // Arrange
//    ConnectionControlScreen connectionControlScreen = new ConnectionControlScreen();
//    CobarAccesser cobarAccesser = new CobarAccesser();
//
//    // Act
//    connectionControlScreen.setCobarAccesser(cobarAccesser);
//
//    // Assert
//    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
//    Assert.assertEquals(null, xmlAccesser);
//    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
//    boolean isRequireSessionResult = connectionControlScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = connectionControlScreen.isUseCacheControlHeader();
//    String toStringResult = connectionControlScreen.toString();
//    String[] supportedMethods = connectionControlScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = connectionControlScreen.isUseExpiresHeader();
//    int cacheSeconds = connectionControlScreen.getCacheSeconds();
//    boolean isContextRequiredResult = connectionControlScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = connectionControlScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(connectionControlScreen.isSynchronizeOnSession());
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
