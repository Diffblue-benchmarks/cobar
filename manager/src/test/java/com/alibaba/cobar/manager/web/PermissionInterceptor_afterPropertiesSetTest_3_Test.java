package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.PermissionInterceptor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PermissionInterceptor_afterPropertiesSetTest_3_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    PermissionInterceptor permissionInterceptor = new PermissionInterceptor();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    permissionInterceptor.afterPropertiesSet();
    Assert.assertNotNull(permissionInterceptor.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
