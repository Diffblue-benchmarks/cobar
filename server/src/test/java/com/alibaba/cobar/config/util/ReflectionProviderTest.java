package com.alibaba.cobar.config.util;

import com.alibaba.cobar.config.util.ObjectAccessException;
import com.alibaba.cobar.config.util.ReflectionProvider;
import com.alibaba.cobar.config.util.Visitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;



public class ReflectionProviderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994619c56f7c9e156a() {

    // Act, creating object to test constructor
    final ReflectionProvider actual = new ReflectionProvider();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fieldDefinedInClassInputNotNullNullOutputNullPointerException9997c8b21647bde394d() {

    // Arrange
    final ReflectionProvider thisObj = new ReflectionProvider();
    final String arg0 = " as it does not have a no-args constructor";
    final Class<Object> arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.fieldDefinedInClass(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFieldInputNullNotNullOutputNullPointerException9998d3e90d2f001b56c() {

    // Arrange
    final ReflectionProvider thisObj = new ReflectionProvider();
    final Class<Object> arg0 = null;
    final String arg1 = " as it does not have a no-args constructor";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getField(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFieldTypeInputNotNullNotNullNullOutputObjectAccessException999ae75435917b59c58() {

    // Arrange
    final ReflectionProvider thisObj = new ReflectionProvider();
    final Object arg0 = " as it does not have a no-args constructor";
    final String arg1 = " as it does not have a no-args constructor";
    final Class<Object> arg2 = null;

    // Act
    thrown.expect(ObjectAccessException.class);
    thisObj.getFieldType(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void invokeMethodInputNotNullNotNullNotNullNullOutputObjectAccessException999bba34fa33b257340() {

    // Arrange
    final ReflectionProvider thisObj = new ReflectionProvider();
    final Object arg0 = " as it does not have a no-args constructor";
    final String arg1 = " as it does not have a no-args constructor";
    final Object arg2 = " as it does not have a no-args constructor";
    final Class<Object> arg3 = null;

    // Act
    thrown.expect(ObjectAccessException.class);
    thisObj.invokeMethod(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void newInstanceInputNullOutputNullPointerException999612845be6d09cb7d() {

    // Arrange
    final ReflectionProvider thisObj = new ReflectionProvider();
    final Class<Object> arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.newInstance(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitSerializableFieldsInputNotNullNullOutputNullPointerException99925755cedb0eccd8e() {

    // Arrange
    final ReflectionProvider thisObj = new ReflectionProvider();
    final Object arg0 = " as it does not have a no-args constructor";
    final Visitor arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visitSerializableFields(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writeFieldInputNotNullNotNullNotNullNullOutputObjectAccessException9996b6e0fa53b07f474() {

    // Arrange
    final ReflectionProvider thisObj = new ReflectionProvider();
    final Object arg0 = " as it does not have a no-args constructor";
    final String arg1 = " as it does not have a no-args constructor";
    final Object arg2 = " as it does not have a no-args constructor";
    final Class<Object> arg3 = null;

    // Act
    thrown.expect(ObjectAccessException.class);
    thisObj.writeField(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }
}
