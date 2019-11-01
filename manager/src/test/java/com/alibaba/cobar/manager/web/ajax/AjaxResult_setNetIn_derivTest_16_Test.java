package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.AjaxResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AjaxResult_setNetIn_derivTest_16_Test {
  @Test
  public void setNetIn_derivTest() throws Exception {
    // Arrange
    AjaxResult ajaxResult = new AjaxResult();
    String netIn_deriv = "aaaaa";

    // Act
    ajaxResult.setNetIn_deriv(netIn_deriv);

    // Assert
    int schema = ajaxResult.getSchema();
    int active = ajaxResult.getActive();
    String netOut_deriv = ajaxResult.getNetOut_deriv();
    String toStringResult = ajaxResult.toString();
    int total = ajaxResult.getTotal();
    long netIn = ajaxResult.getNetIn();
    long id = ajaxResult.getId();
    String request_deriv = ajaxResult.getRequest_deriv();
    long connection = ajaxResult.getConnection();
    String flag = ajaxResult.getFlag();
    long timestamp = ajaxResult.getTimestamp();
    String netIn_deriv1 = ajaxResult.getNetIn_deriv();
    int error = ajaxResult.getError();
    long request = ajaxResult.getRequest();
    Assert.assertEquals(0, schema);
    Assert.assertEquals(0L, ajaxResult.getNetOut());
    Assert.assertEquals(0L, request);
    Assert.assertEquals(0, error);
    Assert.assertEquals("aaaaa", netIn_deriv1);
    Assert.assertEquals(0L, timestamp);
    Assert.assertEquals(null, flag);
    Assert.assertEquals(0L, connection);
    Assert.assertEquals("0", request_deriv);
    Assert.assertEquals(-1L, id);
    Assert.assertEquals(0L, netIn);
    Assert.assertEquals(0, total);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0", netOut_deriv);
    Assert.assertEquals(0, active);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
