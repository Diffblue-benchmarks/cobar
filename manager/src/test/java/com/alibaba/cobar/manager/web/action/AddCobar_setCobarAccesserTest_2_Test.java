package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.action.AddCobar;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.bind.support.WebBindingInitializer;

public class AddCobar_setCobarAccesserTest_2_Test {
//failed_compile   @Test
//  public void setCobarAccesserTest() throws Exception {
//    // Arrange
//    AddCobar addCobar = new AddCobar();
//    CobarAccesser cobarAccesser = new CobarAccesser();
//
//    // Act
//    addCobar.setCobarAccesser(cobarAccesser);
//
//    // Assert
//    String toStringResult = cobarAccesser.toString();
//    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
//    Assert.assertEquals(null, xmlAccesser);
//    boolean isBindOnNewFormResult = addCobar.isBindOnNewForm();
//    Validator[] validators = addCobar.getValidators();
//    boolean isRequireSessionResult = addCobar.isRequireSession();
//    boolean isUseCacheControlHeaderResult = addCobar.isUseCacheControlHeader();
//    boolean isUseExpiresHeaderResult = addCobar.isUseExpiresHeader();
//    BindingErrorProcessor bindingErrorProcessor = addCobar.getBindingErrorProcessor();
//    PropertyEditorRegistrar[] propertyEditorRegistrars = addCobar.getPropertyEditorRegistrars();
//    int cacheSeconds = addCobar.getCacheSeconds();
//    String successView = addCobar.getSuccessView();
//    boolean isSynchronizeOnSessionResult = addCobar.isSynchronizeOnSession();
//    boolean isValidateOnBindingResult = addCobar.isValidateOnBinding();
//    boolean isSessionFormResult = addCobar.isSessionForm();
//    String formSessionAttributeName = addCobar.getFormSessionAttributeName();
//    String toStringResult1 = addCobar.toString();
//    Class commandClass = addCobar.getCommandClass();
//    MessageCodesResolver messageCodesResolver = addCobar.getMessageCodesResolver();
//    String[] supportedMethods = addCobar.getSupportedMethods();
//    boolean isContextRequiredResult = addCobar.isContextRequired();
//    String commandName = addCobar.getCommandName();
//    boolean isUseCacheControlNoStoreResult = addCobar.isUseCacheControlNoStore();
//    Validator validator = addCobar.getValidator();
//    String formView = addCobar.getFormView();
//    Assert.assertFalse(isBindOnNewFormResult);
//    Assert.assertEquals(null, addCobar.getWebBindingInitializer());
//    Assert.assertEquals(null, formView);
//    Assert.assertEquals(null, validator);
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertEquals("command", commandName);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertEquals(null, messageCodesResolver);
//    Assert.assertEquals(null, commandClass);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals("com.alibaba.cobar.manager.web.action.AddCobar.FORM.command", formSessionAttributeName);
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
