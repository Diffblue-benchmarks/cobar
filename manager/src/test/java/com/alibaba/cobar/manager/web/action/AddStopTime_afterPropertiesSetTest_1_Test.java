package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.AddStopTime;
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

public class AddStopTime_afterPropertiesSetTest_1_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    AddStopTime addStopTime = new AddStopTime();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    addStopTime.afterPropertiesSet();
//    boolean isBindOnNewFormResult = addStopTime.isBindOnNewForm();
//    Validator[] validators = addStopTime.getValidators();
//    boolean isRequireSessionResult = addStopTime.isRequireSession();
//    boolean isUseCacheControlHeaderResult = addStopTime.isUseCacheControlHeader();
//    boolean isUseExpiresHeaderResult = addStopTime.isUseExpiresHeader();
//    BindingErrorProcessor bindingErrorProcessor = addStopTime.getBindingErrorProcessor();
//    PropertyEditorRegistrar[] propertyEditorRegistrars = addStopTime.getPropertyEditorRegistrars();
//    int cacheSeconds = addStopTime.getCacheSeconds();
//    String successView = addStopTime.getSuccessView();
//    boolean isSynchronizeOnSessionResult = addStopTime.isSynchronizeOnSession();
//    boolean isValidateOnBindingResult = addStopTime.isValidateOnBinding();
//    boolean isSessionFormResult = addStopTime.isSessionForm();
//    String formSessionAttributeName = addStopTime.getFormSessionAttributeName();
//    String toStringResult = addStopTime.toString();
//    MessageCodesResolver messageCodesResolver = addStopTime.getMessageCodesResolver();
//    String[] supportedMethods = addStopTime.getSupportedMethods();
//    boolean isContextRequiredResult = addStopTime.isContextRequired();
//    String commandName = addStopTime.getCommandName();
//    boolean isUseCacheControlNoStoreResult = addStopTime.isUseCacheControlNoStore();
//    Validator validator = addStopTime.getValidator();
//    String formView = addStopTime.getFormView();
//    Assert.assertFalse(isBindOnNewFormResult);
//    Assert.assertEquals(null, addStopTime.getWebBindingInitializer());
//    Assert.assertEquals(null, formView);
//    Assert.assertEquals(null, validator);
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertEquals("command", commandName);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertEquals(null, messageCodesResolver);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals("com.alibaba.cobar.manager.web.action.AddStopTime.FORM.command", formSessionAttributeName);
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
