package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.CobarNodeInstantPerfValueAjax;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarNodeInstantPerfValueAjax_CobarNodeInstantPerfValueAjaxTest_1_Test {
  @Test
  public void CobarNodeInstantPerfValueAjaxTest() throws Exception {
    // Arrange and Act
    CobarNodeInstantPerfValueAjax cobarNodeInstantPerfValueAjax = new CobarNodeInstantPerfValueAjax();

    // Assert
    Assert.assertNotNull(cobarNodeInstantPerfValueAjax.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
