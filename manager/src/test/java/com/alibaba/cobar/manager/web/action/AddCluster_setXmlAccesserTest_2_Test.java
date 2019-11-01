package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.action.AddCluster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.bind.support.WebBindingInitializer;

public class AddCluster_setXmlAccesserTest_2_Test {
//failed_compile   @Test
//  public void setXmlAccesserTest() throws Exception {
//    // Arrange
//    AddCluster addCluster = new AddCluster();
//    XmlAccesser xmlAccesser = new XmlAccesser();
//
//    // Act
//    addCluster.setXmlAccesser(xmlAccesser);
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
//    String toStringResult1 = addCluster.toString();
//    Class commandClass = addCluster.getCommandClass();
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
//    Assert.assertEquals(null, commandClass);
//    Assert.assertNotNull(toStringResult1);
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
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
