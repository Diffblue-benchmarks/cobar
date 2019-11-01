package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.VipDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VipDO_getWeightsTest_12_Test {
  @Test
  public void getWeightsTest() throws Exception {
    // Arrange
    VipDO vipDO = new VipDO();

    // Act
    int[] actual = vipDO.getWeights();

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
