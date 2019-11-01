package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.action.StopHeartbeat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StopHeartbeat_setCobarAccesserTest_1_Test {
//failed_compile   @Test
//  public void setCobarAccesserTest() throws Exception {
//    // Arrange
//    StopHeartbeat stopHeartbeat = new StopHeartbeat();
//    CobarAccesser cobarAccesser = new CobarAccesser();
//
//    // Act
//    stopHeartbeat.setCobarAccesser(cobarAccesser);
//
//    // Assert
//    String toStringResult = cobarAccesser.toString();
//    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
//    Assert.assertEquals(null, xmlAccesser);
//    boolean isRequireSessionResult = stopHeartbeat.isRequireSession();
//    boolean isUseCacheControlHeaderResult = stopHeartbeat.isUseCacheControlHeader();
//    String toStringResult1 = stopHeartbeat.toString();
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
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
