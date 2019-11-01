package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.VipDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VipDO_setIdTest_13_Test {
  @Test
  public void setIdTest() throws Exception {
    // Arrange
    VipDO vipDO = new VipDO();
    long id = 1L;

    // Act
    vipDO.setId(id);

    // Assert
    String sid = vipDO.getSid();
    long id1 = vipDO.getId();
    long[] cobarIds = vipDO.getCobarIds();
    String toStringResult = vipDO.toString();
    String schema = vipDO.getSchema();
    Assert.assertEquals(null, sid);
    Assert.assertEquals(null, vipDO.getWeights());
    Assert.assertEquals(null, schema);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarIds);
    Assert.assertEquals(1L, id1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
