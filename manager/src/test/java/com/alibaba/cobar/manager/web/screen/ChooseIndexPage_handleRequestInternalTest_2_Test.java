package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.ChooseIndexPage;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class ChooseIndexPage_handleRequestInternalTest_2_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    ChooseIndexPage chooseIndexPage = new ChooseIndexPage();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    chooseIndexPage.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = chooseIndexPage.isRequireSession();
//    boolean isUseCacheControlHeaderResult = chooseIndexPage.isUseCacheControlHeader();
//    String toStringResult = chooseIndexPage.toString();
//    String[] supportedMethods = chooseIndexPage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = chooseIndexPage.isUseExpiresHeader();
//    int cacheSeconds = chooseIndexPage.getCacheSeconds();
//    boolean isContextRequiredResult = chooseIndexPage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = chooseIndexPage.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(chooseIndexPage.isSynchronizeOnSession());
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
