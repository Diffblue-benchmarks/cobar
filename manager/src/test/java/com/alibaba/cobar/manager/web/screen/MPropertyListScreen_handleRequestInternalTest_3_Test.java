package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.MPropertyListScreen;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class MPropertyListScreen_handleRequestInternalTest_3_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    MPropertyListScreen mPropertyListScreen = new MPropertyListScreen();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    mPropertyListScreen.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = mPropertyListScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = mPropertyListScreen.isUseCacheControlHeader();
//    String toStringResult = mPropertyListScreen.toString();
//    String[] supportedMethods = mPropertyListScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = mPropertyListScreen.isUseExpiresHeader();
//    int cacheSeconds = mPropertyListScreen.getCacheSeconds();
//    boolean isContextRequiredResult = mPropertyListScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = mPropertyListScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(mPropertyListScreen.isSynchronizeOnSession());
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
