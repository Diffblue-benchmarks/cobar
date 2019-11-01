package com.alibaba.cobar.route.util;

import com.alibaba.cobar.route.util.PermutationUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PermutationUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999845bc485964b8636() {

    // Act, creating object to test constructor
    final PermutationUtil actual = new PermutationUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
