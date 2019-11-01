package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.AjaxParams;
import net.sf.json.JSONArray;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class AjaxParams_getArrayTest_3_Test {
  @Test
  public void getArrayTest() throws Exception {
    // Arrange
    AjaxParams ajaxParams = Whitebox.newInstance(AjaxParams.class);

    // Act
    JSONArray actual = ajaxParams.getArray();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
