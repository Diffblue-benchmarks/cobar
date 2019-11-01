package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.CobarDetailScreen;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class CobarDetailScreen_handleRequestInternalTest_5_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    CobarDetailScreen cobarDetailScreen = new CobarDetailScreen();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    cobarDetailScreen.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = cobarDetailScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = cobarDetailScreen.isUseCacheControlHeader();
//    String toStringResult = cobarDetailScreen.toString();
//    String[] supportedMethods = cobarDetailScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = cobarDetailScreen.isUseExpiresHeader();
//    int cacheSeconds = cobarDetailScreen.getCacheSeconds();
//    boolean isContextRequiredResult = cobarDetailScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = cobarDetailScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(cobarDetailScreen.isSynchronizeOnSession());
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
