package com.alibaba.cobar.jdbc.util;

import com.alibaba.cobar.jdbc.util.SecurityUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SecurityUtil_scramble323Test_2_Test {
  @Test
  public void scramble323Test() throws Exception {
    // Arrange
    String pass = "aaaaa";
    String seed = "aaaaa";

    // Act
    String actual = SecurityUtil.scramble323(pass, seed);

    // Assert
    Assert.assertNotNull(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
