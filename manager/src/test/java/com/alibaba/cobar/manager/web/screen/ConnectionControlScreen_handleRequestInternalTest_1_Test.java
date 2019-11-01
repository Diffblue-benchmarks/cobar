package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.ConnectionControlScreen;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class ConnectionControlScreen_handleRequestInternalTest_1_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    ConnectionControlScreen connectionControlScreen = new ConnectionControlScreen();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    connectionControlScreen.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = connectionControlScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = connectionControlScreen.isUseCacheControlHeader();
//    String toStringResult = connectionControlScreen.toString();
//    String[] supportedMethods = connectionControlScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = connectionControlScreen.isUseExpiresHeader();
//    int cacheSeconds = connectionControlScreen.getCacheSeconds();
//    boolean isContextRequiredResult = connectionControlScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = connectionControlScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(connectionControlScreen.isSynchronizeOnSession());
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
