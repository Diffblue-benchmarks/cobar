package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.VipDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VipDO_setSchemaTest_10_Test {
  @Test
  public void setSchemaTest() throws Exception {
    // Arrange
    VipDO vipDO = new VipDO();
    String schema = "aaaaa";

    // Act
    vipDO.setSchema(schema);

    // Assert
    long id = vipDO.getId();
    long[] cobarIds = vipDO.getCobarIds();
    String toStringResult = vipDO.toString();
    String schema1 = vipDO.getSchema();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, vipDO.getWeights());
    Assert.assertEquals("aaaaa", schema1);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarIds);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
