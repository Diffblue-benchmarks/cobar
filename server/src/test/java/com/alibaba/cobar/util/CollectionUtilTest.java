package com.alibaba.cobar.util;

import com.alibaba.cobar.util.CollectionUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashSet;
import java.util.Set;



public class CollectionUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999294c94aab1e57fe7() {

    // Act, creating object to test constructor
    final CollectionUtil actual = new CollectionUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void intersectSetInputNotNullNotNullOutput1999625e86f33452d290() {
//
//    // Arrange
//    final HashSet<Object> arg0 = new HashSet<Object>();
//    arg0.add("aaaaa");
//    final HashSet<Object> arg1 = new HashSet<Object>();
//    arg1.add("aaaaa");
//
//    // Act
//    final Set<Object> actual = CollectionUtil.intersectSet(arg0, arg1);
//
//    // Assert result
//    final HashSet<Object> hashSet = new HashSet<Object>();
//    hashSet.add("aaaaa");
//    Assert.assertEquals(hashSet, actual);
//
//  }
}
