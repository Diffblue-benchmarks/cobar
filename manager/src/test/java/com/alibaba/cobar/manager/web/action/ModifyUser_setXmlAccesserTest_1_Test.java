package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.action.ModifyUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.bind.support.WebBindingInitializer;

public class ModifyUser_setXmlAccesserTest_1_Test {
//failed_compile   @Test
//  public void setXmlAccesserTest() throws Exception {
//    // Arrange
//    ModifyUser modifyUser = new ModifyUser();
//    XmlAccesser xmlAccesser = new XmlAccesser();
//
//    // Act
//    modifyUser.setXmlAccesser(xmlAccesser);
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
//    String toStringResult1 = modifyUser.toString();
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
//    Assert.assertNotNull(toStringResult1);
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
