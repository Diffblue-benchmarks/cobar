package com.alibaba.cobar.util;

import com.alibaba.cobar.util.NameableExecutor;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;



public class NameableExecutorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullPositiveNotNullNullOutputNullPointerException999a9bd09f1fbeeaee4() {

    // Arrange
    final String arg0 = "aaaaa";
    final int arg1 = 1;
    final ArrayBlockingQueue<Runnable> arg2 = new ArrayBlockingQueue<Runnable>(1);
    final ThreadFactory arg3 = null;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new NameableExecutor(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }
}
