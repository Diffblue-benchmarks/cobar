package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.EditCobarPage;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EditCobarPage_afterPropertiesSetTest_3_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    EditCobarPage editCobarPage = new EditCobarPage();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    editCobarPage.afterPropertiesSet();
//    boolean isRequireSessionResult = editCobarPage.isRequireSession();
//    boolean isUseCacheControlHeaderResult = editCobarPage.isUseCacheControlHeader();
//    String toStringResult = editCobarPage.toString();
//    String[] supportedMethods = editCobarPage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = editCobarPage.isUseExpiresHeader();
//    int cacheSeconds = editCobarPage.getCacheSeconds();
//    boolean isContextRequiredResult = editCobarPage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = editCobarPage.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(editCobarPage.isSynchronizeOnSession());
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
