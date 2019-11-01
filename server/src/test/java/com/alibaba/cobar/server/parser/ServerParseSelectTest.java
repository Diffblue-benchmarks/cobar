package com.alibaba.cobar.server.parser;

import com.alibaba.cobar.server.parser.ServerParseSelect;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ServerParseSelectTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e3dd3e31fe867c55() {

    // Act, creating object to test constructor
    final ServerParseSelect actual = new ServerParseSelect();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void databaseCheckInputNotNullNegativeOutputNegative9993b98ccb968e99a24() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    final int actual = ServerParseSelect.databaseCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void identityCheckInputNotNullNegativeOutputStringIndexOutOfBoundsException999779bcdbc5652a428() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ServerParseSelect.identityCheck(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void indexAfterIdentityInputNotNullNegativeOutputStringIndexOutOfBoundsException9991b9b6e19ecf7f777() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ServerParseSelect.indexAfterIdentity(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void indexAfterLastInsertIdFuncInputNotNullNegativeOutputNegative999dfccfb5cf379e610() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    final int actual = ServerParseSelect.indexAfterLastInsertIdFunc(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lastInsertCheckInputNotNullNegativeOutputNegative999fc7fc6031c9df957() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    final int actual = ServerParseSelect.lastInsertCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullNegativeOutputStringIndexOutOfBoundsException9993ed717d0e1300c8a() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ServerParseSelect.parse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void select2CheckInputNotNullNegativeOutputNegative999cde8388a71b4fb92() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    final int actual = ServerParseSelect.select2Check(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void skipAsInputNotNullNegativeOutputStringIndexOutOfBoundsException999c08dba8da4758fac() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ServerParseSelect.skipAs(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void userCheckInputNotNullNegativeOutputNegative99949e36c5661a9513e() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    final int actual = ServerParseSelect.userCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void versionCommentCheckInputNotNullNegativeOutputNegative999ff6e909314964da9() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    final int actual = ServerParseSelect.versionCommentCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
