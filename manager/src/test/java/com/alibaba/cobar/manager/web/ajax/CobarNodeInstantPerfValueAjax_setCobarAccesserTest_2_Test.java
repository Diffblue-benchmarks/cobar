package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.ajax.CobarNodeInstantPerfValueAjax;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarNodeInstantPerfValueAjax_setCobarAccesserTest_2_Test {
  @Test
  public void setCobarAccesserTest() throws Exception {
    // Arrange
    CobarNodeInstantPerfValueAjax cobarNodeInstantPerfValueAjax = new CobarNodeInstantPerfValueAjax();
    CobarAccesser cobarAccesser = new CobarAccesser();

    // Act
    cobarNodeInstantPerfValueAjax.setCobarAccesser(cobarAccesser);

    // Assert
    String toStringResult = cobarAccesser.toString();
    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
    Assert.assertEquals(null, xmlAccesser);
    Assert.assertNotNull(cobarNodeInstantPerfValueAjax.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
