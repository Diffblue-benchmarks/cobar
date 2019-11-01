package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.Offline;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class OfflineTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999529306bfbcdce4f6() {

    // Act, creating object to test constructor
    final Offline actual = new Offline();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void executeInputNotNullNullOutputNoClassDefFoundError9995d7afc62aac8a938() {
//
//    // Arrange
//    final String arg0 = "aaaaa";
//    final ManagerConnection arg1 = null;
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    Offline.execute(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
