package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.CobarControlAjax;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CobarControlAjax_afterPropertiesSetTest_4_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    CobarControlAjax cobarControlAjax = new CobarControlAjax();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    cobarControlAjax.afterPropertiesSet();
    Assert.assertNotNull(cobarControlAjax.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
