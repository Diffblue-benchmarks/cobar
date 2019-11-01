package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.MClusterListScreen;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class MClusterListScreen_afterPropertiesSetTest_1_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    MClusterListScreen mClusterListScreen = new MClusterListScreen();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    mClusterListScreen.afterPropertiesSet();
//    boolean isRequireSessionResult = mClusterListScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = mClusterListScreen.isUseCacheControlHeader();
//    String toStringResult = mClusterListScreen.toString();
//    String[] supportedMethods = mClusterListScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = mClusterListScreen.isUseExpiresHeader();
//    int cacheSeconds = mClusterListScreen.getCacheSeconds();
//    boolean isContextRequiredResult = mClusterListScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = mClusterListScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(mClusterListScreen.isSynchronizeOnSession());
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
