package com.alibaba.cobar.util;

// import com.alibaba.cobar.util.SmallSet.;
import com.alibaba.cobar.util.SmallSet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.Iterator;



public class SmallSetTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void addInputNotNullOutputFalse99935b9337309ddd0fd() {

    // Arrange
    final SmallSet<Object> thisObj = new SmallSet<Object>();
    thisObj.add("aaaaa");
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.add(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void cloneOutputNotNull9999186455fe37d8a18() throws CloneNotSupportedException {
//
//    // Arrange
//    final SmallSet<Object> thisObj = new SmallSet<Object>();
//    thisObj.add("aaaaa");
//
//    // Act
//    final Object actual = thisObj.clone();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertArrayEquals(new Object[]{ "aaaaa" }, ((SmallSet) actual).cproverElementData);
//    Assert.assertEquals(1, ((SmallSet) actual).size());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99984fed336881d1900() {
//
//    // Act, creating object to test constructor
//    final SmallSet<Object> actual = new SmallSet<Object>();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertArrayEquals(new Object[]{ }, actual.cproverElementData);
//    Assert.assertEquals(0, actual.size());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputZeroOutputNotNull999e19823bf3b1eb560() {
//
//    // Arrange
//    final int arg0 = 0;
//
//    // Act, creating object to test constructor
//    final SmallSet<Object> actual = new SmallSet<Object>(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertArrayEquals(new Object[]{ }, actual.cproverElementData);
//    Assert.assertEquals(0, actual.size());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void iteratorOutputNotNull999f11975deeb413e41() {

    // Arrange
    final SmallSet<Object> thisObj = new SmallSet<Object>();
    thisObj.add("aaaaa");

    // Act
    final Iterator<Object> actual = thisObj.iterator();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sizeOutputPositive999688b26b833ebbf9f() {

    // Arrange
    final SmallSet<Object> thisObj = new SmallSet<Object>();
    thisObj.add("aaaaa");

    // Act
    final int actual = thisObj.size();

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
