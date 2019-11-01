package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.VipDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VipDO_setWeightsTest_7_Test {
  @Test
  public void setWeightsTest() throws Exception {
    // Arrange
    VipDO vipDO = new VipDO();
    int[] intArray = new int[]{1, 1, 1, 1, 1, 1, 655361, 1};

    // Act
    vipDO.setWeights(intArray);

    // Assert
    Assert.assertEquals(8, intArray.length);
    Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1, 655361, 1}, intArray);
    String sid = vipDO.getSid();
    long id = vipDO.getId();
    long[] cobarIds = vipDO.getCobarIds();
    String toStringResult = vipDO.toString();
    String schema = vipDO.getSchema();
    Assert.assertEquals(null, sid);
    Assert.assertSame(intArray, vipDO.getWeights());
    Assert.assertEquals(null, schema);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarIds);
    Assert.assertEquals(0L, id);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
