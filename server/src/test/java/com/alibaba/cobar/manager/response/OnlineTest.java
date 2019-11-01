package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.Online;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class OnlineTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995d4ea4f088c8fb4f() {

    // Act, creating object to test constructor
    final Online actual = new Online();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void executeInputNotNullNullOutputNoClassDefFoundError9995847a3d8c9d8886e() {
//
//    // Arrange
//    final String arg0 = "aaaaa";
//    final ManagerConnection arg1 = null;
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    Online.execute(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
