package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.ClusterInstantPerfValueAjax;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ClusterInstantPerfValueAjax_handleRequestTest_3_Test {
  @Test
  public void handleRequestTest() throws Exception {
    // Arrange
    ClusterInstantPerfValueAjax clusterInstantPerfValueAjax = new ClusterInstantPerfValueAjax();
    HttpServletRequestWrapper httpServletRequestWrapper = (HttpServletRequestWrapper) null;
    HttpServletResponseWrapper httpServletResponseWrapper = (HttpServletResponseWrapper) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    clusterInstantPerfValueAjax.handleRequest(httpServletRequestWrapper, httpServletResponseWrapper);
    Assert.assertEquals(null, httpServletRequestWrapper);
    Assert.assertEquals(null, httpServletResponseWrapper);
    Assert.assertNotNull(clusterInstantPerfValueAjax.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
