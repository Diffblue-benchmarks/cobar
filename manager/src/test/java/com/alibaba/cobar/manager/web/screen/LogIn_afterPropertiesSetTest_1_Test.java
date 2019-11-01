package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.LogIn;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LogIn_afterPropertiesSetTest_1_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    LogIn logIn = new LogIn();
//
//    // Act
//    logIn.afterPropertiesSet();
//
//    // Assert
//    boolean isRequireSessionResult = logIn.isRequireSession();
//    boolean isUseCacheControlHeaderResult = logIn.isUseCacheControlHeader();
//    String toStringResult = logIn.toString();
//    String[] supportedMethods = logIn.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = logIn.isUseExpiresHeader();
//    int cacheSeconds = logIn.getCacheSeconds();
//    boolean isContextRequiredResult = logIn.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = logIn.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(logIn.isSynchronizeOnSession());
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
