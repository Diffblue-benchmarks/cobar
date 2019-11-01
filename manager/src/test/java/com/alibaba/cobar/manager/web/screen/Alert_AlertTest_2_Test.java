package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.Alert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Alert_AlertTest_2_Test {
//failed_compile   @Test
//  public void AlertTest() throws Exception {
//    // Arrange and Act
//    Alert alert = new Alert();
//
//    // Assert
//    boolean isRequireSessionResult = alert.isRequireSession();
//    boolean isUseCacheControlHeaderResult = alert.isUseCacheControlHeader();
//    String toStringResult = alert.toString();
//    String[] supportedMethods = alert.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = alert.isUseExpiresHeader();
//    int cacheSeconds = alert.getCacheSeconds();
//    boolean isContextRequiredResult = alert.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = alert.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(alert.isSynchronizeOnSession());
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
