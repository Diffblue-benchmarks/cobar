package com.alibaba.cobar.util;

import com.alibaba.cobar.util.TimeUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TimeUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d1f72d28ef9bc9c9() {

    // Act, creating object to test constructor
    final TimeUtil actual = new TimeUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void currentTimeMillisOutputPositive9996d8dd2141e7a0e81() {
//
//    // Act
//    final long actual = TimeUtil.currentTimeMillis();
//
//    // Assert result
//    Assert.assertEquals(1572604606756L, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void updateOutputVoid99997270dc53c8819d3() {

    // Act
    TimeUtil.update();

    // The method returns void, testing that no exception is thrown

  }
}
