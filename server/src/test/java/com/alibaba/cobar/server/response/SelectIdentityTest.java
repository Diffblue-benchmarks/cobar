package com.alibaba.cobar.server.response;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.response.SelectIdentity;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SelectIdentityTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994a97a43e82c130e1() {

    // Act, creating object to test constructor
    final SelectIdentity actual = new SelectIdentity();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void responseInputNullNotNullPositiveNotNullOutputNullPointerException99911da2fb2045cab75() {

    // Arrange
    final ServerConnection arg0 = null;
    final String arg1 = "aaaaa";
    final int arg2 = 1;
    final String arg3 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    SelectIdentity.response(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }
}
