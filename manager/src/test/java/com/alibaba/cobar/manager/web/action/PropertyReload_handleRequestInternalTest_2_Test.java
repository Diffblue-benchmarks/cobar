package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.PropertyReload;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class PropertyReload_handleRequestInternalTest_2_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    PropertyReload propertyReload = new PropertyReload();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    propertyReload.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = propertyReload.isRequireSession();
//    boolean isUseCacheControlHeaderResult = propertyReload.isUseCacheControlHeader();
//    String toStringResult = propertyReload.toString();
//    String[] supportedMethods = propertyReload.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = propertyReload.isUseExpiresHeader();
//    int cacheSeconds = propertyReload.getCacheSeconds();
//    boolean isContextRequiredResult = propertyReload.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = propertyReload.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(propertyReload.isSynchronizeOnSession());
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
