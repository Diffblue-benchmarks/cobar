package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.XmlManagerAjax;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XmlManagerAjax_XmlManagerAjaxTest_3_Test {
  @Test
  public void XmlManagerAjaxTest() throws Exception {
    // Arrange and Act
    XmlManagerAjax xmlManagerAjax = new XmlManagerAjax();

    // Assert
    Assert.assertNotNull(xmlManagerAjax.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
