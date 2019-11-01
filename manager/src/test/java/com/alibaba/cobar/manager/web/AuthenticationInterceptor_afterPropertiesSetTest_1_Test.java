package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.AuthenticationInterceptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AuthenticationInterceptor_afterPropertiesSetTest_1_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    AuthenticationInterceptor authenticationInterceptor = new AuthenticationInterceptor();

    // Act
    authenticationInterceptor.afterPropertiesSet();

    // Assert
    Assert.assertNotNull(authenticationInterceptor.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
