package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.StopHeartbeat;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StopHeartbeat_afterPropertiesSetTest_5_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    StopHeartbeat stopHeartbeat = new StopHeartbeat();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    stopHeartbeat.afterPropertiesSet();
//    boolean isRequireSessionResult = stopHeartbeat.isRequireSession();
//    boolean isUseCacheControlHeaderResult = stopHeartbeat.isUseCacheControlHeader();
//    String toStringResult = stopHeartbeat.toString();
//    String[] supportedMethods = stopHeartbeat.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = stopHeartbeat.isUseExpiresHeader();
//    int cacheSeconds = stopHeartbeat.getCacheSeconds();
//    boolean isContextRequiredResult = stopHeartbeat.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = stopHeartbeat.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(stopHeartbeat.isSynchronizeOnSession());
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
