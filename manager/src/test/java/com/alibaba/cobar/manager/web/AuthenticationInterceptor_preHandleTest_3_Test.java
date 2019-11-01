package com.alibaba.cobar.manager.web;

import com.alibaba.cobar.manager.web.AuthenticationInterceptor;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AuthenticationInterceptor_preHandleTest_3_Test {
  @Test
  public void preHandleTest() throws Exception {
    // Arrange
    AuthenticationInterceptor authenticationInterceptor = new AuthenticationInterceptor();
    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;
    String handler = "kaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    authenticationInterceptor.preHandle(httpServletRequestWrapper, httpServletResponseWrapper, handler);
    Assert.assertEquals(null, httpServletRequestWrapper);
    Assert.assertEquals(null, httpServletResponseWrapper);
    Assert.assertNotNull(authenticationInterceptor.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
