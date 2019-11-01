package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.StopHeartbeat;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class StopHeartbeat_handleRequestInternalTest_4_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    StopHeartbeat stopHeartbeat = new StopHeartbeat();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    stopHeartbeat.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isUseCacheControlHeaderResult = stopHeartbeat.isUseCacheControlHeader();
//    String toStringResult = stopHeartbeat.toString();
//    String[] supportedMethods = stopHeartbeat.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = stopHeartbeat.isUseExpiresHeader();
//    int cacheSeconds = stopHeartbeat.getCacheSeconds();
//    boolean isContextRequiredResult = stopHeartbeat.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = stopHeartbeat.isUseCacheControlNoStore();
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//    Assert.assertFalse(stopHeartbeat.isSynchronizeOnSession());
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
