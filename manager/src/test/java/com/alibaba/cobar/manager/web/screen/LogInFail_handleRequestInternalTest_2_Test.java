package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.LogInFail;
import java.util.Map;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

public class LogInFail_handleRequestInternalTest_2_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    LogInFail logInFail = new LogInFail();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act
//    ModelAndView actual = logInFail.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
//
//    // Assert
//    Map modelInternal = actual.getModelInternal();
//    boolean isReferenceResult = actual.isReference();
//    String toStringResult = actual.toString();
//    String viewName = actual.getViewName();
//    ModelMap modelMap = actual.getModelMap();
//    Map model = actual.getModel();
//    boolean hasViewResult = actual.hasView();
//    boolean isEmptyResult = actual.isEmpty();
//    Assert.assertEquals(null, modelInternal);
//    Assert.assertEquals(null, actual.getView());
//    Assert.assertFalse(isEmptyResult);
//    Assert.assertTrue(hasViewResult);
//    Assert.assertTrue(model instanceof ModelMap);
//    Assert.assertEquals(0, modelMap.size());
//    Assert.assertSame(modelMap, model);
//    Assert.assertEquals("logInFail", viewName);
//    Assert.assertEquals("ModelAndView: reference to view with name 'logInFail'; model is null", toStringResult);
//    Assert.assertTrue(isReferenceResult);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = logInFail.isRequireSession();
//    boolean isUseCacheControlHeaderResult = logInFail.isUseCacheControlHeader();
//    String toStringResult1 = logInFail.toString();
//    String[] supportedMethods = logInFail.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = logInFail.isUseExpiresHeader();
//    int cacheSeconds = logInFail.getCacheSeconds();
//    boolean isContextRequiredResult = logInFail.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = logInFail.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(logInFail.isSynchronizeOnSession());
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(-1, cacheSeconds);
//    Assert.assertTrue(isUseExpiresHeaderResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
