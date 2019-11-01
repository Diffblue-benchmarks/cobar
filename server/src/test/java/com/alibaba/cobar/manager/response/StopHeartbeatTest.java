package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.StopHeartbeat;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class StopHeartbeatTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b0971bdf32249dfd() {

    // Act, creating object to test constructor
    final StopHeartbeat actual = new StopHeartbeat();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNullNullOutputStringIndexOutOfBoundsException9993e2db10b6a891c25() {

    // Arrange
    final String arg0 = "aaaaa";
    final ManagerConnection arg1 = null;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    StopHeartbeat.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
