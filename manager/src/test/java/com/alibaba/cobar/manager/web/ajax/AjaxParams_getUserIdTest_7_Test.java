package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.AjaxParams;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class AjaxParams_getUserIdTest_7_Test {
  @Test
  public void getUserIdTest() throws Exception {
    // Arrange
    AjaxParams ajaxParams = Whitebox.newInstance(AjaxParams.class);

    // Act
    long actual = ajaxParams.getUserId();

    // Assert
    Assert.assertEquals(0L, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
