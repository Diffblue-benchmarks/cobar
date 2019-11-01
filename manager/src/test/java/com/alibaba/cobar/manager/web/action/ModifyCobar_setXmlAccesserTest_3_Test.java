package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.action.ModifyCobar;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.bind.support.WebBindingInitializer;

public class ModifyCobar_setXmlAccesserTest_3_Test {
//failed_compile   @Test
//  public void setXmlAccesserTest() throws Exception {
//    // Arrange
//    ModifyCobar modifyCobar = new ModifyCobar();
//    XmlAccesser xmlAccesser = new XmlAccesser();
//
//    // Act
//    modifyCobar.setXmlAccesser(xmlAccesser);
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
//    boolean isBindOnNewFormResult = modifyCobar.isBindOnNewForm();
//    Validator[] validators = modifyCobar.getValidators();
//    boolean isRequireSessionResult = modifyCobar.isRequireSession();
//    boolean isUseCacheControlHeaderResult = modifyCobar.isUseCacheControlHeader();
//    boolean isUseExpiresHeaderResult = modifyCobar.isUseExpiresHeader();
//    BindingErrorProcessor bindingErrorProcessor = modifyCobar.getBindingErrorProcessor();
//    PropertyEditorRegistrar[] propertyEditorRegistrars = modifyCobar.getPropertyEditorRegistrars();
//    int cacheSeconds = modifyCobar.getCacheSeconds();
//    String successView = modifyCobar.getSuccessView();
//    boolean isSynchronizeOnSessionResult = modifyCobar.isSynchronizeOnSession();
//    boolean isValidateOnBindingResult = modifyCobar.isValidateOnBinding();
//    boolean isSessionFormResult = modifyCobar.isSessionForm();
//    String formSessionAttributeName = modifyCobar.getFormSessionAttributeName();
//    String toStringResult1 = modifyCobar.toString();
//    Class commandClass = modifyCobar.getCommandClass();
//    MessageCodesResolver messageCodesResolver = modifyCobar.getMessageCodesResolver();
//    String[] supportedMethods = modifyCobar.getSupportedMethods();
//    boolean isContextRequiredResult = modifyCobar.isContextRequired();
//    String commandName = modifyCobar.getCommandName();
//    boolean isUseCacheControlNoStoreResult = modifyCobar.isUseCacheControlNoStore();
//    Validator validator = modifyCobar.getValidator();
//    String formView = modifyCobar.getFormView();
//    Assert.assertFalse(isBindOnNewFormResult);
//    Assert.assertEquals(null, modifyCobar.getWebBindingInitializer());
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
//    Assert.assertEquals("com.alibaba.cobar.manager.web.action.ModifyCobar.FORM.command", formSessionAttributeName);
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
