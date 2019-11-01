package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.KillConfirm;
import java.util.Map;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

public class KillConfirm_handleRequestInternalTest_2_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    KillConfirm killConfirm = new KillConfirm();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act
//    ModelAndView actual = killConfirm.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
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
//    Assert.assertTrue(modelInternal instanceof ModelMap);
//    Assert.assertEquals(null, actual.getView());
//    Assert.assertEquals(1, modelInternal.size());
//    Assert.assertFalse(isEmptyResult);
//    Assert.assertTrue(hasViewResult);
//    Assert.assertSame(modelInternal, model);
//    Assert.assertSame(modelInternal, modelMap);
//    Assert.assertEquals("c_killConfirm", viewName);
//    Assert.assertEquals("ModelAndView: reference to view with name 'c_killConfirm'; model is {info=confirm}",
//        toStringResult);
//    Assert.assertTrue(isReferenceResult);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = killConfirm.isRequireSession();
//    boolean isUseCacheControlHeaderResult = killConfirm.isUseCacheControlHeader();
//    String toStringResult1 = killConfirm.toString();
//    String[] supportedMethods = killConfirm.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = killConfirm.isUseExpiresHeader();
//    int cacheSeconds = killConfirm.getCacheSeconds();
//    boolean isContextRequiredResult = killConfirm.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = killConfirm.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(killConfirm.isSynchronizeOnSession());
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
