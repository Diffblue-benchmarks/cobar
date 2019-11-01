package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.heartbeat.MySQLDetector;
import com.alibaba.cobar.heartbeat.MySQLDetectorAuthenticator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MySQLDetectorAuthenticatorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999799eb35e684428bc() {

    // Arrange
    final MySQLDetector arg0 = new MySQLDetector(null);

    // Act, creating object to test constructor
    final MySQLDetectorAuthenticator actual = new MySQLDetectorAuthenticator(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInput24OutputRuntimeException999a83ec14305ee9804() {

    // Arrange
    final MySQLDetector mySQLDetector = new MySQLDetector(null);
    final MySQLDetectorAuthenticator thisObj = new MySQLDetectorAuthenticator(mySQLDetector);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.handle(arg0);

    // The method is not expected to return due to exception thrown

  }
}
