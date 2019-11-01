package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.AjaxParams;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class AjaxParams_getValueTypeTest_4_Test {
  @Test
  public void getValueTypeTest() throws Exception {
    // Arrange
    AjaxParams ajaxParams = Whitebox.newInstance(AjaxParams.class);

    // Act
    String actual = ajaxParams.getValueType();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
