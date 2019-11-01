package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.ClusterListScreen;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.servlet.ModelAndView;

public class ClusterListScreen_handleRequestInternalTest_4_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    ClusterListScreen clusterListScreen = new ClusterListScreen();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    clusterListScreen.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = clusterListScreen.isRequireSession();
//    boolean isUseCacheControlHeaderResult = clusterListScreen.isUseCacheControlHeader();
//    String toStringResult = clusterListScreen.toString();
//    String[] supportedMethods = clusterListScreen.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = clusterListScreen.isUseExpiresHeader();
//    int cacheSeconds = clusterListScreen.getCacheSeconds();
//    boolean isContextRequiredResult = clusterListScreen.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = clusterListScreen.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(clusterListScreen.isSynchronizeOnSession());
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
