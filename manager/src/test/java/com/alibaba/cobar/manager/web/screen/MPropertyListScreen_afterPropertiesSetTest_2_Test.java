package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.MPropertyListScreen;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class MPropertyListScreen_afterPropertiesSetTest_2_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    MPropertyListScreen mPropertyListScreen = new MPropertyListScreen();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    mPropertyListScreen.afterPropertiesSet();
//    boolean isUseCacheControlHeaderResult = mPropertyListScreen.isUseCacheControlHeader();
//    String toStringResult = mPropertyListScreen.toString();
//    String[] supportedMethods = mPropertyListScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = mPropertyListScreen.isUseExpiresHeader();
//    int cacheSeconds = mPropertyListScreen.getCacheSeconds();
//    boolean isContextRequiredResult = mPropertyListScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = mPropertyListScreen.isUseCacheControlNoStore();
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//    Assert.assertFalse(mPropertyListScreen.isSynchronizeOnSession());
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(-1, cacheSeconds);
//    Assert.assertTrue(isUseExpiresHeaderResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertNotNull(toStringResult);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
