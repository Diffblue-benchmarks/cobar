package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.action.PropertyReload;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PropertyReload_setCobarAccesserTest_3_Test {
//failed_compile   @Test
//  public void setCobarAccesserTest() throws Exception {
//    // Arrange
//    PropertyReload propertyReload = new PropertyReload();
//    CobarAccesser cobarAccesser = new CobarAccesser();
//
//    // Act
//    propertyReload.setCobarAccesser(cobarAccesser);
//
//    // Assert
//    String toStringResult = cobarAccesser.toString();
//    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
//    Assert.assertEquals(null, xmlAccesser);
//    boolean isRequireSessionResult = propertyReload.isRequireSession();
//    boolean isUseCacheControlHeaderResult = propertyReload.isUseCacheControlHeader();
//    String toStringResult1 = propertyReload.toString();
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
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
