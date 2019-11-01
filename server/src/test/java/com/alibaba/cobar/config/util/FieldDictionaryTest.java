package com.alibaba.cobar.config.util;

import com.alibaba.cobar.config.util.FieldDictionary;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FieldDictionaryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999302626e0a8c4e7be() {

    // Act, creating object to test constructor
    final FieldDictionary actual = new FieldDictionary();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fieldInputNullNotNullNullOutputNullPointerException999a1998ac4a0bb7e69() {

    // Arrange
    final FieldDictionary thisObj = new FieldDictionary();
    final Class<Object> arg0 = null;
    final String arg1 = ".";
    final Class<Object> arg2 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.field(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void serializableFieldsForInputNullOutputNullPointerException9998fdcba15011462c6() {

    // Arrange
    final FieldDictionary thisObj = new FieldDictionary();
    final Class<Object> arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.serializableFieldsFor(arg0);

    // The method is not expected to return due to exception thrown

  }
}
