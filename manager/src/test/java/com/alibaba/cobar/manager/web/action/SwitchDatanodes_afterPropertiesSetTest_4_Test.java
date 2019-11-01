package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.SwitchDatanodes;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SwitchDatanodes_afterPropertiesSetTest_4_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    SwitchDatanodes switchDatanodes = new SwitchDatanodes();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    switchDatanodes.afterPropertiesSet();
//    boolean isRequireSessionResult = switchDatanodes.isRequireSession();
//    boolean isUseCacheControlHeaderResult = switchDatanodes.isUseCacheControlHeader();
//    String toStringResult = switchDatanodes.toString();
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
//    Assert.assertNotNull(toStringResult);
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
