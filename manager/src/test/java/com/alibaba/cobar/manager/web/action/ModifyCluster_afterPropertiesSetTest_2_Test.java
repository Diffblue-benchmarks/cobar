package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.ModifyCluster;
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

public class ModifyCluster_afterPropertiesSetTest_2_Test {
//failed_compile   @Test
//  public void afterPropertiesSetTest() throws Exception {
//    // Arrange
//    ModifyCluster modifyCluster = new ModifyCluster();
//
//    // Act and Assert
//    thrown.expect(IllegalArgumentException.class);
//    modifyCluster.afterPropertiesSet();
//    boolean isBindOnNewFormResult = modifyCluster.isBindOnNewForm();
//    Validator[] validators = modifyCluster.getValidators();
//    boolean isRequireSessionResult = modifyCluster.isRequireSession();
//    boolean isUseCacheControlHeaderResult = modifyCluster.isUseCacheControlHeader();
//    boolean isUseExpiresHeaderResult = modifyCluster.isUseExpiresHeader();
//    BindingErrorProcessor bindingErrorProcessor = modifyCluster.getBindingErrorProcessor();
//    PropertyEditorRegistrar[] propertyEditorRegistrars = modifyCluster.getPropertyEditorRegistrars();
//    int cacheSeconds = modifyCluster.getCacheSeconds();
//    String successView = modifyCluster.getSuccessView();
//    boolean isSynchronizeOnSessionResult = modifyCluster.isSynchronizeOnSession();
//    boolean isValidateOnBindingResult = modifyCluster.isValidateOnBinding();
//    boolean isSessionFormResult = modifyCluster.isSessionForm();
//    String formSessionAttributeName = modifyCluster.getFormSessionAttributeName();
//    String toStringResult = modifyCluster.toString();
//    MessageCodesResolver messageCodesResolver = modifyCluster.getMessageCodesResolver();
//    String[] supportedMethods = modifyCluster.getSupportedMethods();
//    boolean isContextRequiredResult = modifyCluster.isContextRequired();
//    String commandName = modifyCluster.getCommandName();
//    boolean isUseCacheControlNoStoreResult = modifyCluster.isUseCacheControlNoStore();
//    Validator validator = modifyCluster.getValidator();
//    String formView = modifyCluster.getFormView();
//    Assert.assertFalse(isBindOnNewFormResult);
//    Assert.assertEquals(null, modifyCluster.getWebBindingInitializer());
//    Assert.assertEquals(null, formView);
//    Assert.assertEquals(null, validator);
//    Assert.assertTrue(isUseCacheControlNoStoreResult);
//    Assert.assertEquals("command", commandName);
//    Assert.assertTrue(isContextRequiredResult);
//    Assert.assertEquals(3, supportedMethods.length);
//    Assert.assertArrayEquals(new String[]{"HEAD", "POST", "GET"}, supportedMethods);
//    Assert.assertEquals(null, messageCodesResolver);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals("com.alibaba.cobar.manager.web.action.ModifyCluster.FORM.command", formSessionAttributeName);
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
