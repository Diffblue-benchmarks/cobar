package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.PermissionInterceptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PermissionInterceptor_PermissionInterceptorTest_2_Test {
  @Test
  public void PermissionInterceptorTest() throws Exception {
    // Arrange and Act
    PermissionInterceptor permissionInterceptor = new PermissionInterceptor();

    // Assert
    Assert.assertNotNull(permissionInterceptor.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
