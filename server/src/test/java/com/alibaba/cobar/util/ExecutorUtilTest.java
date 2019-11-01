package com.alibaba.cobar.util;

import com.alibaba.cobar.util.ExecutorUtil;
import com.alibaba.cobar.util.NameableExecutor;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.concurrent.ThreadFactory;



public class ExecutorUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99932f73c9b6a80e73f() {

    // Act, creating object to test constructor
    final ExecutorUtil actual = new ExecutorUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void createInputNotNullPositiveTrueOutputNotNull999c512c5cb999679b4() {
//
//    // Arrange
//    final String arg0 = "aaaaa";
//    final int arg1 = 1;
//    final boolean arg2 = true;
//
//    // Act
//    final NameableExecutor actual = ExecutorUtil.create(arg0, arg1, arg2);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals("aaaaa", actual.getName());
//    Assert.assertNotNull(actual.getRejectedExecutionHandler());
//    Assert.assertEquals(1, actual.getMaximumPoolSize());
//    Assert.assertEquals(1, actual.getCorePoolSize());
//    Assert.assertNotNull(actual.getThreadFactory());
//    Assert.assertNotNull(actual.getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getQueue(), "size"));
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void createInputNotNullPositiveOutputNotNull9997f791398e3a0ceb0() {
//
//    // Arrange
//    final String arg0 = "aaaaa";
//    final int arg1 = 1;
//
//    // Act
//    final NameableExecutor actual = ExecutorUtil.create(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals("aaaaa", actual.getName());
//    Assert.assertNotNull(actual.getRejectedExecutionHandler());
//    Assert.assertEquals(1, actual.getMaximumPoolSize());
//    Assert.assertEquals(1, actual.getCorePoolSize());
//    Assert.assertNotNull(actual.getThreadFactory());
//    Assert.assertNotNull(actual.getQueue());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.getQueue(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getQueue(), "size"));
//
//  }
}
