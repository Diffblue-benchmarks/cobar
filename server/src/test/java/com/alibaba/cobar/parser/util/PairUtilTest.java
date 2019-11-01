package com.alibaba.cobar.parser.util;

import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.parser.util.PairUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PairUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b671926f8528a5a1() {

    // Act, creating object to test constructor
    final PairUtil actual = new PairUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sequenceSlicingInputNotNullOutputNumberFormatException9994281a4de6c6c903d() {

    // Arrange
    final String arg0 = "";

    // Act
    thrown.expect(NumberFormatException.class);
    PairUtil.sequenceSlicing(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void splitIndexInputNotNullNotNullNotNullOutputNotNull99903495f869961bb4b() {

    // Arrange
    final String arg0 = "";
    final char arg1 = ':';
    final char arg2 = ':';

    // Act
    final Pair<String, Integer> actual = PairUtil.splitIndex(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("", actual.getKey());
    Assert.assertNotNull(actual.getValue());

  }
}
