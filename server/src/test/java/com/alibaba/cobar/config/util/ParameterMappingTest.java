package com.alibaba.cobar.config.util;

import com.alibaba.cobar.config.util.BeanConfig;
import com.alibaba.cobar.config.util.ParameterMapping;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;



public class ParameterMappingTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999dcb53cb43332768a() {

    // Act, creating object to test constructor
    final ParameterMapping actual = new ParameterMapping();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void createBeanInputNotNullOutputNullPointerException9997daeb5e10c833b01() throws IllegalAccessException, InvocationTargetException {

    // Arrange
    final BeanConfig arg0 = new BeanConfig();

    // Act
    thrown.expect(NullPointerException.class);
    ParameterMapping.createBean(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void mappingInputNotNullNotNullOutputVoid9990a9cec8aaad9f8c5() throws IllegalAccessException, InvocationTargetException {

    // Arrange
    final Object arg0 = "aaaaa";
    final HashMap<String, Object> arg1 = new HashMap<String, Object>();
    arg1.put("aaaaa", "aaaaa");

    // Act
    ParameterMapping.mapping(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
