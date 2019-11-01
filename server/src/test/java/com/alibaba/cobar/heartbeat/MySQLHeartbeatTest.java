package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.heartbeat.MySQLDetector;
import com.alibaba.cobar.heartbeat.MySQLHeartbeat;
import com.alibaba.cobar.mysql.MySQLDataSource;
import com.alibaba.cobar.statistic.HeartbeatRecorder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MySQLHeartbeatTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull9991ddec569c4a4327e() {

    // Arrange
    final MySQLDataSource arg0 = null;

    // Act, creating object to test constructor
    final MySQLHeartbeat actual = new MySQLHeartbeat(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getErrorCount());
    Assert.assertEquals(0, actual.getStatus());
    Assert.assertNull(actual.getDetector());
    Assert.assertNotNull(actual.getRecorder());
    Assert.assertNull(actual.getSource());

  }

  // Test written by Diffblue Cover
  @Test
  public void getDetectorOutputVoid999f3ec3cb8fac0b489() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    final MySQLDetector actual = thisObj.getDetector();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getErrorCountOutputZero9993599c2bbfbb63c36() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    final int actual = thisObj.getErrorCount();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLastActiveTimeOutputVoid9993be468162a544b81() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    final String actual = thisObj.getLastActiveTime();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRecorderOutputNotNull999f735895d7f2ec389() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    final HeartbeatRecorder actual = thisObj.getRecorder();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getSourceOutputVoid9995a1d9d72f5afe925() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    final MySQLDataSource actual = thisObj.getSource();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getStatusOutputZero99960610a67cc6ba0ec() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    final int actual = thisObj.getStatus();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeoutOutputNegative999a189a38af2045f21() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    final long actual = thisObj.getTimeout();

    // Assert result
    Assert.assertEquals(-1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void heartbeatOutputNullPointerException9993d69138a5e9f79e0() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.heartbeat();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isCheckingOutputFalse999727ef2f93f25fb83() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    final boolean actual = thisObj.isChecking();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isStopOutputFalse9996ed89d0ebc3d6ed3() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    final boolean actual = thisObj.isStop();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setResultInputNegativeNotNullTrueOutputVoid99944f1b609f194bf7b() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);
    final int arg0 = -2;
    final MySQLDetector arg1 = new MySQLDetector(null);
    final boolean arg2 = true;

    // Act
    thisObj.setResult(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void startOutputVoid999c182773e015fe32c() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    thisObj.start();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stopOutputVoid999d73b92c230e692b8() {

    // Arrange
    final MySQLHeartbeat thisObj = new MySQLHeartbeat(null);

    // Act
    thisObj.stop();

    // The method returns void, testing that no exception is thrown

  }
}
