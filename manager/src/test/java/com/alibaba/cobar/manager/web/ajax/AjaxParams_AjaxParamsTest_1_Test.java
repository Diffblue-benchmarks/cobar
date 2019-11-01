package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.AjaxParams;
import javax.servlet.http.HttpServletRequestWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AjaxParams_AjaxParamsTest_1_Test {
  @Test
  public void AjaxParamsTest() throws Exception {
    // Arrange
    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new AjaxParams(httpServletRequestWrapper);
    Assert.assertEquals(null, httpServletRequestWrapper);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
