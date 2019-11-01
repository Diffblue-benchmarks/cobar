package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.MUserModifyPwd;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class MUserModifyPwd_handleRequestInternalTest_3_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    MUserModifyPwd mUserModifyPwd = new MUserModifyPwd();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    mUserModifyPwd.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = mUserModifyPwd.isRequireSession();
//    boolean isUseCacheControlHeaderResult = mUserModifyPwd.isUseCacheControlHeader();
//    String toStringResult = mUserModifyPwd.toString();
//    String[] supportedMethods = mUserModifyPwd.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = mUserModifyPwd.isUseExpiresHeader();
//    int cacheSeconds = mUserModifyPwd.getCacheSeconds();
//    boolean isContextRequiredResult = mUserModifyPwd.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = mUserModifyPwd.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(mUserModifyPwd.isSynchronizeOnSession());
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
