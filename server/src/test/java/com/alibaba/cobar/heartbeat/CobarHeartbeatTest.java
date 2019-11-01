package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.CobarNode;
import com.alibaba.cobar.config.model.CobarNodeConfig;
import com.alibaba.cobar.heartbeat.CobarDetector;
import com.alibaba.cobar.heartbeat.CobarHeartbeat;
import com.alibaba.cobar.statistic.HeartbeatRecorder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CobarHeartbeatTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull999d29c58447fe89274() {
//
//    // Arrange
//    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
//    final CobarNode arg0 = new CobarNode(cobarNodeConfig);
//
//    // Act, creating object to test constructor
//    final CobarHeartbeat actual = new CobarHeartbeat(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.getDetector());
//    Assert.assertNotNull(actual.getRecorder());
//    Assert.assertNotNull(actual.detectCount);
//    Assert.assertEquals(0L, actual.detectCount.get());
//    Assert.assertEquals(0, actual.getErrorCount());
//    Assert.assertEquals(1, actual.getStatus());
//    Assert.assertNotNull(actual.getNode());
//    Assert.assertNotNull(actual.getNode().getHeartbeat());
//    Assert.assertNull(actual.getNode().getHeartbeat().getDetector());
//    Assert.assertNotNull(actual.getNode().getHeartbeat().getRecorder());
//    Assert.assertNotNull(actual.getNode().getHeartbeat().detectCount);
//    Assert.assertEquals(0L, actual.getNode().getHeartbeat().detectCount.get());
//    Assert.assertEquals(0, actual.getNode().getHeartbeat().getErrorCount());
//    Assert.assertEquals(1, actual.getNode().getHeartbeat().getStatus());
//    Assert.assertNull(actual.getNode().getHeartbeat().getNode());
//    Assert.assertNotNull(actual.getNode().getConfig());
//    Assert.assertEquals("ERROR", actual.getNode().getConfig().getName());
//    Assert.assertEquals(-2, actual.getNode().getConfig().getWeight());
//    Assert.assertEquals("ERROR", actual.getNode().getConfig().getHost());
//    Assert.assertEquals(-2, actual.getNode().getConfig().getPort());
//    Assert.assertEquals("ERROR", actual.getNode().getName());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getDetectorOutputVoid9992fd239a282d38ec7() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);

    // Act
    final CobarDetector actual = thisObj.getDetector();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getErrorCountOutputZero999d7a5850d59f8f14e() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);

    // Act
    final int actual = thisObj.getErrorCount();

    // Assert result
    Assert.assertEquals(0, actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getNodeOutputNotNull99941ab31f0e868f23e() {
//
//    // Arrange
//    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
//    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
//    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);
//
//    // Act
//    final CobarNode actual = thisObj.getNode();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getHeartbeat());
//    Assert.assertNull(actual.getHeartbeat().getDetector());
//    Assert.assertNotNull(actual.getHeartbeat().getRecorder());
//    Assert.assertNotNull(actual.getHeartbeat().detectCount);
//    Assert.assertEquals(0L, actual.getHeartbeat().detectCount.get());
//    Assert.assertEquals(0, actual.getHeartbeat().getErrorCount());
//    Assert.assertEquals(1, actual.getHeartbeat().getStatus());
//    Assert.assertNull(actual.getHeartbeat().getNode());
//    Assert.assertNotNull(actual.getConfig());
//    Assert.assertEquals("ERROR", actual.getConfig().getName());
//    Assert.assertEquals(-2, actual.getConfig().getWeight());
//    Assert.assertEquals("ERROR", actual.getConfig().getHost());
//    Assert.assertEquals(-2, actual.getConfig().getPort());
//    Assert.assertEquals("ERROR", actual.getName());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getRecorderOutputNotNull999feeb8594239bb17d() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);

    // Act
    final HeartbeatRecorder actual = thisObj.getRecorder();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getStatusOutputPositive999dba997587bd339b1() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);

    // Act
    final int actual = thisObj.getStatus();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeoutOutputNegative9996043166b688260dc() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);

    // Act
    final long actual = thisObj.getTimeout();

    // Assert result
    Assert.assertEquals(-1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void heartbeatOutputVoid999277d0bddf37c5dc8() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);

    // Act
    thisObj.heartbeat();

    // Assert side effects
    Assert.assertEquals(-1, thisObj.getStatus());

  }

  // Test written by Diffblue Cover
  @Test
  public void isCheckingOutputFalse999e5288b2983dd088a() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);

    // Act
    final boolean actual = thisObj.isChecking();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isStopOutputFalse99996c5b90e3686a26f() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);

    // Act
    final boolean actual = thisObj.isStop();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lastActiveTimeOutputVoid999a22544864371b0f3() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);

    // Act
    final String actual = thisObj.lastActiveTime();

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void requestMessageInputNegative24OutputNotNull99940ea5f431b882bf6() {
//
//    // Arrange
//    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
//    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
//    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);
//    final int arg0 = -2;
//    final byte[] arg1 = { (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2, (short) -2 };
//
//    // Act
//    final String actual = thisObj.requestMessage(arg0, arg1);
//
//    // Assert result
//    Assert.assertEquals("REQUEST:TIMEOUT, id=\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd, host=ERROR, port=-2, time=1572604606756", actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void setResultInputNegativeNotNullTrueNullOutputVoid99912418e3d23d450e9() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);
    final int arg0 = -2;
    final CobarDetector arg1 = new CobarDetector(null);
    final boolean arg2 = true;
    final byte[] arg3 = null;

    // Act
    thisObj.setResult(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void startOutputVoid9993a41038a6ffb88eb() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);

    // Act
    thisObj.start();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stopOutputVoid999058028e9e2fb55dd() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig("ERROR", "ERROR", -2, -2);
    final CobarNode cobarNode = new CobarNode(cobarNodeConfig);
    final CobarHeartbeat thisObj = new CobarHeartbeat(cobarNode);

    // Act
    thisObj.stop();

    // The method returns void, testing that no exception is thrown

  }
}
