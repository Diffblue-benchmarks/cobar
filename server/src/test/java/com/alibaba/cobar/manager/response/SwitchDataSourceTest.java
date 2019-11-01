package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.SwitchDataSource;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SwitchDataSourceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992db1d49ff71a394f() {

    // Act, creating object to test constructor
    final SwitchDataSource actual = new SwitchDataSource();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void responseInputNotNullNullOutputStringIndexOutOfBoundsException999a6d4c2c5ae7a6849() {

    // Arrange
    final String arg0 = "MANAGER";
    final ManagerConnection arg1 = null;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    SwitchDataSource.response(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
