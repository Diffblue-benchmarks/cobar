package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.CobarListScreen;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CobarListScreen_afterPropertiesSetTest_3_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    CobarListScreen cobarListScreen = new CobarListScreen();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    cobarListScreen.afterPropertiesSet();
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
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
