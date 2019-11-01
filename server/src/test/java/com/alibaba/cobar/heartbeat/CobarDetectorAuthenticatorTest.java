package com.alibaba.cobar.heartbeat;

import com.alibaba.cobar.heartbeat.CobarDetector;
import com.alibaba.cobar.heartbeat.CobarDetectorAuthenticator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CobarDetectorAuthenticatorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99966e6e9c2f727e617() {

    // Arrange
    final CobarDetector arg0 = new CobarDetector(null);

    // Act, creating object to test constructor
    final CobarDetectorAuthenticator actual = new CobarDetectorAuthenticator(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInput24OutputRuntimeException99957fea523483afe22() {

    // Arrange
    final CobarDetector cobarDetector = new CobarDetector(null);
    final CobarDetectorAuthenticator thisObj = new CobarDetectorAuthenticator(cobarDetector);
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.handle(arg0);

    // The method is not expected to return due to exception thrown

  }
}
