package com.alibaba.cobar.server.response;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.response.SelectLastInsertId;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SelectLastInsertIdTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99941b67b32b2b6f7b0() {

    // Act, creating object to test constructor
    final SelectLastInsertId actual = new SelectLastInsertId();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void responseInputNullNotNullPositiveOutputNullPointerException999a3476b56e04a7159() {

    // Arrange
    final ServerConnection arg0 = null;
    final String arg1 = "aaaaa";
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    SelectLastInsertId.response(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
