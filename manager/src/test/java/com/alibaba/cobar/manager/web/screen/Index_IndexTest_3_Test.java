package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.Index;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Index_IndexTest_3_Test {
//failed_compile   @Test
//  public void IndexTest() throws Exception {
//    // Arrange and Act
//    Index index = new Index();
//
//    // Assert
//    boolean isRequireSessionResult = index.isRequireSession();
//    boolean isUseCacheControlHeaderResult = index.isUseCacheControlHeader();
//    String toStringResult = index.toString();
//    String[] supportedMethods = index.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = index.isUseExpiresHeader();
//    int cacheSeconds = index.getCacheSeconds();
//    boolean isContextRequiredResult = index.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = index.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(index.isSynchronizeOnSession());
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
