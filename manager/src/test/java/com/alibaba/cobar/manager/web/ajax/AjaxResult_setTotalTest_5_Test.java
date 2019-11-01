package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.AjaxResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AjaxResult_setTotalTest_5_Test {
  @Test
  public void setTotalTest() throws Exception {
    // Arrange
    AjaxResult ajaxResult = new AjaxResult();
    int totalCount = 1;

    // Act
    ajaxResult.setTotal(totalCount);

    // Assert
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
    String netIn_deriv = ajaxResult.getNetIn_deriv();
    int error = ajaxResult.getError();
    long request = ajaxResult.getRequest();
    Assert.assertEquals(0, active);
    Assert.assertEquals(0L, ajaxResult.getNetOut());
    Assert.assertEquals(0L, request);
    Assert.assertEquals(0, error);
    Assert.assertEquals("0", netIn_deriv);
    Assert.assertEquals(0L, timestamp);
    Assert.assertEquals(null, flag);
    Assert.assertEquals(0L, connection);
    Assert.assertEquals("0", request_deriv);
    Assert.assertEquals(-1L, id);
    Assert.assertEquals(0L, netIn);
    Assert.assertEquals(1, total);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("0", netOut_deriv);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
