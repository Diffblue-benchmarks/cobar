package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.SwitchDatanodes;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class SwitchDatanodes_handleRequestInternalTest_5_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    SwitchDatanodes switchDatanodes = new SwitchDatanodes();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    switchDatanodes.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = switchDatanodes.isRequireSession();
//    boolean isUseCacheControlHeaderResult = switchDatanodes.isUseCacheControlHeader();
//    String toStringResult = switchDatanodes.toString();
//    String[] supportedMethods = switchDatanodes.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = switchDatanodes.isUseExpiresHeader();
//    int cacheSeconds = switchDatanodes.getCacheSeconds();
//    boolean isContextRequiredResult = switchDatanodes.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = switchDatanodes.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(switchDatanodes.isSynchronizeOnSession());
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
