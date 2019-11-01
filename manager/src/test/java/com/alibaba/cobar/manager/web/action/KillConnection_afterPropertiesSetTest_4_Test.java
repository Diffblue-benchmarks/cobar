package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.KillConnection;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class KillConnection_afterPropertiesSetTest_4_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    KillConnection killConnection = new KillConnection();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    killConnection.afterPropertiesSet();
//    boolean isRequireSessionResult = killConnection.isRequireSession();
//    boolean isUseCacheControlHeaderResult = killConnection.isUseCacheControlHeader();
//    String toStringResult = killConnection.toString();
//    String[] supportedMethods = killConnection.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = killConnection.isUseExpiresHeader();
//    int cacheSeconds = killConnection.getCacheSeconds();
//    boolean isContextRequiredResult = killConnection.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = killConnection.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(killConnection.isSynchronizeOnSession());
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
