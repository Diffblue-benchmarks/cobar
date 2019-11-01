package com.alibaba.cobar.mysql;

import com.alibaba.cobar.mysql.BindValueUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BindValueUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b98a74c01e2ded02() {

    // Act, creating object to test constructor
    final BindValueUtil actual = new BindValueUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
