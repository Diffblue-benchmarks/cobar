package com.alibaba.cobar.parser.util;

import com.alibaba.cobar.parser.util.ListUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class ListUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f486a9fd783db04c() {

    // Act, creating object to test constructor
    final ListUtil actual = new ListUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isEqualsInputNotNullNotNullOutputTrue9997683d427b7b7ada0() {

    // Arrange
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaaa");
    final ArrayList<Object> arg1 = new ArrayList<Object>();
    arg1.add("aaaaa");

    // Act
    final boolean actual = ListUtil.isEquals(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
