package com.alibaba.cobar.net.buffer;

import com.alibaba.cobar.net.buffer.BufferPool;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BufferPoolTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroZeroOutputArithmeticException99964b0a05e17ac18cb() {

    // Arrange
    final int arg0 = 0;
    final int arg1 = 0;

    // Act, creating object to test constructor
    thrown.expect(ArithmeticException.class);
    new BufferPool(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
