package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.AddClusterPage;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class AddClusterPage_handleRequestInternalTest_1_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    AddClusterPage addClusterPage = new AddClusterPage();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    addClusterPage.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = addClusterPage.isRequireSession();
//    boolean isUseCacheControlHeaderResult = addClusterPage.isUseCacheControlHeader();
//    String toStringResult = addClusterPage.toString();
//    String[] supportedMethods = addClusterPage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = addClusterPage.isUseExpiresHeader();
//    int cacheSeconds = addClusterPage.getCacheSeconds();
//    boolean isContextRequiredResult = addClusterPage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = addClusterPage.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(addClusterPage.isSynchronizeOnSession());
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
