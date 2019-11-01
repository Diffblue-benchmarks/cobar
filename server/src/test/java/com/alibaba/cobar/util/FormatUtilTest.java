package com.alibaba.cobar.util;

import com.alibaba.cobar.util.FormatUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FormatUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c21117d554562acd() {

    // Act, creating object to test constructor
    final FormatUtil actual = new FormatUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void formatInputNotNullZerocZeroOutputNotNull9995763be2ca5506826() {

    // Arrange
    final String arg0 = "ms";
    final int arg1 = 0;
    final char arg2 = 'c';
    final int arg3 = 0;

    // Act
    final String actual = FormatUtil.format(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertEquals("ms", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void formatInputNotNullZeroOutputNotNull9997c364cf5bf0f6d58() {

    // Arrange
    final String arg0 = "ms";
    final int arg1 = 0;

    // Act
    final String actual = FormatUtil.format(arg0, arg1);

    // Assert result
    Assert.assertEquals("ms", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void formatInputZeroZeroOutputNotNull999e52638b75a795364() {

    // Arrange
    final int arg0 = 0;
    final int arg1 = 0;

    // Act
    final String actual = FormatUtil.format(arg0, arg1);

    // Assert result
    Assert.assertEquals("0", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void formatInputZeroZeroOutputNotNull999741b0bb8a42ef774() {

    // Arrange
    final long arg0 = 0L;
    final int arg1 = 0;

    // Act
    final String actual = FormatUtil.format(arg0, arg1);

    // Assert result
    Assert.assertEquals("0", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void formatTimeInputZeroZeroOutputNotNull999c6b83b11b182a248() {

    // Arrange
    final long arg0 = 0L;
    final int arg1 = 0;

    // Act
    final String actual = FormatUtil.formatTime(arg0, arg1);

    // Assert result
    Assert.assertEquals("", actual);

  }
}
