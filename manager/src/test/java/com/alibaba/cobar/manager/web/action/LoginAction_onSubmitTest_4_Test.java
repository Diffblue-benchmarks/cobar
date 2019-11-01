package com.alibaba.cobar.manager.web.action;

import com.alibaba.cobar.manager.web.action.LoginAction;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;

public class LoginAction_onSubmitTest_4_Test {
//failed_compile   @Test
//  public void onSubmitTest() throws Exception {
//    // Arrange
//    LoginAction loginAction = new LoginAction();
//    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
//    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
//    String string = "kaaaa";
//    BeanPropertyBindingResult beanPropertyBindingResult = new BeanPropertyBindingResult(string, "aaaaa");
//    BindException bindException = new BindException(beanPropertyBindingResult);
//
//    // Act and Assert
//    thrown.expect(ClassCastException.class);
//    loginAction.onSubmit(httpServletRequestWrapper, httpServletResponseWrapper, string, bindException);
//    Assert.assertEquals(null, httpServletRequestWrapper);
//    Assert.assertEquals(null, httpServletResponseWrapper);
//    String objectName = bindException.getObjectName();
//    String nestedPath = bindException.getNestedPath();
//    int errorCount = bindException.getErrorCount();
//    String toStringResult = bindException.toString();
//    String message = bindException.getMessage();
//    FieldError fieldError = bindException.getFieldError();
//    boolean hasGlobalErrorsResult = bindException.hasGlobalErrors();
//    boolean hasFieldErrorsResult = bindException.hasFieldErrors();
//    boolean hasErrorsResult = bindException.hasErrors();
//    Map model = bindException.getModel();
//    int globalErrorCount = bindException.getGlobalErrorCount();
//    Throwable[] suppressed = bindException.getSuppressed();
//    String[] suppressedFields = bindException.getSuppressedFields();
//    PropertyEditorRegistry propertyEditorRegistry = bindException.getPropertyEditorRegistry();
//    ObjectError globalError = bindException.getGlobalError();
//    Throwable cause = bindException.getCause();
//    int fieldErrorCount = bindException.getFieldErrorCount();
//    BindingResult bindingResult = bindException.getBindingResult();
//    Object target = bindException.getTarget();
//    Assert.assertEquals("aaaaa", objectName);
//    Assert.assertEquals("org.springframework.validation.BeanPropertyBindingResult: 0 errors",
//        bindException.getLocalizedMessage());
//    Assert.assertTrue(target instanceof String);
//    Assert.assertSame(beanPropertyBindingResult, bindingResult);
//    Assert.assertTrue(bindingResult instanceof BeanPropertyBindingResult);
//    Assert.assertEquals("kaaaa", target);
//    Assert.assertSame(beanPropertyBindingResult, bindingResult);
//    Assert.assertEquals(0, fieldErrorCount);
//    Assert.assertEquals(null, cause);
//    Assert.assertEquals(null, globalError);
//    Assert.assertTrue(propertyEditorRegistry instanceof BeanWrapperImpl);
//    Assert.assertEquals(0, suppressedFields.length);
//    Assert.assertArrayEquals(new String[]{}, suppressedFields);
//    String nestedPath1 = ((BeanWrapperImpl) propertyEditorRegistry).getNestedPath();
//    String toStringResult1 = ((BeanWrapperImpl) propertyEditorRegistry).toString();
//    Class rootClass = ((BeanWrapperImpl) propertyEditorRegistry).getRootClass();
//    Class wrappedClass = ((BeanWrapperImpl) propertyEditorRegistry).getWrappedClass();
//    Object rootInstance = ((BeanWrapperImpl) propertyEditorRegistry).getRootInstance();
//    PropertyDescriptor[] propertyDescriptors = ((BeanWrapperImpl) propertyEditorRegistry).getPropertyDescriptors();
//    boolean isExtractOldValueForEditorResult = ((BeanWrapperImpl) propertyEditorRegistry).isExtractOldValueForEditor();
//    Object wrappedInstance = ((BeanWrapperImpl) propertyEditorRegistry).getWrappedInstance();
//    Assert.assertEquals(0, suppressed.length);
//    Assert.assertEquals("", nestedPath);
//    Assert.assertEquals(
//        "org.springframework.validation.BindException: org.springframework.validation.BeanPropertyBindingResult: 0 errors",
//        toStringResult);
//    Assert.assertFalse(hasFieldErrorsResult);
//    Assert.assertFalse(hasErrorsResult);
//    Assert.assertEquals("org.springframework.validation.BeanPropertyBindingResult: 0 errors", message);
//    Assert.assertTrue(model instanceof java.util.HashMap);
//    Assert.assertEquals(0, globalErrorCount);
//    Assert.assertEquals(2, model.size());
//    Assert.assertEquals(0, errorCount);
//    Assert.assertEquals(null, fieldError);
//    Assert.assertFalse(hasGlobalErrorsResult);
//    Assert.assertTrue(isExtractOldValueForEditorResult);
//    Assert.assertTrue(wrappedInstance instanceof String);
//    Assert.assertTrue(wrappedClass instanceof String);
//    Assert.assertEquals("kaaaa", wrappedInstance);
//    Assert.assertEquals("", nestedPath1);
//    Assert.assertTrue(rootClass instanceof String);
//    Assert.assertEquals(3, propertyDescriptors.length);
//    PropertyDescriptor propertyDescriptor = propertyDescriptors[0];
//    PropertyDescriptor propertyDescriptor1 = propertyDescriptors[1];
//    Assert.assertTrue(rootInstance instanceof String);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals("kaaaa", rootInstance);
//    boolean isExpertResult = propertyDescriptor1.isExpert();
//    String name = propertyDescriptor1.getName();
//    String toStringResult2 = propertyDescriptor1.toString();
//    String displayName = propertyDescriptor1.getDisplayName();
//    Class<Object> propertyEditorClass = propertyDescriptor1.getPropertyEditorClass();
//    Method writeMethod = propertyDescriptor1.getWriteMethod();
//    boolean isPreferredResult = propertyDescriptor1.isPreferred();
//    boolean isHiddenResult = propertyDescriptor1.isHidden();
//    boolean isConstrainedResult = propertyDescriptor1.isConstrained();
//    String shortDescription = propertyDescriptor1.getShortDescription();
//    String baseName = propertyDescriptor1.getBaseName();
//    Class<Object> class0 = propertyDescriptor1.getClass0();
//    boolean isBoundResult = propertyDescriptor1.isBound();
//    boolean isExpertResult1 = propertyDescriptor.isExpert();
//    Assert.assertTrue(propertyDescriptor.getPropertyType() instanceof byte[]);
//    Assert.assertFalse(isExpertResult1);
//    Assert.assertTrue(class0 instanceof String);
//    Assert.assertEquals("Class", baseName);
//    Assert.assertEquals("class", shortDescription);
//    Assert.assertFalse(isConstrainedResult);
//    Assert.assertFalse(isHiddenResult);
//    Assert.assertFalse(isPreferredResult);
//    Assert.assertEquals(null, writeMethod);
//    Assert.assertEquals(null, propertyEditorClass);
//    Assert.assertEquals("class", displayName);
//    Assert.assertEquals(
//        "java.beans.PropertyDescriptor[name=class; propertyType=class java.lang.Class; readMethod=public final native java.lang.Class java.lang.Object.getClass()]",
//        toStringResult2);
//    Assert.assertEquals("class", name);
//    Assert.assertFalse(isExpertResult);
//    Assert.assertFalse(isBoundResult);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
