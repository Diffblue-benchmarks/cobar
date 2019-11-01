package com.alibaba.cobar.server.response;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.response.SelectUser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SelectUserTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d096329c2ae061af() {

    // Act, creating object to test constructor
    final SelectUser actual = new SelectUser();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void responseInputNullOutputNoClassDefFoundError9999fc06e55f2899e1a() {
//
//    // Arrange
//    final ServerConnection arg0 = null;
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    SelectUser.response(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
