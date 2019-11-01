package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.DatanodesControlScreen;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class DatanodesControlScreen_handleRequestInternalTest_2_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    DatanodesControlScreen datanodesControlScreen = new DatanodesControlScreen();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    datanodesControlScreen.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = datanodesControlScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = datanodesControlScreen.isUseCacheControlHeader();
//    String toStringResult = datanodesControlScreen.toString();
//    String[] supportedMethods = datanodesControlScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = datanodesControlScreen.isUseExpiresHeader();
//    int cacheSeconds = datanodesControlScreen.getCacheSeconds();
//    boolean isContextRequiredResult = datanodesControlScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = datanodesControlScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(datanodesControlScreen.isSynchronizeOnSession());
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
