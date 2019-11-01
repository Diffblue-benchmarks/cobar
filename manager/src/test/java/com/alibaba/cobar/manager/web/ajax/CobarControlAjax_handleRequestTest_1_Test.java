package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.CobarControlAjax;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CobarControlAjax_handleRequestTest_1_Test {
  @Test
  public void handleRequestTest() throws Exception {
    // Arrange
    CobarControlAjax cobarControlAjax = new CobarControlAjax();
    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cobarControlAjax.handleRequest(httpServletRequestWrapper, httpServletResponseWrapper);
    Assert.assertEquals(null, httpServletRequestWrapper);
    Assert.assertEquals(null, httpServletResponseWrapper);
    Assert.assertNotNull(cobarControlAjax.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
