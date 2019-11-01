package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.action.KillConnection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class KillConnection_setCobarAccesserTest_3_Test {
//failed_compile   @Test
//  public void setCobarAccesserTest() throws Exception {
//    // Arrange
//    KillConnection killConnection = new KillConnection();
//    CobarAccesser cobarAccesser = new CobarAccesser();
//
//    // Act
//    killConnection.setCobarAccesser(cobarAccesser);
//
//    // Assert
//    String toStringResult = cobarAccesser.toString();
//    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
//    Assert.assertEquals(null, xmlAccesser);
//    boolean isRequireSessionResult = killConnection.isRequireSession();
//    boolean isUseCacheControlHeaderResult = killConnection.isUseCacheControlHeader();
//    String toStringResult1 = killConnection.toString();
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
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
