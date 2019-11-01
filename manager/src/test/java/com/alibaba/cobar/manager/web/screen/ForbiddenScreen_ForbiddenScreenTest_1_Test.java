package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.ForbiddenScreen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ForbiddenScreen_ForbiddenScreenTest_1_Test {
//failed_compile   @Test
//  public void ForbiddenScreenTest() throws Exception {
//    // Arrange and Act
//    ForbiddenScreen forbiddenScreen = new ForbiddenScreen();
//
//    // Assert
//    boolean isRequireSessionResult = forbiddenScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = forbiddenScreen.isUseCacheControlHeader();
//    String toStringResult = forbiddenScreen.toString();
//    String[] supportedMethods = forbiddenScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = forbiddenScreen.isUseExpiresHeader();
//    int cacheSeconds = forbiddenScreen.getCacheSeconds();
//    boolean isContextRequiredResult = forbiddenScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = forbiddenScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(forbiddenScreen.isSynchronizeOnSession());
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
