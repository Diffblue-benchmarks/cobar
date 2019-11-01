package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.ModifyUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.bind.support.WebBindingInitializer;

public class ModifyUser_ModifyUserTest_3_Test {
//failed_compile   @Test
//  public void ModifyUserTest() throws Exception {
//    // Arrange and Act
//    ModifyUser modifyUser = new ModifyUser();
//
//    // Assert
//    boolean isBindOnNewFormResult = modifyUser.isBindOnNewForm();
//    Validator[] validators = modifyUser.getValidators();
//    boolean isRequireSessionResult = modifyUser.isRequireSession();
//    boolean isUseCacheControlHeaderResult = modifyUser.isUseCacheControlHeader();
//    boolean isUseExpiresHeaderResult = modifyUser.isUseExpiresHeader();
//    BindingErrorProcessor bindingErrorProcessor = modifyUser.getBindingErrorProcessor();
//    PropertyEditorRegistrar[] propertyEditorRegistrars = modifyUser.getPropertyEditorRegistrars();
//    int cacheSeconds = modifyUser.getCacheSeconds();
//    String successView = modifyUser.getSuccessView();
//    boolean isSynchronizeOnSessionResult = modifyUser.isSynchronizeOnSession();
//    boolean isValidateOnBindingResult = modifyUser.isValidateOnBinding();
//    boolean isSessionFormResult = modifyUser.isSessionForm();
//    String formSessionAttributeName = modifyUser.getFormSessionAttributeName();
//    String toStringResult = modifyUser.toString();
//    Class commandClass = modifyUser.getCommandClass();
//    MessageCodesResolver messageCodesResolver = modifyUser.getMessageCodesResolver();
//    String[] supportedMethods = modifyUser.getSupportedMethods();
//    boolean isContextRequiredResult = modifyUser.isContextRequired();
//    String commandName = modifyUser.getCommandName();
//    boolean isUseCacheControlNoStoreResult = modifyUser.isUseCacheControlNoStore();
//    Validator validator = modifyUser.getValidator();
//    String formView = modifyUser.getFormView();
//    Assert.assertFalse(isBindOnNewFormResult);
//    Assert.assertEquals(null, modifyUser.getWebBindingInitializer());
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
//    Assert.assertEquals("com.alibaba.cobar.manager.web.action.ModifyUser.FORM.command", formSessionAttributeName);
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
