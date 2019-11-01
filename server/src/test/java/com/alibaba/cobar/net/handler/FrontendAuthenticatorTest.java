package com.alibaba.cobar.net.handler;

import com.alibaba.cobar.net.FrontendConnection;
import com.alibaba.cobar.net.handler.FrontendAuthenticator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class FrontendAuthenticatorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void checkPasswordInput24NotNullOutputNullPointerException999a5091b7e77561195() {

    // Arrange
    final FrontendAuthenticator thisObj = new FrontendAuthenticator(null);
    final byte[] arg0 = { (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 10, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9 };
    final String arg1 = "'";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.checkPassword(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void checkSchemaInputNotNullNotNullOutputNullPointerException999606817308e398c87() {

    // Arrange
    final FrontendAuthenticator thisObj = new FrontendAuthenticator(null);
    final String arg0 = "'";
    final String arg1 = "'";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.checkSchema(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void checkUserInputNotNullNotNullOutputNullPointerException999365f97abb846ae75() {

    // Arrange
    final FrontendAuthenticator thisObj = new FrontendAuthenticator(null);
    final String arg0 = "'";
    final String arg1 = "'";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.checkUser(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull999c3f2d1e59ac9eb81() {

    // Arrange
    final FrontendConnection arg0 = null;

    // Act, creating object to test constructor
    final FrontendAuthenticator actual = new FrontendAuthenticator(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.source);

  }

  // Test written by Diffblue Cover
  @Test
  public void failureInputZeroNotNullOutputNullPointerException9994c2e4e20b086925b() {

    // Arrange
    final FrontendAuthenticator thisObj = new FrontendAuthenticator(null);
    final int arg0 = 0;
    final String arg1 = "'";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.failure(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void handleInput24OutputArrayIndexOutOfBoundsException9998531b0364d661f03() {

    // Arrange
    final FrontendAuthenticator thisObj = new FrontendAuthenticator(null);
    final byte[] arg0 = { (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 10, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9, (short) 9 };

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    thisObj.handle(arg0);

    // The method is not expected to return due to exception thrown

  }
}
