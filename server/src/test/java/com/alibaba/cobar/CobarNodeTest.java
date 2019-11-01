package com.alibaba.cobar;

import com.alibaba.cobar.CobarNode;
import com.alibaba.cobar.config.model.CobarNodeConfig;
import com.alibaba.cobar.heartbeat.CobarHeartbeat;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CobarNodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull999cafcef11fe1bfbb1() {
//
//    // Arrange
//    final CobarNodeConfig arg0 = new CobarNodeConfig(" heartbeat error.", " heartbeat error.", 1, 1);
//
//    // Act, creating object to test constructor
//    final CobarNode actual = new CobarNode(arg0);
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
//    Assert.assertEquals(" heartbeat error.", actual.getConfig().getName());
//    Assert.assertEquals(1, actual.getConfig().getWeight());
//    Assert.assertEquals(" heartbeat error.", actual.getConfig().getHost());
//    Assert.assertEquals(1, actual.getConfig().getPort());
//    Assert.assertEquals(" heartbeat error.", actual.getName());
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void doHeartbeatOutputVoid9994233e675ae192575() {
//
//    // Arrange
//    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig(" heartbeat error.", " heartbeat error.", 1, 1);
//    final CobarNode thisObj = new CobarNode(cobarNodeConfig);
//
//    // Act
//    thisObj.doHeartbeat();
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getHeartbeat());
//    Assert.assertNull(thisObj.getHeartbeat().getDetector());
//    Assert.assertNotNull(thisObj.getHeartbeat().getRecorder());
//    Assert.assertNotNull(thisObj.getHeartbeat().detectCount);
//    Assert.assertEquals(0L, thisObj.getHeartbeat().detectCount.get());
//    Assert.assertEquals(0, thisObj.getHeartbeat().getErrorCount());
//    Assert.assertEquals(-1, thisObj.getHeartbeat().getStatus());
//    Assert.assertNull(thisObj.getHeartbeat().getNode());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getConfigOutputNotNull99912bffdc0f20a63e7() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig(" heartbeat error.", " heartbeat error.", 1, 1);
    final CobarNode thisObj = new CobarNode(cobarNodeConfig);

    // Act
    final CobarNodeConfig actual = thisObj.getConfig();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(" heartbeat error.", actual.getName());
    Assert.assertEquals(1, actual.getWeight());
    Assert.assertEquals(" heartbeat error.", actual.getHost());
    Assert.assertEquals(1, actual.getPort());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getHeartbeatOutputNotNull999f0e8ab89adcc93a4() {
//
//    // Arrange
//    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig(" heartbeat error.", " heartbeat error.", 1, 1);
//    final CobarNode thisObj = new CobarNode(cobarNodeConfig);
//
//    // Act
//    final CobarHeartbeat actual = thisObj.getHeartbeat();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.getDetector());
//    Assert.assertNotNull(actual.getRecorder());
//    Assert.assertNotNull(actual.detectCount);
//    Assert.assertEquals(0L, actual.detectCount.get());
//    Assert.assertEquals(0, actual.getErrorCount());
//    Assert.assertEquals(1, actual.getStatus());
//    Assert.assertNull(actual.getNode());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputNotNull9990a327b28c33a7ed6() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig(" heartbeat error.", " heartbeat error.", 1, 1);
    final CobarNode thisObj = new CobarNode(cobarNodeConfig);

    // Act
    final String actual = thisObj.getName();

    // Assert result
    Assert.assertEquals(" heartbeat error.", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isOnlineOutputTrue999f0d050dbbc5d518e() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig(" heartbeat error.", " heartbeat error.", 1, 1);
    final CobarNode thisObj = new CobarNode(cobarNodeConfig);

    // Act
    final boolean actual = thisObj.isOnline();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void startHeartbeatOutputVoid999670926982a006915() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig(" heartbeat error.", " heartbeat error.", 1, 1);
    final CobarNode thisObj = new CobarNode(cobarNodeConfig);

    // Act
    thisObj.startHeartbeat();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stopHeartbeatOutputVoid999ca1731ded5490136() {

    // Arrange
    final CobarNodeConfig cobarNodeConfig = new CobarNodeConfig(" heartbeat error.", " heartbeat error.", 1, 1);
    final CobarNode thisObj = new CobarNode(cobarNodeConfig);

    // Act
    thisObj.stopHeartbeat();

    // The method returns void, testing that no exception is thrown

  }
}
