package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.ChooseStoptimePage;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class ChooseStoptimePage_handleRequestInternalTest_1_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    ChooseStoptimePage chooseStoptimePage = new ChooseStoptimePage();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    chooseStoptimePage.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = chooseStoptimePage.isRequireSession();
//    boolean isUseCacheControlHeaderResult = chooseStoptimePage.isUseCacheControlHeader();
//    String toStringResult = chooseStoptimePage.toString();
//    String[] supportedMethods = chooseStoptimePage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = chooseStoptimePage.isUseExpiresHeader();
//    int cacheSeconds = chooseStoptimePage.getCacheSeconds();
//    boolean isContextRequiredResult = chooseStoptimePage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = chooseStoptimePage.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(chooseStoptimePage.isSynchronizeOnSession());
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
