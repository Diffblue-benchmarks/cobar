package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.screen.DatanodesControlScreen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DatanodesControlScreen_setCobarAccesserTest_3_Test {
//failed_compile   @Test
//  public void setCobarAccesserTest() throws Exception {
//    // Arrange
//    DatanodesControlScreen datanodesControlScreen = new DatanodesControlScreen();
//    CobarAccesser cobarAccesser = new CobarAccesser();
//
//    // Act
//    datanodesControlScreen.setCobarAccesser(cobarAccesser);
//
//    // Assert
//    String toStringResult = cobarAccesser.toString();
//    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
//    Assert.assertEquals(null, xmlAccesser);
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
