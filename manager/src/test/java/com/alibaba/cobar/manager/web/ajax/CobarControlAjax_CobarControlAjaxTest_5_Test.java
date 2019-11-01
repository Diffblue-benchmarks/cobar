package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.CobarControlAjax;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarControlAjax_CobarControlAjaxTest_5_Test {
  @Test
  public void CobarControlAjaxTest() throws Exception {
    // Arrange and Act
    CobarControlAjax cobarControlAjax = new CobarControlAjax();

    // Assert
    Assert.assertNotNull(cobarControlAjax.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
