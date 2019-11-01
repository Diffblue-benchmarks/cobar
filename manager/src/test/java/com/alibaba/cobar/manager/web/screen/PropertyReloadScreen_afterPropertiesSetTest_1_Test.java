package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.PropertyReloadScreen;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PropertyReloadScreen_afterPropertiesSetTest_1_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    PropertyReloadScreen propertyReloadScreen = new PropertyReloadScreen();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    propertyReloadScreen.afterPropertiesSet();
//    boolean isRequireSessionResult = propertyReloadScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = propertyReloadScreen.isUseCacheControlHeader();
//    String toStringResult = propertyReloadScreen.toString();
//    String[] supportedMethods = propertyReloadScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = propertyReloadScreen.isUseExpiresHeader();
//    int cacheSeconds = propertyReloadScreen.getCacheSeconds();
//    boolean isContextRequiredResult = propertyReloadScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = propertyReloadScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(propertyReloadScreen.isSynchronizeOnSession());
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
