package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.PropertyReload;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PropertyReload_afterPropertiesSetTest_5_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    PropertyReload propertyReload = new PropertyReload();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    propertyReload.afterPropertiesSet();
//    boolean isRequireSessionResult = propertyReload.isRequireSession();
//    boolean isUseCacheControlHeaderResult = propertyReload.isUseCacheControlHeader();
//    String toStringResult = propertyReload.toString();
//    String[] supportedMethods = propertyReload.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = propertyReload.isUseExpiresHeader();
//    int cacheSeconds = propertyReload.getCacheSeconds();
//    boolean isContextRequiredResult = propertyReload.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = propertyReload.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(propertyReload.isSynchronizeOnSession());
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
