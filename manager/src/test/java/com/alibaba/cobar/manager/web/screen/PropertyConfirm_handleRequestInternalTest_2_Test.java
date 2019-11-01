package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.PropertyConfirm;
import java.util.Map;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

public class PropertyConfirm_handleRequestInternalTest_2_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    PropertyConfirm propertyConfirm = new PropertyConfirm();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act
//    ModelAndView actual = propertyConfirm.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
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
//    Assert.assertEquals(2, modelInternal.size());
//    Assert.assertFalse(isEmptyResult);
//    Assert.assertTrue(hasViewResult);
//    Assert.assertSame(modelInternal, model);
//    Assert.assertSame(modelInternal, modelMap);
//    Assert.assertEquals("c_propertyConfirm", viewName);
//    Assert.assertEquals(
//        "ModelAndView: reference to view with name 'c_propertyConfirm'; model is {type=null, info=null}",
//        toStringResult);
//    Assert.assertTrue(isReferenceResult);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = propertyConfirm.isRequireSession();
//    boolean isUseCacheControlHeaderResult = propertyConfirm.isUseCacheControlHeader();
//    String toStringResult1 = propertyConfirm.toString();
//    String[] supportedMethods = propertyConfirm.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = propertyConfirm.isUseExpiresHeader();
//    int cacheSeconds = propertyConfirm.getCacheSeconds();
//    boolean isContextRequiredResult = propertyConfirm.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = propertyConfirm.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(propertyConfirm.isSynchronizeOnSession());
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
