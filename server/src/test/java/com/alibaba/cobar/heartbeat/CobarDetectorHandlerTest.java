package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.exception.HeartbeatException;
import com.alibaba.cobar.heartbeat.CobarDetector;
import com.alibaba.cobar.heartbeat.CobarDetectorHandler;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class CobarDetectorHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull999af7438f3968c489b() {
//
//    // Arrange
//    final CobarDetector arg0 = new CobarDetector(null);
//
//    // Act, creating object to test constructor
//    final CobarDetectorHandler actual = new CobarDetectorHandler(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(Reflector.getInstanceField(actual, "dataQueue"));
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(Reflector.getInstanceField(actual, "dataQueue"), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(actual, "dataQueue"), "size"));
//    Assert.assertNotNull(Reflector.getInstanceField(actual, "isHandling"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void handleDataErrorInputNotNullOutputNullPointerException999235e79298e49c9a8() {

    // Arrange
    final CobarDetector cobarDetector = new CobarDetector(null);
    final CobarDetectorHandler thisObj = new CobarDetectorHandler(cobarDetector);
    final Throwable arg0 = new Throwable();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.handleDataError(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void handleDataInput24OutputNullPointerException999e3adbe3a6d4a21ff() {

    // Arrange
    final CobarDetector cobarDetector = new CobarDetector(null);
    final CobarDetectorHandler thisObj = new CobarDetectorHandler(cobarDetector);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.handleData(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInput24OutputNullPointerException999ca19a677ebf5cc4a() {

    // Arrange
    final CobarDetector cobarDetector = new CobarDetector(null);
    final CobarDetectorHandler thisObj = new CobarDetectorHandler(cobarDetector);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.handle(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void offerDataErrorOutputHeartbeatException999f2d9b9d284073a7c() {

    // Arrange
    final CobarDetector cobarDetector = new CobarDetector(null);
    final CobarDetectorHandler thisObj = new CobarDetectorHandler(cobarDetector);

    // Act
    thrown.expect(HeartbeatException.class);
    thisObj.offerDataError();

    // The method is not expected to return due to exception thrown

  }
}
