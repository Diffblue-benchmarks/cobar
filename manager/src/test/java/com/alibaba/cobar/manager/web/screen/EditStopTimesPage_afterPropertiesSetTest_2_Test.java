package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.EditStopTimesPage;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EditStopTimesPage_afterPropertiesSetTest_2_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    EditStopTimesPage editStopTimesPage = new EditStopTimesPage();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    editStopTimesPage.afterPropertiesSet();
//    boolean isUseCacheControlHeaderResult = editStopTimesPage.isUseCacheControlHeader();
//    String toStringResult = editStopTimesPage.toString();
//    String[] supportedMethods = editStopTimesPage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = editStopTimesPage.isUseExpiresHeader();
//    int cacheSeconds = editStopTimesPage.getCacheSeconds();
//    boolean isContextRequiredResult = editStopTimesPage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = editStopTimesPage.isUseCacheControlNoStore();
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//    Assert.assertFalse(editStopTimesPage.isSynchronizeOnSession());
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(-1, cacheSeconds);
//    Assert.assertTrue(isUseExpiresHeaderResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertNotNull(toStringResult);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
