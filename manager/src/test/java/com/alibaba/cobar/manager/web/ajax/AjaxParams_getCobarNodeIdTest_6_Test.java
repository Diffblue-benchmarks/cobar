package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.AjaxParams;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class AjaxParams_getCobarNodeIdTest_6_Test {
  @Test
  public void getCobarNodeIdTest() throws Exception {
    // Arrange
    AjaxParams ajaxParams = Whitebox.newInstance(AjaxParams.class);

    // Act
    long actual = ajaxParams.getCobarNodeId();

    // Assert
    Assert.assertEquals(0L, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
