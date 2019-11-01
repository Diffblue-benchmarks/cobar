package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.LoginAction;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.bind.support.WebBindingInitializer;

public class LoginAction_afterPropertiesSetTest_1_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    LoginAction loginAction = new LoginAction();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    loginAction.afterPropertiesSet();
//    boolean isBindOnNewFormResult = loginAction.isBindOnNewForm();
//    Validator[] validators = loginAction.getValidators();
//    boolean isRequireSessionResult = loginAction.isRequireSession();
//    boolean isUseCacheControlHeaderResult = loginAction.isUseCacheControlHeader();
//    boolean isUseExpiresHeaderResult = loginAction.isUseExpiresHeader();
//    BindingErrorProcessor bindingErrorProcessor = loginAction.getBindingErrorProcessor();
//    PropertyEditorRegistrar[] propertyEditorRegistrars = loginAction.getPropertyEditorRegistrars();
//    int cacheSeconds = loginAction.getCacheSeconds();
//    String successView = loginAction.getSuccessView();
//    boolean isSynchronizeOnSessionResult = loginAction.isSynchronizeOnSession();
//    boolean isValidateOnBindingResult = loginAction.isValidateOnBinding();
//    boolean isSessionFormResult = loginAction.isSessionForm();
//    String formSessionAttributeName = loginAction.getFormSessionAttributeName();
//    String toStringResult = loginAction.toString();
//    MessageCodesResolver messageCodesResolver = loginAction.getMessageCodesResolver();
//    String[] supportedMethods = loginAction.getSupportedMethods();
//    boolean isContextRequiredResult = loginAction.isContextRequired();
//    String commandName = loginAction.getCommandName();
//    boolean isUseCacheControlNoStoreResult = loginAction.isUseCacheControlNoStore();
//    Validator validator = loginAction.getValidator();
//    String formView = loginAction.getFormView();
//    Assert.assertFalse(isBindOnNewFormResult);
//    Assert.assertEquals(null, loginAction.getWebBindingInitializer());
//    Assert.assertEquals(null, formView);
//    Assert.assertEquals(null, validator);
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertEquals("command", commandName);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertEquals(null, messageCodesResolver);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals("com.alibaba.cobar.manager.web.action.LoginAction.FORM.command", formSessionAttributeName);
//    Assert.assertFalse(isSessionFormResult);
//    Assert.assertTrue(isValidateOnBindingResult);
//    Assert.assertFalse(isSynchronizeOnSessionResult);
//    Assert.assertEquals(null, successView);
//    Assert.assertEquals(0, cacheSeconds);
//    Assert.assertEquals(null, propertyEditorRegistrars);
//    Assert.assertEquals(null, bindingErrorProcessor);
//    Assert.assertTrue(isUseExpiresHeaderResult);
//    Assert.assertTrue(isUseCacheControlHeaderResult);
//    Assert.assertFalse(isRequireSessionResult);
//    Assert.assertEquals(null, validators);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
