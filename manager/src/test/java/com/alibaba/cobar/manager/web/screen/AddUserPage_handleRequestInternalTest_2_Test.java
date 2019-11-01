package com.alibaba.cobar.manager.web.screen;

import com.alibaba.cobar.manager.web.screen.AddUserPage;
import java.util.Map;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

public class AddUserPage_handleRequestInternalTest_2_Test {
//failed_compile   @Test
//  public void handleRequestInternalTest() throws Exception {
//    // Arrange
//    AddUserPage addUserPage = new AddUserPage();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//
//    // Act
//    ModelAndView actual = addUserPage.handleRequestInternal(httpServletRequestWrapper, httpServletResponseWrapper);
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
//    Assert.assertEquals("m_addUser", viewName);
//    Assert.assertEquals("ModelAndView: reference to view with name 'm_addUser'; model is null", toStringResult);
//    Assert.assertTrue(isReferenceResult);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    boolean isRequireSessionResult = addUserPage.isRequireSession();
//    boolean isUseCacheControlHeaderResult = addUserPage.isUseCacheControlHeader();
//    String toStringResult1 = addUserPage.toString();
//    String[] supportedMethods = addUserPage.getSupportedMethods();
//    boolean isUseExpiresHeaderResult = addUserPage.isUseExpiresHeader();
//    int cacheSeconds = addUserPage.getCacheSeconds();
//    boolean isContextRequiredResult = addUserPage.isContextRequired();
//    boolean isUseCacheControlNoStoreResult = addUserPage.isUseCacheControlNoStore();
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertFalse(addUserPage.isSynchronizeOnSession());
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
