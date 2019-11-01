package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.exception.HeartbeatException;
import com.alibaba.cobar.heartbeat.MySQLDetector;
import com.alibaba.cobar.heartbeat.MySQLDetectorHandler;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class MySQLDetectorHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull9995d4abe87c4cafadd() {
//
//    // Arrange
//    final MySQLDetector arg0 = new MySQLDetector(null);
//
//    // Act, creating object to test constructor
//    final MySQLDetectorHandler actual = new MySQLDetectorHandler(arg0);
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
  public void handleDataErrorInputNotNullOutputNullPointerException9996632689fbbea05cb() {

    // Arrange
    final MySQLDetector mySQLDetector = new MySQLDetector(null);
    final MySQLDetectorHandler thisObj = new MySQLDetectorHandler(mySQLDetector);
    final Throwable arg0 = new Throwable();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.handleDataError(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void handleDataInput24OutputNullPointerException9990ba73dc74e8cb6e2() {

    // Arrange
    final MySQLDetector mySQLDetector = new MySQLDetector(null);
    final MySQLDetectorHandler thisObj = new MySQLDetectorHandler(mySQLDetector);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.handleData(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInput24OutputNullPointerException999a85082366c4d73dd() {

    // Arrange
    final MySQLDetector mySQLDetector = new MySQLDetector(null);
    final MySQLDetectorHandler thisObj = new MySQLDetectorHandler(mySQLDetector);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.handle(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void offerDataErrorOutputHeartbeatException999da9864f8516dd837() {

    // Arrange
    final MySQLDetector mySQLDetector = new MySQLDetector(null);
    final MySQLDetectorHandler thisObj = new MySQLDetectorHandler(mySQLDetector);

    // Act
    thrown.expect(HeartbeatException.class);
    thisObj.offerDataError();

    // The method is not expected to return due to exception thrown

  }
}
