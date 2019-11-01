package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.VipDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VipDO_getSchemaTest_11_Test {
  @Test
  public void getSchemaTest() throws Exception {
    // Arrange
    VipDO vipDO = new VipDO();

    // Act
    String actual = vipDO.getSchema();

    // Assert
    Assert.assertEquals(null, actual);
    String sid = vipDO.getSid();
    long id = vipDO.getId();
    long[] cobarIds = vipDO.getCobarIds();
    String toStringResult = vipDO.toString();
    String schema = vipDO.getSchema();
    Assert.assertEquals(null, sid);
    Assert.assertEquals(null, vipDO.getWeights());
    Assert.assertEquals(null, schema);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarIds);
    Assert.assertEquals(0L, id);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
