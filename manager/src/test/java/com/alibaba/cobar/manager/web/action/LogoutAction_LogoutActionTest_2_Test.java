package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.LogoutAction;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LogoutAction_LogoutActionTest_2_Test {
//failed_compile   @Test
//  public void LogoutActionTest() throws Exception {
//    // Arrange and Act
//    LogoutAction logoutAction = new LogoutAction();
//
//    // Assert
//    boolean isUseCacheControlHeaderResult = logoutAction.isUseCacheControlHeader();
//    String toStringResult = logoutAction.toString();
//    String[] supportedMethods = logoutAction.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = logoutAction.isUseExpiresHeader();
//    int cacheSeconds = logoutAction.getCacheSeconds();
//    boolean isContextRequiredResult = logoutAction.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = logoutAction.isUseCacheControlNoStore();
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//    Assert.assertFalse(logoutAction.isSynchronizeOnSession());
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(-1, cacheSeconds);
//    Assert.assertTrue(isUseExpiresHeaderResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertNotNull(toStringResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
