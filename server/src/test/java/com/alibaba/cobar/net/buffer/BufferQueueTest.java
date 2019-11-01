package com.alibaba.cobar.net.buffer;

import com.alibaba.cobar.net.buffer.BufferQueue;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.ByteBuffer;



public class BufferQueueTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void attachInputNullOutputVoid99911bca149e082f4c1() {

    // Arrange
    final BufferQueue thisObj = new BufferQueue(1);
    final ByteBuffer arg0 = null;

    // Act
    thisObj.attach(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void attachmentOutputVoid9997f934d8679cf3a56() {

    // Arrange
    final BufferQueue thisObj = new BufferQueue(1);

    // Act
    final ByteBuffer actual = thisObj.attachment();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull999414e8e7f5a024ff6() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final BufferQueue actual = new BufferQueue(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void pollOutputVoid99950ff2653cb291716() {

    // Arrange
    final BufferQueue thisObj = new BufferQueue(1);

    // Act
    final ByteBuffer actual = thisObj.poll();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void putInputNullOutputVoid9998571408c6a6bdf78() throws InterruptedException {

    // Arrange
    final BufferQueue thisObj = new BufferQueue(1);
    final ByteBuffer arg0 = null;

    // Act
    thisObj.put(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void sizeOutputZero99917b908fbec7e686d() {

    // Arrange
    final BufferQueue thisObj = new BufferQueue(1);

    // Act
    final int actual = thisObj.size();

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
