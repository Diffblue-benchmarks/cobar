package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.MCobarListScreen;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class MCobarListScreen_afterPropertiesSetTest_3_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    MCobarListScreen mCobarListScreen = new MCobarListScreen();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    mCobarListScreen.afterPropertiesSet();
//    boolean isRequireSessionResult = mCobarListScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = mCobarListScreen.isUseCacheControlHeader();
//    String toStringResult = mCobarListScreen.toString();
//    String[] supportedMethods = mCobarListScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = mCobarListScreen.isUseExpiresHeader();
//    int cacheSeconds = mCobarListScreen.getCacheSeconds();
//    boolean isContextRequiredResult = mCobarListScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = mCobarListScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(mCobarListScreen.isSynchronizeOnSession());
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
