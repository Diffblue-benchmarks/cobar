package com.alibaba.cobar.server.response;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.response.CharacterSet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CharacterSetTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998714229d001d106e() {

    // Act, creating object to test constructor
    final CharacterSet actual = new CharacterSet();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void responseInputNotNullNullNegativeOutputStringIndexOutOfBoundsException999cb7e8d0df9682357() {

    // Arrange
    final String arg0 = "'";
    final ServerConnection arg1 = null;
    final int arg2 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    CharacterSet.response(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
