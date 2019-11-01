package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.PermissionInterceptor;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PermissionInterceptor_preHandleTest_4_Test {
  @Test
  public void preHandleTest() throws Exception {
    // Arrange
    PermissionInterceptor permissionInterceptor = new PermissionInterceptor();
    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
    String handler = "kaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    permissionInterceptor.preHandle(httpServletRequestWrapper, httpServletResponseWrapper, handler);
    Assert.assertEquals(null, httpServletRequestWrapper);
    Assert.assertEquals(null, httpServletResponseWrapper);
    Assert.assertNotNull(permissionInterceptor.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
