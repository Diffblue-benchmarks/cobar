package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.KillConnection;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class KillConnectionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999995a9cf72c963b6a() {

    // Act, creating object to test constructor
    final KillConnection actual = new KillConnection();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void responseInputNotNullZeroNullOutputNoClassDefFoundError9999e36f2adb48edf10() {
//
//    // Arrange
//    final String arg0 = ",";
//    final int arg1 = 0;
//    final ManagerConnection arg2 = null;
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    KillConnection.response(arg0, arg1, arg2);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
