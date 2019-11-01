package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.KillConnection;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class KillConnection_handleRequestInternalTest_1_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    KillConnection killConnection = new KillConnection();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    killConnection.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isUseCacheControlHeaderResult = killConnection.isUseCacheControlHeader();
//    String toStringResult = killConnection.toString();
//    String[] supportedMethods = killConnection.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = killConnection.isUseExpiresHeader();
//    int cacheSeconds = killConnection.getCacheSeconds();
//    boolean isContextRequiredResult = killConnection.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = killConnection.isUseCacheControlNoStore();
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//    Assert.assertFalse(killConnection.isSynchronizeOnSession());
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
