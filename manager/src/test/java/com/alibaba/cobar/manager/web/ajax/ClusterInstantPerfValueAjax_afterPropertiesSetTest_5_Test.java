package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.web.ajax.ClusterInstantPerfValueAjax;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ClusterInstantPerfValueAjax_afterPropertiesSetTest_5_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    ClusterInstantPerfValueAjax clusterInstantPerfValueAjax = new ClusterInstantPerfValueAjax();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    clusterInstantPerfValueAjax.afterPropertiesSet();
    Assert.assertNotNull(clusterInstantPerfValueAjax.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
