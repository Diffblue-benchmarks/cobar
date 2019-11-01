package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.LogInPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LogInPage_afterPropertiesSetTest_2_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    LogInPage logInPage = new LogInPage();
//
//    // Act
//    logInPage.afterPropertiesSet();
//
//    // Assert
//    boolean isRequireSessionResult = logInPage.isRequireSession();
//    boolean isUseCacheControlHeaderResult = logInPage.isUseCacheControlHeader();
//    String toStringResult = logInPage.toString();
//    String[] supportedMethods = logInPage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = logInPage.isUseExpiresHeader();
//    int cacheSeconds = logInPage.getCacheSeconds();
//    boolean isContextRequiredResult = logInPage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = logInPage.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(logInPage.isSynchronizeOnSession());
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
