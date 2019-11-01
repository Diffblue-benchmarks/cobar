package com.alibaba.cobar;

import com.alibaba.cobar.CobarPrivileges;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CobarPrivilegesTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b429948911d1ac57() {

    // Act, creating object to test constructor
    final CobarPrivileges actual = new CobarPrivileges();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getPasswordInputNotNullOutputNoClassDefFoundError9991c071095b22bbd3f() {
//
//    // Arrange
//    final CobarPrivileges thisObj = new CobarPrivileges();
//    final String arg0 = "alarm";
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    thisObj.getPassword(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getUserSchemasInputNotNullOutputNoClassDefFoundError999a38a2a282407dda2() {
//
//    // Arrange
//    final CobarPrivileges thisObj = new CobarPrivileges();
//    final String arg0 = "alarm";
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    thisObj.getUserSchemas(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void schemaExistsInputNotNullOutputNoClassDefFoundError999d872b6a07bcb1f00() {
//
//    // Arrange
//    final CobarPrivileges thisObj = new CobarPrivileges();
//    final String arg0 = "alarm";
//
//    // Act
//    thrown.expect(NoClassDefFoundError.class);
//    thisObj.schemaExists(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void userExistsInputNotNullNotNullOutputExceptionInInitializerError9998eeca03190cf0711() {
//
//    // Arrange
//    final CobarPrivileges thisObj = new CobarPrivileges();
//    final String arg0 = "alarm";
//    final String arg1 = "alarm";
//
//    // Act
//    thrown.expect(ExceptionInInitializerError.class);
//    thisObj.userExists(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
