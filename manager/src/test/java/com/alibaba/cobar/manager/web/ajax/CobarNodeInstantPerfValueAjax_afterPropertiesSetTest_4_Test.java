package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.CobarNodeInstantPerfValueAjax;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CobarNodeInstantPerfValueAjax_afterPropertiesSetTest_4_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    CobarNodeInstantPerfValueAjax cobarNodeInstantPerfValueAjax = new CobarNodeInstantPerfValueAjax();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    cobarNodeInstantPerfValueAjax.afterPropertiesSet();
    Assert.assertNotNull(cobarNodeInstantPerfValueAjax.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
