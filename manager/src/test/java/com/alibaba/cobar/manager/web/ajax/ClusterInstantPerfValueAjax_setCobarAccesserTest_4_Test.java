package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.ajax.ClusterInstantPerfValueAjax;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterInstantPerfValueAjax_setCobarAccesserTest_4_Test {
  @Test
  public void setCobarAccesserTest() throws Exception {
    // Arrange
    ClusterInstantPerfValueAjax clusterInstantPerfValueAjax = new ClusterInstantPerfValueAjax();
    CobarAccesser cobarAccesser = new CobarAccesser();

    // Act
    clusterInstantPerfValueAjax.setCobarAccesser(cobarAccesser);

    // Assert
    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
    Assert.assertEquals(null, xmlAccesser);
    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
    Assert.assertNotNull(clusterInstantPerfValueAjax.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
