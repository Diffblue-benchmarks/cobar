package com.alibaba.cobar.util;

import com.alibaba.cobar.util.ObjectUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ObjectUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e7b5680d27a6199c() {

    // Act, creating object to test constructor
    final ObjectUtil actual = new ObjectUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullNotNullOutputTrue999c5dd6847d6210035() {

    // Arrange
    final Object arg0 = "aaaaa";
    final Object arg1 = "aaaaa";

    // Act
    final boolean actual = ObjectUtil.equals(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
