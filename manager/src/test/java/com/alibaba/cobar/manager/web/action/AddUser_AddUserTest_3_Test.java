package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.AddUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.bind.support.WebBindingInitializer;

public class AddUser_AddUserTest_3_Test {
//failed_compile   @Test
//  public void AddUserTest() throws Exception {
//    // Arrange and Act
//    AddUser addUser = new AddUser();
//
//    // Assert
//    boolean isBindOnNewFormResult = addUser.isBindOnNewForm();
//    Validator[] validators = addUser.getValidators();
//    boolean isRequireSessionResult = addUser.isRequireSession();
//    boolean isUseCacheControlHeaderResult = addUser.isUseCacheControlHeader();
//    boolean isUseExpiresHeaderResult = addUser.isUseExpiresHeader();
//    BindingErrorProcessor bindingErrorProcessor = addUser.getBindingErrorProcessor();
//    PropertyEditorRegistrar[] propertyEditorRegistrars = addUser.getPropertyEditorRegistrars();
//    int cacheSeconds = addUser.getCacheSeconds();
//    String successView = addUser.getSuccessView();
//    boolean isSynchronizeOnSessionResult = addUser.isSynchronizeOnSession();
//    boolean isValidateOnBindingResult = addUser.isValidateOnBinding();
//    boolean isSessionFormResult = addUser.isSessionForm();
//    String formSessionAttributeName = addUser.getFormSessionAttributeName();
//    String toStringResult = addUser.toString();
//    Class commandClass = addUser.getCommandClass();
//    MessageCodesResolver messageCodesResolver = addUser.getMessageCodesResolver();
//    String[] supportedMethods = addUser.getSupportedMethods();
//    boolean isContextRequiredResult = addUser.isContextRequired();
//    String commandName = addUser.getCommandName();
//    boolean isUseCacheControlNoStoreResult = addUser.isUseCacheControlNoStore();
//    Validator validator = addUser.getValidator();
//    String formView = addUser.getFormView();
//    Assert.assertFalse(isBindOnNewFormResult);
//    Assert.assertEquals(null, addUser.getWebBindingInitializer());
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
//    Assert.assertEquals("com.alibaba.cobar.manager.web.action.AddUser.FORM.command", formSessionAttributeName);
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
