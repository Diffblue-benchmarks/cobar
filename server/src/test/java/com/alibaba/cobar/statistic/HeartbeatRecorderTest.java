package com.alibaba.cobar.statistic;

import com.alibaba.cobar.statistic.HeartbeatRecorder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class HeartbeatRecorderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e53af17ea63a8392() {

    // Act, creating object to test constructor
    final HeartbeatRecorder actual = new HeartbeatRecorder();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOutputNotNull999cf419fc000007ee3() {

    // Arrange
    final HeartbeatRecorder thisObj = new HeartbeatRecorder();

    // Act
    final String actual = thisObj.get();

    // Assert result
    Assert.assertEquals("0,0,0", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setInputZeroOutputVoid9990e51ef5e1285d362() {

    // Arrange
    final HeartbeatRecorder thisObj = new HeartbeatRecorder();
    final long arg0 = 0L;

    // Act
    thisObj.set(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
