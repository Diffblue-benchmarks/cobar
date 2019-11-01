package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.AuthenticationInterceptor;
import java.util.HashSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AuthenticationInterceptor_setSwitchURISetTest_4_Test {
  @Test
  public void setSwitchURISetTest() throws Exception {
    // Arrange
    AuthenticationInterceptor authenticationInterceptor = new AuthenticationInterceptor();
    HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("aaaaa");

    // Act
    authenticationInterceptor.setSwitchURISet(hashSet);

    // Assert
    Assert.assertEquals(1, hashSet.size());
    Assert.assertTrue(hashSet.contains("aaaaa"));
    Assert.assertNotNull(authenticationInterceptor.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
