package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.AddCobarPage;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AddCobarPage_afterPropertiesSetTest_3_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    AddCobarPage addCobarPage = new AddCobarPage();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    addCobarPage.afterPropertiesSet();
//    boolean isRequireSessionResult = addCobarPage.isRequireSession();
//    boolean isUseCacheControlHeaderResult = addCobarPage.isUseCacheControlHeader();
//    String toStringResult = addCobarPage.toString();
//    String[] supportedMethods = addCobarPage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = addCobarPage.isUseExpiresHeader();
//    int cacheSeconds = addCobarPage.getCacheSeconds();
//    boolean isContextRequiredResult = addCobarPage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = addCobarPage.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(addCobarPage.isSynchronizeOnSession());
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
