package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.VipDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VipDO_setSidTest_3_Test {
  @Test
  public void setSidTest() throws Exception {
    // Arrange
    VipDO vipDO = new VipDO();
    String sid = "aaaaa";

    // Act
    vipDO.setSid(sid);

    // Assert
    long id = vipDO.getId();
    long[] cobarIds = vipDO.getCobarIds();
    String toStringResult = vipDO.toString();
    String schema = vipDO.getSchema();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, vipDO.getWeights());
    Assert.assertEquals(null, schema);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarIds);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
