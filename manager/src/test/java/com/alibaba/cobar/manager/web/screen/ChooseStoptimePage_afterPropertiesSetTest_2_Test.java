package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.ChooseStoptimePage;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ChooseStoptimePage_afterPropertiesSetTest_2_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    ChooseStoptimePage chooseStoptimePage = new ChooseStoptimePage();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    chooseStoptimePage.afterPropertiesSet();
//    boolean isRequireSessionResult = chooseStoptimePage.isRequireSession();
//    boolean isUseCacheControlHeaderResult = chooseStoptimePage.isUseCacheControlHeader();
//    String toStringResult = chooseStoptimePage.toString();
//    String[] supportedMethods = chooseStoptimePage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = chooseStoptimePage.isUseExpiresHeader();
//    int cacheSeconds = chooseStoptimePage.getCacheSeconds();
//    boolean isContextRequiredResult = chooseStoptimePage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = chooseStoptimePage.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(chooseStoptimePage.isSynchronizeOnSession());
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
