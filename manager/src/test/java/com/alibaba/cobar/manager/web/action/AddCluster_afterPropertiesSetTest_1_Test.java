package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.AddCluster;
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

public class AddCluster_afterPropertiesSetTest_1_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    AddCluster addCluster = new AddCluster();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    addCluster.afterPropertiesSet();
//    boolean isBindOnNewFormResult = addCluster.isBindOnNewForm();
//    Validator[] validators = addCluster.getValidators();
//    boolean isRequireSessionResult = addCluster.isRequireSession();
//    boolean isUseCacheControlHeaderResult = addCluster.isUseCacheControlHeader();
//    boolean isUseExpiresHeaderResult = addCluster.isUseExpiresHeader();
//    BindingErrorProcessor bindingErrorProcessor = addCluster.getBindingErrorProcessor();
//    PropertyEditorRegistrar[] propertyEditorRegistrars = addCluster.getPropertyEditorRegistrars();
//    int cacheSeconds = addCluster.getCacheSeconds();
//    String successView = addCluster.getSuccessView();
//    boolean isSynchronizeOnSessionResult = addCluster.isSynchronizeOnSession();
//    boolean isValidateOnBindingResult = addCluster.isValidateOnBinding();
//    boolean isSessionFormResult = addCluster.isSessionForm();
//    String formSessionAttributeName = addCluster.getFormSessionAttributeName();
//    String toStringResult = addCluster.toString();
//    MessageCodesResolver messageCodesResolver = addCluster.getMessageCodesResolver();
//    String[] supportedMethods = addCluster.getSupportedMethods();
//    boolean isContextRequiredResult = addCluster.isContextRequired();
//    String commandName = addCluster.getCommandName();
//    boolean isUseCacheControlNoStoreResult = addCluster.isUseCacheControlNoStore();
//    Validator validator = addCluster.getValidator();
//    String formView = addCluster.getFormView();
//    Assert.assertFalse(isBindOnNewFormResult);
//    Assert.assertEquals(null, addCluster.getWebBindingInitializer());
//    Assert.assertEquals(null, formView);
//    Assert.assertEquals(null, validator);
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertEquals("command", commandName);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertEquals(null, messageCodesResolver);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals("com.alibaba.cobar.manager.web.action.AddCluster.FORM.command", formSessionAttributeName);
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
