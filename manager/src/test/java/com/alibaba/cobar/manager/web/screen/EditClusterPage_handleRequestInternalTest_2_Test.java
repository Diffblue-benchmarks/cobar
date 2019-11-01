package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.EditClusterPage;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class EditClusterPage_handleRequestInternalTest_2_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    EditClusterPage editClusterPage = new EditClusterPage();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    editClusterPage.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isUseCacheControlHeaderResult = editClusterPage.isUseCacheControlHeader();
//    String toStringResult = editClusterPage.toString();
//    String[] supportedMethods = editClusterPage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = editClusterPage.isUseExpiresHeader();
//    int cacheSeconds = editClusterPage.getCacheSeconds();
//    boolean isContextRequiredResult = editClusterPage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = editClusterPage.isUseCacheControlNoStore();
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//    Assert.assertFalse(editClusterPage.isSynchronizeOnSession());
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
