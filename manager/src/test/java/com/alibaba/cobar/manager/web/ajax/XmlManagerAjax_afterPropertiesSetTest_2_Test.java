package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.XmlManagerAjax;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class XmlManagerAjax_afterPropertiesSetTest_2_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    XmlManagerAjax xmlManagerAjax = new XmlManagerAjax();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    xmlManagerAjax.afterPropertiesSet();
    Assert.assertNotNull(xmlManagerAjax.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
