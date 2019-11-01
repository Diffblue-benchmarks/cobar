package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.action.SwitchDatanodes;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SwitchDatanodes_setCobarAccesserTest_3_Test {
//failed_compile   @Test
//  public void setCobarAccesserTest() throws Exception {
//    // Arrange
//    SwitchDatanodes switchDatanodes = new SwitchDatanodes();
//    CobarAccesser cobarAccesser = new CobarAccesser();
//
//    // Act
//    switchDatanodes.setCobarAccesser(cobarAccesser);
//
//    // Assert
//    String toStringResult = cobarAccesser.toString();
//    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
//    Assert.assertEquals(null, xmlAccesser);
//    boolean isRequireSessionResult = switchDatanodes.isRequireSession();
//    boolean isUseCacheControlHeaderResult = switchDatanodes.isUseCacheControlHeader();
//    String toStringResult1 = switchDatanodes.toString();
//    String[] supportedMethods = switchDatanodes.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = switchDatanodes.isUseExpiresHeader();
//    int cacheSeconds = switchDatanodes.getCacheSeconds();
//    boolean isContextRequiredResult = switchDatanodes.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = switchDatanodes.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(switchDatanodes.isSynchronizeOnSession());
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
