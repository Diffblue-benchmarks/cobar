package com.alibaba.cobar.server.response;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.response.ShowCobarStatus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowCobarStatusTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99915b1fbbe98c05603() {

    // Act, creating object to test constructor
    final ShowCobarStatus actual = new ShowCobarStatus();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void responseInputNullOutputNoClassDefFoundError999ed92415b25922af6() {
//
//    // Arrange
//    final ServerConnection arg0 = null;
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    ShowCobarStatus.response(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
