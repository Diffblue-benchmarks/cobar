package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.ModifyPassword;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.bind.support.WebBindingInitializer;

public class ModifyPassword_ModifyPasswordTest_3_Test {
//failed_compile   @Test
//  public void ModifyPasswordTest() throws Exception {
//    // Arrange and Act
//    ModifyPassword modifyPassword = new ModifyPassword();
//
//    // Assert
//    boolean isBindOnNewFormResult = modifyPassword.isBindOnNewForm();
//    Validator[] validators = modifyPassword.getValidators();
//    boolean isRequireSessionResult = modifyPassword.isRequireSession();
//    boolean isUseCacheControlHeaderResult = modifyPassword.isUseCacheControlHeader();
//    boolean isUseExpiresHeaderResult = modifyPassword.isUseExpiresHeader();
//    BindingErrorProcessor bindingErrorProcessor = modifyPassword.getBindingErrorProcessor();
//    PropertyEditorRegistrar[] propertyEditorRegistrars = modifyPassword.getPropertyEditorRegistrars();
//    int cacheSeconds = modifyPassword.getCacheSeconds();
//    String successView = modifyPassword.getSuccessView();
//    boolean isSynchronizeOnSessionResult = modifyPassword.isSynchronizeOnSession();
//    boolean isValidateOnBindingResult = modifyPassword.isValidateOnBinding();
//    boolean isSessionFormResult = modifyPassword.isSessionForm();
//    String formSessionAttributeName = modifyPassword.getFormSessionAttributeName();
//    String toStringResult = modifyPassword.toString();
//    Class commandClass = modifyPassword.getCommandClass();
//    MessageCodesResolver messageCodesResolver = modifyPassword.getMessageCodesResolver();
//    String[] supportedMethods = modifyPassword.getSupportedMethods();
//    boolean isContextRequiredResult = modifyPassword.isContextRequired();
//    String commandName = modifyPassword.getCommandName();
//    boolean isUseCacheControlNoStoreResult = modifyPassword.isUseCacheControlNoStore();
//    Validator validator = modifyPassword.getValidator();
//    String formView = modifyPassword.getFormView();
//    Assert.assertFalse(isBindOnNewFormResult);
//    Assert.assertEquals(null, modifyPassword.getWebBindingInitializer());
//    Assert.assertEquals(null, formView);
//    Assert.assertEquals(null, validator);
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertEquals("command", commandName);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertEquals(null, messageCodesResolver);
//    Assert.assertEquals(null, commandClass);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals("com.alibaba.cobar.manager.web.action.ModifyPassword.FORM.command", formSessionAttributeName);
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
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
