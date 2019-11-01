package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.ajax.CobarControlAjax;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarControlAjax_setCobarAccesserTest_2_Test {
  @Test
  public void setCobarAccesserTest() throws Exception {
    // Arrange
    CobarControlAjax cobarControlAjax = new CobarControlAjax();
    CobarAccesser cobarAccesser = new CobarAccesser();

    // Act
    cobarControlAjax.setCobarAccesser(cobarAccesser);

    // Assert
    String toStringResult = cobarAccesser.toString();
    XmlAccesser xmlAccesser = cobarAccesser.getXmlAccesser();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
    Assert.assertEquals(null, xmlAccesser);
    Assert.assertNotNull(cobarControlAjax.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
