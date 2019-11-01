package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.EditUserPage;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EditUserPage_afterPropertiesSetTest_2_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    EditUserPage editUserPage = new EditUserPage();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    editUserPage.afterPropertiesSet();
//    boolean isRequireSessionResult = editUserPage.isRequireSession();
//    boolean isUseCacheControlHeaderResult = editUserPage.isUseCacheControlHeader();
//    String toStringResult = editUserPage.toString();
//    String[] supportedMethods = editUserPage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = editUserPage.isUseExpiresHeader();
//    int cacheSeconds = editUserPage.getCacheSeconds();
//    boolean isContextRequiredResult = editUserPage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = editUserPage.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(editUserPage.isSynchronizeOnSession());
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
