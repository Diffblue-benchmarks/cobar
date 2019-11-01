package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.action.ModifyPassword;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.bind.support.WebBindingInitializer;

public class ModifyPassword_setXmlAccesserTest_4_Test {
//failed_compile   @Test
//  public void setXmlAccesserTest() throws Exception {
//    // Arrange
//    ModifyPassword modifyPassword = new ModifyPassword();
//    XmlAccesser xmlAccesser = new XmlAccesser();
//
//    // Act
//    modifyPassword.setXmlAccesser(xmlAccesser);
//
//    // Assert
//    CobarDAOImple cobarDAO = xmlAccesser.getCobarDAO();
//    String toStringResult = xmlAccesser.toString();
//    UserDAOImple userDAO = xmlAccesser.getUserDAO();
//    ClusterDAOImple clusterDAO = xmlAccesser.getClusterDAO();
//    Assert.assertEquals(null, cobarDAO);
//    Assert.assertEquals(null, xmlAccesser.getPropertyDAO());
//    Assert.assertEquals(null, clusterDAO);
//    Assert.assertEquals(null, userDAO);
//    Assert.assertNotNull(toStringResult);
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
//    String toStringResult1 = modifyPassword.toString();
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
//    Assert.assertNotNull(toStringResult1);
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
