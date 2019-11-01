package com.alibaba.cobar.manager.parser;

import com.alibaba.cobar.manager.parser.ManagerParseStop;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ManagerParseStopTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999af3d832bc3d4ac1() {

    // Act, creating object to test constructor
    final ManagerParseStop actual = new ManagerParseStop();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPairInputNotNullOutputStringIndexOutOfBoundsException999848695809a50ef5b() {

    // Arrange
    final String arg0 = " ";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ManagerParseStop.getPair(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullNegativeOutputStringIndexOutOfBoundsException999f28ac97ac14c8af2() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    ManagerParseStop.parse(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stop2CheckInputNotNullNegativeOutputNegative999b709e363317da138() {

    // Arrange
    final String arg0 = " ";
    final int arg1 = -1;

    // Act
    final int actual = ManagerParseStop.stop2Check(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
